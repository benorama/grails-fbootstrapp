class FbootstrappGrailsPlugin {
	
	def version = "0.1.1"
	def grailsVersion = "2.0 > *"
	def dependsOn = [:]
	//def loadAfter                = ['services', 'controllers']
	//def observe                  = ['services', 'controllers']
	//def watchedResources         = ["grails-app/services/**/*Service.groovy", "grails-app/controllers/**/*Controller.groovy"]
	def pluginExcludes = [
			"grails-app/views/error.gsp"
	]

	def author = "Benoit Hediard"
	def authorEmail = "ben@benorama.com"
	def title = "Plugin FBootstrapp CSS framework resource files"
	def description = '''Provides FBootstrapp CSS framework resource files.
FBootstrapp is a toolkit designed to kickstart development of facebook iframe apps in both relevant sizes. It includes base CSS and HTML for typography, forms, buttons, tables, grids, navigation, and more, styled in the typical facebook look and feel.
FBootstrapp is based on Twitter's excellent Bootstrap, as the name might indicate.
To get started -- checkout http://ckrack.github.com/fbootstrapp/!
'''

	// URL to the plugin's documentation
	def documentation = "https://github.com/benorama/fbootstrapp-grails-plugin/blob/master/README.md"
	def license = "APACHE"
	def issueManagement = [ system: "github", url: "https://github.com/benorama/fbootstrapp-grails-plugin/issues" ]
	def scm = [ url: "https://github.com/benorama/fbootstrapp-grails-plugin" ]

}
