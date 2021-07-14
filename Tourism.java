import java.util.*;
class Project
{
	int guide,place_price=0,price_final=0,
	choice,f_member,cost=0,result;
	String name,phone_no;
	void info()
	{
		System.out.println("Welcome To the Toriusm Management System");
		System.out.println("-----------------------------------");

		System.out.println("..........TOURISM FORM...........");
		System.out.println(" ");

		System.out.println("Please Enter The Following Information  Carefully");
		System.out.println(" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name(Owner of family):");
		name=sc.nextLine();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Enter the Phone Number ");
		phone_no=sc.next();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Enter the numbers of Your Family Members:");
		System.out.print("Members: ");
		f_member=sc.nextInt();
		if(f_member>4 && f_member<=8)
		{
			System.out.println("Your Family Members are "+f_member+"\nSo You Need 2 Vehicles:");
			cost=cost+3000+3000;
			System.out.println(" ");
			System.out.println(" ");
		}
		else if(f_member>8)
		{
			System.out.println("Your Family Members are "+f_member+"\nSo You Need Mini Bus:");
			cost=cost+3000+3000+4000;
			System.out.println(" ");
			System.out.println(" ");
		}
		else
		{
			System.out.println("Your Family Members are "+f_member+"\nSo You Need only 1 Vehicle:");
			cost=cost+3000;
			System.out.println(" ");
			System.out.println(" ");
		}
	}


	void place()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For View All Places You Want To visit in Maharashtra:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("             PLACES                                          PRICE");
			System.out.println(" ");
			System.out.println("1] Hindu temples,Museums & Aga Khan Palace (PUNE):           2000\n"
					+"2] Buddhist Cave Shrines & Lohagad Fort (LONAVLA):           2000\n"
					+"3] Westeen Ghats Trekking & Pratapgad Fort (MAHABALESHWAR):  3000\n"
					+"4] Panchavati temples & Ram Kund Water Tank (NASHIK):        2000\n"
					+"5] Matheran Toy Train & Panoram Point (MATHERAN):            2000\n");
			break;
		};
		if(choice>1)
		{
			System.out.println("Something Went Wrong");
			Project obj1=new Project();
			obj1.place();
		}
	}


	void selectPlace()
	{
		int for_it;
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Please Enter The Number Of Places you want to visit From this list");
		Scanner sc12=new Scanner(System.in);
		for_it=sc12.nextInt();

		int an_choice ;
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Please Choice The Place Which \nYou Want To Visit By Using 1 To 5");
		System.out.println(" ");
		for(int place=1;place<=for_it;place++)
		{
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("1(PUNE)\n2(LONAVLA)\n3(MAHABALESHWAR)\n4(NASHIK)\n5(MATHERAN)");
			System.out.print("Choice: ");
			an_choice=sc.nextInt();
			if(an_choice<1 || an_choice>5)
			{
				System.out.println("Something Went Wrong!");
				Project obj2=new Project();
				obj2.selectPlace();
			}

			switch(an_choice)
			{
				case 1:
				System.out.println("");
				place_price=2000;
				break;
				case 2:
				System.out.println("");
				place_price=2000;
				break;
				case 3:
				System.out.println("");
				place_price=3000;
				break;
				case 4:
				System.out.println("");
				place_price=3000;
				break;
				case 5:
				System.out.println("");
				place_price=2000;
				break;
			};
			for(int price_final1=1;price_final1<=for_it;price_final1++)
			{
				if(price_final1==2)
				{			
					break;
				}
		
				price_final+=place_price;
			}
		}
	}


	void guideInfo()
	{
		int a;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("You Want any Guider OR Any One To Help You?");
		System.out.println("1]YES\n2]NO");
		Scanner sc=new Scanner(System.in);
		System.out.println("YES OR NO: ");
		a=sc.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("THEN,OK!");
			guide=3000+0;
			break;
			case 2:
			System.out.println("OK,NO PROBLEM!");
			guide=0;
			break;
		};
		if(a<1 || a>2)
		{
			System.out.println("Something Went Wrong!");
			Project obj3=new Project();
			obj3.guideInfo();
		}
	}


	void billGenerate()
	{
		
		System.out.println("Your bill is ready...");
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("            TOTAL BILL        ");
		System.out.println("Your Name is(Owner of Family) : "+name);
		System.out.println("Your Phone number is          : +91 "+phone_no);
		System.out.println("Cost of Vehicle is            : "+cost);
		System.out.println("Cost of Place is              : "+price_final);
		System.out.println("Cost of Guider is             : "+guide);
		result=cost+guide+price_final;
		System.out.println(" ");
		System.out.println("Total Cost is                 : "+result);
		
	}


	void confirm()
	{
		int ch,pay;
		String e_mail;
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("You Want To Confirm It?");
		System.out.println("1: YES\n2: NO");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Ok,Confirm!!!");
			System.out.println(" ");
			break;
			case 2:
			System.out.println("Ok,No Problem!!!");
			System.out.println(" ");
			break;
		};
		if(ch<1 || ch>2)
		{
			System.out.println("Something Went Wrong!");
			Project obj5=new Project();
			obj5.confirm();
		}
		if(ch==1)
		{
			System.out.println("How You Want to Pay The Bill:");
			System.out.println("1: ONLINE(10% off)\n2: OFFLINE(Full Payment)");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("*Note: If you want to discount then  choose online payment *"); 
			pay=sc.nextInt();
			switch(pay)
			{
				case 1:
				int discount=result/10;
				result=result-discount;
				System.out.println("Final Amount is: "+result);
				break;
				case 2:
				System.out.println("Final Amount is: "+result);
				break;
			};
			if(pay<1 || pay>2)
			{
				System.out.println("Something went Wrong!");
				Project obj6=new Project();
				obj6.confirm();
			}
			System.out.println(" ");
			System.out.println("Enter Your E-mail: ");
			e_mail=sc.next();
			System.out.println(" ");
			System.out.println("E-mail: " +e_mail);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("We Confirm It!\nWe Will Notify You About\nPayment Details And Feedback\nVia E-mail ID");
			System.out.println(" ");
			System.out.println("THANK YOU!");
		}
		else
		{
			System.out.println("THANK YOU!");
		}
	}
}


public class Tourism
{
	public static void main(String args[])
	{
		Project obj=new Project();
		obj.info();
		obj.place();
		obj.selectPlace();
		obj.guideInfo();
		obj.billGenerate();
		obj.confirm();
	}
}


