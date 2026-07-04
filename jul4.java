
//class, objects, constructors, local vs gloabal variables
class hosp{         //class
    String dname;           //global variable cz its in class, not in fn so it can be used in the entire programme
    String name;
    public hosp(String dname, String name){         //method....dname, name are objects
        this.dname = dname;             //objects, constructors
        this.name = name;   //to use the variable in the next classes, we'll use the keyword "this"
        int id = 100; //local variable
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
