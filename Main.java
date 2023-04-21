public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 3, 4, 5, 6, 7};
        String string = "Alexx9800";
        System.out.println(getSumEvenValuesFromArrayNumbers(numbers));
        getUniqueValuesFromStringArray(string);
    }

    /**
     * Написати метод який приймає массив цілих чисел і вертає суму всіх його парних елементів
     * (не тих які мають парні індекси а ті які самі є парними). [8,2,3,4,5,6,7] -> 20
     *
     * @param numbers - массив цілих чисел
     * @return sum - сума парних елементів numbers
     */
    public static int getSumEvenValuesFromArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
     * Alexx9800
     * A
     * l
     * e
     * x
     * 9
     * 8
     * 0
     *
     * @param string - стрінга
     */
    public static void getUniqueValuesFromStringArray(String string) {
        StringBuilder uniqueValues = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (!uniqueValues.toString().contains(String.valueOf(string.charAt(i)))) {
                uniqueValues.append(string.charAt(i)).append("\n");
            }
        }
        System.out.println(uniqueValues);
    }
}
