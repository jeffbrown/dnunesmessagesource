package dnunesmessagesource

import org.springframework.context.i18n.LocaleContextHolder

class CmbIdService {
    def messageSource

    String getCustomMessage() {
        messageSource.getMessage('my.custom.message', [] as Object[], LocaleContextHolder.locale)
    }
}
