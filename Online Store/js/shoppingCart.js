// Author: William Connor
// Date: 11/20/17

var productShortName = new Array();
var productLongName = new Array();
var productImgURL = new Array();
var productShortDescription = new Array();
var productDetailedDescription = new Array();
var productPrice = new Array();


productShortName[0] = "brownies";
productShortName[1] = "cakes";
productShortName[2] = "macarons";
productShortName[3] = "pies";
productShortName[4] = "cupcakes";

productLongName[0] = "Peanut Butter Brownie";
productLongName[1] = "Wedding Cake";
productLongName[2] = "Vanilla Macaron";
productLongName[3] = "Apple Pie";
productLongName[4] = "Chocolate Cupcake";

productImgURL[0] = "Brownies";
productImgURL[1] = "Cakes";
productImgURL[2] = "Macarons";
productImgURL[3] = "Pies";
productImgURL[4] = "Cupcakes";

productShortDescription[0] = "Peanut Butter Brownies with a chocolatey drizzle!";
productShortDescription[1] = "Wedding Cakes that are simple and elegant";
productShortDescription[2] = "The little hamburger desserts!";
productShortDescription[3] = "About as American as it gets";
productShortDescription[4] = "Chocolate cupcakes with crushed Oreos and gummies!";

productDetailedDescription[0] = "These brownies are made with 100% whole milk chocolate and smooth creamy peanut butter.";
productDetailedDescription[1] = "Minimal icing cakes are the newest trend and this 2-tier cake can easily feed a wedding party up to 75 people.";
productDetailedDescription[2] = "Macarons are considered to be a French dessert delicacy and these are no different.";
productDetailedDescription[3] = "These mini apple pies are great for portion control and large parties.";
productDetailedDescription[4] = "Your kids will love these delicious cupcakes with gummy worms, and great for Halloween as well.";

productPrice[0] = 2;
productPrice[1] = 50.00;
productPrice[2] = 1;
productPrice[3] = 5;
productPrice[4] = 3;


function addToCart(i) {
	if(getCookie(productShortName[i])) {
		setCookie(productShortName[i], parseInt(getCookie(productShortName[i])) + 1, 5);
		} else {
			setCookie(productShortName[i], 1, 5);
		}
	}

