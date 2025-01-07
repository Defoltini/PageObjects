package TestData;

import com.github.javafaker.Faker;

import java.util.Date;
import java.util.Locale;






public class TestData {
    static Faker faker = new Faker(new Locale("en-GB"));
    public static  String firstName = faker.name().firstName(),
            lastName= faker.name().lastName(),
            userEmail= faker.internet().emailAddress(),
            userAddress=faker.address().cityName(),
             userPhone= faker.phoneNumber().subscriberNumber(10),
             userGenter= faker.options().option("Male", "Female", "Other"),
             userHobby= faker.options().option("Sports", "Reading", "Music"),
             userSelectPicture = faker.options().option( "Енот.jpg", "test1.PNG"),
             userSubjects = faker.options().option( "Maths", "English"),
             userState = faker.options().option( "NCR", "Haryana"),
             userMonth = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
             userDateOfBirth = String.format(String.valueOf(faker.number().numberBetween(1, 28))),
             userYear = String.format(String.valueOf(faker.number().numberBetween(1998, 2024)));

     public static String userCity;

      static { // Changed to static block for initialization
             // Fixed equality check from single '=' to '=='  if (userState = "NCR" )
             if (userState.equals("NCR")) {
                 userCity = faker.options().option("Delhi", "Gurgaon", "Noida");
             }
             else
             {
                 userCity =faker.options().option( "Karnal", "Panipat");
             }

    }}
