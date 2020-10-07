package wideColumn;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraImpl {
    public static void main(String[] args) {
        //jdbc:cassandra://localhost:9042
        String serverIP = "localhost:9042";
        String keyspace = "system";

        Cluster cluster = Cluster.builder()
                                 .addContactPoints(serverIP)
                                 .build();

        Session session = cluster.connect(keyspace);

        System.out.println(session.getState());

    }
}
