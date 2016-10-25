import java.io.IOException;
import java.util.LinkedList;

public class StableMarriage {
	LinkedList<String> Person1Couples = new LinkedList<String>();
	LinkedList<String> Person2Couples = new LinkedList<String>();
	LinkedList<String> ControlGroup = new LinkedList<String>();
	
	StableMarriage(){
	}
	StableMarriage(LinkedList<String> Person1, LinkedList<String> Person2){
		Person1Couples = Person1;
		Person2Couples = Person2;
	}
	StableMarriage(LinkedList<String> Person1, LinkedList<String> Person2,LinkedList<String> NewControlGroup){
		Person1Couples = Person1;
		Person2Couples = Person2;
		ControlGroup = NewControlGroup;
	}
//	gale-Shapeley Algorithm is below: 
	public static LinkedList<String> FindCouples (LinkedList<String> Person1Couples,LinkedList<String> Person2Couples){
		for(int i = 1; i < Person1Couples.size(); i++){
//			ignore if interest in Person1 has greater rank than in Person2
			if(Person1Couples.indexOf(Person1Couples.get(i)) > Person2Couples.indexOf(Person1Couples.get(i))){
				continue;
			}
//			delete from Person2 if interest in Person2 has higher rank than in Person1
			if(Person2Couples.indexOf(Person1Couples.get(i)) > Person1Couples.indexOf(Person1Couples.get(i))){
				Person2Couples.remove(Person2Couples.indexOf(Person1Couples.get(i)));
				Person2Couples.add(i, "null");
			}
//			remove Person2's last interest if interest in Person1 has the same rank as in Person 2 
			if(Person1Couples.indexOf(Person1Couples.get(i)) == Person2Couples.indexOf(Person1Couples.get(i))){
				Person2Couples.removeLast();
			}
		}
		return Person2Couples;
	}
	
//	for people that have only 1 other in their couples list
	public static void FindMarriages1Other(LinkedList<String> Person1Couples, LinkedList<String> Person2Couples){
		LinkedList<String> MarriedCouples = new LinkedList<String>();
		for (int i = 1; i < Person2Couples.size(); i++) {
			if (Person1Couples.get(i) != "null") {
				MarriedCouples.add(Person1Couples.get(i));
				if(MarriedCouples.size() == 1){
					System.out.println( MarriedCouples.getFirst());
				}
			}
			else
				continue;
		}
	}
	
//	for people that have at least 2 others in their couples list
	public static void FindMarriages2Other(LinkedList<String> Person1Couples, LinkedList<String> Person2Couples, LinkedList<String> Woman){
		LinkedList<String> MarriedCouples = new LinkedList<String>();
		for (int i = 1; i < Person2Couples.size(); i++) {
			if( ((Person1Couples.get(i)!= "null") && Person2Couples.get(i) != "null" )){
				if(Woman.indexOf(Person1Couples.get(0)) < Woman.indexOf(Person2Couples.get(0)))
					MarriedCouples.add(Person1Couples.get(i));
				if(MarriedCouples.size() == 1)
					System.out.println( MarriedCouples.getFirst());
			}
			if(Person1Couples.get(i) != Person1Couples.get(i))
				continue;
			else
				continue;
		}
	}
	

	
	
	
}