package StrategyPattern;

public class AdvancedWebProgrammer extends Programmer {

	// 웹 프로그래머는 기본 웹 관련 서버/클라이언트 사이드 스킬을 알고 있습니다.
	public AdvancedWebProgrammer() {
		ClientSide cs = new AdvancedWebClientSide();
		ServerSide ss = new AdvancedWebServerSide();
		setClient(cs);
		setServer(ss);
	}

	// 모든 스킬을 나열하는 문자열을 만듭니다.
	@Override
	public String getAllSkill() {
		String display = getClientProgramming() + ", " + getServerProgramming();
		return display;
	}
}