package conversortdemoneda;

public class CurrencyConverter {
    private static final double MXN_TO_USD_RATE = 0.05; // Tasas de cambio ficticias
    private static final double MXN_TO_EUR_RATE = 0.04;
    private static final double MXN_TO_GBP_RATE = 0.03;
    private static final double MXN_TO_JPY_RATE = 5.48;
    private static final double MXN_TO_KRW_RATE = 57.78;

    private static final double USD_TO_MXN_RATE = 20.00; 
    private static final double EUR_TO_MXN_RATE = 25.00;
    private static final double GBP_TO_MXN_RATE = 33.66;
    private static final double JPY_TO_MXN_RATE = 0.18;
    private static final double KRW_TO_MXN_RATE = 0.017;

    // Métodos para convertir MXN a otras monedas
    public double mxnToUsd(double mxn) { return mxn * MXN_TO_USD_RATE; }
    public double mxnToEur(double mxn) { return mxn * MXN_TO_EUR_RATE; }
    public double mxnToGbp(double mxn) { return mxn * MXN_TO_GBP_RATE; }
    public double mxnToJpy(double mxn) { return mxn * MXN_TO_JPY_RATE; }
    public double mxnToKrw(double mxn) { return mxn * MXN_TO_KRW_RATE; }

    // Métodos para convertir otras monedas a MXN
    public double usdToMxn(double usd) { return usd * USD_TO_MXN_RATE; }
    public double eurToMxn(double eur) { return eur * EUR_TO_MXN_RATE; }
    public double gbpToMxn(double gbp) { return gbp * GBP_TO_MXN_RATE; }
    public double jpyToMxn(double jpy) { return jpy * JPY_TO_MXN_RATE; }
    public double krwToMxn(double krw) { return krw * KRW_TO_MXN_RATE; }
}
