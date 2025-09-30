# Copilot Coding Agent Instructions for Java Workspace

## Project Overview
This workspace contains multiple Java learning modules, each in its own subdirectory. The codebase is structured for educational activities, with each lesson focusing on a specific concept or exercise. There is no overarching application architecture; instead, each lesson is self-contained.

## Directory Structure
- `Lesson-03-Discussion/`, `Lesson-05-activity/`, `Lesson-07-activity/`, `Lesson-08-Activity/`: Each contains a `Main.java` and sometimes helper files (e.g., `Input.java`).
- Top-level files: `Main.java`, `Main.class` (likely for quick tests or demos).

## Build & Run
- No build system (Maven/Gradle) detected; compile with `javac` and run with `java`.
- Example: To compile and run Lesson 8:
  ```bash
  cd Lesson-08-Activity
  javac Main.java Input.java
  java Main
  ```
- For lessons with only `Main.java`, compile and run just that file.

## Testing & Debugging
- No automated tests present; manual testing via console output is standard.
- Debug by running individual lesson modules and observing output.

## Coding Patterns & Conventions
- Each lesson's `Main.java` contains a class named `Main` with a `main` method as the entry point.
- Helper methods (e.g., `print`, `sphereVolume`) are defined within the `Main` class, not nested inside other methods.
- Use `Math.PI` for π and `Math.pow(base, exponent)` for exponentiation.
- Console output is the primary feedback mechanism.

## Integration & Dependencies
- No external libraries or frameworks are used.
- All code is standard Java (JDK).

## Key Files
- `Lesson-08-Activity/Main.java`: Example of correct method structure and usage of Java math functions.
- `Lesson-07-activity/Input.java`: Example of input handling (if present).

## Agent Guidance
- When fixing errors, check for method placement (no nested methods), correct math function usage, and proper class structure.
- When adding new lessons, follow the pattern: one directory per lesson, with a `Main.java` entry point.
- Keep code simple and focused on the lesson objective.

---
_If any lesson introduces new conventions or external dependencies, update this file to reflect those changes._
