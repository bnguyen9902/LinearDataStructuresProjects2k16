
public class CodingGuidelines2 {
	
	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   class Time
	   {
	   private:
	   // Data members (attributes)
	      int hour;
		  int minute;
		  int second;
       public:
	   // Functions for Operating on Time
	      void DisplayTime()
		  {
		     cout << setW(2) << setFill('0') << hour << ":" << 
		     setW(2) << setFill('0') << minute << ":" 
		     << setW(2) << setFill('0') << second << endl;
		  }
		  void setTime(int h=0, int m=0, int s=0);
	   };

	}
  
}
