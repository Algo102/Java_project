package Lecture.Lec8_2OOP.Ex006.Interface;

import Lecture.Lec8_2OOP.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
