package attribute.command.attribute;

import attribute.common.exception.InvalidAttributeNameException;

import java.util.Objects;

public class AttributeName {
    private String name;

    public AttributeName(String name) {
        validate(name);
        this.name = name;
    }

    public String value() {
        return name;
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new InvalidAttributeNameException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeName that = (AttributeName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
