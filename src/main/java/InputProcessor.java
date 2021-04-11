import person.FactoryPerson;


public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            result = FactoryPerson.createPerson(input).toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}
