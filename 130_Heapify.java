public class Solution {
    /**
     * @param A: Given an integer array
     * @return: void
     */
    public void heapify(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        
        for (int i = A.length / 2 - 1; i >= 0; i--) {
            shiftDown(A, i);
        }
    }
    
    private void shiftDown(int[] A, int index) {
        int minIdx = index;
        int leftChildIdx = index * 2 + 1;
        int rightChildIdx = index * 2 + 2;
        if (leftChildIdx < A.length && A[leftChildIdx] < A[minIdx]) {
            minIdx = leftChildIdx;
        }
        if (rightChildIdx < A.length && A[rightChildIdx] < A[minIdx]) {
            minIdx = rightChildIdx;
        }
        
        if (minIdx != index) {
            swap(A, index, minIdx);
            shiftDown(A, minIdx);
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}