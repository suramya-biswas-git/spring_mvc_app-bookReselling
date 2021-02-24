/**
 * 
 */

function checkConfirmedPassword(){
	var original=document.getElementById("original").value;
	var confirm=document.getElementById("confirm").value;
	if(original!==confirm){
		alert("Mismatched with first Password....Re-enter");
		return false;
	}
	return true;
}


