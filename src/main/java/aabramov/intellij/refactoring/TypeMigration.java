package aabramov.intellij.refactoring;

class Entity {
    
    // migrate to Long?
    private int id;
    private String name;
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

public class TypeMigration {
    // Stub
}
