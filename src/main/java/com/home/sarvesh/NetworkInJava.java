package com.home.sarvesh;
import java.net.*;
import java.util.Arrays;

public class NetworkInJava {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		address = InetAddress.getByName("google.com");
		System.out.println(address);
		InetAddress arr[] = InetAddress.getAllByName("google.com");
		System.out.println(Arrays.toString(arr));
		
	}
	
}
