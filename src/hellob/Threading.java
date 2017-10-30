package hellob;

import java.io.IOException;

public class Threading extends Thread{
	private String name;
	private Thread t;
	
	public Threading (String name) {
		System.out.println("Creating thread - "+name);
		this.name=name; 		
	}
	public void run() {
		System.out.println("Running thread - "+name);
		int i = 5;
		while (i>0) {
			System.out.println("cool story mate! Executing thread - "+name);
			i--;
			try {
				t.sleep(50);
				if (i==1)
					System.out.println(t.isAlive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} System.out.println("Exiting thread - "+name);
	}
	
	public void start() {
		System.out.println("Starting thread - "+ name);
		if (t==null) {
		t = new Thread(this,name);
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		}
		
	}

	public static void main(String[] args) {
		Threading t1 = new Threading("1");
		Threading t2 = new Threading("2");
		t1.start();
		t2.start();

	}

}
