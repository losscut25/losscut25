package likey;

public class LikeyDTO {
	
	String userID;
	int evaluationID;
	String userIP;
	
	public LikeyDTO() { //변수를 초기화 해주지 않는 기본 생성자
		
	}
	public LikeyDTO(String userID, int evaluationID, String userIP) {
		this.userID = userID;
		this.evaluationID = evaluationID;
		this.userIP = userIP;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getEvaluationID() {
		return evaluationID;
	}
	public void setEvaluationID(int evaluationID) {
		this.evaluationID = evaluationID;
	}
	public String getUserIP() {
		return userIP;
	}
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}

}
