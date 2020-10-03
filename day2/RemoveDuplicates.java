package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] companies = {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};
        Set<String> set=new TreeSet<String>();
        for (String string : companies) {
        	set.add(string);
		}
        System.out.println(set);
        for (String asc : set) {
			System.out.println(asc);
		}
	}

}
