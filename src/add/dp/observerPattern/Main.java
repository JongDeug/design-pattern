package add.dp.observerPattern;

import hf.dp.observerPattern.MyHWInfo;

public class Main {
	public static void main(String[] args) {

		MyHWInfo.printInfo();
		NumberGenerator generator = new RandomNumberGenerator();
		

//		Observer observer = new DigitObserver(generator);
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		// 살짝 헷갈리는데 양방향으로 구독을 "정할"수 있는 것 같음.
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		
		
		generator.execute();
		
	}
}
