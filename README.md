> [!CAUTION]
> С 29.02.2024 разработка проекта завершена. Инструментарий будет поддерживаться в актуальном и рабочем состоянии, но
> правки в основной код вноситься не будут.

[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

STRScanUnlocker - аддон к моду "Властелин колец" для Minecraft 1.7.10. Добавляет команду для сканирования структур в
формате мода "Властелин колец".

## Использование

### Получение стрсканов для вашего аддона

При заходе в игру постройте желаемую структуру и определитесь с координатами 2 углов кубоида, в котором она помещается 
(здесь пригодится опыт работы с WorldEdit). Далее введите 4 команды.

* '''/strscan begin'''
* '''/strscan origin X Y Z''' (Координата 1)
* '''/strscan expand X Y Z''' (Координата 2)
* '''/strscan scan TEST'''

Файл с расширением .strscan будет располагаться по пути `.minecraft/saves/Мир, _в_котором_вы_строили/lotr-str-scans`.

### Что делать, если я не программист?

Даже в это случае strscan может пригодиться. Например, откройте архив мода LOTR и пройдите по пути `assets/lotr/strscan`. 
Затем выберите любой из файлов и замените его на ваш стрскан. Помните: он должен быть одноимённым. Теперь вы можете 
спавнить в 1 клик свои структуры вместо лотровских. Они же будут появляться в мире.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_STRScanUnlocker&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_STRScanUnlocker
