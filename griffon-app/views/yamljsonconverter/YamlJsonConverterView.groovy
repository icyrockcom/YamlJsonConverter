package yamljsonconverter

import javax.swing.event.DocumentListener

actions {
  action(id: 'toYaml', name: 'To YAML', 
    smallIcon: crystalIcon(icon: '1downarrow', size: 32), closure: controller.&toYaml)  
  action(id: 'toJson', name: 'To JSON', 
    smallIcon: crystalIcon(icon: '1downarrow1', size: 32), closure: controller.&toJson)  
}

application(title: 'YamlJsonConverter',
  pack: true,
  location:[550,50]
  ) {
  migLayout(layoutConstraints: 'fill, gap 0',
    rowConstraints: '[fill][][fill]', 
    columnConstraints: '[fill,200][fill,200][fill,400]')
  
  textArea(id: 'yaml', constraints: 'spanx 2, height 300')
  bind(source: model, sourceProperty: 'yaml', target: yaml, targetProperty: 'text', 
    validator: { model.yaml != yaml.text })
  yaml.document.addDocumentListener({
    doLater { model.@yaml = yaml.text }
  } as DocumentListener)
  textArea(id: 'messages', text: bind { model.messages }, constraints: 'spany 3, width 300, wrap')
  button(id: 'toYaml', action: toYaml, constraints: '')
  button(id: 'toJson', action: toJson, constraints: 'wrap')
  textArea(id: 'json', text: bind { model.json }, constraints: 'spanx 2, height 300')
  bind(source: model, sourceProperty: 'json', target: json, targetProperty: 'text', 
    validator: { model.json != json.text })
  json.document.addDocumentListener({
    doLater { model.@json = json.text }
  } as DocumentListener)
}
