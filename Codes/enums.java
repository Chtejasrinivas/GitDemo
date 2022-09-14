public class enums
{
    public enum Softdrinks
{
    // In enums the values must mr in caps only
    PEPSI(20,4.5),
    THUMBSUP(30,5),
    SPRITE(15,2.5),
    MIRINDA(30,1.5),
    COLA(35,5.0);
    float rating;
    int price;
    Softdrinks(int price,double rating) 
    {
        this.price= price;
        this.rating = (float) rating;
    }
}
    public static void main(String[] args) {
        System.out.println(Softdrinks.COLA.price);
    }
}
