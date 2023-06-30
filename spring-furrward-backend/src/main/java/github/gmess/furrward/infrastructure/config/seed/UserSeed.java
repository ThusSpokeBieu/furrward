package github.gmess.furrward.infrastructure.config.seed;

import github.gmess.furrward.domain.entities.User;

public class UserSeed {

    public static final User[] users = new User[10];

    static {
        User johndoe = new User();
        johndoe.setName("John Doe");
        johndoe.setEmail("johndoe@example.com");
        johndoe.setDocument("123456789");
        johndoe.setPhoneNumber("123456789");
        johndoe.setCountry("United States");
        johndoe.setState("California");
        johndoe.setCity("Los Angeles");
        johndoe.setNeighborhood("Downtown");
        johndoe.setStreetAddress("123 Main St");
        johndoe.setPostalCode("90001");
        users[0] = johndoe;

        User janedoe = new User();
        janedoe.setName("Jane Doe");
        janedoe.setEmail("janedoe@example.com");
        janedoe.setDocument("987654321");
        janedoe.setPhoneNumber("987654321");
        janedoe.setCountry("Canada");
        janedoe.setState("Ontario");
        janedoe.setCity("Toronto");
        janedoe.setNeighborhood("Midtown");
        janedoe.setStreetAddress("456 Elm St");
        janedoe.setPostalCode("M1M 1M1");
        users[1] = janedoe;

        User user3 = new User();
        user3.setName("Michael Johnson");
        user3.setEmail("michaeljohnson@example.com");
        user3.setDocument("654321987");
        user3.setPhoneNumber("654321987");
        user3.setCountry("United Kingdom");
        user3.setState("England");
        user3.setCity("London");
        user3.setNeighborhood("West End");
        user3.setStreetAddress("789 Oak Ave");
        user3.setPostalCode("SW1A 1AA");
        users[2] = user3;

        User user4 = new User();
        user4.setName("Sarah Davis");
        user4.setEmail("sarahdavis@example.com");
        user4.setDocument("456789123");
        user4.setPhoneNumber("456789123");
        user4.setCountry("Australia");
        user4.setState("New South Wales");
        user4.setCity("Sydney");
        user4.setNeighborhood("CBD");
        user4.setStreetAddress("321 George St");
        user4.setPostalCode("2000");
        users[3] = user4;

        User user5 = new User();
        user5.setName("Robert Johnson");
        user5.setEmail("robertjohnson@example.com");
        user5.setDocument("123123123");
        user5.setPhoneNumber("987987987");
        user5.setCountry("United States");
        user5.setState("Texas");
        user5.setCity("Austin");
        user5.setNeighborhood("Downtown");
        user5.setStreetAddress("555 Oak St");
        user5.setPostalCode("78701");
        users[4] = user5;

        User user6 = new User();
        user6.setName("Emma Wilson");
        user6.setEmail("emmawilson@example.com");
        user6.setDocument("987987987");
        user6.setPhoneNumber("123123123");
        user6.setCountry("Canada");
        user6.setState("British Columbia");
        user6.setCity("Vancouver");
        user6.setNeighborhood("Yaletown");
        user6.setStreetAddress("123 Elm St");
        user6.setPostalCode("V6B 2Y5");
        users[5] = user6;

        User user7 = new User();
        user7.setName("David Lee");
        user7.setEmail("davidlee@example.com");
        user7.setDocument("789789789");
        user7.setPhoneNumber("789789789");
        user7.setCountry("United Kingdom");
        user7.setState("Scotland");
        user7.setCity("Edinburgh");
        user7.setNeighborhood("Old Town");
        user7.setStreetAddress("789 High St");
        user7.setPostalCode("EH1 1TG");
        users[6] = user7;

        User user8 = new User();
        user8.setName("Olivia Brown");
        user8.setEmail("oliviabrown@example.com");
        user8.setDocument("741852963");
        user8.setPhoneNumber("741852963");
        user8.setCountry("United States");
        user8.setState("New York");
        user8.setCity("New York City");
        user8.setNeighborhood("Manhattan");
        user8.setStreetAddress("789 Broadway");
        user8.setPostalCode("10003");
        users[7] = user8;

        User user9 = new User();
        user9.setName("Alexander Wilson");
        user9.setEmail("alexanderwilson@example.com");
        user9.setDocument("369258147");
        user9.setPhoneNumber("369258147");
        user9.setCountry("Canada");
        user9.setState("Alberta");
        user9.setCity("Calgary");
        user9.setNeighborhood("Downtown");
        user9.setStreetAddress("456 Main St");
        user9.setPostalCode("T2P 1J9");
        users[8] = user9;

        User user10 = new User();
        user10.setName("Sophia Taylor");
        user10.setEmail("sophiataylor@example.com");
        user10.setDocument("258147369");
        user10.setPhoneNumber("258147369");
        user10.setCountry("Australia");
        user10.setState("Victoria");
        user10.setCity("Melbourne");
        user10.setNeighborhood("Southbank");
        user10.setStreetAddress("321 Collins St");
        user10.setPostalCode("3000");
        users[9] = user10;
    }

    private UserSeed() {

    }
}
