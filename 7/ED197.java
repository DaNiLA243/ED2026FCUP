class ED197 {
    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b) {
        MyQueue<Integer> res = new LinkedListQueue<>();

        Integer ahold = a.size() > 0 ? a.dequeue() : null;
        Integer bhold = b.size() > 0 ? b.dequeue() : null;

        while (ahold != null || bhold != null) {
            if (bhold == null || (ahold != null && ahold <= bhold)) {
                res.enqueue(ahold);
                ahold = a.size() > 0 ? a.dequeue() : null;
            } else {
                res.enqueue(bhold);
                bhold = b.size() > 0 ? b.dequeue() : null;
            }
        }
        return res;
    }
}