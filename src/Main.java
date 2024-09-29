import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);
    static BinaryTree bt = new BinaryTree();
    public static void main(String[] args) {

        boolean run = true;
        while(run){
            System.out.println();
            try{
                System.out.print("Binary Tree Operations Menu: \n1. Insert a number \n2. Display Preorder traversal" +
                        "\n3. Display Postorder traversal \n4. Display Inorder traversal \n5. Exit \n" +
                        "Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insert();
                        break;
                    case 2:
                            preorder();
                            break;
                    case 3:
                            postorder();
                            break;
                    case 4:
                            inorder();
                            break;
                    case 5:
                            run = false;
                            break;
                    default:
                            System.out.println("Input only 1-5. ");
                        }
                } catch (Exception e) {
                    System.out.println("Input integer only from 1-5. ");
                    sc.nextLine();
            }
        }
    }
    private static void inorder(){
    bt.inorder();
    }

    private static void postorder() {
        bt.postorder();
    }

    private static void preorder() {
        bt.preorder();
    }

    private static void insert() {
        System.out.print("Enter the number to insert : ");
        int number = sc.nextInt();
        bt.insert(number);
        System.out.println("Inserted number " + number + " into Binary Tree ");
    }
}