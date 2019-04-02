class helloworld {
    private native void print();
    public static void main(String[] args) {
        new helloworld().print();
    }
    static {
        System.loadLibrary("helloworld");
    }
}