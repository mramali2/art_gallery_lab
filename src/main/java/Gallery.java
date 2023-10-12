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
    
    public void addStock(Artwork newArtwork) {
        this.stock.add(newArtwork);
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
    
    
    
//    public int getStock(){
//        return this.stock;
//    }

//    public void setStock(){
//    this.stock= newStock;
//    }
//
//    public int getStockCount(){
//    return this.stockcount;
//    }
//
//    public void setStockCount(){
//    this.stockCount= newstockCount;
//    }
}
