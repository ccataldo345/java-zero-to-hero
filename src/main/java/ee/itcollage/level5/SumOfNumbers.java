package ee.itcollage.level5;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.*;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (isEmpty(integerList)) {
            return null;
        }
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

}
