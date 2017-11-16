import java.util.*;
import java.math.*;

public class Main{

static int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,
 113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,
 257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,
 409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547, 557,563,569,
 571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709};

 private static int sumDivisors(int n){
  int sum = n;
  int root = (int) (Math.sqrt(n));
  if (root*root!=n) {
   root++;
  }
  for (int x=0; primes[x]<=root; x++) {
   if(n%primes[x]==0){
    sum+=primes[x];
    if (n/primes[x] != primes[x]) {
     sum+=(n/primes[x]);
    }
   }
  }
  if(n!=1){
    sum++;
  }
  return sum;
 }
 public static void main(String[] args) {
  int testCase;
  Scanner sc = new Scanner(System.in);
  testCase = sc.nextInt();
  for (int x=0; x<testCase; x++) {
   int n, k, div=0;
   n=sc.nextInt();
   k=sc.nextInt();
   if (k!=1) {
    while(n%k==0){
     n/=k;
    }
    div=sumDivisors(n);
   }
   System.out.print(div+"\n");
  }
 }
}