function validationForm(){

	    var regex1 = /[A-Za-z]/;
	    var regex2 = /[A-Za-z]+@[A-Za-z]+[.][A-Za-z]+/;
			if(document.frm1.txt1.value==="" || document.frm1.txt2.value==="" || document.frm1.email.value===""){
				alert("All fields are Mandatory. Please fill in");
			    return false;
			}

			if((document.frm1.txt1.value).length < 3){
				alert("Customer name should have minimum 3 characters");
				return false;
			}

			if((document.frm1.txt2.value).match(regex1)){
				alert("Alphabets are not allowed for the date field");
				return false;
			}

			if(!(document.frm1.email.value).match(regex2)){
				alert("Invalid Email id");
				return false;
			} 


		}