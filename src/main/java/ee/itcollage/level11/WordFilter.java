package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    //todo fix tests

    /*public List<Word> getNouns(List<Word> words) {
        List<Word> nouns = new ArrayList<>();
        for (Word word : words) {
            //if (word.getWordType().equals(Word.WordType.NOUN)) {
            if (word.getWordType().isNoun()) {
                nouns.add(word);
            }
        }
        return nouns;
    }*/

    public List<Word> getNouns(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isNoun())
                .collect(Collectors.toList());
    }

    /*public Word getFirstVerb(List<Word> words) {
        List<Word> firstVerb = new ArrayList<>();
        for (Word word : words) {
            // if (word.getWordType().equals(Word.WordType.VERB)) {
            if (word.getWordType().isVerb()) {
                firstVerb.add(word);
                return firstVerb.get(0);
            }
        }
        return null;
    }*/

    public Word getFirstVerb(List<Word> words) {
        return words.stream()
                .filter(word -> word.getWordType().isVerb())
                .findFirst().orElse(null);
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        List<Word> firstType = new ArrayList<>();
        for (Word word : words) {
            // if (word.getWordType().equals(Word.WordType.VERB)) {
            if (word.getWordType().equals(type)) {
                firstType.add(word);
                return firstType.get(0);
            }
        }
        return null;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        List<Word> notNouns = new ArrayList<>();
        for (Word word : words) {
            //if (word.getWordType().equals(Word.WordType.NOUN)) {
            if (!word.getWordType().isNoun()) {
                notNouns.add(word);
            }
        }
        return notNouns;
    }

    public List<String> getNounStrings(List<Word> words) {
        List<String> nounsString = new ArrayList<>();
        for (Word word : words) {
            //if (word.getWordType().equals(Word.WordType.NOUN)) {
            if (word.getWordType().isNoun()) {
                nounsString.add(word.getWord());
            }
        }
        return nounsString;
    }

    public String getFirstVerbString(List<Word> words) {
        List<String> firstVerbString = new ArrayList<>();
        for (Word word : words) {
            // if (word.getWordType().equals(Word.WordType.VERB)) {
            if (word.getWordType().isVerb()) {
                firstVerbString.add(word.getWord());
                return firstVerbString.get(0);
            }
        }
        return null;
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        List<String> firstStringType = new ArrayList<>();
        for (Word word : words) {
            // if (word.getWordType().equals(Word.WordType.VERB)) {
            if (word.getWordType().equals(type)) {
                firstStringType.add(word.getWord());
                return firstStringType.get(0);
            }
        }
        return null;
    }
}
