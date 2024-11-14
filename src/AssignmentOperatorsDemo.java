public class AssignmentOperatorsDemo {
    public static void main(String args[]) {
        //Assigning Primitive Values
        int j, k;
        // j gets the value 10.
        j = 10;
        // j gets the value 5. The previous value is overwritten.
        j = 5;
        // k gets the value 5.
        k = j;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //Multiple Assignments
        //  (k = (j = 10))
        k = j = 10; //
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
    }

}
