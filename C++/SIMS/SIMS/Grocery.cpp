#include "Grocery.h"
#include <iostream>

using namespace std;

//Initialize records
GroceryData::GroceryData()
{
	SKU = "";
	Item = "";
}


void writeGroceryData(GroceryData aGroceryToWrite)
{
	cout << aGroceryToWrite.SKU << endl;
	cout << aGroceryToWrite.Item << endl;
	cout << aGroceryToWrite.Retail << endl;
	cout << aGroceryToWrite.Cost << endl;
	cout << aGroceryToWrite.Floor << endl;
	cout << aGroceryToWrite.Warehouse << endl;

}