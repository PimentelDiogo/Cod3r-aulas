package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(1, "Roberto");
        usuario.put(1, "Ricardo");// altera ou add chave e valor
        usuario.put(2, "Diogo");
        usuario.put(3, "Duda");

        System.out.println(usuario.size());
        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());
        System.out.println(usuario.containsValue("Diogo"));
        System.out.println(usuario.get(2)); //busca da chave

        for(int chave: usuario.keySet()){ //.values() busca valores
            System.out.println(chave);
        }
        for(Map.Entry<Integer, String> reg: usuario.entrySet()){
            System.out.println(reg.getKey());
            System.out.println(reg.getValue());
        }
    }
}
