public class Main {
    public static void main(String[] args) {
        int N = 4;
        int Arr[] = { 1, 2, 2, 4 };

        remove_duplicate(Arr, N);
    }

    static int remove_duplicate(int A[], int N) {
        if (N <= 1) {
            return N;
        }

        int c = 1; // Initialize the count of unique elements

        for (int i = 1; i < N; i++) {
            if (A[i] != A[c - 1]) {
                A[c++] = A[i];
            }
        }

        return c;
    }
}
