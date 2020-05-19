import java.util.*;
public class SSTF {

	public static int abs(int x,int y)
	{
		if(x>y)
			return x-y;
		if(y>x)
			return y-x;
		return  0;
	}
	static  int min(int x,int y)
	{
		if(x>=y)
			return y;
		if(y>x)
			return x;
		return 0;
	}
	public void sstf(Vector<Integer>p,int start)
	{
		int sum=0;
		int min=0;
		int max=0;
		int choosen;
		int z=p.size();
		System.out.println("the SSTF sequence is: ");
		for(int i=0;i<z;i++)
		{
			p.add(start);
			p.sort(null);
			int off=p.indexOf(start);
			if(off==0)
			{
				 max=p.elementAt(off+1);
				 choosen=max;
			}
			else if(off==p.size()-1)
			{
				 min=p.elementAt(off-1);
				 choosen=min;
			}
			else
			{
				 min=p.elementAt(off-1);
				 max=p.elementAt(off+1);
				 int x;int y;
				 x=abs(min,start);
				 y=abs(max,start);
				 if(x>y) {choosen=max;}
				 else {choosen=min;}
			}
			
			
			int offset=p.indexOf(choosen);
			System.out.print(choosen+"    ");
			sum+=abs(choosen,start);
			start=choosen;
			p.removeElementAt(offset);
			p.removeElementAt(off);
		}
		System.out.println(" ");
		System.out.println("The total head movement of SSTF is:  "+sum);
		System.out.println("****************************************************** ");
	}
}
