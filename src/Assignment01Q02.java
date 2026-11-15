public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double par = 0;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n-1; i += 1) {
            par += (Math.pow(-1, i)) * (1.0 / (2 * i + 1));
        }

        approxPi = par * 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
