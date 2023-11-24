STRScanUnlocker - аддон к моду "Властелин колец" для Minecraft 1.7.10. Добавляет команду для сканирования структур в формате мода "Властелин колец".

https://lotrminecraftmod.fandom.com/ru/wiki/STRScanUnlocker - статья, в которой подробно описан мод.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA или импортирован в Eclipse IDE.

| Технология                                    | Версия    |
|-----------------------------------------------|-----------|
| Версия системы автоматической сборки Gradle   | 8.4       |
| Версия Java, используемая для запуска Gradle  | 17.0.9    |
| Версия Java, используемая для запуска проекта | 17.0.9    |
| Версия Java, используемая для сборки проекта  | 1.8.0_392 |
| Уровень используемого в коде синтаксиса Java  | 8         |

## Установка

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы должны увидеть папку, в которой находятся файлы `build.gradle.kts`, `settings.gradle.kts` и другие. Полученную папку будем называть ***папкой проекта***.

### IntelliJ IDEA

Запустите IntelliJ IDEA и откройте папку проекта: `File -> Open -> [Выбираете папку] -> OK`. Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Java для запуска Gradle: переменные среды ОС или `File -> Settings -> Build -> Build Tools -> Gradle -> Gradle JVM`;
* Java для запуска проекта: `File -> Project Structure -> Project -> SDK`;
* Синтаксис Java: `File -> Project Structure -> Project -> Language Level`.

В каждом меню есть возможность скачать JDK. В конечном итоге, у вас должно быть скачано столько разных JDK, сколько указано в таблице.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать в ***меню Gradle***: `View -> Tool Windows -> Gradle`, нажав на значок перезагрузки в появившемся справа меню.

### Eclipse IDE

Запустите Eclipse IDE и импортируйте папку проекта: `File -> Import -> Gradle -> Existing Gradle Project -> Next -> [Выбираете папку] -> Finish`. Сразу после импорта начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Java для запуска Gradle: переменные среды ОС;
* Java для запуска проекта: `Project -> Properties -> Java Build Path -> Libraries -> [нажимаете на JRE System Library] -> Remove -> Add Library -> JRE System Library -> Next -> Alternate JRE -> Installed JREs -> Add -> Standard VM -> Next -> [выбираете JRE home] -> Finish -> Apply and close -> [в выпадающем меню справа от Alternate JRE выбираете нужную JRE] -> Finish -> Apply and close`;
* Синтаксис Java: `Project -> Properties -> Java Compiler -> [галочка на Enable project specific settings] -> [выставляете Compiler compliance level] -> Apply and close`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать, нажав слева (под панелью Package Explorer) ПКМ по названию проекта и выбрав `Gradle -> Refresh Gradle Project`. После перезагрузки проекта в нижней части окна появится ***меню Gradle***. 

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Вот самые важные команды, необходимые каждому разработчику:

* Генерация исходного кода Minecraft: `Меню Gradle -> modded minecraft -> setupDecompWorkspace`.
* Запуск клиента из среды: `Меню Gradle -> modded minecraft -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> modded minecraft -> runServer`. К нему можно подключиться из клиента, введя в качестве адреса `localhost`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> build -> build`. После компиляции ваш мод появится в папке `папка_проекта/build/libs`. Вас интересует тот файл, который без приписки `-dev.jar`.

Примечания: 
* Команды запускаются двойным нажатием по ним.
* В IntelliJ IDEA все вышеуказанные команды содержатся в категории Gradle "Tools".
