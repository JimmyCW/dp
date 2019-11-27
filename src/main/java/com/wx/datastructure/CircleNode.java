package com.wx.datastructure;

import java.util.Scanner;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 */
public class CircleNode<T> {

    private Node first;

    private int size;

    public Node getFirst() {
        return first;
    }

    public int size() {
        return size;
    }

    public CircleNode() {
    }

    public void insert(T t) {
        Node node = new Node(t);
        if (first == null) {
            first = node;
            first.next = first;
        } else {
            Node last = null;
            do {
                if (last == null) {
                    last = first.next;
                } else {
                    last = last.next;
                }
            } while (last.next != first);
            last.next = node;
            node.next = first;
        }
        size++;
    }

    /**
     * 头结点有问题
     * @param index
     */
    public void delete(int index) {
        int i = 0;
        Node tmp = first;
        while (i++ < index - 2) {
            tmp = tmp.next;
            if (tmp == null) {
                throw new NullPointerException();
            }
        }
        tmp.next = tmp.next.next;
        size--;
    }

    public void delete(Node node) {
        Node tmp = first;
        int i = 1;
        boolean flag = true;
        while (true) {
            if (!node.getVal().equals(tmp.next.getVal())) {
                tmp = tmp.next;
                i++;
            } else {
                break;
            }
            if(i > size) {
                flag = false;
                break;
            }
        }
        if(flag) {
            if(first.getVal().equals(node.getVal())) {
                first = tmp.next.next;
            }
            tmp.next = tmp.next.next;
            size--;
            System.out.println(size);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        CircleNode circleNode = new CircleNode();
        long mill = System.currentTimeMillis();
        for (int i = 0; i < x; i++) {
            circleNode.insert(i + 1);
        }
        int time = 3;
        int j = 1;
        Node tmp = circleNode.first;
        while (circleNode.size() > 1) {
            if (j % time == 0) {
                Node temp = tmp;
                tmp = tmp.next;
                circleNode.delete(temp);
                j = 1;
            } else {
                j++;
                tmp = tmp.next;
            }
        }
        long m2= System.currentTimeMillis();
        System.out.println(circleNode.first.getVal());
        System.out.println(m2 - mill);
    }

}

class Node<T> {
    private T t;
    public Node next;

    public Node(T t) {
        this.t = t;
    }

    public T getVal() {
        return t;
    }
}