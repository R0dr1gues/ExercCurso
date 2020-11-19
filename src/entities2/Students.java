package entities2;

public class Students {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalNote() {
		return  grade1 + grade2 + grade3;
	}
	public double missingNote () {
		if (finalNote()<60.00) {
				return 60.00 - finalNote();
		}
		else {
				return 0.0;
		}
	}
	
}
