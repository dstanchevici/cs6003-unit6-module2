
public class EvenBetterSentenceToolExample {

    public static void main (String[] argv)
    {
	String s1 = "Always proofread to make sure you didn't any words out.";
	String s2 = null;

	System.out.println (EvenBetterSentenceTool.countLetters(s1) + ", " + EvenBetterSentenceTool.countNonLetters(s1));
	System.out.println (EvenBetterSentenceTool.countLetters(s2) + ", " + EvenBetterSentenceTool.countNonLetters(s2));
    }

}
