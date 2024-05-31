package SoloDSA;


public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        
        toDoList.addToDo(new Task("Task 1", "I'm going to sleep"));
        toDoList.addToDo(new Task("Task 2", "I'm going to call my mom"));
        toDoList.addToDo(new Task("Task 3", "I'm going to eat chocolate"));
 
        toDoList.viewToDoList();
      
        toDoList.markToDoAsCompleted("Task 3");
        toDoList.markToDoAsCompleted("Task 2");

        toDoList.viewToDoList();
    }
}

