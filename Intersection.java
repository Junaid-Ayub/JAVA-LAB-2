public class Intersection {

    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {2, 4, 6, 5, 10};

    public void intersection() {
        System.out.print("Intersections: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }

            }

        }
    }
    public static void main(String[] args) {
        Intersection b1 = new Intersection();
        b1.intersection();
    }
}

