package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public int frequency(T value) {
        return (int) Stream.of(array).filter(i -> i.equals(value)).count();
    }

    public T findOddOccurringValue() {
        return Stream.of(array).filter(i -> frequency(i) % 2 != 0).findFirst().get();
    }

    public T findEvenOccurringValue() {
        return Stream.of(array).filter(i -> frequency(i) % 2 == 0).findFirst().get();
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return frequency(valueToEvaluate);
    }

    public T[] filter(Function<T, Boolean> predicate) {
        return Stream.of(array).filter(predicate::apply).toArray(size -> Arrays.copyOf(array, size));
    }
}
