import java.util.*;

public class BooleanFactory /* implements IFactory */ {
    // なにかしろの文字列をパースを行うイメージ
    public static Boolean from(String arg) throws AssertionError {
        switch (arg) {
            case "true":
            case "True":
                return Boolean.True;
            case "false":
            case "False":
                return Boolean.False;
            default:
                throw new AssertionError("unexpected arguments");
        }
    }

    public static Set<Boolean> of(Boolean ...args) {
        return Arrays.asList(args)
                .stream()
                .reduce(
                    EnumSet.noneOf(Boolean.class),
                    (acc, itr) -> {
                        acc.add(itr);
                        return acc;
                    },
                    // parallel not support.
                    (prev, next) -> next
                );
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
