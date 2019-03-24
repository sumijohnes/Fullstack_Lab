function onlyAlphabets(empName){
	if((empName.value).match(/^[A-Za-z]+$/))
		return 1;
	else
		return 0;

}