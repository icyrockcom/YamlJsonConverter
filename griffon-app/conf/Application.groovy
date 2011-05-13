application {
    title = 'YamlJsonConverter'
    startupGroups = ['YamlJsonConverter']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "YamlJsonConverter"
    'YamlJsonConverter' {
        model      = 'yamljsonconverter.YamlJsonConverterModel'
        view       = 'yamljsonconverter.YamlJsonConverterView'
        controller = 'yamljsonconverter.YamlJsonConverterController'
    }

}
