package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Naver extends Authenticator{
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("아이디", "비밀번호");
	}

}
