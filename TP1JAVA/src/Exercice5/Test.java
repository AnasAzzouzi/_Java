package Exercice5;

public class Test {
    public static void main(String[] args) {
        FileStatistics fs= new FileStatistics("D:\\TP1JAVA\\src\\Exercice5\\myfile.txt");

        System.out.println(fs.getWordCount());
        System.out.println(fs.getCharCount());
    }
}
