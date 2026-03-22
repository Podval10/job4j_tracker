package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double sum = 0;
        for (Pupil student : pupils) {
            for (Subject subject : student.subjects()) {
                sum += subject.score();
                count++;
            }

        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil student : pupils) {
            double sum = 0;
            double count = 0;

            for (Subject subject : student.subjects()) {
                sum += subject.score();
                count++;

            }

            list.add(new Label(student.name(), sum / count));

        }

        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil student : pupils) {
            for (Subject subject : student.subjects()) {
                int sum = map.get(subject.name()) == null ? subject.score() : map.get(subject.name()) + subject.score();


                map.put(subject.name(), sum);
            }
        }
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            Label label = new Label(key, value / pupils.size());

            list.add(label);
        }


        return list;

    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label label = null;
        List<Label> list = new ArrayList<>();
        for (Pupil student : pupils) {
            double sum = 0;
            for (Subject subject : student.subjects()) {
                sum += subject.score();
            }

            list.add(new Label(student.name(), sum));

        }
        Collections.sort(list, Comparator.naturalOrder());
        for (Label label1 : list) {
            label = label1;


        }
        return label;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Label label = null;
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil student : pupils) {
            for (Subject subject : student.subjects()) {
                int sum = map.get(subject.name()) == null ? subject.score() : map.get(subject.name()) + subject.score();


                map.put(subject.name(), sum);
            }
        }
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            Label label2 = new Label(key, value);

            list.add(label2);
        }
        Collections.sort(list, Comparator.naturalOrder());
        for (Label label1 : list) {
            label = label1;
        }

        return label;
    }


}