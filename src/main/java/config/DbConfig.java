package config;

public class DbConfig {
	
		private final String uri="jdbc:mysql://localhost:3306/webappbiblio?zeroDateTimeBehavior=CONVERT_TO_NULL";
		private final String username="root";
		private final String password="*****";
		
		public String getUri() {
			return uri;
		}
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
}
