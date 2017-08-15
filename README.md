This test application demonstrate an algorithm to calculate an approximation of pi. 
How to run this app:

1. Clone it 

      git clone https://github.com/francisloumendoza/pi-test.git

2. Go inside the directory 

      cd pi-test

3. Compile and run the app 

      mvn clean package && java -jar target/revelian-test-1.0.jar

4. Access this on your web browser

      http://localhost:8080/
			
			
NOTES: 
pi is neverending but I put a configuration of the term limit. The application.properties lives on src/main/java/resources/application.properties
