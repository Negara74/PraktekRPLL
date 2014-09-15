class bubbledortApp
{
	public static void main(String[] args)
	{
		int max=100;
		arraybub arr;
		arr=new arraybub(max);
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(11);
		arr.insert(22);
		arr.insert(66);
		arr.insert(00);
		arr.insert(99);
		arr.insert(33);
		arr.insert(55);
		System.out.println("bilangan acan kaurutkeun : >");
		arr.display();
		arr.bubblesort();
		System.out.println("bilangan nu kaurut : >");
		arr.display();
		System.out.println("_ckakakakakakak_");
	}
}