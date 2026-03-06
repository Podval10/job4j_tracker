package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {

        Iterator<Character> iterator = evenElements.iterator();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < evenElements.size(); i+=2) {

            string.append(iterator.next());
                       iterator.next();
            }


            return string.toString();
        }


        private String getDescendingElements () {
            StringBuilder string = new StringBuilder(descendingElements.getLast());
            Iterator<Character> iterator = descendingElements.descendingIterator();
            for (int i = 0; i < descendingElements.size(); i++) {
                while (iterator.hasNext()) {
                    string.append(iterator.next());
                }
            }
            return string.toString();
        }

        public String getReconstructPhrase () {
            return getEvenElements() + getDescendingElements();
        }
    }
