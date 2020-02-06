public class PrintingLikeBoss {


    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }

    public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter ++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print(" ");
            counter ++;
        }

    }

    public static void printTriangle(int size) {
        int white = size - 1, counter = 1;
        while (counter <= size) {
            printWhitespaces(white);
            printStars(counter);

            white --;
            counter ++;
        }
    }

    public static void xmasTree(int height) {
        int width = height + (height - 1);
        int white = width/2, counter = 1;

        // Print foliage
        while (white >= 0) {
            printWhitespaces(white);
            printStars(counter);

            white --;
            counter += 2;
        }

        // Print stump
        white = (width/2) - 1;
        int stump = 2;
        while (stump > 0) {
            printWhitespaces(white);
            printStars(3);

            stump --;
        }



    }
}
