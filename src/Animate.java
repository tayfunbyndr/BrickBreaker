
public class Animate implements Runnable {
	BrickBreakerPanel bp;
	
	Animate(BrickBreakerPanel b){
		bp=b;
	}
	public void run(){
		while(true){
			bp.Update();
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
