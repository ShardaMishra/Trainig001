package ThreadPractice;


class v1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class p1 {

	public static void main(String[] args) {
		Thread v=new v1();
		v.start();
		for(char c='a';c<'z';c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
