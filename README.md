# MadLibs with ArrayLists

The goal of this lab is to practice working with ArrayLists by developing a class that can be used to randomly generate words from a particular part-of-speech (POS). This class will then be used to create a game of MadLibs.
---
## Files
---
The following files are provided:

```POSDictionary.java``` **UNFINISHED**. This class loads a list of words that are labeled according to their part-of-speech. You will need to complete this code so that the words are stored different ArrayLists depending on the part-of-speech.
```MadLibHelper.java``` This is an application for generating random words. You may use this for testing your **POSDictionary** class.
```POSChecker.java``` This is an application that can be used to check the part-of-speech for arbitrary words. You may use this for testing your **POSDictionary** class.
```pos_dict.txt``` This is a plain text file containing approximately 200,000 words labeled according to their part-of-speech. This is a simplified version of the public domain Moby Part-of-Speech file. The original version lists multiple parts-of-speech for each word where appropriate. This version selects a single part-of-speech for each word.

## Instructions
---
- Complete ```POSDictionary.java``` so that all methods conform to the docstrings. Test your completed file by running the two provided application programs. Since these are command-line applications, you should execute them from the terminal.
- Once **POSDictionary** is working, create a MadLibs console user-interface that plays the game automatically with the selected words.  You may need to add accessor methods to complete this step.
- Submit
