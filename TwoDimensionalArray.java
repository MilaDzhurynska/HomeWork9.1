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
            }
        }
