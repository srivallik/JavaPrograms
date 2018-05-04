
public class Test2 {

	public static void main(String[] args) {
	Hospital h1=new Hospital();
	Hospital h2=new Hospital();
	Hospital h3=new Hospital();
	h1.ShowDetail(726511, "Srivalli");
	h2.ShowDetail(725512,"Sravya");
	h3.ShowDetail(726513,"Vishwa");
	
	}

}
class Hospital
{
	void ShowDetail(int PId,String Pname)
	{
		System.out.println(PId+" "+" "+Pname);
	}
}