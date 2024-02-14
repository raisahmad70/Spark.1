package Spark;

 class instent {
     String name;
 }

class suno extends instent
{ String name;

    void home() {
        super.name="mai hu don";
        name="koi baat ni";
        System.out.println("super variable => "+super.name+" \nmain variable=> "+this.name);
    }
}public class demoo {
    public static void main(String[] args) {
        suno  ins=new suno() ;
        ins.home();
    }
}

