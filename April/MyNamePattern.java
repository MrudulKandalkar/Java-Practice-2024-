class MyNamePattern
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=30;j++) 
			{
				if (j==1 ||(i==2&&j==2)||(i==3&&j==3)||(i==2&&j==4)||j==5|| j==7 ||(i==1&&j==8)||(i==1&&j==9)||(i==2&&j==9)||(i==3&&j==9)||(i==3&&j==8)||(i==4&&j==8)||(i==5&&j==9)||j==11||j==14||(i==5&&j==12)||(i==5&&j==13)||(j==17)||j==20||(i==1&&j==18)||(i==1&&j==19)||(i==5&&j==18)||(i==5&&j==19)||(i==1&&j==16)||(i==5&&j==16)||j==22||j==25||(i==5&&j==23)||(i==5&&j==24)||j==27||(i==5&&j==28)||(i==5&&j==29)||(i==5&&j==30)) 
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}