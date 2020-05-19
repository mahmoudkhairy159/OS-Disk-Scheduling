import java.util.*;
public class SCAN {
	public static int abs(int x,int y)
	{
		if(x>y)
			return x-y;
		if(y>x)
			return y-x;
		return  0;
	}
	public void scan(Vector <Integer>p,int start) {
		int sum1=0,sum2=0,sum=0;
		p.add(start);
		p.add(0);
		p.sort(null);
		int off=p.indexOf(start);
		System.out.println("the Scan sequence is: ");
		for(int i=off-1;i>=0;i--) {
			System.out.print(p.elementAt(i)+"    ");
			sum1+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		for(int i=off+1;i<p.size();i++) {
			System.out.print(p.elementAt(i)+"    ");
			sum2+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		System.out.println(" ");
		sum=sum1+sum2;
		System.out.println("The total head movement of SSTF is:  "+sum);
		System.out.println("****************************************************** ");
	}
}
