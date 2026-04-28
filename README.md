# Kotlin Course

A collection of hands-on exercises completed while learning Kotlin fundamentals. Each lesson focuses on a specific language concept, progressing from basic syntax to object-oriented programming.

## Topics Covered

| Lesson | Topic |
|--------|-------|
| 3 | Variables — `val`, `var`, constants, type declaration |
| 4 | Data types — `Int`, `Long`, `Float`, `Double`, `String`, `Boolean`, `Char` |
| 5 | Null safety — nullable types, Elvis operator (`?:`), `throw` on null |
| 6 | Conditionals — `when` expressions, input validation, type-safe branching |
| 7 | Loops — `for`, `while`, `do-while`, ranges, `step`, `break`, `continue`, nested loops |
| 8 | Strings — manipulation, `split`, `replace`, `substringAfterLast`, regex |
| 9 | String templates and expressions |
| 10 | Collections — Arrays, Lists, Sets: creation, mutation, iteration, search |
| 11 | Maps — creation, CRUD, iteration, complex value types |
| 12 | Functions — signatures, return types, nullable returns, refactoring |
| 13 | Collection operations — `filter`, `map`, `groupBy`, `sorted`, `distinct`, `firstOrNull` |
| 14 | Map operations — `filter`, `mapKeys`, `replaceAll`, `any`, `all`, `putAll`, `count` |
| 15 | OOP basics — classes, objects (singletons), `data class`, properties, methods |

## Project Structure

```
src/main/kotlin/com/kooken/kotlincourse/
├── lesson3/    # Variables and constants
├── lesson4/    # Primitive data types
├── lesson5/    # Null safety and Elvis operator
├── lesson6/    # Conditionals and when expressions
├── lesson7/    # Loop constructs
├── lesson8/    # String operations
├── lesson9/    # String templates
├── lesson10/   # Arrays, Lists, Sets
├── lesson11/   # Maps (dictionaries)
├── lesson12/   # Function signatures and refactoring
├── lesson13/   # Functional collection operations
├── lesson14/   # Advanced map operations
└── lesson15/   # OOP: classes, objects, data classes
    └── homework/
```

## Tech Stack

- **Language:** Kotlin 2.0.10
- **Build tool:** Gradle (Kotlin DSL)
- **JVM:** 20

## Running the Project

Clone the repository and run any lesson's `main` function via IntelliJ IDEA or from the command line:

```bash
./gradlew run
```

To run a specific file, open it in IntelliJ IDEA and click the run icon next to the `main` function.

## Highlights

- **Lesson 6** — real-world branching tasks: season detection, dog-to-human age conversion, clothing recommendations by temperature, bonus point calculation
- **Lesson 8** — string transformation pipeline: phrase rewriting, log parsing, credit card masking, email formatting, abbreviation generation
- **Lesson 12** — code refactoring task: simplifying a `drawRectangle` function by extracting a reusable `drawLine` helper
- **Lesson 13** — chained functional operations: grade analysis, alphabetical directory builder, number categorization
- **Lesson 15** — OOP design: `Concert` class with encapsulated ticket sales, `Emotion` with intensity classification, `Moon` singleton, `Product` data class
