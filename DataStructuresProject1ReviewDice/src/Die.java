
public class Die {
   int Value;
   
   Die(){
   }
   public void setDie(int value){
	   Value = value;
   }
   public int getValue(){
	   return Value;
   }
   public void printValue(){
	   if(Value == 0){
		   System.out.println("-1");
	   }
	   if (Value == 1) {
			System.out.println("*");
		}
		if (Value == 2) {
			System.out.println("* *");
		}
		if (Value == 3) {
			System.out.println("* *" + "\n" + " *");
		}
		if (Value == 4) {
			System.out.println("* *" + "\n" + "* *");
		}
		if (Value == 5) {
			System.out.println("* *" + "\n" + " *" + "\n" + "* *");
		}
		if (Value == 6) {
			System.out.println("* *" + "\n" + "* *" + "\n" + "* *");
		}
   }
}
