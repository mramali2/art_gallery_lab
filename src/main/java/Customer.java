public class Customer {


    private String name;


    private int wallet;

    public Customer(String name){
        this.name = name;
        this.wallet = 0;
    }

    public String getName() {
        return this.name;
    }
    

    public int getWallet(){
        return this.wallet;
    }

    public void setWallet(int newWalletAmount) {
        this.wallet = newWalletAmount;
    }
}
