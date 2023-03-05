# react-native-language-translation

This library help you to translate easy in 50 languages and its easy to use

## Installation

```sh
npm install react-native-language-translations
```
Make sure to build project again after installing the dependency


## DEMO

![Screenrecorder-2023-03-05-13-21](https://user-images.githubusercontent.com/52692588/222954054-73dbe586-76db-423d-bc87-79dd9a216684.gif)




## Usage


This package first downloads the modal which you want to use for that you have to call a method createLanguageTranslator giving parameters as languages codes. 



```js
import {
  createLanguageTranslator,
  translate,
  getAllLanguages,
} from 'react-native-language-translations';
 // english to chinese
 const t = (text: string) => {
    createLanguageTranslator('en', 'zh', () => {
      translate(text, (result: string) => {
        setResult(result);
      });
    });
  };

   getAllLanguages((val: String) => {
      console.log(val);
      let langVal = [];
     
      Object.keys(val).forEach((i) => langVal.push(i));
    });

// ...
```

| Parameter | Type | Description | iOS | Android |
| --- | --- | --- | --- | --- |
| createLanguageTranslator | Function | Downloads the trasnlator modal just pass to and from language code | X | ✔ |
| translate | Function | used too translate text | X | ✔ |

| getAllLanguages | Function | returns all the supported languages | X | ✔ |

## Contributing

## License

MIT

---
