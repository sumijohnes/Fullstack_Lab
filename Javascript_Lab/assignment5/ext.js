function extMsg(){
	alert("Message from ext.js");
}

/* function getTheDate(){
	d = new Date();
	date = d.getDate();
	mon = d.getMonth()+1;
	year=d.getFullYear();
	alert("Date is: "+date+"/"+mon+"/"+year);
}*/

function getTheDate(){
	d = new Date();
	date = d.getDate();
	mon = d.getMonth()+1;
	year=d.getFullYear();
	document.write("Date is: "+date+"-"+mon+"-"+year);
	}