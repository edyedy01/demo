package za.co.test.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @PostMapping("/test-post")
    public ResponseEntity<PersonResponse> hello(@RequestBody PersonRequest personRequest) {


        return ResponseEntity.ok(PersonResponse.builder().id(1).build());
    }
}
