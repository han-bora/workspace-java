package kr.co.himedia.builder02;

public class CalzonePizza extends Pizza {
	
	private final boolean sauceInside;

	public CalzonePizza(Builder builder) {
		super(builder);
		// TODO Auto-generated constructor stub
		this.sauceInside = builder.sauceInside;
	}
	
	public static class Builder extends Pizza.Builder {
		
		private boolean sauceInside = false;
		
		public Builder sauceInside() {
			this.sauceInside = true;
			return this;
		}
		
		
		@Override
		protected Builder self() {
			return this;
		}
		
		Pizza build() {
			return new CalzonePizza(this);
			
		}
	
	}

	@Override
	public String toString() {
		return "CalzonePizza [sauceInside=" + sauceInside + "]";
	}
	
	
	

}
