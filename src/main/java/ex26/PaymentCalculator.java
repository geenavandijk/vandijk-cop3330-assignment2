package ex26;

public class PaymentCalculator {

    private int apr;
    private int b;
    private int p;

    public int getApr() {
        return apr;
    }

    public void setApr(int apr) {
        this.apr = apr;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }


    public int calculateMonthsUntilPaidOff( ){

        float i = (float) (apr/36500.0);

        double j = (-(1.0/30) * Math.log (1 + b/p *(1- Math.pow(1+i,30)))) / Math.log (1+i);

        return (int) Math.ceil (j);

    }
}
