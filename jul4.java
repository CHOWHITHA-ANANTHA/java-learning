
//class, objects, constructors, local vs gloabal variables
//array index change





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

//array index change
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        for (int i = 0; i < m.length; i++) {
            int firstIdx = 0;       //we name first and last indexes are variables to change them
            int lastIdx = m[i].length - 1;
            
            int newm = m[i][firstIdx];          //interchanging indices
            m[i][firstIdx] = m[i][lastIdx];
            m[i][lastIdx] = newm;
        }
        for (int[] row : m) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + (j < row.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
    }
}

