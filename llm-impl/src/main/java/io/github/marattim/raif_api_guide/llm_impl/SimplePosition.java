package io.github.marattim.raif_api_guide.llm_impl;

import io.github.marattim.raif_api_guide.Position;

record SimplePosition(int line, int character) implements Position {
}
