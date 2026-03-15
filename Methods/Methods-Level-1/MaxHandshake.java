public class Maximum_handshake{
    public void Max_handshake(int n) {
        System.out.println("Max Handshake are");
		int handshake=(n*(n-1))/2;
		System.out.println(handshake);
    }
	public static void main(String[] args) {
        Maximum_handshake max = new Maximum_handshake();
        max.Max_handshake(50);
    }
}