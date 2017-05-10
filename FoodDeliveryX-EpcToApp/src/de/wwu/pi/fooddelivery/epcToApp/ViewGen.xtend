package de.wwu.pi.fooddelivery.epcToApp

import static extension de.wwu.pi.fooddelivery.epcToApp.GeneratorUtil.*

import Epc.Function

class ViewGen {
	
	def generateView(Function view){
		// Prepare the view
		
		// Switch view
		switch view.name.firstWord.toUpperCase {
			case 'CREATE': return generateCreateContent(view)
			// ...
		}
		
		
	}
	
	def generateCreateContent(Function view) '''
		File content
	'''
}