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
    Tracker tracker = new Tracker();
    UserAction[] actions = {
            new CreateAction(),
            new ExitAction()
    };
    new StartUI().init(input, tracker, actions);
    assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
}
    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item")); /* Добавляется в tracker новая заявка */
        String replacedName = "New item name";
        Input input = new MockInput(
                new String[] {"0",String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item")); /* Добавляется в tracker новая заявка */
        Input input = new MockInput(
                new String[] {"0" /* входные параметры для DeleteAction (должны содержать ID добавленной заявки item.getId()) */, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}