
public class CountCharacter {
	int Count=0;
	String Character="ATMECS";
	
	CountCharacter(){
		System.out.println("Total Count Of Characters");		
	}
	public void charCount() {
		for(int charIndex=0;charIndex<Character.length();charIndex++) {
			Count++;
		}
		System.out.println("String is :"+Character);
		System.out.println("Total Characters in the Given String is :"+Count);
	}
}
