#include <iostream>
#include "Grocery.h"
#include <fstream>
#include <string>
using namespace std;

int main(int argc, char *argv[])
{
	// Declare an array of structures 100 elements wide
	// Use string stream class 
	//Instantiate a GroceryData Object

	GroceryData groceries[100];


	ifstream iFile("inventory.txt");

	getline(iFile, str);

	myGrocery.writeGroceryData();


	system("pause");
	return 0;
}