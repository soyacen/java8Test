package dasd.ss;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		List<Integer> ls2=new ArrayList<>();

		for(int i=0;i<10;i++){
			ls.add(i);
		}
		ls2.addAll(ls);
		System.out.println(ls.size()+","+ls2.size());
		ls.clear();
		System.out.println(ls.size()+","+ls2.size());

		
	}
}
