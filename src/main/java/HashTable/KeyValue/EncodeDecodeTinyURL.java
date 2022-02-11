package HashTable.KeyValue;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTinyURL {
    Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        return "http://tinyurl.com/" + longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(
                Integer.parseInt(
                        shortUrl.replace("http://tinyurl.com/", "")));
    }
}
