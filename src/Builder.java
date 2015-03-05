/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */




import java.util.Scanner;
public class Builder {
	public static void main(String[]args){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter Java is fun! ");
		String string= kbd.nextLine();
		StringBuilder s= new StringBuilder(string);
		

		s.append("I Love Java.");
                
                System.out.println("Please enter Yes ");
                String in = kbd.nextLine();
		s.insert(string.length(), in + "\n");
		
                string = "java is fun_yes";
                String[] parts = string.split("_");
                String part1 = parts[0]; 
                String part2 = parts[1];
                System.out.println(part1 +"\n"+ part2 +"\n" + s);
                
		
	}

}


  