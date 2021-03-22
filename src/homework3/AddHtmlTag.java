package homework3;

public class AddHtmlTag {
    /*3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
    Given a tag and a word string, create the HTML string with tags around the word, e.g. "<i>Hello</i>".

    Task: word = Welcome to Java World, tag=p

    For example:
    tag=h1, words=Java Tutorials -> <h1>Java Tutorials</h1>
     */
    public static void main(String[] args) {
        System.out.println(addTag("Hello","h1"));
        System.out.println(addTag("Java Tutorials","h1"));
        System.out.println(addTag("Welcome to Java World", "p"));
    }

    public static String addTag(String words, String tag){
        StringBuilder sb = new StringBuilder();
        return sb.append("tag=" + tag + ", words=" +  words + " ->" +
                " <" +  tag + ">" + words + "</" + tag + ">").toString();
    }
}
