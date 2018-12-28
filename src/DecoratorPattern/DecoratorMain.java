package DecoratorPattern;

public class DecoratorMain {
	public static void main(String[] args) {

		// 그냥 용감한 쿠키 만들기
		Cookie braveCookie = new BraveCookie();

		// 우유를 얹은 용감한 쿠키 만들기
		Cookie milkBraveCookie = new MilkTopping(braveCookie);

		// 그위에 초콜릿을 얹은 용감한 쿠키 만들기
		Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);

		// 그위에 우유를 한번 더 넣은 용감한 쿠키 만들기
		Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);

		System.out.println(chocolateDoubleMilkBraveCookie.getName());

		// 소다 쿠키 만들기
		Cookie SodaCookie = new Cookie() {
			@Override
			public String getName() {
				return "소다 쿠키";
			}
		};

		// 초콜릿을 두번 넣은 소다 쿠키 만들기
		SodaCookie = new ChocolateTopping(new ChocolateTopping(SodaCookie));

		System.out.println(SodaCookie.getName());
	}
}