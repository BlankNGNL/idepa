package Simple_Factory_Pattern;

public class StandardLineBreaker implements LineBreaker {

	@Override
	public String breakLines(String text) {
		return text.substring(0, 44) + "\n" + text.substring(44, 92) + "\n" + text.substring(92);
	}

}
