import java.util.Arrays;

public class Generic<T> {
    T[] object;
    T[] objectTwo;

    public Generic(T[] object, T[] objectTwo) {
        this.object = object;
        this.objectTwo = objectTwo;
    }

    public T[] getObjectOne() {
        return object;
    }

    public T[] getObjectTwo() {
        return objectTwo;
    }

    public void showType() {
        System.out.println("First object type: " + object.getClass().getName());
        System.out.println("Second object type: " + objectTwo.getClass().getName());
    }


    public void checkForSame() {
        Object[] array = Arrays.stream(object).toArray();
        Object[] arrayTwo = Arrays.stream(objectTwo).toArray();
        int longest = Math.max(array.length, arrayTwo.length);
        int counter = 0;

        for (int i = 0; i < longest; i++) {
            if (i < array.length && i < arrayTwo.length && arrayTwo[i].equals(array[i])) {
                System.out.println("Есть одинаковые элементы в одном и том же порядке");
                counter += 1;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Нет одинкаовых элементов в одном и том же порядке");
        }
    }
}
