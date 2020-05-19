
import java.util.*;

public class C_LOOK {
	public static int abs(int x,int y)
	{
		if(x>y)
			return x-y;
		if(y>x)
			return y-x;
		return  0;
	}
	public void c_look(Vector <Integer>p,int start) {
		int sum1=0,sum2=0,sum=0;
		p.add(start);
		p.sort(null);
		int off=p.indexOf(start);
		System.out.println("the C_LOOK sequence is: ");
		for(int i=off+1;i<p.size();i++) {
			System.out.print(p.elementAt(i)+"    ");
			sum2+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		for(int i=0;i<off;i++) {
			System.out.print(p.elementAt(i)+"    ");
			sum1+=abs(start,p.elementAt(i));
			start=p.elementAt(i);
		}
		System.out.println(" ");
		sum=sum1+sum2;
		System.out.println("The total head movement of SSTF is:  "+sum);
		System.out.println("****************************************************** ");
	}

}
