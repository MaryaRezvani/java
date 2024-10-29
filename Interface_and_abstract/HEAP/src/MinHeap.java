
// import java.util.Arrays;
// import java.util.Scanner;
class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    // private int leftChild(int index) {
    //     return 2 * index + 1;
    // }

    // private int rightChild(int index) {
    //     return 2 * index + 2;
    // }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int element) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = element;
        int current = size;
        size++;

        // Heapify up
        while (current != 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void printHeap() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(heap[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        System.out.println(result.toString());
    }
}
