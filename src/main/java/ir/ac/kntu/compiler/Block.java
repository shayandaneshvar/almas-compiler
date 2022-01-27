package ir.ac.kntu.compiler;

import java.util.LinkedList;
import java.util.List;

public class Block {
    private final int key;
    private final List<String> variables = new LinkedList<>();
    private final Block parent;

    Block(int key, Block parent) {
        this.key = key;
        this.parent = parent;
    }

    public Block getParent() {
        return parent;
    }

    public int getKey() {
        return key;
    }

    public List<String> getVariables() {
        return variables;
    }


    public void addVariableToBlock(String variable) {
        this.variables.add(variable);
    }

    public boolean containsVariable(String variable) {
        return variables.stream().anyMatch(v -> v.equals(variable));
    }
}
