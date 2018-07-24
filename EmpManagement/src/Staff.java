
public abstract class Staff {

		protected String name;
		
		public abstract void calculateSalary();
		
		public Staff() {
			name = "";
		}
		
		public Staff(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		public String setName() {
			return name;
		}
	

}
