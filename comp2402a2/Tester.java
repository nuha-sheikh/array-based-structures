package comp2402a2;

import java.util.Random;

public class Tester {

  public static void myStackTest(int n) {
    System.out.println( "Test myStack------");
    MyStack<Integer> ms = new MyFastStack<Integer>();
    ms.push(1);
    ms.push(1);
    // ms.push("apple");
    System.out.println( "Size: " + ms.size() );
    System.out.println( "List: "+ms.toString());
    System.out.println( "Pop Return: " + ms.pop() );
    System.out.println( "Size: " + ms.size() );
    System.out.println( "List: "+ms.toString());

    System.out.println( "Done Test myStack------");
  }

  public static void myDequeTest(int n) {
    System.out.println( "Test myDeque------");
    MyDeque<String> md = new MyFastDeque<String>();
    md.addFirst("b");
    md.addFirst("b");
    md.addFirst("a");
    md.addFirst("b");
    System.out.println( "List: "+md.toString());
    md.addLast("c");
    md.removeLast();
    //md.addLast("c");
    //md.addLast("b");
    System.out.println( "Size: " + md.size() );
    System.out.println( "List: "+md.toString());
    //System.out.println( "Return: " + md.removeFirst() );


    // MyDeque<Integer> md = new MyFastDeque<Integer>();
    //
    // Random rand = new Random();
    // for( int i = 0; i < n; i++ ) {
    //   int x = rand.nextInt(3*n/2);
    //   if( rand.nextBoolean() ) {
    //     System.out.println( "addFirst(" + x + ")");
    //     md.addFirst(x);
    //   } else {
    //     System.out.println( "addLast(" + x + ")");
    //     md.addLast(x);
    //   }
    //   System.out.println( md );
    // }
    //
    // while( md.size() > 0 ) {
    //   System.out.println( "size() = " + md.size() );
    //   if( rand.nextBoolean() ) {
    //     System.out.println( "removeFirst() = " + md.removeFirst());
    //   } else {
    //     System.out.println( "removeLast() = " + md.removeLast());
    //   }
    // }
    System.out.println( "Done Test myDeque------");
  }

  public static void main(String[] args) {
    //myStackTest(1000);
    myDequeTest(10);
  }
}
