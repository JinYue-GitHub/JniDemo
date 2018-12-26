package cn.test;

public class JniDemo {

	static{
		System.loadLibrary("JniDemo");
	}
	public native static void set(int i);
    public native static int get();
    public static void main(String[] args) {
        set(59134);
        System.out.println(get());
    }
    
}
