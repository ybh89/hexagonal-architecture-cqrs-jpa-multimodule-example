package attribute.command.attributevalue.out.persistence;

import attribute.command.attributevalue.port.out.InsertAllAttributeValuesCommand;
import attribute.command.attributevalue.port.out.InsertAllAttributeValuesPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class AttributeValuePersistenceAdapter implements InsertAllAttributeValuesPort {
    private final AttributeValueRepository attributeValueRepository;

    @Override
    public void insertAllAttributeValues(InsertAllAttributeValuesCommand insertAllAttributeValuesCommand) {
        final Long attributeId = insertAllAttributeValuesCommand.getAttributeId();

        List<AttributeValue> attributeValues = insertAllAttributeValuesCommand.getAttributeValueNames().stream()
                .map(name -> new AttributeValue(attributeId, name))
                .collect(Collectors.toList());
        attributeValueRepository.saveAll(attributeValues);
    }
}
