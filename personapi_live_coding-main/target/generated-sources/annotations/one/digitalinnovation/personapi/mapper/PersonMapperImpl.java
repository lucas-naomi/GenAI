package one.digitalinnovation.personapi.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.request.PersonDTO.PersonDTOBuilder;
import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.dto.request.PhoneDTO.PhoneDTOBuilder;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.entity.Person.PersonBuilder;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.entity.Phone.PhoneBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-11T11:52:55+0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PersonBuilder person = Person.builder();

        if ( dto.getBirthDate() != null ) {
            person.birthDate( LocalDate.parse( dto.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.cpf( dto.getCpf() );
        person.firstName( dto.getFirstName() );
        person.id( dto.getId() );
        person.phones( phoneDTOListToPhoneList( dto.getPhones() ) );
        person.secondName( dto.getSecondName() );

        return person.build();
    }

    @Override
    public PersonDTO toDTO(Person dto) {
        if ( dto == null ) {
            return null;
        }

        PersonDTOBuilder personDTO = PersonDTO.builder();

        if ( dto.getBirthDate() != null ) {
            personDTO.birthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( dto.getBirthDate() ) );
        }
        personDTO.cpf( dto.getCpf() );
        personDTO.firstName( dto.getFirstName() );
        personDTO.id( dto.getId() );
        personDTO.phones( phoneListToPhoneDTOList( dto.getPhones() ) );
        personDTO.secondName( dto.getSecondName() );

        return personDTO.build();
    }

    protected Phone phoneDTOToPhone(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        PhoneBuilder phone = Phone.builder();

        phone.id( phoneDTO.getId() );
        phone.number( phoneDTO.getNumber() );
        phone.type( phoneDTO.getType() );

        return phone.build();
    }

    protected List<Phone> phoneDTOListToPhoneList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( phoneDTOToPhone( phoneDTO ) );
        }

        return list1;
    }

    protected PhoneDTO phoneToPhoneDTO(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDTOBuilder phoneDTO = PhoneDTO.builder();

        return phoneDTO.build();
    }

    protected List<PhoneDTO> phoneListToPhoneDTOList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneDTO> list1 = new ArrayList<PhoneDTO>( list.size() );
        for ( Phone phone : list ) {
            list1.add( phoneToPhoneDTO( phone ) );
        }

        return list1;
    }
}
