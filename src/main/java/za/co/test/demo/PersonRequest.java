package za.co.test.demo;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record PersonRequest(String firstName, String surname, double height, double weight, LocalDateTime createdDate) {
}
