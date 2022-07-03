package attribute.command.attribute.in.web;

import attribute.command.attribute.port.in.SaveAttributeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RegisterAttributeController {
    private final SaveAttributeUseCase saveAttributeUseCase;

    @PostMapping("/attributes")
    public ResponseEntity<?> registerAttribute(RegisterAttributeRequest registerAttributeRequest) {
        saveAttributeUseCase.saveAttribute(registerAttributeRequest.map());
        return ResponseEntity.ok().build();
    }
}
