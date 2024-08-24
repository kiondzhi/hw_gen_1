//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4, 5};
        Object[] arrayTwo = {3, 5, 6, 5, 1};

        Generic<Integer[]> nums = new Generic(array, arrayTwo);
        nums.checkForSame();
    }

}