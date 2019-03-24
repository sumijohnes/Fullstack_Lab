function onlySpaces(empNo,empName,dOJ){
	if(empNo.match(/^\s+$/) || empName.value.match(/^\s+$/) || dOJ.value.match(/^\s+$/))
		return 0;
	else
		return 1;
}