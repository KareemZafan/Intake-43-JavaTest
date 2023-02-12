import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Hello Intake-43" );

        // list of students' namess
        List<String> names = new ArrayList<>( List.of( "Kareem", "Fouda", "Nader", "Raghda" ,"Kirolos","Ahmed Arthur") );
        for (String name : names) {
            System.out.println( name );
        }
    }
}