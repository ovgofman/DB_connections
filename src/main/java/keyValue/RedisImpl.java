package keyValue;

import redis.clients.jedis.Jedis;

public class RedisImpl {
    public static void main(String[] args) {
        Jedis jedis = getJedis(args);

        jedis.set("events/city/rome", "32,15,223,828");
        String cachedResponse = jedis.get("events/city/rome");
        //String cachedResponse = jedis.get("name");
        System.out.println(cachedResponse);
    }

    private static Jedis getJedis(String[] args) {
        Jedis jedis;

        if (args.length == 2)
            jedis = new Jedis(args[0], Integer.parseInt(args[1]));
        else
            jedis = new Jedis();

        return jedis;
    }
}
