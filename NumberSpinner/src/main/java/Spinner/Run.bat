@echo off

javac -d . "C:\Users\Lord Pupcent\Documents\GitHub\netBeans\NumberSpinner\src\main\java\Spinner\Tablica.java"

javac -d . "C:\Users\Lord Pupcent\Documents\GitHub\netBeans\NumberSpinner\src\main\java\Spinner\Prozor.java"

javac -d . "C:\Users\Lord Pupcent\Documents\GitHub\netBeans\NumberSpinner\src\main\java\Spinner\Start.java"

SET PATH=%PATH%;"C:\Users\Lord Pupcent\Documents\GitHub\netBeans\NumberSpinner\src\main\java\Spinner"

java Spinner.Start
