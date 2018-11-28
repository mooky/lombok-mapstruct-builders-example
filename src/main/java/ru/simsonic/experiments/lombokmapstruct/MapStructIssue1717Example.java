package ru.simsonic.experiments.lombokmapstruct;

import org.mapstruct.factory.Mappers;

public class MapStructIssue1717Example {

    public static void main(String[] args) {
        Source source = new Source();
        source.setText("String value");
        System.out.println("Source: " + source);

        SourceTargetConverter sourceTargetConverter = Mappers.getMapper(SourceTargetConverter.class);

        Target target = sourceTargetConverter.toTarget(source);
        System.out.println("Target: " + target);
    }
}
