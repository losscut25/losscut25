package javaEx;

class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelup();
		System.out.println(stv.channel);
//		stv.displayCaption("Hellow World");  // 캡션(자막) 기능을 켠다.
		stv.caption = true;
		stv.displayCaption("Hellow World");
		
	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power; }
	void channelup() {++channel;}
	void channeldown() {--channel; }
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
