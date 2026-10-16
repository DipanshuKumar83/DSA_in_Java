package Java_framework;

import java.util.HashMap;
import java.util.Map;

public class framework03 {
    static void main(String[] args) {
        Map<String,String> Mark=new HashMap<>();
        Mark.put("Dipanshu","First");
        Mark.put("Ranjan","Second");
        Mark.put("DipShikha","Third");
        Mark.put("Varnaya","Fouth");
        IO.println(Mark);

        Map<String,String> table=new HashMap<>();
        table.put("Ram","World");
        IO.println(table);
        table.putAll(Mark);
        IO.println(table);
    }
}
