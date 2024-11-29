public class Primes {
    public static void main(String[] args) {
        int last = 1 + Integer.parseInt(args[0]);
        boolean[] allPrime = new boolean[last];
        allPrime[0] = false;
        allPrime[1] = false;
        for (int i=2; i<last; i++) {
            allPrime[i] = true;
        }
        int p = 2;
        while (p<Math.sqrt(last-1)) {
            for (int i=p+1; i<last; i++) {
                if (i%p==0) {
                    allPrime[i]= false;
                }
            }
                p++;
                while (allPrime[p]==false) {
                    p++;
            }
        }
        System.out.println("Prime numbers up to " + (last-1) + ":");
        int count = 0;
        for (int i=2; i<last; i++) {
            if (allPrime[i]==true) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + (last-1) + " (" + ((100*count)/(last-1)) + "% are primes)");
    }
}