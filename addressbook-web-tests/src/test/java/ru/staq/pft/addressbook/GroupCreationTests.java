package ru.staq.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test9", "test9", "test9"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
