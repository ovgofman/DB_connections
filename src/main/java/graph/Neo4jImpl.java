package graph;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

public class Neo4jImpl implements AutoCloseable {
    private final Driver driver;

    public Neo4jImpl(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

    @Override
    public void close() {
        driver.close();
    }

    public void printGreeting(final String message) {
        try (Session session = driver.session()) {
            String user = session.writeTransaction(new TransactionWork<String>() {
                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (Neo:User {name: '" + message + "', age: 46});");
                    return result.single().get(0).asString(); // comment it out, to make it works
                }
            });
            System.out.println(user);
        }
    }


    public static void main(String[] args) {
        try (Neo4jImpl greeter = new Neo4jImpl("neo4j://localhost:7687", "neo4j", "neo")) {
            greeter.printGreeting("Salma Hayek");
        }
    }
}
