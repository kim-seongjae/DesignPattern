package CompositePattern;

/**
Node 클래스는 기본적인 파일 및 디렉토리의 근간이라고 가정합니다.
모든 파일과 디렉토리는 이름을 가지고 있을테니 이름을 반환할 getName() 메소드를 가집니다.
*/
public interface Node {
    public String getName();
}