import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.extension.ExtendWith;
        import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestingSocialNetwork {
    @Test
    void testingAddUser() {
        /*SocialNetwork sn1 = new SocialNetwork();
        assertEquals(50, sn1.getUsers());
        sn1.addUser();
        assertEquals(51, sn1.getUsers());*/
    }

    @Test
    void testingGoodReview() {
        /*SocialNetwork sn1 = new SocialNetwork();
        SocialNetwork sn2 = new SocialNetwork("MySpace", 32, 5.0);
        sn1.goodReview();
        sn2.goodReview();
        assertEquals(3.0, sn1.getRating());
        assertEquals(5.0, sn2.getRating());*/
    }

    @Test
    void testingBadReview() {
        /*SocialNetwork sn1 = new SocialNetwork();
        SocialNetwork sn2 = new SocialNetwork("MySpace", 32, 5.0);
        sn1.badReview();
        sn2.badReview();
        assertEquals(2.0, sn1.getRating());
        assertEquals(4.5, sn2.getRating());*/
    }

    @Test
    void testingToString() {
        /*SocialNetwork sn1 = new SocialNetwork();
        SocialNetwork sn2 = new SocialNetwork("MySpace", 32, 5.0);
        assertEquals("Facebook has 50 users, and a rating of 2.5", sn1.toString());
        assertEquals("MySpace has 32 users, and a rating of 5.0", sn2.toString());*/
    }

    @Test
    void testingIsBetterThan() {
        /*SocialNetwork sn1 = new SocialNetwork();
        SocialNetwork sn2 = new SocialNetwork("MySpace", 32, 5.0);
        assertEquals(false, sn1.isBetterThan(sn2));
        assertEquals(true, sn2.isBetterThan(sn1));*/
    }
}

