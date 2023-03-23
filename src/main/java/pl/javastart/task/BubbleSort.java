package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int a;
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < (inputArray.length - i); j++) {
                if (inputArray[j - 1] > inputArray[j]) {
                    a = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = a;
                    counter++;
                } else if (i == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}