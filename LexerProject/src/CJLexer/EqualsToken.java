package CJLexer;

public class EqualsToken implements Token{
    public int hashCode() {
		return 51;
	}
	
	public boolean equals(final Object other) {
		return other instanceof EqualsToken;
	}
	
	public String toString() {
		return "=";
	}
}
