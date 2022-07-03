package attribute.command.attributevalue.port.out;

import attribute.command.attribute.port.event.AttributeCreated;
import lombok.Getter;

import java.util.List;

@Getter
public class InsertAllAttributeValuesCommand {
    private Long attributeId;
    private List<String> attributeValueNames;

    private InsertAllAttributeValuesCommand(Long attributeId, List<String> attributeValueNames) {
        this.attributeId = attributeId;
        this.attributeValueNames = attributeValueNames;
    }

    public static InsertAllAttributeValuesCommand from(AttributeCreated attributeCreated) {
        return new InsertAllAttributeValuesCommand(attributeCreated.getAttributeId()
                , attributeCreated.getAttributeValueNames());
    }
}
