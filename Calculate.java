public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        Calculate calc = new Calculate();
        int sum1 = Integer.valueOf(args[0]);
        int first = Integer.valueOf(args[1]);
        int second = Integer.valueOf(args[2]);
        System.out.println(first + calc.job(sum1) + second + " = " + calc.sum(first, second, sum1));
    }

    public int sum(int first, int second, int sum1) {
        int sum = 0;
        if (sum1 == 1) {
            sum = first + second;
        }
        if (sum1 == 2)  {
            sum = first * second;
        }
        return sum;
    }

    public String job(int sum1) {
        String job = "";
        if (sum1 == 1) {
            job = " + ";
        }
        if (sum1 == 2) {
            job = " * ";
        }
        return job;
    }
}