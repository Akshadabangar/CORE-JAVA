package whileloop;

/*TOPIC = WHILE LOOP...WHILE LOOP IS THE TEST CONDITION IS EVALUATE & CONDITION IS TRUE
IN WHILE LOOP CONDITION WIIL CHECK BEFORE EXECUTION OF BLOCK*/

/*SYNTAX =
 while(condition){
 Body of Loop }
 */

public interface WhileLoop 
{
public static void main(String args[]) 
{
	int i=1;
	while(i<=10) {
		System.out.println(i);
		i++;
	}
}
}
