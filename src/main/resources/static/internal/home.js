$(document).ready(function ()
{
	// $('.combobox').combobox();

	$('table').dataTable();

});

function handleBrandsSelectionChange (selectTag)
{
	var request = new XMLHttpRequest();

	var selectedBrand = selectTag.value;
	
	if (!selectedBrand)
		{
		console.log("no brand selected!");
		return;
		}
	
	request.open('GET', '/api/models?brand=' + selectedBrand, true);
	
	request.onload = function () {
	  // Begin accessing JSON data here
	  var data = JSON.parse(this.response);
	  
	  var selectModel = document.getElementById("selectModel");

	  if (request.status >= 200 && request.status < 400) {
	    data.forEach(models => {
	        var opt = document.createElement('option');
	        opt.value = models.value;
	        opt.innerHTML = models.text;
	        selectModel.appendChild(opt);
	    });
	  } else {
	    console.log('error');
	  }
	};

	request.send();
}
