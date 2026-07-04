
//class, objects, constructors
class hosp{         //class
    String dname;
    String name;
    public hosp(String dname, String name){         //method....dname, name are objects
        this.dname = dname;             //objects, constructors
        this.name = name;
    }
}
public class Main{
	public static void main(String[] args) {
	    hosp p1 = new hosp("fever", "radhe");       //calling the object
	    hosp p2 = new hosp("vomits" , "rukmini");
		System.out.println(p1.dname);
		System.out.println(p1.name);
	}
}
