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

    public void buyArtwork(Gallery gallery, Artwork artwork){
//        customer buys artwork for specific price if they have enough money
//        check that wallet > artwork price
//        if yes wallet - artwork price and till + artwork price

    }
}
