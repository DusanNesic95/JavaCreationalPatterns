package net.sytes.codeline.builder;

/**
 * @author dusannesic
 * Class implements Builder Design Pattern using
 * Inner Static Class method
 */
public class Sandwich {

	private String bread;
	private String condements;
	private String extras;
	private String meat;
	
	public String getBread() {
		return bread;
	}
	public String getCondements() {
		return condements;
	}
	public String getExtras() {
		return extras;
	}
	public String getMeat() {
		return meat;
	}
	
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", condements=" + condements + ", extras=" + extras + ", meat=" + meat
				+ "]";
	}

	public static class SandwichBuilder {
		private Sandwich sandwich;
		
		public SandwichBuilder() {
			this.sandwich = new Sandwich();
		}
		
		public SandwichBuilder bread(String bread) {
			sandwich.bread = bread;
			return this;
		}
		public SandwichBuilder condements(String condements) {
			sandwich.condements = condements;
			return this;
		}
		public SandwichBuilder extras(String extras) {
			sandwich.extras = extras;
			return this;
		}
		public SandwichBuilder meat(String meat) {
			sandwich.meat = meat;
			return this;
		}
		public Sandwich build() {
			return sandwich;
		}
	}
	
}
