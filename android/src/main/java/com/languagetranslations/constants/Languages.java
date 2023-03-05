package com.languagetranslations.constants;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;

public class Languages {
  @NonNull
  public static final String AFRIKAANS = "af";
  @NonNull
  public static final String ALBANIAN = "sq";
  @NonNull
  public static final String ARABIC = "ar";
  @NonNull
  public static final String BELARUSIAN = "be";
  @NonNull
  public static final String BULGARIAN = "bg";
  @NonNull
  public static final String BENGALI = "bn";
  @NonNull
  public static final String CATALAN = "ca";
  @NonNull
  public static final String CHINESE = "zh";
  @NonNull
  public static final String CROATIAN = "hr";
  @NonNull
  public static final String CZECH = "cs";
  @NonNull
  public static final String DANISH = "da";
  @NonNull
  public static final String DUTCH = "nl";
  @NonNull
  public static final String ENGLISH = "en";
  @NonNull
  public static final String ESPERANTO = "eo";
  @NonNull
  public static final String ESTONIAN = "et";
  @NonNull
  public static final String FINNISH = "fi";
  @NonNull
  public static final String FRENCH = "fr";
  @NonNull
  public static final String GALICIAN = "gl";
  @NonNull
  public static final String GEORGIAN = "ka";
  @NonNull
  public static final String GERMAN = "de";
  @NonNull
  public static final String GREEK = "el";
  @NonNull
  public static final String GUJARATI = "gu";
  @NonNull
  public static final String HAITIAN_CREOLE = "ht";
  @NonNull
  public static final String HEBREW = "he";
  @NonNull
  public static final String HINDI = "hi";
  @NonNull
  public static final String HUNGARIAN = "hu";
  @NonNull
  public static final String ICELANDIC = "is";
  @NonNull
  public static final String INDONESIAN = "id";
  @NonNull
  public static final String IRISH = "ga";
  @NonNull
  public static final String ITALIAN = "it";
  @NonNull
  public static final String JAPANESE = "ja";
  @NonNull
  public static final String KANNADA = "kn";
  @NonNull
  public static final String KOREAN = "ko";
  @NonNull
  public static final String LITHUANIAN = "lt";
  @NonNull
  public static final String LATVIAN = "lv";
  @NonNull
  public static final String MACEDONIAN = "mk";
  @NonNull
  public static final String MARATHI = "mr";
  @NonNull
  public static final String MALAY = "ms";
  @NonNull
  public static final String MALTESE = "mt";
  @NonNull
  public static final String NORWEGIAN = "no";
  @NonNull
  public static final String PERSIAN = "fa";
  @NonNull
  public static final String POLISH = "pl";
  @NonNull
  public static final String PORTUGUESE = "pt";
  @NonNull
  public static final String ROMANIAN = "ro";
  @NonNull
  public static final String RUSSIAN = "ru";
  @NonNull
  public static final String SLOVAK = "sk";
  @NonNull
  public static final String SLOVENIAN = "sl";
  @NonNull
  public static final String SPANISH = "es";
  @NonNull
  public static final String SWEDISH = "sv";
  @NonNull
  public static final String SWAHILI = "sw";
  @NonNull
  public static final String TAGALOG = "tl";
  @NonNull
  public static final String TAMIL = "ta";
  @NonNull
  public static final String TELUGU = "te";
  @NonNull
  public static final String THAI = "th";
  @NonNull
  public static final String TURKISH = "tr";
  @NonNull
  public static final String UKRAINIAN = "uk";
  @NonNull
  public static final String URDU = "ur";
  @NonNull
  public static final String VIETNAMESE = "vi";
  @NonNull
  public static final String WELSH = "cy";


  private static Languages languages = new Languages();
  private Languages() {

  }

  public static Languages getInstance(){
    return  languages;
  }

  public WritableMap getLanguages(){
    WritableNativeArray writableNativeArray = new WritableNativeArray();
    WritableMap writableMap = new WritableNativeMap();
    writableMap.putString("hi","HINDI");
    writableMap.putString("en","ENGLISH");
    writableMap.putString("zh","CHINESE");
    writableMap.putString("fr","FRENCH");
    writableMap.putString("el","GREEK");
    writableMap.putString("es","SPANISH");
    writableMap.putString("ur","URDU");
    writableMap.putString("pt","PORTUGUESE");

    return writableMap
    ;


  }


}
