public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;
        System.out.print(arrOne[0] + " " + arrOne[1] + " " + arrOne[2]);
        System.out.println();
        double[] arrTwo = {1.57, 7.654, 9.986};
        System.out.print(arrTwo[0] + " " + arrTwo[1] + " " + arrTwo[2]);
        System.out.println();
        long[] arrThree = {12L, 4L, 5};
        System.out.print(arrThree[0] + " " + arrThree[1] + " " + arrThree[2]);
        System.out.println();

        System.out.println("Task2");
        System.out.print(arrOne[0] + ", " + arrOne[1] + ", " + arrOne[2]);
        System.out.println();
        System.out.print(arrTwo[0] + ", " + arrTwo[1] + ", " + arrTwo[2]);
        System.out.println();
        System.out.print(arrThree[0] + ", " + arrThree[1] + ", " + arrThree[2]);
        System.out.println();

        System.out.println("Task3");
        System.out.print(arrOne[2] + ", " + arrOne[1] + ", " + arrOne[0]);
        System.out.println();
        System.out.print(arrTwo[2] + ", " + arrTwo[1] + ", " + arrTwo[0]);
        System.out.println();
        System.out.print(arrThree[2] + ", " + arrThree[1] + ", " + arrThree[0]);
        System.out.println();

        System.out.println("Task4");
        for (int i = 0; i < 3; i++) {
            if (arrOne[i] % 2 != 0) {
                arrOne[i] = arrOne[i] + 1;
            }
            System.out.print(arrOne[i] + " ");
        }

    }
}