/**
 * Created by carl on 9/24/17.
 */

grails.bootstrap.skip = false

// for hibernate search
// app wouldn't start with this
/*
grails.plugins.hibernatesearch = {
    rebuildIndexOnStart false
}
*/
// but did with this
grails.plugins.hibernatesearch.rebuildIndexOnStart = true
