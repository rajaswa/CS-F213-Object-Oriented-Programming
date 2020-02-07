public class DepartmentalStore
{
	//constructor
	public DepartmentalStore(){}

	public int costofMilkPerlitre​(java.lang.String company)
	{
		if (company == "Amul")
		{
			return 39;
		}
		if (company == "Mother Dairy")
		{
			return 36;
		}
		else
		{
			return 32;
		}
	}

	public int costofRicePerkg​(java.lang.String company)
	{
		if (company == "Daawat")
		{
			return 200;
		}
		if (company == "Patanjali")
		{
			return 130;
		}
		else
		{
			return 120;
		}
	}

	public int costofWheatPerkg​(java.lang.String company)
	{
		if (company == "Aashirvad")
		{
			return 40;
		}
		if (company == "Patanjali")
		{
			return 37;
		}
		else
		{
			return 35;
		}
	}
}