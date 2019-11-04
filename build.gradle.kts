plugins {
  id("org.danilopianini.gradle-latex") version "0.1.1"
}

latex {
    "cas-sc-template" {
        bib = "cas-refs.bib"
    }
    "cas-dc-template" {
        bib = "cas-refs.bib"
    }
}
