function checkName()
{
	  var name=$('#un').val();
	  
	 
	  for(i=0;i<name.length;i++)
		  {
		    var ch=name.charAt(i);
		    //alert(ch);
		    if( (ch <= 'Z' && ch >='A') || (ch <= 'z' && ch >='a'))
		    	{
		      	$('#ne').text("");
		    	}
		  
		    else
		    	{
		    	$('#ne').text("Invalid Character");
		    	}
		  }

}

function checkEmptyFields()
{
	  var name=$("#un").val();
	  var pwd=$("#pwd").val();
	  var email=$("#eml").val();
	  
	  var namePresent=true;
	  var pwdPresent=true;
	  var emailPresent=true;
	  
	  //alert(name+" "+pwd+ " "+email);
	  if(name==null || name.length<=0)
		  namePresent=false;
	  
	  if(pwd==null || pwd.length<=0)
		  pwdPresent=false;
	
	  if(email==null || email.length<=0)
		  emailPresent=false;
	  
	  if(!namePresent || !pwdPresent || !emailPresent)
		  {
		   $('#mem').text("Marked fields are mandatory");
		   return false;		  
		  }
	  
	  else
		  {
		   return true;
		  }
}