package attribute.command.attribute.service;

import attribute.command.attribute.Attribute;
import attribute.command.attribute.port.event.AttributeCreated;
import attribute.command.attribute.port.in.SaveAttributeCommand;
import attribute.command.attribute.port.in.SaveAttributeUseCase;
import attribute.command.attribute.port.out.InsertAttributeCommand;
import attribute.command.attribute.port.out.InsertAttributePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
class SaveAttributeService implements SaveAttributeUseCase {
    private final InsertAttributePort insertAttributePort;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void saveAttribute(SaveAttributeCommand saveAttributeCommand) {
        Attribute attribute = Attribute.create(saveAttributeCommand.getAttributeName());
        Long attributeId = insertAttributePort.insertAttribute(InsertAttributeCommand.from(attribute));
        eventPublisher.publishEvent(new AttributeCreated(attributeId, saveAttributeCommand.getAttributeValueNames()));
    }
}
