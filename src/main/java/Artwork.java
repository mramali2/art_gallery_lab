public class Artwork {

private String title;

private Artist artist;

private int price;

public Artwork(String title, Artist artist, int price){
    this.title = title;
    this.price = price;
    this.artist = artist;
}


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title= newTitle;
    }

    public String getArtist() {
        return this.artist.getName();
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

//    public void setArtist(String newArtist) {
//        this.artist = newArtist;
//        newArtist="luke";
//    }
}
