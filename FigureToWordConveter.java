import java.util.Scanner;
public class FigureToWordConveter {
	public static String  getWord(String input){
		String output="";
		if(input.length()<=3)
			output=output+getFullHundredWord(input);
		if(input.length()>3&&input.length()<=6)
			output=output+getFullThousandWord(input);
			
		if(input.length()>6&&input.length()<=9)
			output=output+getFullMillionWord(input);
		return output;
	} 	public static String  getFullMillionWord(String input){
		String output="millions and more coming soon";
		/*if(input.length()==7)
			output=output+getFullHundredWord(Character.toString(input.charAt(0)))+" Million "+getFullThousandWord((Character.toString(input.charAt(1)))+(Character.toString(input.charAt(2)))+(Character.toString(input.charAt(3))));
		else if(input.length()==8)
			output=output+getFullHundredWord(Character.toString(input.charAt(0))+Character.toString(input.charAt(1)))+" Million "+getFullThousandWord((Character.toString(input.charAt(2)))+(Character.toString(input.charAt(3)))+(Character.toString(input.charAt(4))));
		else 
			output=output+getFullHundredWord(Character.toString(input.charAt(0))+Character.toString(input.charAt(1))+Character.toString(input.charAt(2)))+" Million "+getFullThousandWord((Character.toString(input.charAt(3)))+(Character.toString(input.charAt(4)))+(Character.toString(input.charAt(5))));
		*/return output;
	}
	public static String  getFullThousandWord(String input){
		String output="";
		if(input.length()==4)
			output=output+getFullHundredWord(Character.toString(input.charAt(0)))+"Thousand "+getFullHundredWord((Character.toString(input.charAt(1)))+(Character.toString(input.charAt(2)))+(Character.toString(input.charAt(3))));
		else if(input.length()==5)
			output=output+getFullHundredWord(Character.toString(input.charAt(0))+Character.toString(input.charAt(1)))+"Thousand "+getFullHundredWord((Character.toString(input.charAt(2)))+(Character.toString(input.charAt(3)))+(Character.toString(input.charAt(4))));
		else 
			output=output+getFullHundredWord(Character.toString(input.charAt(0))+Character.toString(input.charAt(1))+Character.toString(input.charAt(2)))+"Thousand "+getFullHundredWord((Character.toString(input.charAt(3)))+(Character.toString(input.charAt(4)))+(Character.toString(input.charAt(5))));
		return output;
		
	}
	public static String  getFullHundredWord(String input){
		String output="";
		if(input.length()<=2&&Integer.parseInt(input)<=20)
			output+=getTensWord(Integer.parseInt(input));
		else if(input.length()==2&&Integer.parseInt(input)>20)
			output=output+getTensMultiples(Integer.parseInt(Character.toString(input.charAt(0))))+getTensWord(Integer.parseInt(Character.toString(input.charAt(1))));
		else if(input.length()==3){
			output=output+getHundredMultiples(Integer.parseInt(Character.toString(input.charAt(0))))+getTensMultiples(Integer.parseInt(Character.toString(input.charAt(1))))+" "+getTensWord(Integer.parseInt(Character.toString(input.charAt(2))));
				if(Character.toString(input.charAt(1)).equals("0")&&Character.toString(input.charAt(2)).equals("0"))
					output=output.replaceAll(" And ", "");
									}
		return output;
	}
	public static String getTensWord(int tensNumber){
		switch (tensNumber){
		case 1: return "One ";
		case 2: return "Two ";
		case 3: return "Three ";
		case 4: return "Four ";
		case 5: return "Five ";
		case 6: return "Six ";
		case 7: return "Seven ";
		case 8: return "Eight ";
		case 9: return "Nine ";
		case 10: return "Ten ";
		case 11: return "Eleven ";
		case 12: return "Twelve ";
		case 13: return "Thirteen ";
		case 14: return "Fourteen ";
		case 15: return "Fifteen ";
		case 16: return "Sixteen ";
		case 17: return "Seventeen ";
		case 18: return "Eighteen ";
		case 19: return "Nineteen ";
		case 20: return "Twenty ";
		default : return "";
		}
	}
		public static String getTensMultiples(int tensNumber){
			switch (tensNumber){
			case 2: return "Twenty ";
			case 3: return "Thirty ";
			case 4: return "Forty ";
			case 5: return "Fifty ";
			case 6: return "Sixty ";
			case 7: return "Seventy ";
			case 8: return "Eighty ";
			case 9: return "Ninety ";
			default : return "";
			}

	}
		public static String getHundredMultiples(int tensNumber){
			switch (tensNumber){
			case 1: return "One Hunderd And ";
			case 2: return "Two Hunderd And ";
			case 3: return "Three Hundred And ";
			case 4: return "Four Hunded And ";
			case 5: return "Five Hundred And ";
			case 6: return "Six Hundred And ";
			case 7: return "Seven Hundred And ";
			case 8: return "Eight Hundred And ";
			case 9: return "Nine Hundred And ";
			default : return "";
			}

	}
	public static String getMoreUnits(int numberLength){
		switch (numberLength){
		case 3: return "Hunderd";
		case 4: case 5:case 6: return "Thousand";
		case 7: case 8: case 9: return "Million";
		default : return "";
		}
		
	}
	public static void main(String[] args) {
		do{
		Scanner ui= new Scanner(System.in);
		System.out.print("Enter An Amount : ");
		String input = ui.next();
		String output = getWord(input);
		System.out.println(output);
		/*String amount = ui.next();
		if(amount.length()<=2)
		System.out.println(getTensWord(Integer.parseInt(amount)));
		else if(Integer.parseInt(Character.toString(amount.charAt(2)))!=0)
		System.out.println(getTensWord(Integer.parseInt(Character.toString(amount.charAt(0))))+" "+getMoreUnits(amount.length()));
		else System.out.println(getTensWord(Integer.parseInt(Character.toString(amount.charAt(0))+Character.toString(amount.charAt(1))))+" "+getMoreUnits(amount.length()));*/
		}while(true);
	}

}
