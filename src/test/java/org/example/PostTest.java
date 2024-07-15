package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostTest {

    @Test
    void testSetReactionSymbol() {
        Post post = new Post();
        post.setReactionSymbol("👍");
        assertEquals(0, post.getReactionNumber());
    }

    @Test
    void testGetReactionSymbol() {
        Post post = new Post();
        post.setReactionSymbol("👍");
        assertEquals("👍", post.getReactionSymbol());
    }

}