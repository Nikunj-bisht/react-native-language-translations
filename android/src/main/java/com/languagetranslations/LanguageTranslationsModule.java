package com.languagetranslations;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.languagetranslations.constants.Languages;

@ReactModule(name = LanguageTranslationsModule.NAME)
public class LanguageTranslationsModule extends ReactContextBaseJavaModule {
  public static final String NAME = "LanguageTranslations";
  LanguageTranslationHelper languageTranslationHelper;
  public LanguageTranslationsModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void createLanguageTranslator(String fromLang , String toLang  , Callback callback) {

    languageTranslationHelper = new LanguageTranslationHelper(fromLang,toLang);
    languageTranslationHelper.downLoadTranslator(callback);
//    languageTranslationHelper.translateLanguage(text);
  }

  @ReactMethod
  public void transLate(String text , Callback callback){

    languageTranslationHelper.translateLanguage(text,callback);

  }

  @ReactMethod
  public void getAllLanguages(Callback callback) {

    WritableMap writableNativeArray = Languages.getInstance().getLanguages();
    callback.invoke(writableNativeArray);
  }
}
