package documentOriented;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongodbImpl {
    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongoClient = getMongoClient(args);

        System.out.println("MongoDB version: " + mongoClient.getVersion());
    }

    private static MongoClient getMongoClient(String[] args) throws UnknownHostException {
        if (args.length == 3) {
            String dbName = args[0],
                    ip = args[1],
                    port = args[2];

            return new MongoClient(new MongoClientURI(String.format("%s://%s:%s", dbName, ip, port)));
        } else
            return new MongoClient();
    }
}
