/**
 * 
 */
package com.main;

/**
 * @author I329523
 *
 */
public class MainTrigger {

	/**
	 * 
	 */
	public MainTrigger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String print = null;
		if(args != null){
			for(int i= 0; i < args.length; i++){
				print = args[0];
			}
			System.out.println(print);
		}
	}

}
