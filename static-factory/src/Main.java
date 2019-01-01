import java.rmi.UnexpectedException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Boolean b = null;
        try {
            b = BooleanFactory.from("true");
        } catch (UnexpectedException e) {
            e.printStackTrace();
        }
        Set<Boolean> set = BooleanFactory.of(Boolean.True, Boolean.False);
        System.out.printf("%s %s\n", b.toString(), set.toString());
    }
}
