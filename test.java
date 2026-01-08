class Test
{
    @Override
    public String toString(){
        return "From Method";
    }
	public static void main(String[] args) {
	     Test t = new Test();
	     System.out.println(t.toString());
	}
}