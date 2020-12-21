class Continent{
    String continentName;

    public Continent(String continentName){
        this.continentName = continentName;
    }

    public void show(){
        System.out.println(continentName);
    }

    final void func(){
        System.out.println("This is a final method");
    }

}

class Country extends Continent{
    private String countryName;
    public Country(String continentName, String countryName){
        super(continentName);
        this.countryName = countryName;
    }

    @Override //this is an annotation which is an optional choice
    public void show(){
        System.out.println("country = "+this.countryName + "continent = "+continentName);
    }



    public void showContinent(){
        super.show();
    }

}

public class Overriding {
    public static void main(String[] args) {
        Country country = new Country("Asia","Bangladesh");
        country.show();
        Continent continent = new Continent("Asia");
        //continent.show();
        country.showContinent();
    }
}
