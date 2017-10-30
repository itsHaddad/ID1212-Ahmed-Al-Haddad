package hellob;

public class Tuna {
	private int hour;
	private int min;
	private int sec;
	public Tuna() {
		hour =23;
		min =59;
		sec =59; 
	}
	
	public void setTime(int h,int m ,int s) {
		hour= ((h<24 && h>=0 ? h: 0));
		min= ((m<60 && m>=0 ? m:0));
		sec= ((s<60 && s>=0 ? s:0));
	}
	
	public String military() {
		return String.format("%02d:%02d:%02d", hour,min,sec);
	}
}
