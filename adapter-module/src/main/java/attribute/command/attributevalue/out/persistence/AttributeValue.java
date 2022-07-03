package attribute.command.attributevalue.out.persistence;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
public class AttributeValue {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long attributeId;
    private String name;

    public AttributeValue(Long attributeId, String name) {
        this.attributeId = attributeId;
        this.name = name;
    }
}
