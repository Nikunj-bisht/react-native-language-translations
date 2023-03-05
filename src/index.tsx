import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-language-translation' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const LanguageTranslation = NativeModules.LanguageTranslations
  ? NativeModules.LanguageTranslations
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function createLanguageTranslator(
  a: string,
  b: string,
  callBack: Function
) {
  LanguageTranslation.createLanguageTranslator(a, b, (val: Boolean) => {
    callBack(val);
  });
}

export function translate(a: string, callBack: Function) {
  LanguageTranslation.transLate(a, (result: any) => {
    callBack(result);
  });
}

export function getAllLanguages(callBack: Function) {
  LanguageTranslation.getAllLanguages(callBack);
}
