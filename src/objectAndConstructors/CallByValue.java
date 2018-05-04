package objectAndConstructors;

public class CallByValue
{

  public static void main(String args[])
  {
    CallByValue cbv = new CallByValue();
    int x = 10;
    cbv.display(x);
    System.out.println(x); 
  }
  public void display(int y)
  {
    y = 20;
  }
}  