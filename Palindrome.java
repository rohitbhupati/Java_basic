package java_assignment3;

public class Palindrome {
	public static void main(String[] args) {
int no =121;
int temp =no;
int rev=0 ,rem;
while(temp !=0){
	rem = temp%10;
	rev = rev*10 +rem;
	temp = temp/10;
}	
if(no == rev) {
	System.out.print(no+ " its a palindrome");
}
else{
	System.out.print(no+ " its not a palindrome");
}
}
}
