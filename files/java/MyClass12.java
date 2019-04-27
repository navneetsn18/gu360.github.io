import java.io.*;
 	import java.util.*;
 	 
 	public class a {
 	 
 	public static void main(String[] args) {
 	Scanner scan = new Scanner(System.in);
 	String input = "", output = "";
 	int rows, collumns;
 	 
 	while(scan.hasNext()){
 	input += scan.next();
 	}
 	rows = (int) Math.floor(Math.sqrt(input.length()));
 	collumns = (int) Math.ceil(Math.sqrt(input.length()));
 	 
 	if (collumns*rows < input.length()){
 	rows++;
 	}
 	 
 	
 	 
 	char matrix[][] = new char[rows][collumns];
 	 
 	
 	for(int row_i=0; row_i<rows; row_i++){
 	for(int collumn_i=0; collumn_i<collumns; collumn_i++){
 	if(((row_i*collumns)+collumn_i) < (input.length())){
 	matrix[row_i][collumn_i] = input.charAt((row_i*collumns)+collumn_i);
 	}
 	}
 	}
 	 
 	
 	for(int collumn_i=0; collumn_i<collumns; collumn_i++){
 	for(int row_i=0; row_i<rows; row_i++){
 	if(((row_i*collumns)+collumn_i) < (input.length())){
 	output += matrix[row_i][collumn_i];
 	}
 	}
 	if(collumn_i < (collumns-1)){
 	output+=" ";
 	}
 	}
 	System.out.println(output);
 	}
 	}
