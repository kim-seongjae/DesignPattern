package StrategyPattern;

public class AmateurProgrammer extends Programmer {

	// 아마추어 프로그래머는 클라이언트쪽은 잘 알고 있지만 서버쪽은 평범합니다.
	public AmateurProgrammer() {
		ClientSide cs = new AdvancedWebClientSide();
		ServerSide ss = new WebServerSide();
		setClient(cs);
		setServer(ss);
	}

	@Override
	public String getAllSkill() {
		String display = getClientProgramming() + ", " + getServerProgramming();
		return display;
	}
}