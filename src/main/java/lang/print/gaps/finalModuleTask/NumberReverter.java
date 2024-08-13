package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newNum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            newNum = newNum * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(newNum);
    }
}
