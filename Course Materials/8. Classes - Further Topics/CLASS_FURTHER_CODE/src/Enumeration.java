enum Teams{
    MU, Liverpool, Arsenal, Everton, Chelsea;
}

enum Laliga{
    RealMadrid(33), Barcelona(26), Athletico(10);

    //private variable
    private int numberOfTitlesWon;

    //private constructor
    Laliga(int titles){
        numberOfTitlesWon = titles;
    }

    //public method
    public int getNumberOfTitlesWon(){
        return numberOfTitlesWon;
    }
}

public class Enumeration {
    public static void main(String[] args) {
        //System.out.println(Teams.Chelsea);
        //Teams t = Teams.Liverpool;
        //System.out.println(t);

        //--------------PRE-DEFINED METHOD---------------
        //-----------------------------------------------
        //Teams[] BPl = Teams.values();
        /*for (Teams teams: BPl) {
            System.out.println(teams);
        }*/

        //t = Teams.valueOf("Chelsea");
        //System.out.println(t);

        //-----------------------------------------------
        //-----------------------------------------------
        Laliga spanishTeam = Laliga.valueOf("RealMadrid");
        //System.out.println(spanishTeam.getNumberOfTitlesWon());

        for (Laliga teams : Laliga.values()) {
            System.out.println(teams.getNumberOfTitlesWon());
        }


    }
}
