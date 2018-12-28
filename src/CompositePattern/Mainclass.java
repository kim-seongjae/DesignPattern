package CompositePattern;

 class Mainclass {
	public static void main(String[] args) {
		Directory dir = new Directory();
		dir.add(new File()); // 디렉토리에 파일 하나를 삽입!
		dir.add(new Directory()); // 디렉토리에 디렉토리를 삽입!
		Directory secondDir = new Directory();
		secondDir.add(dir); // 기존 루트 디렉토리를 새로 만든 디렉토리에 삽입!
	}
}
