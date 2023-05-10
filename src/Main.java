import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] number1 = {1.57, 7.654, 9.986};

        int[] number3 = new int[6];
        number3[0] = 3;
        number3[1] = 6;
        number3[2] = 7;
        number3[3] = 4;
        number3[4] = 9;
        number3[5] = 8;


    }

    public static void task2() {
        System.out.println("Задание 2");

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] number1 = {1.57, 7.654, 9.986};

        int[] number2 = new int[6];
        number2[0] = 3;
        number2[1] = 6;
        number2[2] = 7;
        number2[3] = 4;
        number2[4] = 9;
        number2[5] = 8;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }


        }

        System.out.println();
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] number1 = {1.57, 7.654, 9.986};

        int[] number2 = new int[6];
        number2[0] = 3;
        number2[1] = 6;
        number2[2] = 7;
        number2[3] = 4;
        number2[4] = 9;
        number2[5] = 8;
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }


        }

        System.out.println();

        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i]);
            if (i != 0) {
                System.out.print(" , ");
            }

        }
        System.out.println();
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();


    }
    public static void task4(){
        System.out.println("Задание 4");
        int [] number4 = {1, 2, 3};
        for (int i = 0; i < number4.length; i++) {
if (number4[i] % 2 != 0){
    number4[i]+=1;
}
        }

        System.out.println(Arrays.toString(number4));

    }

}