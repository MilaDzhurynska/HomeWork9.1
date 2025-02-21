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
        /*
        Знайдіть суму всіх елементів в парних рядках (рядок 0, 2)
        та суму всіх елементів в непарних рядках (рядок 1, 3).
         */

        int sumEvenRows = 0;
        int sumOddRows = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumRows = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRows += matrix[i][j];
            }
            if (i % 2 == 0) {
                sumEvenRows += sumRows; // парні рядки (0; 2)
            } else {
                sumOddRows += sumRows; // непарні рядки (1; 3)
            }
        }
        System.out.println("Сума елементів у парних рядках: " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках: " + sumOddRows);

        /*
        Знайдіть добуток всіх елементів в парних стовпцях (стовпцях 0, 2)
        та добуток всіх елементів в непарних стовпцях (стовпцях 1, 3).
         */

        long productEvenColumns = 1; // краще long, бо може бути > int
        long productOddColumns = 1; // 1, бо в нас добуток, якщо присвоїти 0, то виведе лише 0

        for (int j = 0; j < matrix[0].length; j++) {
            long productColumns = 1;
            for (int i = 0; i < matrix.length; i++) {
                productColumns *= matrix[j][i];
            }
            if (j % 2 == 0) {
                productEvenColumns *= productColumns; // парні стовпці (0; 2)
            } else {
                productOddColumns *= productColumns; // непарні стовпці (1; 3)
            }
        }
        System.out.println("Добуток елементів у парних стовпцях: " + productEvenColumns);
        System.out.println("Добуток елементів у непарних стовпцях: " + productOddColumns);

        /*
        Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця,
        в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
         */
        int m = 4;

        boolean flag = false; // оголосили Boolean для перевірки магічного квадрата

        int sum1 = 0, sum2 = 0; // ініціалізація та оголошення діагональної суми як 0

        for (int i = 0; i < m; i++){  //знаходження суми двох діагоналей, тобто sum1 і sum2
            sum1 += matrix[i][i];
            sum2 += matrix[i][m-1-i];
        }
        if (sum1!=sum2) // якщо сума діагоналей нерівна, тоді це не магічний квадрат
            flag = true;

        for (int i = 0; i < m; i++){
            int rowSum = 0, colSum = 0;  //Ініціалізація та оголошення суми рядків і стовпців як 0
            for (int j = 0; j < m; j++){ //знаходження суми рядків і стовпців, тобто рядка і стовпця
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != colSum || colSum != sum1)
                flag = true;

        }
        if (!flag)
            System.out.println("Матриця є магічним квадратом.");
        else
            System.out.println("Матриця не є магічним квадратом.");
    }
}