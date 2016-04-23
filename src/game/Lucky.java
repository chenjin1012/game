package game;
public class Lucky {
	static String name[]=new String[10];
	static int password[]=new int[10];
	static int number[]=new int[10];
	static boolean flog=true;
	static int a=0;
	public static int mune()
	{
		System.out.println("***************luck*********");
		System.out.println("1.regist\t2.login\t3.luck\t4.exit ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		return num;
		
	}
	
	public static void regist()
	{
		System.out.println("input the username:");
		Scanner input=new Scanner(System.in);
		name[a]=input.nextLine();
		System.out.println("input the password");
		password[a]=input.nextInt();
		number[a]=(int)(Math.random()*10);
		System.out.println("You have registed");
		System.out.println("username:"+name);
		System.out.println("usernumber"+number);
		a++;
	
		
		
	}//注册
	public static void login()
	{
		int use_password;
		String use_name;
		System.out.println("input username");
		Scanner input=new  Scanner(System.in);
		do{
		use_name=input.nextLine();
		if(name.equals(use_name))
		{
			System.out.println("input password");
			use_password=input.nextInt();
			for(int i=0;i<3;i++){
				if(i>=3){
					System.out.println("password is wrong,system is out");return;}
			if(password==use_password)
			{
				System.out.println("success login");
				a=1;
				return;
			}else
			{
				System.out.println("passwordS is wrong,please input again");
				return;
			}
			
			}
			
		}else
		{
			System.out.println("you need regist first");
		}
		}while(!(name.equals(use_name)));
	}//��¼
	public static void luck()
	{
		int lucknum[]=new int[5];  
		int use_number;
		//String use_name;
		
		for (int i = 0; i <lucknum.length; i++) {
			lucknum[i]=(int)(Math.random()*10);
		}
		if(a==1){
		System.out.println("luck time~");
		System.out.println("input your usernumber");
		Scanner input =new Scanner(System.in);
		use_number=input.nextInt();
		int j;
		for ( j = 0; j < lucknum.length; j++) {
			if(use_number==lucknum[j])
			{
				System.out.println("you are so luck");
				break;
				
			}
			}
			if(j>=lucknum.length)
			System.out.println("sorry,you have miss the chance,luck number are:");
			
			
		
			
			for (int i = 0; i < lucknum.length; i++) {
				System.out.println(lucknum[i]);
			}
			
		//flog=false;
		System.out.println("do you want try again?Y?N?");
		//System.out.println("GGGGG");
		String a;
		a=input.next();
		if(a.equals("Y")){
			flog=true;
		     return;}
		if(a.equals("N"))
		{
			flog=false;
					return;
		}
		
	
		//Scanner input=new Scanner(System.in);
		
		}
		else
		{
			System.out.println("exit");
			
		}
		return ;
				}

		
		
	
		
		
		
	
	
	public static void main(String[] args) {
       int n;
   
       
       while(a<10){
       n=mune();
		switch (n) {
		case 1:regist();
			break;
		case 2:login();
			//��½
			break;
		case 3:luck();
			//�齱
			break;
		case 4:return;
			//�˳�			break;

		default:
			System.out.println("�������");
			break;
		}
	
	}

	}

}

