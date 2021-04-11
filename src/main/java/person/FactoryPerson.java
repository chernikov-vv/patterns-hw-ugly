package person;

import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.appearance.Appearance;

public class FactoryPerson {

    public static Person createPerson(final String input) {
        final int intCode = Integer.parseInt(input);

        final FioGenerator fioGenerator = new FioGenerator();
        fioGenerator.generateParams(intCode);
        final Fio fio = fioGenerator.getFio();

        final PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(intCode);
        final Physical physical = physGenerator.buildResponse();

        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(intCode);
        final Appearance appearance = appearanceGenerator.buildResponse();

        final PhoneGenerator phoneGenerator = new PhoneGenerator();
        phoneGenerator.generateParams(intCode);
        Phone phone = phoneGenerator.buildResponse();

        return new Person(input, fio, physical, appearance, phone);
    }
}
