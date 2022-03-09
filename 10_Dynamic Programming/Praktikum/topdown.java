public class topdown {  
    int[] cache;

    topdown(int[] cache){
        this.cache = cache;
    }

    int fibonacci(int n) {
        if (cache[n] == 0) {
            if (n < 2) cache[n] = n;
            else cache[n] = fibonacci(n-1) + fibonacci( n-2);
        }

        return cache[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(new topdown(new int[n+1]).fibonacci(n));
    }
}

