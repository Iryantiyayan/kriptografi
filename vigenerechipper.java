package vigenere;

import java.util.*;
public class vigenerechipper
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String p="",c="",k="",l="abcdefghijklmnopqrstuvwxyz";
		//System.out.print("wat d u want/ p 1 to enc or 2 to dec?");
		
		
		//int m=in.nextInt();
		
			System.out.print("PlainText :");
			p=in.nextLine();
			
			System.out.print("Key       :");
			k=in.nextLine();
			int ky=k.length();
			int pln=p.length();
		String 	y =k;
		int m = pln%ky;
		
			for( int i=1; i<pln/ky ; i++)
			{
				//if(i>=ky)
					//i=0;
				k=k+y;
				
				
				//x.charAt((x.indexOf(K.charAt(j)) + x.indexOf(p1.charAt(j)))%27);
			}
		k=k+k.substring(0,m);	
			//System.out.println(k);
		for (int j=0; j<pln; j++ ){
			c=c + l.charAt((l.indexOf(k.charAt(j)) + l.indexOf(p.charAt(j)))%26);
		}
		c=c.toUpperCase();
		System.out.println("Ciphertext  :"+c);
		
		// Decryption
		c = c.toLowerCase();
		
		String pl = "";
		
		for (int r=0; r<pln; r++ ){
			pl=pl + l.charAt(((l.indexOf(c.charAt(r)) - l.indexOf(k.charAt(r))) +26 )%26);
		}	
		
		System.out.println("decipher    :"+p);
			
		

	}

}