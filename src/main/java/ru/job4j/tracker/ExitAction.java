package ru.job4j.tracker;

public class ExitAction implements UserAction {
    private final Output output;

    public ExitAction(Output output) {
        this.output = output;
    }
    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("Меню:");
        output.println("0. Завершить программу");
        output.println("=== Завершение программы ===");
        return false;
    }
}
