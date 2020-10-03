package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String temp="";
		String[] words=text.split(" ");
		for(int i=0;i<words.length-1;i++){
			for(int j=i;j<words.length-1;j++){
				if(words[i].equals(words[j])){
					temp=words[i];
					count++;
				}
			}
		}
		if(count>1){
			System.out.println(text.replace(temp,""));
		}
	}
}
