import java.util.Scanner;

public class DLL {  
  
    //Representing a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to the newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //display() will print out the elements of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        } 
        System.out.println("\n");
    }  

    //deleteFromTheEnd() will delete a node from the end of the list  
    public void deleteFromTheEnd() {  
      //Checks whether list is empty  
      if(head == null) { 
          System.out.println("List is empty");
          return;  
      }  
      else {  
          //Checks whether the list contains only one node  
          if(head != tail) {  
              System.out.println("Deleted the node "+tail.data);
              //Previous node to the tail will become new tail  
              tail = tail.previous;  
              //Node next to current tail will be made null 
              tail.next = null;  
          }  
          //If the list contains only one element  
          //Then it will remove node and now both head and tail will point to null  
          else {  
              System.out.println("Deleted the node "+head.data);
              head = tail = null;  
          }  
          
      }  
    }

    //insertAtTheBeginning() will add a node to the starting of the list  
public void insertAtTheBeginning(int data) {  
     //Create a new node  
     Node newNode = new Node(data);  
       
     //If list is empty  
     if(head == null) {  
         //Both head and tail will point to newNode  
         head = tail = newNode;  
         //head's previous will point to null  
         head.previous = null;  
         //tail's next will point to null, as it is the last node of the list  
         tail.next = null;  
     }  
     //Add newNode as new head of the list  
     else {  
         //head's previous node will be newNode  
         head.previous = newNode;  
         //newNode's next node will be head  
         newNode.next = head;  
         //newNode's previous will point to null  
         newNode.previous = null;  
         //newNode will become new head  
         head = newNode;  
     }  
 }  
      
public static void main(String[] args) {  

int choice;
    DLL dList = new DLL(); 
    Scanner scanner = new Scanner(System.in);   
    System.out.println("\nPlease enter the n number of nodes\n");
    int n = scanner.nextInt();
    //Add nodes to the list 
    System.out.println("Enter any "+n+" values to add to the list:\n");
    for(int i = 0;i < n;i++) {
        int value = scanner.nextInt();
    dList.addNode(value);  
    } 
     dList.display();


do{
System.out.println("Choose any one of the menu options listed below\n 1.Delete a node from the end \n 2.Insert a node at the beginning \n 3.Display the doubly linked list \n 4.Stop\n");
 choice = scanner.nextInt();
switch(choice){
    case 1:
        dList.deleteFromTheEnd();  
        break;
    case 2 :
        System.out.println("\nPlease enter a value in integer to insert a new node:\n");
    int newNodeInsert = scanner.nextInt();
          //Adding 1 node to the list  
          dList.insertAtTheBeginning(newNodeInsert);
          System.out.println("Added node "+newNodeInsert);
        break;
    case 3:
        dList.display();
        break;
    case 4:
        System.exit(0);
        break;import java.util.Scanner;

public class DLL {  
  
    //Representing a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to the newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //display() will print out the elements of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        } 
        System.out.println("\n");
    }  

    //deleteFromTheEnd() will delete a node from the end of the list  
    public void deleteFromTheEnd() {  
      //Checks whether list is empty  
      if(head == null) { 
          System.out.println("List is empty");
          return;  
      }  
      else {  
          //Checks whether the list contains only one node  
          if(head != tail) {  
              System.out.println("Deleted the node "+tail.data);
              //Previous node to the tail will become new tail  
              tail = tail.previous;  
              //Node next to current tail will be made null 
              tail.next = null;  
          }  
          //If the list contains only one element  
          //Then it will remove node and now both head and tail will point to null  
          else {  
              System.out.println("Deleted the node "+head.data);
              head = tail = null;  
          }  
          
      }  
    }

    //insertAtTheBeginning() will add a node to the starting of the list  
public void insertAtTheBeginning(int data) {  
     //Create a new node  
     Node newNode = new Node(data);  
       
     //If list is empty  
     if(head == null) {  
         //Both head and tail will point to newNode  
         head = tail = newNode;  
         //head's previous will point to null  
         head.previous = null;  
         //tail's next will point to null, as it is the last node of the list  
         tail.next = null;  
     }  
     //Add newNode as new head of the list  
     else {  
         //head's previous node will be newNode  
         head.previous = newNode;  
         //newNode's next node will be head  
         newNode.next = head;  
         //newNode's previous will point to null  
         newNode.previous = null;  
         //newNode will become new head  
         head = newNode;  
     }  
 }  
      
public static void main(String[] args) {  

int choice;
    DLL dList = new DLL(); 
    Scanner scanner = new Scanner(System.in);   
    System.out.println("\nPlease enter the n number of nodes\n");
    int n = scanner.nextInt();
    //Add nodes to the list 
    System.out.println("Enter any "+n+" values to add to the list:\n");
    for(int i = 0;i < n;i++) {
        int value = scanner.nextInt();
    dList.addNode(value);  
    } 
     dList.display();


do{
System.out.println("Choose any one of the menu options listed below\n 1.Delete a node from the end \n 2.Insert a node at the beginning \n 3.Display the doubly linked list \n 4.Stop\n");
 choice = scanner.nextInt();
switch(choice){
    case 1:
        dList.deleteFromTheEnd();  
        break;
    case 2 :
        System.out.println("\nPlease enter a value in integer to insert a new node:\n");
    int newNodeInsert = scanner.nextInt();
          //Adding 1 node to the list  
          dList.insertAtTheBeginning(newNodeInsert);
          System.out.println("Added node "+newNodeInsert);
        break;
    case 3:
        dList.display();
        break;
    case 4:
        System.exit(0);
        break;
    default:
    System.out.println("Please choose the correct option from the menu");
}
    }while(choice!=4);
}  
}
    default:
    System.out.println("Please choose the correct option from the menu");
}
    }while(choice!=4);
}  
}
