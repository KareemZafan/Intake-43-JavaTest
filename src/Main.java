import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Hello Intake-43" );

        // list of students' names
        List<String> names = new ArrayList<>( List.of( "Kareem", "Fouda", "Nader","Amany" ) );

        for (String name : names) {
            System.out.println( name );
           System.out.println( "Amany Hegazy");
        }
    }
}