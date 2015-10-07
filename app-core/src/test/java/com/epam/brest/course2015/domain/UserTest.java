package com.epam.brest.course2015.domain;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by kiryl on 05/10/15.
 */
public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        user=new User();
    }

    @Test
    public void testGetLogin() throws Exception {
        user.setLogin("LOGIN");
        assertEquals("LOGIN",user.getLogin());
    }
    @Test
    public void testGetPassword() throws Exception {
        user.setPassword("PASSWORD");
        assertEquals("PASSWORD",user.getPassword());
    }
    @Test
    public void testGetUserId() throws Exception {
        user.setUserId(14);
        assertEquals((Integer)14, user.getUserId());
    }
    @Test
    public void testGetCreatedDate() throws Exception{
        Date date=new Date(2015,7,14);
        user.setCreatedDate(date);
        assertEquals(date,user.getCreatedDate());
    }


}