package String_Problem;

import java.util.Scanner;

/*Sami's spaceship crashed on Mars! She sends n sequential SOS messages to Earth for help. Letters in some of the SOS messages are altered 
by cosmic radiation during transmission. Given the signal received by Earth as a string, s, determine how many letters of 
Sami's SOS have been changed by radiation.
input :- SOSSPSSQSSOR,SOSSOT, SOSSOSSOS
output:- 3 , 1 , 0
*/
public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
        String msg = in.nextLine();
        int result = 0;
        for(int i =0; i<msg.length(); i+=3){
            if(msg.charAt(i)!='S'){
                result++;
            }
            if(msg.charAt(i+1)!= 'O'){
                result++;
            }
            if(msg.charAt(i+2)!='S'){
                result++;
            }
        }
        System.out.println(result);
        in.close();
	}
}
