class MyStack {
    int[] a;
    int N;

    public MyStack() {
        a = new int[100];
    }

    public void push(int x) {
        a[N++] = x;
    }

    public int pop() {
        return a[--N];
    }

    public int top() {
        return a[N - 1];
    }

    public boolean empty() {
        return N == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */