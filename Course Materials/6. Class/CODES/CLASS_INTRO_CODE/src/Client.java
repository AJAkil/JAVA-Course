public class Client {
    public static void main(String[] args) {
        Character c = new Character("a","M","Running",500,800);
        //c.attack();
        //c.defend();
        //System.out.println(c.getName());
        //c.setName("akil");
        //System.out.println(c.getName());
        c.setHealth(6000);
        System.out.println(c.getHealth());
    }
}
