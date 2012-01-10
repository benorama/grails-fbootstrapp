Grails plugin: FBootstrapp CSS framework resource files
===============================================

Provides FBootstrapp CSS framework resource files.

Fbootstrapp is a toolkit designed to kickstart development of facebook iframe apps in both relevant sizes. It includes base CSS and HTML for typography, forms, buttons, tables, grids, navigation, and more, styled in the typical facebook look and feel.

Fbootstrap is based on Twitter's excellent Bootstrap, as the name might indicate.

To get started -- checkout http://ckrack.github.com/fbootstrapp/

This plugin is fork of https://github.com/groovydev/twitter-bootstrap-grails-plugin


Including the resources
------------------------

You must use the Grails resources framework to make use of this plugin. The resources exposed by this plugin are:

    bootstrap-js - all javascript resources
    bootstrap-css - all css resorces

    bootstrap-alerts - bootstrap alerts javascript resource
    bootstrap-dropdown - bootstrap dropdown javascript resource
    bootstrap-modal - bootstrap modal javascript resource
    bootstrap-popover - bootstrap popover javascript resource
    bootstrap-scrollspy - bootstrap scrollspy javascript resource
    bootstrap-tabs - bootstrap tabs javascript resource
    bootstrap-twipsy - bootstrap twipsy javascript resource
    bootstrap-buttons - bootstrap buttons javascript resource
    bootstrap-less - bootstrap less resource

    bootstrap - all bootstrap css (or less) and javascript resources 

Note 
-----
A bootstrap resource depends on bootstrap-css and bootstrap-js. 
In case of lesscss-resources plugin is installed, bootstrap resource depends on bootstrap-less and bootstrap-js.   
 
Usage
-----

    <r:require modules="bootstrap"/>

Configuration   
-------------

Fix grails taglib g:paginate to work with bootstrap css. 
 
    grails.plugins.fbootstrapp.fixtaglib = true
    
Control plugin resources bundling.

    grails.plugins.fbootstrapp.defaultBundle
        'bundle_name': bundle resources using bundle name
        false: disable bundling
        default: 'bundle_bootstrap'

Logging
-------

    grails.plugins.fbootstrapp - log category
    
Versioning
----------

    Plugin version convention is <original-fbootstrapp-version>.<plugin-version>

Copyright and License
---------------------

fbootstrapp plugin:

   Copyright 2011 Benoit Hediard

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.


Twitter Bootstrap CSS files:

    Copyright 2011 Twitter, Inc.
    
    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law
