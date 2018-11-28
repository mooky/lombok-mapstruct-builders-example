package ru.simsonic.experiments.lombokmapstruct;

import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
public class Dto {

    String text;

    int number;
}
