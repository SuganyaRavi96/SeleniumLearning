package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> list=new ArrayList<String>();
		
		for (String string : companies) {
			list.add(string);
		}
		System.out.println(list);
		Collections.sort(list);
		for (String asc : list) {
			System.out.println(asc);
		}
		
	}

}
