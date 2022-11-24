package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double scoreSubject = 0D;
        int count = 0;
        for (Pupil pupil : pupils) {
           for (Subject subject : pupil.subjects()) {
               scoreSubject += subject.score();
               count++;
           }
        }
        return scoreSubject / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSubject = 0D;
            for (Subject subject : pupil.subjects()) {
                scoreSubject += subject.score();
            }
            rsl.add(new Label(pupil.name(), scoreSubject / pupil.subjects().size()));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> pupilsMap = new LinkedHashMap<>();
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = pupilsMap.getOrDefault(subject.name(), 0);
                pupilsMap.put(subject.name(), score + subject.score());
            }
        }

        for (Map.Entry<String, Integer> map : pupilsMap.entrySet()) {
            int score = map.getValue() / pupils.size();
            rsl.add(new Label(map.getKey(), score));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSubject = 0D;
            for (Subject subject : pupil.subjects()) {
                scoreSubject += subject.score();
            }
            rsl.add(new Label(pupil.name(), scoreSubject));
            rsl.sort(Comparator.naturalOrder());
        }
        return rsl.get(pupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> pupilsMap = new LinkedHashMap<>();
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (pupilsMap.containsKey(subject.name())) {
                    pupilsMap.replace(subject.name(), pupilsMap.get(subject.name()) + subject.score());
                } else {
                    pupilsMap.put(subject.name(), subject.score());
                }
            }
        }

        for (Map.Entry<String, Integer> map : pupilsMap.entrySet()) {
            rsl.add(new Label(map.getKey(), map.getValue()));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(pupils.size() - 1);
    }
}
