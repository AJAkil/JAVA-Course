class ManagingDirector{
    String MDname = "AAA";
    ManagingDirector(){
        //System.out.println("Inside the Managing Director's Constructor");
    }

    public void func(){
        System.out.println("Inside the func() of Managing Director");
    }
}

class Manager extends ManagingDirector{
    String managerName = "BBB";
    Manager(){
        //System.out.println("Inside the Manger's Constructor");
    }

    @Override
    public void func(){
        System.out.println("Inside the func() of Manager");
    }
}

class Accountant extends Manager{
    String accountantName = "CCC";
    Accountant(){
        //System.out.println("Inside the Accountant's Constructor");
    }

    @Override
    public void func(){
        System.out.println("Inside the func() of Accountant");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
//        Accountant acc = new Accountant();
//        //acc.func();
//        ManagingDirector md = acc;
//        md.func();

        //------------------------------------ DYNAMIC METHOD DISPATCH----------------------------------
        //--------------------------------------------------------------------------------------------------------------
        ManagingDirector md = new ManagingDirector();
        Manager manager = new Manager();
        Accountant accountant = new Accountant();
        ManagingDirector md2;
        md2 = md;
        md2.func();
        md2 = manager;
        md2.func();
        md2 = accountant;
        md2.func();



    }
}
