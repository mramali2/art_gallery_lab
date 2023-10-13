import java.util.ArrayList;

public class Customer {


    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name){
        this.name = name;
        this.wallet = 500;
        this.artCollection = new ArrayList<>();
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

    public void payItem(int itemPrice){
        this.wallet -= itemPrice;
    }

    public int getArtCollectionCount(){
        return this.artCollection.size();
    }
    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void addArtCollection(Artwork newArtwork){
        this.artCollection.add(newArtwork);
    }

    public void setArtCollection(ArrayList<Artwork> artCollection) {
        this.artCollection = artCollection;
    }
//    public void buyArtwork(Gallery gallery, Artwork artwork){
//        customer buys artwork for specific price if they have enough money
//        check that wallet > artwork price
//        if yes wallet - artwork price and till + artwork price

//    }
}
