package JavaBasics.methods;

public class Flights {

    static String Amazon_URl = "https://www.amazon.in/";
    static String AmazonPaytile = "Amazon Pay tile";
    static String TravelCategory = "Flights";
    static String VerifyLanding = "Flights";

    public static void OpenAmazon(){
        System.out.println("Opening Amazon using the URl" + Amazon_URl);
    }

    public static void Selectingtile(){
        System.out.println("Selecting " + AmazonPaytile + "From the navigation tab");
    }

    public static void FromTravelCategory(){
        System.out.println("Selecting " + TravelCategory + "from Travel Category");
    }

    public static void LandingpageTitle(){
        System.out.println("Verify the titleof the page" + VerifyLanding);
    }

    public static void main(String[] args){
        OpenAmazon();
        Selectingtile();
        FromTravelCategory();
        LandingpageTitle();
    }
}