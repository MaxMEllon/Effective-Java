import java.lang.reflect.Array;
import java.rmi.UnexpectedException;
import java.util.*;

public class BooleanFactory /* implements IFactory */ {
    // なにかしろの文字列をパースを行うイメージ
    public static Boolean from(String arg) throws UnexpectedException {
        switch (arg) {
            case "true":
            case "True":
                return Boolean.True;
            case "false":
            case "False":
                return Boolean.False;
            default:
                throw new UnexpectedException("unexpected arguments");
        }
    }

    public static Set<Boolean> of(Boolean ...args) {
        Set<Boolean> set = EnumSet.noneOf(Boolean.class);
        Arrays.asList(args).forEach((itr) -> set.add(itr));
        return set;
    }

    public static Boolean valueOf(Boolean ...args) {
       return BooleanFactory.valueOf(args);
    }

    public static Class<Boolean> newType() {
        return Boolean.class;
    }

    /* TODO
    public static Boolean newInstance(Boolean obj) {
        // clone or re create instance
    }

    */
}
