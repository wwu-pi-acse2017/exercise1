package de.wwu.pi.fooddelivery.epcToApp

class View {
	
	def generateView(Function view){
		// Prepare the model
		
		// Switch view
		switch view.firstWord {
			case 'CREATE': return generateCreateContent(view)
			// ...
		}
		
		
	}
	
	def generateCreateContent(Function view) '''
		File content
	'''
}