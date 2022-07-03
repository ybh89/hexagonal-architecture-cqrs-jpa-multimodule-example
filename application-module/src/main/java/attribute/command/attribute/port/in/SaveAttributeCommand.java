package attribute.command.attribute.port.in;

import lombok.Getter;

import java.util.List;

@Getter
public class SaveAttributeCommand {
    private String attributeName;
    private List<String> attributeValueNames;

    public SaveAttributeCommand(String attributeName, List<String> attributeValueNames) {
        this.attributeName = attributeName;
        this.attributeValueNames = attributeValueNames;
    }
}
