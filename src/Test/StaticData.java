package Test;

public class StaticData {
    static int data=5;
    String name;
    StaticData(String n)
    {
    	name=n;
    }
    static void change()
    {
    	data=6;
    }
    void Display()
    {
    	System.out.println("name is: "+name + " data is:"+ data);
    }
	public static void main(String[] args) {
		StaticData d= new StaticData("Karthi");
		StaticData.change();
        d.Display();
	}

}
