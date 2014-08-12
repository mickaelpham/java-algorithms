package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prime {

  public static boolean naivePrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i < n - 1; i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static boolean slightlyBetterPrime(int n) {
    if (n < 2)
      return false;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 2; i < sqrt; i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static boolean[] sieveOfEratosthenes(int max) {
    boolean[] flags = new boolean[max + 1];

    // Set all flags to true other than 0 and 1.
    init(flags);
    int prime = 2;

    while (prime <= Math.sqrt(max)) {
      crossOff(flags, prime);
      prime = getNextPrime(flags, prime);

      if (prime >= flags.length)
        break;
    }

    return flags;
  }

  private static void crossOff(boolean[] flags, int prime) {
    for (int i = prime * prime; i < flags.length; i += prime)
      flags[i] = false;
  }

  private static int getNextPrime(boolean[] flags, int prime) {
    int next = prime + 1;
    while (next < flags.length && !flags[next])
      next++;
    return next;
  }

  private static void init(boolean[] flags) {
    for (int i = 0; i < flags.length; i++)
      flags[i] = i < 2 ? false : true;
  }

  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
    boolean[] flags = sieveOfEratosthenes(Integer.MAX_VALUE / 2);
    for (int i = 0; i < flags.length; i++)
      if (flags[i])
        out.print(i + " ");
    out.println();
    out.close();
    System.out.println(slightlyBetterPrime(4077763));
  }

}
