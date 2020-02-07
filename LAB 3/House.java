public class House
{
    static DepartmentalStore store = new DepartmentalStore();
	//constructor
	public House(){}

	public static int totalExpenditureOnFood​(int amtOfMilk, int amtOfRice, int amtOfWheat, java.lang.String companyOfMilk, java.lang.String companyOfRice, java.lang.String companyOfWheat)
	{
		int cost_milk = store.costofMilkPerlitre​(companyOfMilk);
		int cost_rice = store.costofRicePerkg​(companyOfRice);
		int cost_wheat = store.costofWheatPerkg​(companyOfWheat);

		int cost = (amtOfMilk * cost_milk) + (amtOfRice * cost_rice) + (amtOfWheat * cost_wheat);

		return cost;
	}

	public int basicExpenditurePerPerson​(int house_no)
	{
		if (house_no % 5 == 0)
		{
			return 1000;
		}
		else
		{
			return 700;
		}
	}
}