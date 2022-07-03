package attribute.command.attribute.in.web;

import attribute.command.attribute.port.in.SaveAttributeCommand;
import lombok.Getter;

import java.util.List;

@Getter
public class RegisterAttributeRequest {
    private String attributeName;
    private List<String> attributeValueNames;

    public SaveAttributeCommand map()
    {
        return new SaveAttributeCommand(attributeName, attributeValueNames);
    }
}
