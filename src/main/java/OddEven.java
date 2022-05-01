public class OddEven {
    public String oddEven(double number) {
        if (!(number == Integer.MIN_VALUE - 1 || number == Integer.MAX_VALUE + 1)) {
            if (number < 0) {
                return "Odd";
            } else {
                return "Even";
            }
        }
        return "Undefined";
    }
}
