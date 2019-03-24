function onlyDigits(empNo){
	if((empNo.value).match(/^\d+$/))
		return 1;
	else
		return 0;
}