import java.util.*;

public class Main {

	public static void main(String[] args) {
		 Vector <Integer> p=new Vector <Integer>();
		 Vector <Integer> z=new Vector <Integer>();
		 Vector <Integer> x=new Vector <Integer>();
		 Vector <Integer> m=new Vector <Integer>();
		 Vector <Integer> n=new Vector <Integer>();
			int start=53;
			p.add(98);
			p.add(183);
			p.add(37);
			p.add(122);
			p.add(14);
			p.add(124);
			p.add(65);
			p.add(67);
			for(int i=0;i<p.size();i++) {
				z.add(p.elementAt(i));
				x.add(p.elementAt(i));
				m.add(p.elementAt(i));
				n.add(p.elementAt(i));
			}
			
			FCFS first= new FCFS();
			SSTF second=new SSTF();
			SCAN third=new SCAN();
			C_SCAN fourth=new C_SCAN();
			C_LOOK fifth=new C_LOOK();
			NewOptimizedAlgorittm six=new NewOptimizedAlgorittm();
			
			first.fcfs(p,start);
			second.sstf(p,start);
			third.scan(z, start);
			fourth.c_scan(x, start);
			fifth.c_look(m, start);
			six.NewOptimized(n,0);
			
			
			
	
		 }

}