

## Chapter 1: Introduction to Object Oriented Programming

### 1.1 Programming Fundamentals

**Q1. What are the two elements by which any computer program is made?**
The two fundamental elements of any computer program are:
1. **Data** - Information that the program works with
2. **Code** - Instructions that manipulate the data

**Q2. What is a computer program?**
A computer program is a set of instructions arranged in a step-by-step process based on some algorithm to perform a specific task.

**Q3. What is a programming language?**
A programming language is developed to write programs for a computer in a well-defined way and with a set of rules, which can be converted to binary codes and executed by computers.

**Q4. What is a Programming Paradigm?**
A Programming Paradigm is a style or way of programming.

### 1.2 Programming Concepts

**Q5. Name the two concepts by which any computer program can be made.**
The two programming concepts are:
1. **Process Oriented Programming (POP)**
2. **Object Oriented Programming (OOP)**

**Q6. Define Process Oriented Programming. Which computer languages use this concept?**
Process Oriented Programming is a programming concept where a computer program is organized in such a way that data is kept around its code. In this approach, the program is structured as a collection of functions that operate on data.

**Languages that use POP:** BASIC, COBOL, FORTRAN, C, PL-1

**Q7. Define Object Oriented Programming. Which computer languages use this concept?**
Object Oriented Programming is a programming concept where a computer program is organized in such a way that code is kept around its data. In this approach, the program is structured as a collection of objects that contain both data and methods.

**Languages that use OOP:** Java, C++, Python, Smalltalk

### 1.3 Limitations and Advantages

**Q8. What are the disadvantages or limitations of Process Oriented Programming (POP)?**
1. **Data Security:** Data is at risk of corruption
2. **Global Data Vulnerability:** Most functions share global data, making data vulnerable
3. **Real-world Modeling:** Real-world objects are simplified using a top-down approach, making modeling problematic
4. **Maintainability Issues:** Maintenance becomes difficult as code gets larger

**Q9. What are the advantages of Object Oriented Programming (OOP)?**
1. OOP offers a flexible framework for programs
2. It is completely suitable for describing abstract data types
3. It is very good at representing real-world objects
4. Provides better code organization and maintainability

### 1.4 Core OOP Concepts

**Q10. Define Class.**
A class is a blueprint or prototype that defines the variables and methods common to all objects of a certain kind. It serves as a template for creating objects.

**Q11. Define Object.**
An object is a software bundle of variables and related methods. It is a specific instance of a class containing real values instead of variables. An object represents a real-world entity and contains both data (attributes) and methods (behaviors).

**Q12. What are the differences between Class and Object?**

| Class | Object |
|-------|--------|
| A class is an abstract type | Objects are instances of the type |
| A class does not exist in real life | Objects are entities that actually exist in real life |
| A class does not exist in computer memory unless stored | An object exists in computer memory |

**Q13. Why is a class called a factory of objects?**
A class is known as a factory of objects because from a single class we can create as many objects as we want.

**Q14. Why is an object called an instance of a class?**
A class can create objects of itself with different characteristics and common behaviors. An object represents a specific state of the class. For this reason, an object is called an instance of a class.

**Q15. Why is a class known as a composite data type?**
A class is known as a composite data type because it can contain multiple primitive data types and other composite data types within it.

### 1.5 Four Principles of OOP

**Q16. Name the four basic principles/features of Object Oriented Programming.**
The four fundamental principles of OOP are:
1. **Abstraction**
2. **Encapsulation**
3. **Inheritance**
4. **Polymorphism**

**Q17. Define Abstraction.**
Abstraction is one of the important features of Object Oriented Programming. It is the process of representing the essential features of a system without getting involved with the complexity of the system. It hides complex implementation details and shows only the essential features of an object.

**Q18. Define Encapsulation. What are its advantages?**
Encapsulation is one of the important features of Object Oriented Programming. It is the mechanism that binds together code and the data it manipulates. This keeps both safe from outside interference and misuse. It is a wrapper that prevents the code and data from being accessed by any other code defined outside the wrapper.

**Advantages of Encapsulation:**
1. **Modularity** - Code organization into separate modules
2. **Information Hiding** - Internal implementation details are hidden

**Q19. Define Inheritance. What are its benefits?**
Inheritance is one of the important features of Object Oriented Programming. It is the process by which one object acquires the properties of another object. It is a mechanism where a new class (subclass) inherits properties and behaviors from an existing class (superclass).

**Main advantage of Inheritance:**
Any data member or method can be reused without redefining it, promoting code reusability.

