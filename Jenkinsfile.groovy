//agentName= "CTS01WININTRA01"
pipeline {
    agent any
    options {
        skipDefaultCheckout(true)
    }
     parameters
     {         
		 string(name: 'token', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
		 
     }
    stages 
    {
              
           
    	stage('Compile') 
    	{
    	    steps
    	    {
                 sh """
		 	
                    echo my_var=${token}
             
							  
							""" 
    	    }
        }
            
        
      
        
    }
}

