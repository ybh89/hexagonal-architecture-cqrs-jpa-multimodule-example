package attribute.command.attribute.port.event;

import lombok.Getter;

import java.util.List;

@Getter
public class AttributeCreated {
    private Long attributeId;
    private List<String> attributeValueNames;

    public AttributeCreated(Long attributeId, List<String> attributeValueNames) {
        this.attributeId = attributeId;
        this.attributeValueNames = attributeValueNames;
    }
}
