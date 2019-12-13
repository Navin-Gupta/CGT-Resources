package com.cgt.training.threads;

class Resource{
	private int [] arr;
	
	synchronized void changeArray() {
		arr= new int[20];
	}
	
	// synchronized void manageArray(String name, int size, int  init) {
	void manageArray(String name, int size, int  init) {
		arr = new int[size];
		for(int i =0;i<size;i++)
			arr[i] = init + i;
		for(int i=0;i<arr.length;i++) {
			System.out.println(name + " : " + arr[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MThreadPro extends Thread{
	
	String name;
	Resource resource;
	int size;
	int init;
	
	public MThreadPro(String name, Resource resource, int size, int init) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.resource = resource;
		this.size = size;
		this.init = init;
	}
	
	public void run() {
		synchronized(this.resource) {
			this.resource.manageArray(name, size, init);
			//
			//
			//
			
		}
	}
}

public class CommonResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new Resource();
		MThreadPro thread1 = new MThreadPro("Thread1", resource, 10, 100);
		MThreadPro thread2 = new MThreadPro("Thread2", resource, 15, 500);
		
		thread1.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
		thread2.start();
		
	}

}
