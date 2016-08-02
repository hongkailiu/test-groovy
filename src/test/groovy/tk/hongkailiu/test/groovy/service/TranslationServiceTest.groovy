package tk.hongkailiu.test.groovy.service

import org.junit.Test


/**
 * Created by hongkailiu on 2016-08-01.
 */
class TranslationServiceTest {
    @Test
    void testConvertWithMapCoercion() {
        def service = [convert: { String key -> 'some text' }] as TranslationService
        assert 'some text' == service.convert('key.text')
    }
    @Test
    void testConvertWithClosureCoercion() {
        def service = { String key -> 'some text' } as TranslationService
        assert 'some text' == service.convert('key.text')
    }
}
