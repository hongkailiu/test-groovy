package tk.hongkailiu.test.groovy.service


/**
 * Created by hongkailiu on 2016-08-01.
 */
class TranslationServiceTest extends GroovyTestCase {
    void testConvertWithMapCoercion() {
        def service = [convert: { String key -> 'some text' }] as TranslationService
        assert 'some text' == service.convert('key.text')
    }
}
