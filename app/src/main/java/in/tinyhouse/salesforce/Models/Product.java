package in.tinyhouse.salesforce.Models;

public class Product {

    private String id;
    private String productName;
    private String barcodeData;
    private String price;
    private String timeAdded;

    public  Product () {}

    //Setter and getter functions for id
    public void setId(String Id){
        this.id = Id;
    }
    public String getId(){
        return id;
    }


}
