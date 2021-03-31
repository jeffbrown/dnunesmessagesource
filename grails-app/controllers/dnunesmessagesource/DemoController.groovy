package dnunesmessagesource


import grails.rest.*
import grails.converters.*

class DemoController {
    CmbIdService cmbIdService
	
    def index() {
        String message = cmbIdService.customMessage
        [customMessage: message]
    }
}
