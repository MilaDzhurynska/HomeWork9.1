public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Створіть двовимірний масив цілих чисел розмірністю 4x4.
        int[][] matrix = new int[4][4];

        //Заповніть масив випадковими цілими числами в діапазоні від 1 до 50.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50) + 1;
                //Виведіть матрицю на екран у вигляді таблиці.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /* Знайдіть суму всіх елементів в парних рядках (рядок 0, 2)
        та суму всіх елементів в непарних рядках (рядок 1, 3).
         */

        int sumEvenRows = 0;
        int sumOddRows = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumRows = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sumRows += matrix[i][j];}
            if (i % 2 == 0) {
                sumEvenRows += sumRows; // парні рядки (0; 2)
            } else {
                 sumOddRows += sumRows; // непарні рядки (1; 3)
            }
        }
        System.out.println("Сума елементів у парних рядках: " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках: " + sumOddRows);
    }
}