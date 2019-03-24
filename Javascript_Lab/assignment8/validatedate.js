function validateDate(dOJ){
	if((dOJ.value).match(/^[0-9]+[-/][0-9]+[-/][0-9]+$/))
		return 1;
	else
		return 0;

}