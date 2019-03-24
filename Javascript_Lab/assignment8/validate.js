function validateEmpDetails(){

empNo = document.frm1.txt1;
empName = document.frm1.txt2;
dOJ = document.frm1.txt3;

	if(!isEmpty(empNo,empName,dOJ)){
		alert("Emp No cannot be empty");
		return false;
	}
	else
	{
		if(!onlySpaces(empNo,empName,dOJ)){
		alert("Emp No cannot be contain spaces");
		return false;
	    }

		else
		{

		if(!onlyDigits(empNo)){
		alert("Emp No can contain only digits");
		return false;
	    }

	    if(!onlyAlphabets(empName)){
	    	alert("Emp name can contain only alphabets");
	    	return false;
	    }
	    if(!validateDate(dOJ)){
	    	alert("Date entered is Invalid");
	    }

	    else {
	    	alert("successfull validation");
	    	return true;
	    }

	}

}

}

/* function isEmpty(){

	if(document.frm1.txt1.value==="" || document.frm1.txt2.value==="" || document.frm1.txt3.value==="")
		return 0;
	else
		return 1;
}

function onlySpaces(){
	if(document.frm1.txt1.value.match(/^\s+$/) || document.frm1.txt2.value.match(/^\s+$/) || document.frm1.txt3.value.match(/^\s+$/))
		return 0;
	else
		return 1;
}

function onlyDigits(){
	if((document.frm1.txt1.value).match(/^\d+$/))
		return 1;
	else
		return 0;
}

function onlyAlphabets(){
	if((document.frm1.txt2.value).match(/^[A-Za-z]+$/))
		return 1;
	else
		return 0;

}

function validateDate(){
	if((document.frm1.txt3.value).match(/^[0-9]+[-/][0-9]+[-/][0-9]+$/))
		return 1;
	else
		return 0;

} */