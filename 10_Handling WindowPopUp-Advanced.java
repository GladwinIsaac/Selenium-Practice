If there is 100 new Google tabs opened, need to close all the tabs except the 3rd tab? How you'll handle?
List<String> allWindows=new ArrayList<String>(driver.getWindowHandles());
for(int i=0;i<allWindows.size();i++)
{
	if(!i==2)
	{
	driver.switchTo().window(allWindows.get[i]);
	driver.close();
	}
	else
	{
	//Whatever the action required	
	driver.switchTo().window(allWindows.get[i]);
	Syso(driver.getTitle());
	}
}

//To jump directly to the 3rd window
ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles()); 
driver.switchTo().window(allWindows.get(2)); 
System.out.println(driver.getTitle()); 
