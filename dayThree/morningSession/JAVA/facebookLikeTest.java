import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class facebookLikeTest{

    @Test

 public void testThatListIsEmptyWhenThereIsNoLikes(){

        String [] Likes = {""};

        String expectedDisplay = "no one likes";

        assertEquals(expectedDisplay);
    }
