
public class Box {

		
		//declare instance variable
	public int size = 0;
	
	//method printBox
	public void printBox() {
		
		//loop represents rows
	for (int i = 0; i < size; i++) 
	{
		for (int j = 0; j < size; j++) {
		System.out.print("*");
				
	}

	//next line 
	System.out.println();
		}
	
	}
	
	public void printBox(char c) { //overloaded method added
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
		//create object for box
	Box myBox = new Box();
	//change size to 5
	myBox.size =5;
	
	//invoke printBox method
	myBox.printBox();
	
	myBox.printBox('b'); //invoke overload method

}
}