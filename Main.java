public class Main {
    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        String[] strings = sequenceGenerator.getSequence(30);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
