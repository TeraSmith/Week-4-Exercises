
public class Box {

		
	//declare variable
	public int size = 0;
	
	//method printBox
	public void printBox() {
		
		//loop represents rows
	for (int i = 0; i < size; i++) 
	{
		for (int j = 0; j < size; j++) {
		System.out.print("*");
				
	}

	
	System.out.println();
		}
	
	}
	
	public void printBox(char c) { 
		//overloaded method 
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	//main method
	public static void main(String[] args)
	{
	//create object 
	Box myBox = new Box();
	//change size to 5
	myBox.size =5;
	
	//invoke printBox method
	myBox.printBox();
	//overload method
	myBox.printBox('b'); 

}
}
