public class Functions {

    public static int square(int n) {
        int sq = n*n;
        return sq;
    }

    public static int sumOfSquares(int a, int b) {
        int aSquared = square(a);
        int bSquared = square(b);
        int sum = aSquared + bSquared;

        return sum;
    }

    public static int cube(int n) {

        return n*n*n;
    }
    public static int sumOfCubes(int a, int b) {

        return cube(a) + cube(b);
    }


    public static int average(int a, int b, int c) {

        return (a+b+c)/3;
    }

    public static boolean isPythagoreanTriple(int a, int b, int c) {
        // TODO: Benutze in dieser Methode keine arithmetischen Operatoren (i.e. +, -, *, /, % etc.)!

        //if(sumOfSquares(a,b)==square(c)){
        //    return true;
        //}
        return false;
    }

}
