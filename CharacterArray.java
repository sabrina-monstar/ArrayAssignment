package array;

public class CharacterArray {

	public class search {

	    public static void main(String[] args) {          
	 
	        char[] letters = {'e', 'v', 'o', 'l', '4'};
	        printReverse();

	    }

	    public void printReverse(char[] letters, int size) {
	    
	        for (int i = letters.length-1; i >= 0 ; i--) {
	        System.out.print(letters[i]);
	    }
}
}
}