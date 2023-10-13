import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }



    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public int getTill(){
        return this.till;
    }

    public void setTill(int newTill){
        this.till = newTill;

    }
    public int getStockCount(){
        return this.stock.size();
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    public void addStock(Artwork newArtwork) {
        this.stock.add(newArtwork);
    }
    public void sellArtwork(Artwork artwork, Customer customer) {
//        get specific artwork object from array list stock
//        check price of artwork
//        increase till by that amount and decrease customers wallet by that amount
        if(customer.getWallet()> artwork.getPrice()) {
            this.till += artwork.getPrice();
            customer.payItem(artwork.getPrice());
            this.stock.remove(artwork);
            customer.addArtCollection(artwork);

        }else{
            System.out.println("You do not have sufficient funds - unable to purchase artwork.");
        }
    }

    public int stock_take(){
        int total = 0;
        for(Artwork artwork : this.stock){
            total += artwork.getPrice();
        }
        return total;
    }
}

