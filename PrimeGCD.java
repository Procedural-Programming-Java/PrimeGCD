/**
 * @auther Yaaqov Shkifati
 * @since 03/21/2020
 * @verison 1.0 
 * Description: In this program our objective is to get the
 * greatest common divisor(GCD) from 1-20 and then determine whether or not it
 * is a prime number. Prime numbers hold a special value as pythagoras once said
 * " all things are numbers", because everything is ultimately vibrations and
 * prime defines all other non-primes, some say that they are the building
 * blocks of the universe. Prime numbers show a clear pattern and yet they seem
 * uncatchable, just like Heisenberg uncertainty principle, when you define one
 * part the other part becomes unknowable. When you define a sequence twin pair
 * the other primes become unknowable. Until this day, no one found a formula to
 * generate all the prime numbers. No one ever found the key, except a few
 * pieces for example: Sieve of Eratosthenes, zhang's theorem, and Euler f(n)=
 * n^2+n+41. However, non of the formulas generate a full sequence. It's every
 * mathematicians dream to capture it's sequence and yet no one has ever found
 * it. There was a point when Euler almost captured it when he introduced the
 * formula e^pi*i= cos(pi)+i*sin(pi) then e^pi*i+1=0. Since i^2=-1 and all prime
 * numbers are are odd numbers except for one (2) so when n is prime then i^n+1=
 * +1 0r -1 for n is greater or equal to 3 and n is greater or equal to
 * infinity.This formula is extremely beautiful since it connects all domains in
 * one equation. This also means that there has to be a formula for all prime
 * numbers. However, it's kept a secret because it cracks any code and this
 * could be a cyber security threat. Since most security use the RSA algorithm
 * to encrypt and decrypt messages. The way that RSA algorithm works it uses a
 * public key which is available to anyone and a private key must be kept
 * secret. With this technique, data are encoded with a so-called public key,
 * which is accessible to all; decoding that information requires a private key
 * that only one party knows. Although both parts of this system are called “
 * keys,” the public key is more like a slotted lockbox: anyone can drop
 * something in, or encode a secret message, but only the private key’s holder
 * can unlock the box, or decrypt the message. Different public-key systems can
 * utilize different algorithms, as long as they are based on mathematical
 * problems that are easy to put into place but hard to reverse engineer. For
 * instance, any computer can multiply two extremely large prime numbers
 * together, yet factoring the result is nearly impossible—at least, it would be
 * for a classical machine. Therefore, as we progress to quantum technology and
 * if the secret formula for the sequence prime numbers gets leaked out, it can
 * potentially be a major threat to cyber security.
 *
 * This assignment has really revealed to me how important prime numbers are and
 * how much they play a role in cyber security. As future computer engineering i
 * understand how important this topic is, and i hope to do more research to get
 * a better understanding of various encryption methods and to also expend my
 * knowledge on number theory.
 */
package primegcd;

import java.io.PrintStream;

public class PrimeGCD {

    public static void main(String[] args) throws Exception {
        long num1, num2, gcd, count;
        boolean prime;
        
       PrintStream sc = new PrintStream("Prime.txt");

        count = 0;

        long startTimer = System.currentTimeMillis();

        for (num1 = 1; num1 <= 20; num1++) {
            for (num2 = 1; num2 <= 20; num2++) {

                gcd = GCD(num1, num2);

                prime = isPrimeNumber(gcd);

                if (prime == true) {
                    sc.printf("GCD = %d \n", gcd);
                    count++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time:" + (endTime - startTimer) / 1000 + "seconds");

        System.out.printf("Prime numbers: %d \n", count);
        sc.printf("Prime numbers: %d \n", count);

    }
    //End of main.

    // Method is used to calculate the Greatest Common Divisor. 
    public static long GCD(long num1, long num2) {

        long remainder;

        while (num2 > 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    // Method used to figure  whether if the GCD is prime or not.
    public static boolean isPrimeNumber(long gcd) {

        if (gcd <= 1) {
            return false;
        } else {
            for (int i = 2; i < gcd; i++) {
                if (gcd % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
