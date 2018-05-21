#include <string>
using namespace std;


struct GroceryData
{
	string SKU;
	string Item;
	float Retail;
	float Cost;
	int Floor;
	int Warehouse;
};

void writeGroceryData(GroceryData aGroceryToWrite)