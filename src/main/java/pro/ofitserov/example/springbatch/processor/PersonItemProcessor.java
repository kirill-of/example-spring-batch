package pro.ofitserov.example.springbatch.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import pro.ofitserov.example.springbatch.model.Person;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person person) {
        final Person transformedPerson = new Person(person.getFirstName().toUpperCase(), person.getLastName().toUpperCase());

        log.debug("Converting {} into {}", person, transformedPerson);
        return transformedPerson;
    }
}
