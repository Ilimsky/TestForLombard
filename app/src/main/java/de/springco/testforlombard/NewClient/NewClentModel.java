package de.springco.testforlombard.NewClient;

public class NewClentModel {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private String passport;
    private String phoneNumber;
    private String registrationAddress;
    private String actualAddress;
    private String personalID;

    public NewClentModel() {
        //empty constructor needed
    }

    public NewClentModel(String lastName, String firstName, String patronymic, String dateOfBirth, String passport, String phoneNumber, String registrationAddress, String actualAddress, String personalID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.phoneNumber = phoneNumber;
        this.registrationAddress = registrationAddress;
        this.actualAddress = actualAddress;
        this.personalID = personalID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }
}
