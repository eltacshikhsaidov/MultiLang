# MultiLang
spring boot internationalization, Spring multi-language rest api implementation example

# How it works

Just write all the code as in the project you just need to use only one method for translations

```util.Translate.translate("code")```

Here code means the word you declared ```message_lang.properties``` files.

Suppose you created code greeting

* ```message_en.properties``` -> greeting=Hello
* ```message_ru.properties``` -> greeting=Privet
* ```message_az.properties``` -> greeting=Salam

Then just simple call the following method
```
// import translate method static

// call below method inside your service
translate("greeting")

```

And then pass ```Accept-Language``` the language you want to translate to `REST-API` header

That's it! you're done!

