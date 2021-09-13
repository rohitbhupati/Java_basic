package java_assignment3;

public class Reverse_number {
public static void main(String[] args) {
	int number = 123456,rev =0;
	while(number !=0){
	int	rem =number %10;
		rev= rev *10 +rem;
		number = number/10;
	}
System.out.println("the reverse of number is" +rev);
}
}
