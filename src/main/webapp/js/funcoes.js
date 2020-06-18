//span-confirmar

lsItem = [];
function atualizar(id, preco){
	quantidade = document.getElementById(id).value;
	id = id.replace('prd-','');
	total = quantidade * preco;
	
	//objeto ja scirpt..conhecido como json
	obj = {
			"id":id,
			"quantidade=" :quantidade,
			"total" : total
			}
	lsItem[id] = obj;
	//console.log();
	valorFinal();
	
}
function valorFinal(){
	
	vFinal = 0;
	for (i in lsItem){
		obj = lsItem[i];
		vFinal += obj.total;
		
	}
	document.getElementById("span-confirmar").innerHTML =  vFinal.toFixed(2);
	
	if(vFinal > 0){
		
		document.getElementById("bt-confirmar").removeAttribute("disabled");
		
	}else {
		
		document.getElementById("bt-confirmar").setAttribute("disable","disabled");
	}
	
	
	
}