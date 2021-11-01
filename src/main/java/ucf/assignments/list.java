/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 David La Rosa Giraud
 */
package ucf.assignments;

import java.util.List;

public class list {

    private List<item> toDo = (List<item>) new list();
    private String listTitle;

    public static int addItem(){

        /*
       This method will take an item object and will add it to the toDo list

       Will return 1 if it completes the task

       else will return 0
       */

        return -1;


    }

    public static int deleteItem(){

        /*
       This method will take an int that represent the index of an item from the list and will remove it

       Will return 1 if it completes the task

       else will return 0
       */


        return -1;
    }

    public static int isEmpty(){

        /*
       This method will check if the toDo list is empty

       Will return 0 if it is empty

       else will return 1
       */

        return -1;
    }

    public static int getItem(){

        /*
       This method will take an int that represent the index of an item from the list and will return the corresponding item

       Will return the item
       */

        return -1;
    }

    public static int editTitle(){

        /*
       This method will take a string and will replace the lis title with the provided string

       Will return 1 if it completes the task

       else will return 0
       */


        return -1;

    }

    public static int displayAll(){

        /*
       This method will display all the items from the list using a loop

       Will return 1 if it completes the task

       else will return 0
       */


        return -1;

    }

    public static int displayDone(){

        /*
       This method will display all the completed items from the list using a loop

       Inside the loop it will check if the item is done using isDone() method

       if it is done it will print the item

       else continue

       Will return 1 if it completes the task

       else will return 0
       */

        return -1;
    }

    public static int displayToDo(){

        /*
       This method will display all the to do items from the list using a loop

       Inside the loop it will check if the item is done using isDone() method

       if it is not done it will print the item

       else continue

       Will return 1 if it completes the task

       else will return 0
       */


        return -1;

    }


}
