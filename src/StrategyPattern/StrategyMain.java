package StrategyPattern;

public class StrategyMain {
	public static void main(String[] args) {
		Programmer wp = new WebProgrammer(); // 일반 웹 프로그래머
		Programmer awp = new AdvancedWebProgrammer(); // 고급 웹 프로그래머
		Programmer ap = new AmateurProgrammer(); // 아마추어 웹 프로그래머

		// 다이나믹 프로그래머
		Programmer p = new Programmer() {
			@Override
			public String getAllSkill() {
				String display = getClientProgramming() + ", " + getServerProgramming();
				return display;
			}
		};

		// 다이나믹하게 전략을 수립해보자.
		// 다이나믹 프로그래머는 일반 웹 클라이언트 사이드/고급 웹 서버 사이드를 가진다.
		p.setClient(new WebClientSide());
		p.setServer(new AdvancedWebServerSide());

		System.out.println("[WebProgrammer]\n"+wp.getAllSkill());
		System.out.println("[AdvancedWebProgrammer]\n"+awp.getAllSkill());
		System.out.println("[AmateurProgrammer]\n"+ap.getAllSkill());
		System.out.println("[DynamicProgrammer]\n"+p.getAllSkill());
	}
}