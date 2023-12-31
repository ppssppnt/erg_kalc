# Калькулятор энергосбережения

---

**Описание**: Калькулятор энергосбережения представляет собой программное средство, которое помогает пользователям рассчитывать и управлять своими энергозатратами. С его помощью пользователи могут вводить данные о своих электроприборах, их количестве и потреблении, а затем получать информацию о общем потреблении энергии. Калькулятор энергосбережения помогает пользователям осознанно использовать электроэнергию и принимать решения, направленные на снижение энергозатрат.

- **Технологический стек**: Проект реализован на языке программирования Java с использованием JavaFX для создания графического интерфейса.
- **Статус**: Бета-версия, версия 0.1.
- **Ссылка на продукт или демо-экземпляр**: [Калькулятор энергосбережения на GitHub](https://github.com/ppssppnt/erg_kalc/edit/main/README.md)

**Скриншот рабочего окна приложения**:

![Скриншот](https://github.com/ppssppnt/erg_kalc/blob/main/docs/design/1.png?raw=true)

## Архитектура

Архитектура программного средства основана на разделении ответственности между различными компонентами:

- **UI (Пользовательский интерфейс)**: Отвечает за визуализацию и взаимодействие с пользователем. Пользователь может вводить данные о своих электроприборах и просматривать результаты расчетов с помощью графического интерфейса.
- **Logic (Логика)**: Обрабатывает логику приложения, включая рассчет общего потребления энергии на основе введенных данных.
- **Model (Модель)**: Хранит данные о электроприборах, их количестве и потреблении.

![Диаграмма классов](https://github.com/ppssppnt/erg_kalc/blob/main/docs/architecture/cl1.png)

## Зависимости

Для работы программного средства требуется установленная Java Runtime Environment (JRE).

## Установка

Для установки программного средства необходимо установить JRE на компьютер. Затем можно запустить исполняемый файл программы или скомпилировать исходный код и запустить полученный JAR-файл.

## Конфигурация

Программное средство не требует дополнительной конфигурации.

## Применение

Чтобы использовать программное средство, пользователь может выполнить след

ующие действия:

1. Добавить электроприбор: Пользователь может ввести название, количество и потребление энергии для каждого электроприбора.
2. Рассчитать общее потребление: Пользователь может запросить расчет общего потребления энергии на основе введенных данных.
3. Просмотреть результаты: Пользователь может просмотреть результаты расчетов, включая общее потребление энергии.

## Проверка ПО

Проверка программного средства не включает автоматизированные тесты.

## Известные проблемы

- Отсутствие поддержки сохранения данных между сеансами работы программы.
- Возможные проблемы с вводом данных пользователем, если формат ввода не соответствует ожидаемому формату.

<!---
## Получение справочной информации

Опишите, как получить помощь с этим программным обеспечением (это могут быть ссылки на систему отслеживания проблем, вики, список рассылки и т. д.)

**Другое**

Если у вас есть вопросы, проблемы, отчеты об ошибках и т. д., сообщите о проблеме в системе отслеживания проблем этого репозитория.


--->
