package attribute.command.attributevalue.service;

import attribute.command.attribute.port.event.AttributeCreated;
import attribute.command.attributevalue.port.out.InsertAllAttributeValuesCommand;
import attribute.command.attributevalue.port.out.InsertAllAttributeValuesPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@RequiredArgsConstructor
@Service
public class SaveAttributeValuesService {
    private final InsertAllAttributeValuesPort insertAllAttributeValuesPort;

    @TransactionalEventListener
    public void saveAttributeValues(AttributeCreated attributeCreated) {
        insertAllAttributeValuesPort.insertAllAttributeValues(InsertAllAttributeValuesCommand.from(attributeCreated));
    }
}
