package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("name", "body");
        System.out.println(text);
    }

    @Override
    public String generate(String name, String body) {
        return name + " : " + "name" + System.lineSeparator() + body + " : " + "body";
    }
}
