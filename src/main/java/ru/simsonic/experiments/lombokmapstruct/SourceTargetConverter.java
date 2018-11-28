package ru.simsonic.experiments.lombokmapstruct;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import static ru.simsonic.experiments.lombokmapstruct.CustomUtils.makeCustom;

@Mapper
public abstract class SourceTargetConverter {

    public abstract Target toTarget(Source source);

    @AfterMapping
    public void after(@MappingTarget Target target) {
        makeCustom(target);
    }
}
