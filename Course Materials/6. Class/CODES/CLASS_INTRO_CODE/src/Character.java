public class Character {
    private String name;
    private String gender;
    private String ability;
    private int strength;
    private int health;

    //Constructor
    //1. No return type
    //2. Name as same as Class name
    //3.Public
    public Character(String nm, String gend, String ab, int hlth, int str){
        System.out.println(" Cons 1 is being called!!!");
        name = nm;
        gender = gend;
        ability = ab;
        health = hlth;
        strength = str;
    }

    //METHOD OVERLOADING
    public Character(){
        System.out.println("Cons 2 is being called!");
    }

    public Character(String nm, String ab){
        System.out.println("Cons 3 is being called!");
        name = nm;
        ability = ab;
    }

    //getters and setters--> special methods of class
    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String nm){
        name = nm;
    }

    public Character(String name, int health) {
        //this --> this object in question
        this.name = name;
        this.health = health;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void useAbility(){
        System.out.println(name+" is "+ability);
    }

    public void useAbility(String specialAbility){
        System.out.println(name+" is "+specialAbility);
    }

    public void moveAhead(){
        System.out.println("I am moving ahead");
    }

    public void attack(){
        System.out.println("I am attacking!!");
    }

    public void defend(){
        System.out.println("I am moving defending");
    }

    public void moveRight(){
        System.out.println("I am moving Right!");
    }

    public void moveLeft(){
        System.out.println("I am moving Left");
    }

    public static void main(String[] args) {
        Character charly = new Character("charly","male","flying",100,100);
        Character harry = new Character();
        Character Smith = new Character("Smith","Walking");

        charly.useAbility();
        charly.useAbility("Kicking");


    }


}
