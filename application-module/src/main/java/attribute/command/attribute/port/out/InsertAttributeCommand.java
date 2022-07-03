package attribute.command.attribute.port.out;

import attribute.command.attribute.Attribute;
import lombok.Getter;

@Getter
public class InsertAttributeCommand {
    private String name;

    private InsertAttributeCommand(String name) {
        this.name = name;
    }

    public static InsertAttributeCommand from(Attribute attribute) {
        return new InsertAttributeCommand(attribute.name());
    }
}