**Q20. What is the difference between Base class and Derived class?**

| Base Class (Super class, Parent class) | Derived Class (Extended class, Sub-class, Child class) |
|----------------------------------------|-------------------------------------------------------|
| The class whose property is acquired is called the base class | The class in which the property of the base class is acquired is called the derived class |

**Q21. Define Polymorphism.**
Polymorphism is one of the important features of Object Oriented Programming. It allows two or more classes to respond to the same message in different ways. This means we can use the same name for a method in two different classes or in the same class. It also means that the user can send the same message to two different classes and still get a correct response.

**Q22. Name the two types of Polymorphism.**
The two types of polymorphism are:
1. **Overloading**
2. **Overriding**

## Chapter 2: Java Fundamentals and Data Types

### 2.1 Comments in Java

**Q23. Mention different styles of expressing comments in a program.**
There are three types of comments in Java:
1. **Single Line Comments** - Comments follow the // symbol
   ```java
   // this is a comment
   ```
2. **Multiline Comments** - Multi-word comments spread over lines, begin with /* and end with */
   ```java
   /* multiline comments are 
      spread over lines */
   ```
3. **Documentation Comments** - Used to produce HTML documentation, begin with /** and end with */
   ```java
   /** Documentation comment */
   ```

### 2.2 Variables and Data Types

**Q24. Define Variable.**
A variable is a symbolic name for a computer memory location. It can be defined as a space allotted in memory to store numeric or alphanumeric values when the program is executed.

**Q25. State the two kinds of data types.**
The two kinds of data types are:
1. **Primitive Data Type** - Fundamental data types predefined by the language
2. **Composite Data Type** - User-defined data types created using primitive types

**Primitive Data Types in Java:**
- byte, short, int, long, float, double, char, boolean

**Composite Data Types:**
- Classes are examples of composite data types

**Q26. Default values of primitive data types:**
- **int:** 0
- **float:** 0.0
- **boolean:** false
- **char:** '\u0000'

### 2.3 Operators and Expressions

**Q27. Differentiate between operator and expression.**

| Operator | Expression |
|----------|------------|
| An operator is a symbol or letter which makes the compiler perform a specific operation on operands | An expression is a combination of operands and operators that performs a specific operation |
| Example: + in a+b | Example: a+b is an expression |

**Q28. What is meant by precedence of operators?**
The precedence of operators determines the order in which operators are executed in an expression based on the priority given to the operators.

**Q29. Types of Operators:**
1. **Unary Operator** - Acts on one operand (e.g., ++a)
2. **Binary Operator** - Acts on two operands (e.g., a+b)
3. **Ternary Operator** - Acts on three operands (e.g., condition ? value1 : value2)

**Q30. What is the use and syntax of ternary operator?**
The ternary operator is associated with three operands.
**Syntax:** `boolean_expression ? value_if_true : value_if_false`

If the boolean expression is true, the second operand value is returned; otherwise, the third operand value is returned.

### 2.4 Type Conversion and Casting

**Q31. What do you mean by type conversion? How is implicit conversion different from explicit conversion?**

**Type Conversion:** The process of converting one primitive type to another type.

**Two types of conversion:**
1. **Implicit Conversion** - Conversion done automatically by the Java compiler without programmer intervention
   ```java
   int a = 5; 
   double b = a; // Implicit conversion
   ```

2. **Explicit Conversion (Type Casting)** - Conversion using type-cast operator () with programmer intervention
   ```java
   char a = 'A'; 
   int x = (int) a; // Explicit conversion
   ```

**Q32. What is autoboxing in Java? Give an example.**
Autoboxing is the process of automatic conversion of a primitive type to its corresponding wrapper class object.
```java
int a = 5; 
Integer i = a; // Autoboxing
```

**Unboxing:** Conversion of wrapper class object to primitive type
```java
Integer i = 10; 
int a = i; // Unboxing
```

### 2.5 Literals and Tokens

**Q33. What is a literal?**
A literal is a data item which does not change its value during the execution of a program.

**Types of Literals:**
- **Integer literal:** 200
- **Floating point literal:** 72.5
- **Character literal:** 'a'
- **String literal:** "Hello"
- **Boolean literal:** true, false

**Q34. What is a token?**
A token is each individual component of a Java program that carries some meaning and takes an active part in program execution.

**Q35. What are identifiers?**
An identifier is a term used to name a block of statements by which they are identified in a Java program. An identifier can be a class name, function name, variable name, or interface name.

**Q36. What does the token 'keyword' refer to in Java?**
A keyword is a reserved word that has a predefined meaning in Java and cannot be used as identifiers.

