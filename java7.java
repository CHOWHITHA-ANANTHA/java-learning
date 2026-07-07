//single inheritence
import java.util.Scanner;
class parents{ //-------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);                                               //|
    String mom = sc.nextLine();                                                        //|
    String dad = sc.nextLine();                                                        //|
    public void view_parents(){  //--------------------------------------------------- //|--------
        System.out.println("mom: "+mom);                                               //|      //|
        System.out.println("dad: "+dad);                                               //|      //|
    }                                                                                  //|      //|
}                                                                                      //|      //|
class kiddo extends parents{ //<----------------------------------------------------------      //|
    Scanner sc = new Scanner(System.in);                                                //|     //|
    String kid = sc.nextLine();                                                         //|     //|
    public void names(){                                //--------------------------------      //|
        System.out.println("The names in the fam are: "+mom+" ,"+ dad+" ,"+kid);                //|
    }                                                                                           //|
}                                                                                               //|
public class Main{                                                                              //|
	public static void main(String[] args) {                                                      //|
	    Scanner sc = new Scanner(System.in);                                                      //|
		kiddo kid = new kiddo();                                                                    //|
		kid.names();                                                                                //|
		kid.view_parents(); //<------------------------------------------------------------------------
	}
}
