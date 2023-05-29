package HW13;

import java.util.*;
import java.io.*;

public class Homework13{
    private static Map<Client, List<Account>> map = new HashMap<>();
    private static Map<Account, Client> map2 = new HashMap<>();
    private static Map<Client, Set<Account>> map3 = new HashMap<>();



    public static void main(String[] args) {
        map.put(new Client("Иванов", 23),
                List.of(new Account(1,100, Currency.RUBLES, "id: 1"),
                        new Account(2,200, Currency.US_DOLLARS, "id: 2")
                ));
        map.put(new Client("Иванов", 21),
                List.of(new Account(3,300, Currency.RUBLES, "id: 3"),
                        new Account(4,400, Currency.US_DOLLARS, "id: 4")
                ));
        map.put(new Client("Петров", 45),
                List.of(new Account(5,300, Currency.RUBLES, "id: 5"),
                        new Account(6,400, Currency.US_DOLLARS, "id: 6")
                ));
        map.put(new Client("Сидоров", 60),
                List.of(new Account(7,300, Currency.RUBLES, "id: 7"),
                        new Account(8,400, Currency.US_DOLLARS, "id: 8")
                ));

        // Search all Accounts for Key(Clients)
        System.out.println(getAccounts(new Client("Иванов", 23)));

        // Search Key(Clients) for Accounts
        System.out.println(findClient(new Account(8,400, Currency.US_DOLLARS, "id: 8")));
        System.out.println(findClient(new Account(3,300, Currency.RUBLES, "id: 3")));


        // Search Key(Clients) for Accounts second variant

        map2.put(new Account(7,300, Currency.RUBLES, "id: 7"), new Client("Сидоров", 60));
        map2.put(new Account(8,400, Currency.US_DOLLARS, "id: 8"), new Client("Сидоров", 60));

        map2.put(new Account(5,300, Currency.RUBLES, "id: 5"), new Client("Петров", 45));
        map2.put(new Account(6,400, Currency.US_DOLLARS, "id: 6"), new Client("Петров", 45));

        // Search Key(Clients) for Accounts
        System.out.println(findClient(new Account(8,400, Currency.US_DOLLARS, "id: 7")));


        // Third variant

        map.put(new Client("Иванов", 23),
                List.of(new Account(1,100, Currency.RUBLES, "id: 1"),
                        new Account(2,200, Currency.US_DOLLARS, "id: 2")
                ));
        map.put(new Client("Иванов", 21),
                List.of(new Account(3,300, Currency.RUBLES, "id: 3"),
                        new Account(4,400, Currency.US_DOLLARS, "id: 4")
                ));

        var set = new HashSet<Account>();
        set.add(new Account(1,100, Currency.RUBLES, "id: 1"));
        set.add(new Account(2,200, Currency.US_DOLLARS, "id: 2"));
        map3.put(new Client("Иванов", 23), set);

        var set2 = new HashSet<Account>();
        set2.add(new Account(3,300, Currency.RUBLES, "id: 3"));
        set2.add(new Account(4,400, Currency.US_DOLLARS, "id: 4"));
        map3.put(new Client("Иванов", 21), set2);

        // Search all Accounts for Key(Clients)
        System.out.println(getAccounts3(new Client("Иванов", 23)));
        System.out.println(findClient3(new Account(4,400, Currency.US_DOLLARS, "id: 4")));
    }

    private static List<Account> getAccounts(Client client) {
        return map.containsKey(client) ? map.get(client) : null;
    }

    private static Client findClient(Account account){
       for (Map.Entry<Client, List<Account>> entry : map.entrySet())
           {
             for (Account la: entry.getValue() ){
             if(la.equals(account)) return entry.getKey();
             }
           }
        return null;
    }

    private static Client findClient2(Account account) {
        return map2.containsKey(account) ? map2.get(account) : null;
    }


    private static Set<Account> getAccounts3(Client client) {
        return map3.containsKey(client) ? map3.get(client) : null;
    }

    private static Client findClient3(Account account){
        for (Map.Entry<Client, Set<Account>> entry : map3.entrySet())
        {
            for (Account la: entry.getValue() ){
                if(la.equals(account)) return entry.getKey();
            }
        }
        return null;
    }



}