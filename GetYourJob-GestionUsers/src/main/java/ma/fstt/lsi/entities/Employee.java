package ma.fstt.lsi.entities;

import java.io.InputStream;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Employee extends AppUser  {
		private InputStream cv;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Employee(InputStream cv) {
			super();
			this.cv = cv;
		}

		public InputStream getCv() {
			return cv;
		}

		public void setCv(InputStream cv) {
			this.cv = cv;
		}

		@Override
		public String toString() {
			return "Employee [cv=" + cv + "]";
		}

}
