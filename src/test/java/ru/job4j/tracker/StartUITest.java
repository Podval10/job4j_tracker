package ru.job4j.tracker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class StartUITest {

//    @Test
//    void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new MockInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC");
//        assertThat(created.getName()).isEqualTo(expected.getName());
//    }
//
//    @Test
//    void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("new item");
//        tracker.add(item);
//        String[] answers = {String.valueOf(item.getId()), "edited item"};
//        StartUI.replaceItem(new MockInput(answers), tracker);
//        Item edited = tracker.findById(item.getId());
//        assertThat(edited.getName()).isEqualTo("edited item");
//    }
//    @Test
//    void whenDeleteItem(){
//        Tracker tracker = new Tracker();
//        Item item = new Item("mmm");
//        tracker.add(item);
//        String[] answers = {String.valueOf(item.getId())};
//        StartUI.deleteItem(new MockInput(answers),tracker);
//        Item deleted = tracker.findById(item.getId());
//        assertThat(deleted).isEqualTo(null);
//    }
@Test
void whenCreateItem() {
    Input input = new MockInput(
            new String[] {"0", "Item name", "1"}
    );
    Item item = new Item("Item name");
    Output output = new StubOutput();
    Tracker tracker = new Tracker();
    item = tracker.add(item);
    UserAction[] actions = {
            new CreateAction(output),
            new ExitAction(output)
    };
    new StartUI(output).init(input, tracker, actions);
    assertThat(output.toString()).isEqualTo("=== Создание новой заявки ===" + System.lineSeparator()
    + "Добавленная заявка: " + item);
}
    @Test
    void whenReplaceItem() {
    Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item")); /* Добавляется в tracker новая заявка */
        String replacedName = "New item name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf((item.getId())),replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo(replacedName);
    }

    @Test
    void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item")); /* Добавляется в tracker новая заявка */
        Input input = new MockInput(
                new String[] {"0",String.valueOf(item.getId()) /* входные параметры для DeleteAction (должны содержать ID добавленной заявки item.getId()) */, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isNull();
    }

    @Test
    void whenExit() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        StringBuilder result = new StringBuilder();
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo(






//                result.append("Меню:")
//                        .append(System.lineSeparator())
//                        .append("0. Завершить программу")
//                        .append(System.lineSeparator())
//                        .append("=== Завершение программы ===")
//                        .append(System.lineSeparator())
//        );
//
                "Меню:" + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator());

    }
}
//
//"=== Создание новой заявки ===
//        Добавленная заявка: Item{id=1, name='Item name', created=18-08-2025 23:39:12}
//        Меню:
//        0. Завершить программу
//        === Завершение программы ===
//        "