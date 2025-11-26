package za.co.test.demo;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    PersonRepository personRepository;
    @Override
    public PersonResponse createPerson(PersonRequest personRequest) {
        PersonModel personModel = new PersonModel();
        personModel.setFirstName(personRequest.firstName());
        personModel.setSurname(personRequest.surname());
        personModel.setHeight(personRequest.height());
        personModel.setWeight(personRequest.weight());
        personModel.setCreatedDate(LocalDateTime.now());

        personRepository.save(personModel);
        return null;
    }
}
