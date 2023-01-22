import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCircularLinkedList <E> implements MyList<E> {
    protected Node<E> tail;
    protected int size;

//    Return the head element in the list
    public E getFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else {
            return tail.next.element;
        }
    }

//     Return the last element in the list
    public E getLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else {
            return tail.element;
        }
    }

//     Add an element to the beginning of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        if (size == 0) // the new node is the only node in list
            tail = newNode;
         // tail points to the new node
        newNode.next = tail.next; // link the new node with the tail
        tail.next = newNode;
        size++; // Increase list size


    }

//     Add an element to the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new for element e
        if (size == 0) {
            tail = newNode; // The new node is the only node in list
        }
        else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail =newNode;
        }
        size++; // Increase size
    }

//    Add a new element at the specified index. The index of the head element is 0
    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        }
        else if (index == size) {
            addLast(e);
        }
        else {
            Node<E> current = tail.next;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
      @Override
    public E get(int index) {
          if (size == 0) {
              throw new IndexOutOfBoundsException("Index is out of Bound");
          }
          else if (index < 0 || index >= size) {
              throw new IndexOutOfBoundsException("Index is out of Bound");
          }
          else if (index == 0) {
             return getFirst();
          }
          else if (index == size - 1) {
              return getLast();
          }
          else {
              Node<E> current = tail.next;
              for (int i = 0; i < index; i++) {
                  current = current.next;
              }
              return current.element;
          }
      }

    @Override
    public int indexOf(Object e) {
          Node<E> current = tail;
        for (int i = 0; i < size; i++) {
            current = current.next;
            if (current.element.equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        int index = -1;
        Node<E> current = tail;
        for (int i = 0; i < size; i++) {
            current = current.next;
            if (current.element.equals(e)){
                index = i;
            }
        }
        return index;
        }
      @Override
    public E set(int index, E e) {
          if (index < 0 || index >= size) {
              throw new IndexOutOfBoundsException();
          }
         else {
              Node<E> current = tail.next;
              for (int i = 0; i < index; i++) {
                  current = current.next;
              }
             E temp = current.element;
              current.element = e;
              return temp;
             }
    }
    // Remove the head node and return the object that is contained in the removed node.
    public E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else {
            E temp = tail.next.element;
            tail.next = (tail.next).next;
            size--;
            if (tail.next == null) {
                tail = null;
            }
            return temp;
        }
    }

    // Remove the last node and return the object that is contained in the removed node.
    public E removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        else if (size == 1) {
            E temp = tail.next.element;
            tail = null;
            size = 0;
            return temp;
        }
        else {
            Node<E> current = tail.next;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            E temp = tail.element;
            Node <E> temp2 = tail.next;
            tail = current;
            tail.next = temp2;
            size--;
            return temp;
        }
    }
    // Remove the element at the specified position in this list. Return the element that was removed from the list.
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous = tail.next;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    @Override
    public boolean contains(Object o) {
        Node<E> current = tail;
        for (int i = 0; i < size; i++) {
            current = current.next;
            if (current.element.equals(o)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void clear() {
        size = 0;
        tail = null;
    }
    @Override
    public int size() {
        return size;
    }
      protected static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
    @Override
    public java.util.Iterator<E> iterator() {
        return new Iterator();
    }
    private class Iterator implements java.util.Iterator<E>{
        int indexNext = 0;
        boolean nextCalled = false;
        boolean visitingAgain = false;
        private Node<E> p2 = tail;
        private Node<E> p1 = tail;
        private Node<E> current = tail.next;

        E e = current.element;
       // Current index
        @Override
        public boolean hasNext() {
            if (current == null ||current == tail.next && visitingAgain) {
               return false;
            }
            visitingAgain = true;
            return true;
        }

        @Override
        public E next() {
            if(!(current== null)) {
                E e = current.element;
                p2 = p1;
                p1 = current;
                current = current.next;
                nextCalled = true;
                return e;
            }
            throw new IllegalCallerException();
        }
        @Override
        public void remove() {
            if(!nextCalled){
                throw new IllegalStateException();
            }
            p2.next = current;
            p1 = p2;
            nextCalled = false;
            size--;
        }
    }
        @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
            if(this.tail== null){
                result.append("]");
                return result.toString();
            }
        Node<E> current = tail.next;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != tail.next) {
                result.append(", "); // Separate two elements with a comma
            }
            else {
                result.append("]"); // Insert the closing ] in the string
            }
        }
        return result.toString();
    }
}
