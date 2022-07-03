package attribute.command.attribute.out.persistence;

import attribute.command.attribute.port.out.InsertAttributeCommand;
import attribute.command.attribute.port.out.InsertAttributePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AttributePersistenceAdapter implements InsertAttributePort {
    private final AttributeRepository attributeRepository;

    @Override
    public Long insertAttribute(InsertAttributeCommand insertAttributeCommand) {
        Attribute attribute = Attribute.from(insertAttributeCommand);
        return attributeRepository.save(attribute).getId();
    }
}
