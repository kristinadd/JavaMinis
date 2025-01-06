package Synchronized;

public class SynchronizedTest {
  // The synchronized keyword in Java is used to control access to a shared resource in a multithreaded environment. 
  // It ensures that only one thread at a time can execute a block of code or a method that is marked as synchronized. 
  // This prevents race conditions and ensures thread safety.

  // // // // // // // //

  // Synchronized Methods
  // Synchronization is applied to an entire method.
  // The lock is acquired on the object instance (this) or the class (if the method is static).

  // In this example:
  // increment() and getCount() methods are synchronized.
  // Only one thread can execute either of these methods at a time for a single Counter instance.

  private int count = 0;

  // Synchronized method
  public synchronized void increment() {
      count++;
  }

  public synchronized int getCount() {
      return count;
  }



}
