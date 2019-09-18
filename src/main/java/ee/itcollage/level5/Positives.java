package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Positives {

    //todo fix tests

    /**
     * returns only positives. zero is not positive
     * For example:
     * 1, -2, -3 => 1
     */
    public static List<Integer> analyze(List<Integer> integers){
        return integers.stream().filter(integer -> integer > 0).collect(Collectors.toList());
    }
}
