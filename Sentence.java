
public class Sentence {

    String sentence = null;

    public void setSentence (String sentenceToBeStored)
    {
	sentence = sentenceToBeStored;
    }

    public String getSentence ()
    {
	return sentence;
    }

    public int length ()
    {
	return sentence.length();
    }

    public boolean startsRight ()
    {
	return (Character.isUpperCase(sentence.charAt(0)));
    }

    public boolean endsRight ()
    {
	return ( sentence.endsWith(".") || (Character.isLetter(sentence.charAt(sentence.length()-1))));
    }

    public int countLetters ()
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
