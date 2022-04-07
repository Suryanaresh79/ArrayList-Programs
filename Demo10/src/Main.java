import java.util.*;

public class Main {
	public static void main(String args[])
    {
        List<String>
            list = new ArrayList<>(
                Arrays
                    .asList("Naresh",
                            "Vikram",
                            "Vijay"));
        System.out.println("List of String: " + list);
        String string = String.join(", ", list);
        System.out.println("Comma separated String: "
                           + string);
    }
}

