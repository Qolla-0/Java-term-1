package ad231.lashuk;

import java.util.LinkedList;
import java.util.Queue;

public class Cart {

    private final Queue<Item> queue;
    private int capacity;

    public Cart(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean addItem(Item item) {
        return enqueue(item);
    }
    private boolean enqueue(Item item) {
        if (queue.size() == capacity) {
            System.out.println("Queue is full.");
            return false;
        }
        queue.offer(item);
        return true;
    }

    public Item deleteLastAddedItem() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return dequeue();
    }

    private Item dequeue() {
        return queue.poll();
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (Item item : queue) {
           totalPrice += item.price;
        }
        return totalPrice;
    }

    public void raisePrices(float percent) {
        for (Item item : queue) {
           item.raisePriceItem(percent);
        }
    }

    public void decreasePrices(float percent) {
        for (Item item : queue) {
            item.decreasePriceItem(percent);
        }
    }
}

