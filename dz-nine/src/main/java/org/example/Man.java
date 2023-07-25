package org.example;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public Gender getGender() {
        return Gender.Man;
    }

    @Override
    public void registerPartnership(Person partner) {
        if (partner.getGender() == Gender.Woman) {
            this.setPartner(partner);
            ((Woman) partner).setLastName(this.getLastName());
        } else {
            super.registerPartnership(partner);
        }
    }

    @Override
    public void deregisterPartnership(boolean returnLastName) {
        super.deregisterPartnership(returnLastName);
    }
}
