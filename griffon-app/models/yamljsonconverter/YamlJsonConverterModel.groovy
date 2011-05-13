package yamljsonconverter

import groovy.beans.Bindable

class YamlJsonConverterModel {
   @Bindable yaml = '''
a: {b: 1}
c: {d: 2}
'''
   @Bindable json = '''
{"w":{"x":9},"y":{"z":8}}
'''
   @Bindable messages = 'Welcome to YamlJsonConverter!'
}