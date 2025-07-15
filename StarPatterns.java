import java.util.function.IntConsumer;

public class StarPatterns {
    public static void main(String[] args) {
        runTestCase(Main::print18, 5, 4, 7);
    }

    public static void runTestCase(IntConsumer function, int... numbers){
        for (int n: numbers){
            System.out.printf("Pattern for n: %d \n", n);
            function.accept(n);
            System.out.println();
        }
    }

    public static void print1(int n){
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print3(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print4(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void print5(int n){
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print6(int n){
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print( j+1 + " ");
            }
            System.out.println();
        }
    }

    public static void print7(int n){
        for (int i = 0; i < n ; i++){
            // Space
            for (int j = 0; j < n - i -1; j++){
                System.out.print("  ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("* ");
            }
            // Space
            for (int j = 0; j < n - i -1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void print8(int n){
        for (int i = n; i > 0 ; i--){
            // Space
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            // Star
            for (int j = 0; j < 2 * i - 1; j++){
                System.out.print("* ");
            }
            // Space
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void print9(int n){
        for (int i = 0; i < n ; i++){
            // Space
            for (int j = 0; j < n - i -1; j++){
                System.out.print("  ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("* ");
            }
            // Space
            for (int j = 0; j < n - i -1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n; i > 0 ; i--){
            // Space
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            // Star
            for (int j = 0; j < 2 * i - 1; j++){
                System.out.print("* ");
            }
            // Space
            for (int j = 0; j < n - i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void print10(int n){
        for (int i = 1; i < n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = n - 1; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void print11(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                if (j % 2 == 1){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void print12(int n){
        for (int i = 1; i <= n; i++){
            // Numbers
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            // Space
            for (int j = 2 * (n - i); j >=0 ; j--){
                System.out.print(" ");
            }
            // Numbers
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print13(int n){
        int num = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void print14(int n){
        char letter = 'A';
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(letter + " ");
                letter++;
            }
            letter = 'A';
            System.out.println();
        }
    }

    public static void print15(int n){
        char letter = 'A';
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print(letter + " ");
                letter++;
            }
            letter = 'A';
            System.out.println();
        }
    }

    public static void print16(int n){
        char letter = 'A';
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(letter + " ");
            }
            letter++;
            System.out.println();
        }
    }

    public static void print17(int n){
        char letter = 'A';
        for (int i = 1; i <= n; i++){
            // Space
            for (int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            // Letters
            for (int j = 1; j <= i; j++){
                System.out.print(letter);
                letter++;
            }
            if (i == 1){
                letter = 'A';
            }else {
                letter--;
                while (letter > 'A'){
                    letter--;
                    System.out.print(letter);
                }
            }
            // Space
            for (int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print18(int n){
        for (int i = n; i >= 1; i--){
            char letter = 'A';
            for (int k = 1; k < i; k++){
                letter++;
            }
            for (int j = n; j >= i; j--){
                System.out.print(letter);
                letter--;
            }
            System.out.println();
        }
    }
}
