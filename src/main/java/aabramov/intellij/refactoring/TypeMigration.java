package aabramov.intellij.refactoring;

class Entity {

    // gangnam style, youtube?
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

    public static void main(String[] args) {
        Entity entity = new Entity();
        int id = entity.getId();
        System.out.println("id = " + id);
    }

}
