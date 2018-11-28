package ru.simsonic.experiments.lombokmapstruct;

import org.mapstruct.Mapper;

@Mapper
public interface Converter {

    Model fromDto(Dto dto);

    Dto toDto(Model model);
}
