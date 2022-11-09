package add.dp.observerPattern;


public class DigitObserver implements Observer {

//	private NumberGenerator numberGenerator;
//	public DigitObserver(NumberGenerator numberGenerator){
//		this.numberGenerator = numberGenerator;
//		numberGenerator.addObserver(this);
//	}
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber()); 
		try {
			
			
			Thread.sleep(100); 
		} catch (InterruptedException e) {
		}
	}
}
