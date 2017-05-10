package de.wwu.pi.fooddelivery.epcToApp

class GeneratorUtil {
	
	/**
	 * Transform a string with spaces to camelCasedString
	 */
	static def toCamelCase(String input){
		input.split(" ").map[part | part.toFirstUpper ].join
	}
	
	/**
	 * Return the first word within a string
	 */
	static def firstWord(String input){
		input.split(" ").get(0)
	}
	
}