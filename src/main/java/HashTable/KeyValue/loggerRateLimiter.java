package HashTable.KeyValue;

import java.util.HashMap;

public class loggerRateLimiter {
    HashMap<String, Integer> map;
    public loggerRateLimiter() {
        map = new HashMap<>();
    }
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message))
        {
            map.put(message, timestamp);
            return true;
        }
        else
        {
            int oldtimeStamp = map.get(message);
            if (timestamp - oldtimeStamp >= 10)
            {
                map.put(message, timestamp);
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
