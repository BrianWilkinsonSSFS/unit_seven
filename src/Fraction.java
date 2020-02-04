public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int n, int d) {
        if (n < 0 && d > 0) {
            this.numerator = n;
            this.denominator = d;
        } else if (n > 0 && d < 0) {
            this.numerator = -n;
            this.denominator = -d;
        } else {
            this.numerator = Math.abs(n);
            this.denominator = Math.abs(d);
        }
        reduce(this.numerator, this.denominator, gcd(this.numerator, this.denominator));
    }

    public Fraction() {
        this(1, 1);
    }

    private void reduce(int num, int dem, int factor) {
        factor = Math.abs(factor);
        this.numerator /= factor;
        this.denominator /=factor;
    }

    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newDenom = f1.denominator * f2.denominator;
        int newNumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        return new Fraction(newNumerator, newDenom);
    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int newDenom = f1.denominator * f2.denominator;
        int newNumerator = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        return new Fraction(newNumerator, newDenom);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int newNumerator = f1.numerator * f2.numerator;
        int newDenominator = f1.denominator * f2.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        int newNumerator = f1.numerator * f2.denominator;
        int newDenominator = f1.denominator * f2.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 4);
        Fraction g = new Fraction(1, 3);
        System.out.println(Fraction.subtract(g, f));
    }

}
