package gr.aueb.cf.ch6;

/**
 * Δήλωση και αχρικοποίηση
 * Populate εναν πίνανα
 * ενας τρόπος είανι με new
 * ένας με unsized init
 * ένας array initializer
 * και πως θα κάνουμε print τα στοιχεία ενός πίνακα
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];                       // declare and init
        int[] arr2 = {1, 2, 3, 4, 5};                 // unsized init

//      int[] arr3 = new int[] {1, 2, 3, 4 ,5};     // array initialization
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4 ,5};

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse = διασχιση του πίνακα

        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // η κατω μορφή λέγεται enhanced for αλλα λείπει το (int i)
        for ( int el : arr3) {
            System.out.println(el + " ");
        }
    }
}
