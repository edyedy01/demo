package za.co.test.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    private PersonService personService;

    @PostMapping("/test-post")
    public ResponseEntity<PersonResponse> testPost(@RequestBody PersonRequest personRequest) {
        log.debug("Entering testPost:  {}", personRequest);

        PersonResponse personResponse = personService.createPerson(personRequest);

        return ResponseEntity.ok(personResponse);
    }
}
