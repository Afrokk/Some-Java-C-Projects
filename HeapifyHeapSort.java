import java.util.Random;

// Afrokk Khan - University of Windsor

public class HeapifyHeapSort {

    public static int comparisionCount = 0;
    
    public int Heapify(int[] A, int i, int j) {
        int k;
        if (2*i + 2 <= j) {
            if(A[2*i + 1] < A[2*i + 2]) { //for minHeap A[2 * i + 1] > A[2 * i + 2];
                k = 2 * i + 1; // left child
            }
            else {
                k = 2 * i + 2; // right child
            }
            
        }
        else if (2*i + 1 <= j) {
            k = 2 * i + 1;
        }
        else {
            return comparisionCount;
        }
                
        if (A[i] > A[k]) { //if (A[k] < A[i]) -- for minHeap
            int var = A[i];
            A[i] = A[k];
            A[k] = var; 
        }
        comparisionCount++;
        return Heapify(A, k, j);
    }
    
    public int BuildHeap(int[] A) {
        for (int i = A.length / 2; i >= 0; i--) {
            Heapify(A, i, A.length - 1);
        }
        return comparisionCount;
    }
    
    public int HeapSort(int[] A) {
        comparisionCount += BuildHeap(A);
        for (int i = A.length - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            Heapify(A, 0, i - 1);
        }
        return comparisionCount;
    }
    public static void main(String[] args) {
        HeapifyHeapSort obj = new HeapifyHeapSort();

        int[] A = new int[]{4, 2, 1, 8, 6, 5, 10, 9, 11, 16};
        int[] B = new int[]{12,10,15,19,8,7,20};

        System.out.println("Array before calling Heapify(0,9):");
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        HeapifyHeapSort.comparisionCount = 1;
        HeapifyHeapSort.comparisionCount = obj.Heapify(A,0, 9);

        System.out.println("\n\nAfter calling Heapify(0, 9)");
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Number of comparisons: " + (HeapifyHeapSort.comparisionCount));
        System.out.println();
        System.out.println("Array before calling BuildHeap array:");
        for(int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        HeapifyHeapSort.comparisionCount =0;
        obj.BuildHeap(B);
        System.out.println("Array after calling BuildHeap:");
        for(int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("\nNumber of comparisons: " + HeapifyHeapSort.comparisionCount);
        System.out.println();

        int[] C = new int[100];
        Random random = new Random();
        for (int i = 0; i < C.length; i++) {
            C[i] = random.nextInt(500) + 1;
        }
        
        HeapifyHeapSort.comparisionCount = 0;
        System.out.println("Array before using HeapSort:");
        for(int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        comparisionCount += obj.HeapSort(C);
        System.out.println();
        System.out.println("\nAfter calling HeapSort: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("\nNumber of comparisons: " + HeapifyHeapSort.comparisionCount);
        System.out.println("");
    }
}