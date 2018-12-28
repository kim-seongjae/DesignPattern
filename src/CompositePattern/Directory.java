package CompositePattern;

import java.util.List;

public class Directory implements Node {
    private String name;
    private List<Node> children;
    // ...
    @Override
    public String getName(){ return name; }
    public void add(Node node) {
        children.add(node);
    }
}