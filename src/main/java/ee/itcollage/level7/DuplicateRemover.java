package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers){

        ArrayList<Integer> integers = new ArrayList<>(new HashSet<>(numbers));
        System.out.println(integers.toString());    // [1, 2, 3]
        System.out.println(Arrays.asList(integers));    //[[1, 2, 3]]
        return integers;
    }
}
