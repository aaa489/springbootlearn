package com.example.testdemo.beanutil;

import com.example.testdemo.dto.Person;
import com.example.testdemo.dto.PersonPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Don
 * @date 2021/6/3.
 */
@Mapper
public interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

    PersonPO domain2dto(Person person);
}
