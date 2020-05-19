import java.util.*;
public class NewOptimizedAlgorittm {
	public static int abs(int x,int y)
	{
		if(x>y)
			return x-y;
		if(y>x)
			return y-x;
		return  0;
	}
	public void NewOptimized(Vector <Integer>p,int start) {
		int sum=0;
		p.add(start);
		p.sort(null);
		for(int i=0;i<p.size();i++) {
			System.out.print(p.elementAt(i)+"    ");
			sum+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		System.out.println(" ");
		System.out.println("The total head movement of SSTF is:  "+sum);
		System.out.println("****************************************************** ");
		
	}
}
