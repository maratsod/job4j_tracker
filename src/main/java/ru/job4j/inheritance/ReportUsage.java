package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args)  {
        TextReport report = new TextReport();
        HtmlReport html = new HtmlReport();
        JSONReport json = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        String textHtml = html.generate("Report's name", "Report's body");
        String textJson = json.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println(textHtml);
        System.out.println(textJson);
    }
}
