
public class SentenceTool {

    public static boolean startsRight (String sentence)
    {
	return (Character.isUpperCase(sentence.charAt(0)));
    }

    public static boolean endsRight (String sentence)
    {
	return ( sentence.endsWith(".") || (Character.isLetter(sentence.charAt(sentence.length()-1))));
    }

    public static int countLetters (String sentence)
    {
	int ltrCnt = 0;

	for (int i=0; i<sentence.length(); i++) {
	    char ch = sentence.charAt (i);
	    if ( Character.isLetter(ch) ) {
		ltrCnt ++;
	    }
	}
	
	return ltrCnt;
    }

}
