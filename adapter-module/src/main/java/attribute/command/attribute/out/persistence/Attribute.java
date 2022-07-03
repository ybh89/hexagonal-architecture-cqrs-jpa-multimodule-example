package attribute.command.attribute.out.persistence;

import attribute.command.attribute.port.out.InsertAttributeCommand;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Attribute {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(updatable = false)
    private String name;

    private Attribute(String name) {
        this.name = name;
    }

    public static Attribute from(InsertAttributeCommand insertAttributeCommand) {
        return new Attribute(insertAttributeCommand.getName());
    }
}
