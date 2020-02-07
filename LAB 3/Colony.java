public class Colony
{
	public House[] obj = new House[10];

	//constructor
	public Colony(){}

	public House[] create_array()
	{
		for(int i=0; i<obj.length; i++)
		{
			obj[i] = new House();
		}
        return obj;
	}

	public double ColonyEarnings()
	{
		double colony_earning = 0.0;
        create_array();
		for(int i=0; i<obj.length; i++)
		{
			colony_earning += (obj[i].basicExpenditurePerPerson​(i+1)) * (i+1) * 0.1;
		}

		return colony_earning;
	}

	public int DeptStoreEarnings​(int[] amtOfMilk, int[] amtOfRice, int[] amtOfWheat, java.lang.String[] companyOfMilk, java.lang.String[] companyOfRice, java.lang.String[] companyOfWheat)
	{
		int dept_earning = 0;

		for(int i=0; i<obj.length; i++)
		{
			dept_earning += obj[i].totalExpenditureOnFood​(amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]);
		}

		return dept_earning;
	}

	public int HouseHavingMinimumExpenditure​(int[] amtOfMilk, int[] amtOfRice, int[] amtOfWheat, java.lang.String[] companyOfMilk, java.lang.String[] companyOfRice, java.lang.String[] companyOfWheat)
	{
        int expend = 0;
		int expend_min = 99999;
		int id = 0;

		for(int i=0; i<obj.length; i++)
		{
			expend = obj[i].totalExpenditureOnFood​(amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]);
			if (expend<expend_min)
			{
                expend_min = expend;
				id = i+1;
			}
		}

		return id;
	}
public class Colony
{
	public House[] obj = new House[10];

	//constructor
	public Colony(){}

	public House[] create_array()
	{
		for(int i=0; i<obj.length; i++)
		{
			obj[i] = new House();
		}
        return obj;
	}

	public double ColonyEarnings()
	{
		double colony_earning = 0.0;
        create_array();
		for(int i=0; i<obj.length; i++)
		{
			colony_earning += (obj[i].basicExpenditurePerPerson​(i+1)) * (i+1) * 0.1;
		}

		return colony_earning;
	}

	public int DeptStoreEarnings​(int[] amtOfMilk, int[] amtOfRice, int[] amtOfWheat, java.lang.String[] companyOfMilk, java.lang.String[] companyOfRice, java.lang.String[] companyOfWheat)
	{
		int dept_earning = 0;

		for(int i=0; i<obj.length; i++)
		{
			dept_earning += obj[i].totalExpenditureOnFood​(amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]);
		}

		return dept_earning;
	}

	public int HouseHavingMinimumExpenditure​(int[] amtOfMilk, int[] amtOfRice, int[] amtOfWheat, java.lang.String[] companyOfMilk, java.lang.String[] companyOfRice, java.lang.String[] companyOfWheat)
	{
        int expend = 0;
		int expend_min = 99999;
		int id = 0;

		for(int i=0; i<obj.length; i++)
		{
			expend = obj[i].totalExpenditureOnFood​(amtOfMilk[i], amtOfRice[i], amtOfWheat[i], companyOfMilk[i], companyOfRice[i], companyOfWheat[i]);
			if (expend<expend_min)
			{
                expend_min = expend;
				id = i+1;
			}
		}

		return id;
	}
}