
public class Coin extends CoinTotal
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int coinSide;


    public Coin()
    {
        flip();
    }

    public void flip()
    {
        coinSide = (int)(Math.random() * 2);
    }

    public String toString()
    {
        String faceName;

        if(coinSide == HEADS) {
            faceName = "Heads";
        }
        else {
            faceName = "Tails";
        }
        return faceName;
    }



}
