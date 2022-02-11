package HashTable.Freqency;

import java.util.HashMap;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        if(emails == null || emails.length == 0)
        {
            return 0;
        }

        HashMap<String, Integer> counts = new HashMap<>();

        for (String email : emails)
        {
            String[] splitter = email.split("@");
            if (splitter[0].contains("."))
            {
                splitter[0] = splitter[0].replace(".", "");
            }
            if (splitter[0].contains("+"))
            {
                splitter[0] = splitter[0].substring(0, splitter[0].indexOf('+'));
            }
            String mod = splitter[0] + "@" + splitter[1];

            counts.put(mod, counts.getOrDefault(mod, 0) + 1);
        }

        return counts.size();
    }
}
