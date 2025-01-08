package TestData;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    private Faker faker;

    public String firstName,
            lastName,
            userEmail,
            userAddress,
            userPhone,
            userGenter,
            userHobby,
            userSelectPicture,
            userSubjects,
            userState,
            userMonth,
            userDateOfBirth,
            userYear,
            userCity;

    public TestData() {
        faker = new Faker(new Locale("en-GB"));
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        userEmail = faker.internet().emailAddress();
        userAddress = faker.address().cityName();
        userPhone = faker.phoneNumber().subscriberNumber(10);
        userGenter = faker.options().option("Male", "Female", "Other");
        userHobby = faker.options().option("Sports", "Reading", "Music");
        userSelectPicture = faker.options().option("Енот.jpg", "test1.PNG");
        userSubjects = faker.options().option("Maths", "English");
        userState = faker.options().option("NCR", "Haryana");
        userMonth = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        userDateOfBirth = String.format("%d", faker.number().numberBetween(1, 29)); // Use 1 to 28
        userYear = String.format("%d", faker.number().numberBetween(1998, 2024));

        setUserCity();
    }


    private void setUserCity() {
        if (userState.equals("NCR")) {
            userCity = faker.options().option("Delhi", "Gurgaon", "Noida");
        } else {
            userCity = faker.options().option("Karnal", "Panipat");
        }
    }
}