package com.ithinksky.petterns.structural.t01adapter.tinterface;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class WordEditorTest {

    @Test
    void editWordFile() {
        WordEditor wordEditor = new WordEditor();
        wordEditor.editWordFile();
    }
}