package logicalPrograms;

public class Starpgm {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

/*
*
* *
* * *
* * * *
* * * * *
*/

//Explanation
/*
i=5 j=5

*

i=4 5>=4,5>=5

* *

i=3 5>=5 5>=4 5>=3

* * *

i=2 5>=5 5>=4 5>=5 5>=2

* * * *

i=1 5>=5 5>=4 5>=5 5>=2

* * * * **/