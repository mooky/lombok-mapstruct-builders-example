package ru.simsonic.experiments.lombokmapstruct;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Model {

    String text;

    int number;
}
