//factors of a number
public class Main {
    public static void main(String[] args) {
        int number = 60; 
        System.out.print("Factors of " + number + " are: ");
        
        findFactors(number);
    }
    public static void findFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}



public class Main {
	public static void main(String[] args) {
		String str = "Hello World";
		String str2 = "hello world";
		char[] charArray = {'J','a','v','a'};

		System.out.println(str.charAt(1)); //1. charAt
		System.out.println(str.compareTo(str2)); //2. compareTo
		System.out.println(str.compareToIgnoreCase(str2)); //3. compareToIgnoreCase
		System.out.println(str.concat("!!!")); //4. concat
		System.out.println(str.contains("World")); //5. contains
		System.out.println(str.contentEquals("Hello World")); //6. contentEquals
		System.out.println(String.copyValueOf(charArray)); //7. copyValueOf
		System.out.println(str.endsWith("World")); //8. endsWith
		System.out.println(str.equals(str2)); //9. equals
		System.out.println(str.equalsIgnoreCase(str2)); //10. equalsIgnoreCase
		System.out.println(str.indexOf("o")); //11. indexOf
		System.out.println(str.isEmpty()); //12. isEmpty
		System.out.println(String.join("-", "A","B","C")); //13. join
		System.out.println(str.lastIndexOf("o")); //14. lastIndexOf
		System.out.println(str.length());
		System.out.println(str.matches("Hello.*")); //15. matches
		System.out.println(str.replaceAll("o","0")); //16. replaceAll
		System.out.println(str.replace("World","Java")); //17. replace
		System.out.println(str.replaceFirst("o","0")); //18. replaceFirst
		for(String s : str.split(" ")) System.out.println(s);  //19. split
		System.out.println(str.startsWith("Hello")); //20. startsWith
		System.out.println(str.subSequence(0,5)); //21. subSequence
		System.out.println(str.substring(6)); //22. substring
		System.out.println(str.toCharArray()); //23. toCharArray
		System.out.println(str.toLowerCase()); //24. toLowerCase
		System.out.println(str.toUpperCase()); //25. toUpperCase
		System.out.println(str.toString()); //26. toString
		System.out.println("   trim me   ".trim()); //27. trim
		System.out.println(String.valueOf(1234)); //28. valueof
	}
}

