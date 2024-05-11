package lambdas;

// Lambda expressions, introduced in Java SE 8.
// Lambda expressions in Java are akin to lambda functions—a concise block of code that accepts input parameters and yields a result.
// Lambda expressions play a pivotal role in enhancing Java's expressiveness and facilitating the adoption of functional programming paradigms.
// It enables more concise code by allowing the direct inline expression of instances of functional interfaces, eliminating the need to create separate classes or anonymous classes.

// The Example interface represents a functional interface that defines an operation on two values of the same type.

// @param <T> the type of the values operated on by the example method

@FunctionalInterface
public interface Example<T> {

    /**
     * Performs an operation on two values of type T.
     *
     * @param x the first value of type T
     * @param y the second value of type T
     * @return the result of the operation
     */
    public T example(T x, T y);
}