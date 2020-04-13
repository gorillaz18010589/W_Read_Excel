package com.example.w_read_excel;

public class Word {
    String id,type,noun,nountw,verb,verbtw,adj,adjtw,nickname,sentence,sentencetw,adverb,adverbtw;

    public Word() {
    }

    public Word(String id, String type, String noun, String nountw, String verb, String verbtw, String adj, String adjtw, String nickname, String sentence, String sentencetw, String adverb, String adverbtw) {
        this.id = id;
        this.type = type;
        this.noun = noun;
        this.nountw = nountw;
        this.verb = verb;
        this.verbtw = verbtw;
        this.adj = adj;
        this.adjtw = adjtw;
        this.nickname = nickname;
        this.sentence = sentence;
        this.sentencetw = sentencetw;
        this.adverb = adverb;
        this.adverbtw = adverbtw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getNountw() {
        return nountw;
    }

    public void setNountw(String nountw) {
        this.nountw = nountw;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getVerbtw() {
        return verbtw;
    }

    public void setVerbtw(String verbtw) {
        this.verbtw = verbtw;
    }

    public String getAdj() {
        return adj;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public String getAdjtw() {
        return adjtw;
    }

    public void setAdjtw(String adjtw) {
        this.adjtw = adjtw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentencetw() {
        return sentencetw;
    }

    public void setSentencetw(String sentencetw) {
        this.sentencetw = sentencetw;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getAdverbtw() {
        return adverbtw;
    }

    public void setAdverbtw(String adverbtw) {
        this.adverbtw = adverbtw;
    }
}
