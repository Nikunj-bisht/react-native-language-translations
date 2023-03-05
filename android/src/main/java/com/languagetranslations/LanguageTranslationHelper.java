package com.languagetranslations;


import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.nl.translate.TranslateLanguage;
import com.google.mlkit.nl.translate.Translation;
import com.google.mlkit.nl.translate.Translator;
import com.google.mlkit.nl.translate.TranslatorOptions;

import java.util.List;

public class LanguageTranslationHelper {
  TranslatorOptions translatorOptions;
  Translator translator;
  public LanguageTranslationHelper(String fromLang , String toLang){
       translatorOptions = new TranslatorOptions.Builder()
         .setSourceLanguage(fromLang)
         .setTargetLanguage(toLang)
         .build();
       translator = Translation.getClient(translatorOptions);
  }

  public String translateLanguage(String text , Callback callback){
    translator.translate(text)
      .addOnSuccessListener(new OnSuccessListener<String>() {
        @Override
        public void onSuccess(String s) {
         callback.invoke(s);
        }
      })
      .addOnFailureListener(new OnFailureListener() {
        @Override
        public void onFailure(@NonNull Exception e) {
callback.invoke(false);
        }
      });
    return "";

  }

  public void downLoadTranslator(Callback callback){

    DownloadConditions conditions = new DownloadConditions.Builder()
      .requireWifi()
      .build();
    translator.downloadModelIfNeeded(conditions)
      .addOnSuccessListener(
        new OnSuccessListener() {
          @Override
          public void onSuccess(Object o) {
               callback.invoke(true);
          }

        })
      .addOnFailureListener(
        new OnFailureListener() {
          @Override
          public void onFailure(@NonNull Exception e) {
            // Model couldn’t be downloaded or other internal error.
            // ...
            callback.invoke(false);
          }
        });

  }

  public List<String> getAllLanguages(){
   return TranslateLanguage.getAllLanguages();
  }

}
