FROM openjdk:17
EXPOSE 8081
ADD target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-cp","calculator-1.0-SNAPSHOT.jar","com.shivam.Main"]