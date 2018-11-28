package ru.simsonic.experiments.lombokmapstruct;

import org.mapstruct.factory.Mappers;

public class Main {

    public static void main(String[] args) {
        Dto dto = Dto.builder()
                .text("something")
                .number(100)
                .build();
        System.out.printf("src.text = %s, N = %d%n", dto.getText(), dto.getNumber());

        Converter converter = Mappers.getMapper(Converter.class);
        Model model = converter.fromDto(dto);
        System.out.printf("model.text = %s, N = %d%n", model.getText(), model.getNumber());

        Dto revert = converter.toDto(model);
        System.out.printf("revert.text = %s, N = %d%n", revert.getText(), revert.getNumber());
    }
}
