package ass2;

public class a2b1 {
    private String name;
    private String city;

    public a2b1(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayPersonInfo() {
        String capitalizedName = utility.CapitalString.capitalizeFirstLetter(name);
        System.out.println("Name: " + capitalizedName);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        a2b1 person = new a2b1("john", "New York");
        person.displayPersonInfo();
    }
}