// // 1
// import java.util.LinkedList;

// public class Main {
//     public static LinkedList<Integer> reverse(LinkedList<Integer> otherList) {
//         LinkedList<Integer> reverseList = new LinkedList<>();
//         for (int i = otherList.size() - 1; i >= 0; i--) {
//             reverseList.add(otherList.get(i));
//         }
//         return reverseList;
//     }
//     public static void main(String[] args) {
//         LinkedList<Integer> newList = new LinkedList<>();
//         newList.add(1);
//         newList.add(2);
//         newList.add(3);
//         newList.add(4);
//         System.out.println("Initial list: " + newList);
//         System.out.println("Reverse list: " + reverse(newList));
//     }
// }

// // 2 
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void enqueue(Queue<Integer> otherQueue, Integer element) {
//         otherQueue.add(element);
//     }
//     public static Integer dequeue(Queue<Integer> otherQueue) {
//         return otherQueue.poll();
//     }
//     public static Integer first(Queue<Integer> otherQueue) {
//         return otherQueue.peek();
//     }
//     public static void main(String[] args) {
//         Queue<Integer> newQueue = new LinkedList<>();
//         newQueue.add(1);
//         newQueue.add(2);
//         enqueue(newQueue, 3);
//         enqueue(newQueue, 4);
//         System.out.println("Initial queue: " + newQueue);
//         System.out.println("Removing element: " + dequeue(newQueue));
//         System.out.println("Removing element: " + dequeue(newQueue));
//         System.out.println("Queue now: " + newQueue);
//         System.out.println("Head element: " + first(newQueue));
//         System.out.println("Queue now: " + newQueue);
//     }
// }

// // 3

// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.util.Date;

// public class Main {
//     public static double input(Scanner iScanner) {
//         boolean flag = false;
//         double number = 0.0;
//         do {
//             System.out.printf("Input number: ");
//             flag = iScanner.hasNextDouble(); // проверка на корректный ввод
//             if (flag == true) {
//                 number = iScanner.nextDouble();
//             } else {
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока
//             }
//         } while (flag != true);
//         return number;
//     }

//     public static void main(String[] args) {
//         double result = 0.0;
//         double temp = result;

//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Input 1 - for doing new operation, 0 - for exit: ");
//         char menu = iScanner.next().charAt(0);
//         boolean flag = false;
//         while (menu != '0') {
//             double a = 0.0;
//             if (flag == false) {
//                 a = input(iScanner);
//                 flag = true;
//             } else {
//                 a = result;
//                 System.out.printf("Result now is: %.2f\n", a);
//             }
            

//             char op = '+';
//             System.out.println("Input operation (+ - / *): ");
//             op = iScanner.next().charAt(0);

//             double b = input(iScanner);

//             try {
//                 FileWriter writer = new FileWriter("log4.txt", true);
//                 BufferedWriter bufferWriter = new BufferedWriter(writer);
//                 Date date = new Date();
//                 bufferWriter.write(date.toString());
//                 bufferWriter.write("\n");
//                 switch (op) {
//                     case '+':
//                         temp = result;
//                         result = a + b;
//                         bufferWriter.write(String.format("%.2f + %.2f = %.2f\n", a, b, result));
//                         System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
//                         break;
//                     case '-':
//                         temp = result;
//                         result = a - b;
//                         bufferWriter.write(String.format("%.2f - %.2f = %.2f\n", a, b, result));
//                         System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
//                         break;
//                     case '/':
//                         if (b != 0) {
//                             temp = result;
//                             result = a / b;
//                             bufferWriter.write(String.format("%.2f / %.2f = %.2f\n", a, b, result));
//                             System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
//                         } else{
//                             bufferWriter.write(String.format("Error! Division by zero!\n"));
//                             System.out.println("Error! Division by zero!\n");
//                         }
//                         break;
//                     case '*':
//                         temp = result;
//                         result = a * b;
//                         bufferWriter.write(String.format("%.2f * %.2f = %.2f\n", a, b, result));
//                         System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
//                         break;
//                     default:
//                         bufferWriter.write("Incorrect operation!\n");
//                         break;
//                 }
                
//                 do {
//                     System.out.println("Input 1 - for doing new operation, 2 - for canceling the last operation, 0 - for exit: ");
//                     menu = iScanner.next().charAt(0);
                    
//                     if (menu == '2')
//                     {   
//                         result = temp;
//                         System.out.printf("Ok! Result now is %.2f!\n", result);
//                         bufferWriter.write(String.format("Cancelling operation. A current result is %.2f\n", result));
//                     }     
//                 } while (menu == '2');
//                 bufferWriter.close();
//             } catch (IOException e) {
//                 System.out.println(e);
//             }
//         }
//         iScanner.close();
//     }
// }