### 2.6 Instance and Class Variables

**Q37. Define Instance variable. Give an example.**
Instance variables are variables defined inside a class but not inside any particular method. These variables represent the state or property of an object and are created for each instance of a class.
```java
class MyClass { 
    int a, b; // Instance variables
}
```

**Q38. What are class variables?**
Class variables (static variables) are variables that are common to all objects of the class and are shared among all instances.

### 2.7 Unicode and Character Encoding

**Q39. Define Unicode.**
Unicode defines a complete international character set that can represent all characters found in all human languages. It is a 16-bit character encoding system.

**Q40. Define byte code.**
Byte code in Java is an intermediate code generated by the Java Compiler after compiling source code. It is platform-independent and executed by the Java Virtual Machine (JVM).

### 2.8 Wrapper Classes

**Q42. Name the wrapper classes:**
- **char** → Character
- **boolean** → Boolean
- **int** → Integer
- **double** → Double
- **float** → Float
- **byte** → Byte
- **short** → Short
- **long** → Long

## Chapter 4: Important Definitions Reference

### 📖 Core Programming Concepts

**Data Type**: A classification that specifies which type of value a variable can hold and what operations can be performed on it.

**Primitive Data Type**: A basic data type that stores a single value and has a predefined size and range. Examples include `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

**Non-Primitive Data Type**: A data type that is made up of combinations of primitive data types or other non-primitive data structures. Examples include `String`, `Array`, and `Class`.

**Variable**: A name of a reserved area in memory used to hold data. The value of a variable can change during program execution.

**Literal**: Constants or fixed values that don't change during program execution.

**Operator**: A symbol used to perform operations on one or more operands.

### 📖 Java Language Elements

**The Character Set**: A set of characters, letters, and special characters that are valid in a programming language. In Java, this is the Unicode character set.

**Java Tokens**: The smallest individual building block or smallest unit of a Java program that is used to construct expressions and statements.

**Reserved Keywords**: Words in Java that have a special, predefined purpose for the compiler.

**Identifier**: A user-defined name given to program elements like variables, methods, and classes to uniquely identify them.

### 📖 Object-Oriented Programming

**Class**: A blueprint or prototype that defines the variables and methods that an object will contain. It is a logical construct.

**Object**: An instance of a class. It is a physical or real-world entity created from the class blueprint.

**Method**: A set of code that performs an action on data. In object-oriented programming, a method defines the behavior of an object.

**Constructor**: A special type of method that is automatically called when an object of a class is created. Its primary purpose is to initialize the object's state.

### 📖 Data Representation

**Unicode**: A 16-bit character encoding system that can represent 65,536 characters from all human languages.

**Character Encoding**: The process by which a computer interprets raw zeros and ones as characters by pairing them with numbers.

**Floating-Point Data**: Numbers with fractional parts, represented using `float` (single-precision) or `double` (double-precision).

### 📖 Operator Concepts

**Precedence**: The order in which operators are applied in an expression.

**Associativity**: The order in which operators of the same precedence are executed.

**Unary Operators**: Act on one operand (e.g., `++`, `--`).

**Binary Operators**: Act on two operands (e.g., `+`, `-`, `*`).

**Logical Operators**: Return a `true` or `false` value.

**Relational Operators**: Used for comparison and connect classes and objects using the dot operator (`.`).

## Chapter 3: ICSE Previous Years' Questions Summary

### Year-wise Important Questions:

**ICSE 2004-2024 Key Topics Covered:**
- Object-oriented programming principles
- Data types and variables
- Operators and expressions
- Type casting and conversion
- Comments and documentation
- Class and object relationships
- Inheritance and polymorphism concepts
- Java syntax and expressions

**Common Exam Patterns:**
1. Definition-based questions on OOP principles
2. Code evaluation and expression solving
3. Differentiation between concepts
4. Java syntax and statement writing
5. Multiple choice questions on basic concepts

**Important Mathematical Expressions in Java:**
- Square root: `Math.sqrt()`
- Power: `Math.pow(base, exponent)`
- Absolute value: `Math.abs()`

**Sample Expression Conversions:**
- a² + b²: `Math.pow(a,2) + Math.pow(b,2)`
- √(a² + b²): `Math.sqrt(Math.pow(a,2) + Math.pow(b,2))`
- (a+b)ⁿ: `Math.pow(a+b, n)`

---

*This comprehensive guide covers all fundamental concepts of Object Oriented Programming with Java, organized systematically for easy understanding and reference.*
