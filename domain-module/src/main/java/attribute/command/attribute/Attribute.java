package attribute.command.attribute;

public class Attribute {
    private AttributeId id;
    private AttributeName name;

    private Attribute(AttributeName name) {
        this.name = name;
    }

    public static Attribute create(String name) {
        return new Attribute(new AttributeName(name));
    }

    public String name() {
        return name.value();
    }
}
