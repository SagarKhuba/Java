	var x = (17 * 18) + 5;
	var y = 17 * 12;
	
	var result = myFunction(17,18);
	console.log(result);
	
	function myFunction(num1, num2) {
		var a = num1 * num2;
		var b = num1 + num2;
		return(a + b);
	}
	
	console.log( myFunction(17, 12));
	
	function toCelcius(f){
			return (5/9) * (f-32);
	}
	
	console.log("The temperature is "+ toCelcius(60));