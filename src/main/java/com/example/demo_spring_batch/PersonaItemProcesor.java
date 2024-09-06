package com.example.demo_spring_batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonaItemProcesor implements ItemProcessor<Persona, Persona>{

    private static final Logger LOG = LoggerFactory.getLogger(PersonaItemProcesor.class);

    @Override
    public Persona process(Persona persona){
        String firstName = persona.getFirstName().toUpperCase();
        String lastName = persona.getLastName().toUpperCase();
        String phone = persona.getPhone();

        Persona transformedPerson = new Persona(firstName, lastName, phone);

        LOG.info("Convirtiendo ("+persona+") a ("+transformedPerson+")");
    
        return transformedPerson;
    }
}
