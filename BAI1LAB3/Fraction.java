package BAI1LAB3;
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

        public Fraction(int num, int den) {
        if (den == 0) {
            System.out.println("Mau so khong duoc bang 0");
            num = 0;
            den = 1;
        } else {
            this.numerator = num;
            this.denominator = den;
        }
    }
        public Fraction( Fraction ps2 ){
        this.numerator=ps2.numerator;
        this.denominator=ps2.denominator;
    };
 

    public Fraction add(Fraction ps2) {
        int ts = numerator * ps2.denominator + ps2.numerator * denominator;
        int ms = denominator * ps2.denominator;
        return new Fraction(ts, ms);
    }
    public Fraction sub(Fraction ps2) {
        int ts = numerator * ps2.denominator - ps2.numerator * denominator;
        int ms = denominator * ps2.denominator;
        return new Fraction(ts, ms);
    }

    public Fraction mul(Fraction ps2) {
        int ts = numerator * ps2.numerator;
        int ms = denominator * ps2.denominator;
        return new Fraction(ts, ms);
    }

    
    public Fraction div(Fraction ps2) {
        int ts = numerator * ps2.denominator;
        int ms = denominator * ps2.numerator;
        return new Fraction(ts, ms);
    }

      public Fraction reduce(){
        int a=numerator;
        int b=denominator;
        while(numerator!=denominator){
            if(numerator>denominator){
                numerator-=denominator;
            } else {
                denominator-=numerator;
            }
        }
        a/=numerator;
        b/=denominator;
        return new Fraction(a,b);

   
}
    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
