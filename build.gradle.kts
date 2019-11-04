plugins {
  id("org.danilopianini.gradle-latex") version "0.1.0-dev02+f5ee9b5"
}

latex {
    "cas-sc-template" {
        bib = "cas-refs.bib"
    }
    "cas-dc-template" {
        bib = "cas-refs.bib"
    }
}
