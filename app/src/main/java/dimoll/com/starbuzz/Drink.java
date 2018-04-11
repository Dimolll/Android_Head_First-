package dimoll.com.starbuzz;


/**
 * Created by dimoll on 21.02.18.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourcesId;
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    private Drink(String name, String description,int imageResourcesId){
        this.name=name;
        this.description=description;
        this.imageResourcesId=imageResourcesId;
    }

    public String getDescription(){return description;}

    public String getName(){return name;}

    public int getImageResourcesId(){return imageResourcesId;}

    public String toString(){return this.name;}
}
