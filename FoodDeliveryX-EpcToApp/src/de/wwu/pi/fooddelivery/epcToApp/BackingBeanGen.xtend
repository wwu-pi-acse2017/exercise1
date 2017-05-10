package de.wwu.pi.fooddelivery.epcToApp

import Epc.Model

class BackingBeanGen {
	
	def generateBackingBean(Model model){
		// Prepare the model
		
		generateBeanContent(model)
	}
	
	def generateBeanContent(Model model) '''
		File content
	'''
}