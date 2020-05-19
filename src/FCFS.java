import java.util.*;
public class FCFS {
	
	
	public static int abs(int x,int y)
	{
		if(x>y)
			return x-y;
		if(y>x)
			return y-x;
		return  0;
	}
	public void fcfs(Vector <Integer>p,int start)
	{
		int  sum=0;
		System.out.println("the FCFS sequence is: ");
		for(int i=0;i<p.size();i++)
		{
			System.out.print(p.elementAt(i)+"    ");
			sum+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		System.out.println(" ");
		System.out.println("The total head movement of FCFS is:  "+sum);
		System.out.println("****************************************************** ");
	}

}
