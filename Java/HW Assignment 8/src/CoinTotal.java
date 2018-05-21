public class CoinTotal {

    public final double PENNY = .01;
    public final double NICKEL = .05;
    public final double DIME = .1;
    public final double QUARTER = .25;
    private double total;

    public CoinTotal()
    {
        getTotal();
    }

    public double getTotal()
    {
        double pennyTotal = Math.random() * 2 * PENNY;
        double nickelTotal = Math.random() * 2 * NICKEL;
        double dimeTotal = Math.random() * 2 * DIME;
        double quarterTotal = Math.random() * 2 * QUARTER;

        total = pennyTotal + nickelTotal + dimeTotal + quarterTotal * 100;

        return total;
    }

    public String toString()
    {
        String strTotal = "The total is: " + total;
        return strTotal;
    }
}
