import java.util.HashMap;

public class Main {

    public  static void main(String[]args){

        HashMap<String,String> countries=new HashMap<>();

        countries.put("Kenya","Nairobi");
        countries.put("Russia","Moscow");
        countries.put("Ethiopia","Addis Ababa");

        System.out.println(countries);
        System.out.println( countries.size());
        System.out.println(countries.get("Kenya"));






    }
}
