import java.util.Scanner;
public class invoiceitem {
	final static double taxrate=0.1;

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String Answer,description,invoiceNum;
	double taxamount=0;
	double subtotal=0;
	double grandtotal=0;

	int quantity;
	double unitPrice;

	System.out.print( "Any item? Y/N?" );
	Answer = keyboard.nextLine();
	while (Answer.equals("Y")){

	System.out.print( "Item description?" );
	description= keyboard.nextLine();

	System.out.print( "Invoice Number?" );
	invoiceNum= keyboard.next();
	System.out.print( "Quantity?" );
	quantity= keyboard.nextInt();
	 if (quantity< 0 || quantity>50 )  {
		 System.out.print("out fo quantity range");
		 break;
	 }
	
	System.out.print( "Unit Price?" );
	unitPrice= keyboard.nextDouble();
	
	
	System.out.println("Is it taxable?");
	Boolean taxable = keyboard.nextBoolean();
	keyboard.nextLine();
	items oneItem = new items(description , invoiceNum, quantity, unitPrice);
	subtotal=oneItem.getPrice()*oneItem.getQuantity();
	if (taxable){
	taxamount=subtotal*taxrate;
	}
	else {
	taxamount=0;}
	System.out.println("subtotal"+"\n"+ subtotal );
	System.out.println("tax amount"+"\n"+taxamount);
	grandtotal=subtotal+taxamount+grandtotal;
	if (grandtotal< 0 || grandtotal>1000 ) {
		 System.out.print("Counting Wrong or deficit");
	}
	System.out.print( "Any item? Y/N?" );
	Answer = keyboard.nextLine();
	} 


	System.out.println("grand amount"+"\n"+grandtotal);
	}

}
