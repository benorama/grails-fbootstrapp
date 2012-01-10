def log = org.apache.log4j.Logger.getLogger('grails.plugins.fbootstrapp.FBootstrappResources')
def dev = grails.util.GrailsUtil.isDevelopmentEnv()

def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def lesscssPlugin = applicationContext.pluginManager.getGrailsPlugin('lesscss-resources')
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')
def configTagLib = org.codehaus.groovy.grails.commons.ApplicationHolder.application.config.grails.plugins.fbootstrapp.fixtaglib
def configDefaultBundle = org.codehaus.groovy.grails.commons.ApplicationHolder.application.config.grails.plugins.fbootstrapp.defaultBundle 
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_bootstrap'
}
def cssFile = "bootstrap.css"
def cssminFile = "bootstrap.min.css"

log.debug "config: grails.plugins.fbootstrapp.fixtaglib = ${configTagLib}"
log.debug "config: grails.plugins.fbootstrapp.defaultBundle = ${configDefaultBundle}"
log.debug "is lesscss-resources plugin loaded? ${!!lesscssPlugin}"
log.debug "is jquery plugin loaded? ${!!jqueryPlugin}"

modules = {

    'fbootstrapp-fixtaglib' {
        defaultBundle configDefaultBundle
        
        resource url:[plugin: 'fbootstrapp', dir: 'css', file: 'bootstrap-fixtaglib.css'], disposition: 'head'
    }

    'fbootstrapp-css' {
        defaultBundle configDefaultBundle
        if (configTagLib) {
            dependsOn 'fbootstrapp-fixtaglib'
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'css', file: (dev ? cssFile : cssminFile)], disposition: 'head', exclude:'minify'
    }

    'fbootstrapp-alerts' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-alerts.js'], disposition: 'head'
    }

    'fbootstrapp-dropdown' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-dropdown.js'], disposition: 'head'
    }

    'fbootstrapp-modal' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-modal.js'], disposition: 'head'
    }

    'fbootstrapp-popover' {
        defaultBundle configDefaultBundle
        dependsOn 'fbootstrapp-twipsy'
        
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-popover.js'], disposition: 'head'
    }

    'fbootstrapp-scrollspy' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-scrollspy.js'], disposition: 'head'
    }

    'fbootstrapp-tabs' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn "jquery"
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-tabs.js'], disposition: 'head'
    }

    'fbootstrapp-twipsy' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn "jquery"
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-twipsy.js'], disposition: 'head'
    }

    'fbootstrapp-buttons' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn "jquery"
        }
        
        resource url:[plugin: 'fbootstrapp', dir: 'js', file: 'bootstrap-buttons.js'], disposition: 'head'
    }

    'fbootstrapp-js' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }
        dependsOn 'fbootstrapp-alerts,fbootstrapp-dropdown,fbootstrapp-modal,fbootstrapp-scrollspy,fbootstrapp-tabs,fbootstrapp-twipsy,fbootstrapp-popover,fbootstrapp-buttons'
    }

    'fbootstrapp-less' {
        defaultBundle configDefaultBundle
        if (configTagLib) {
            dependsOn 'bootstrap-fixtaglib'
        }
        resource id:'bootstrap-less', url:[plugin: 'fbootstrapp', dir: 'css', file: 'bootstrap.less'], attrs:[rel: "stylesheet/less", type:'css'], disposition: 'head'
    }

    fbootstrapp {
        defaultBundle configDefaultBundle
        if (lesscssPlugin) {
            dependsOn 'fbootstrapp-less'
        } else {
            dependsOn 'fbootstrapp-css'
        }
        dependsOn 'fbootstrapp-js'
    }
       
}
