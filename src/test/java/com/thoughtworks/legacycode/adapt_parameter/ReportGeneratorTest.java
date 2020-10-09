package com.thoughtworks.legacycode.adapt_parameter;

import org.junit.jupiter.api.Test;

class ReportGeneratorTest {

//  Adapt Parameter

// Use adapter pattern on tough dependency
//
// Wrap the console parameter in a new class that we can then mock

    @Test
    void should_print_transformed_input_to_console() {
        ReportGenerator reportGenerator = new ReportGenerator();

        // Change
        reportGenerator.reportToConsole(System.console());

        // Verify that we printed the string that the user entered into the console
    }
}
