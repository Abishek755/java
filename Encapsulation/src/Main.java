class Encapsulation{
    private static String name1 = "Pre";
    private static String name2;
    private static int sid = 101;
    private static String sname= "Raghav";

    public String getName1(){
        return name1;
    }

    public String getName2(){
        return name2;
    }

    public void setName2(String name2){
        this.name2 = name2;
    }

    public int getsid(){
        return sid;
    }

    public void setsid(int sid){
        this.sid = sid;
    }

    public String getsname(){
        return sname;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }

}

public class Main {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        System.out.println(e.getsid());
        System.out.println(e.getsname());
        e.setsid(102);
        e.setsname("Prethish");
        System.out.println(e.getsid());
        System.out.println(e.getsname());
    }
}