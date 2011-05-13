package yamljsonconverter

import org.yaml.snakeyaml.Yaml;
import net.sf.json.JSONObject
   
class YamlJsonConverterController {
    def model
    def view

    def toYaml = {
      def data = JSONObject.fromObject(model.json)
      appendMessage(['toYaml', data])
      model.yaml = new Yaml().dump(data)
    }
    
    def toJson = {
      def data = new Yaml().load(model.yaml)
      appendMessage(['toJson', data])
      model.json = JSONObject.fromObject(data)
    }
    
    def appendMessage = { message ->
      model.messages += "\n$message"
    }
}
