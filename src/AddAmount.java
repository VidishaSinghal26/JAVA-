class AddAmount
{
    private int amount = 50;

    public AddAmount()
    {

    }

    public AddAmount(int a)
    {
        amount = a+amount;
    }

    public void displayAmount()
    {
        System.out.println(amount);
    }
}

class Ans
{
    public static void main(String[] args)
    {
        AddAmount a = new AddAmount();
        AddAmount b = new AddAmount(40);
        a.displayAmount();
        b.displayAmount();
    }
}
