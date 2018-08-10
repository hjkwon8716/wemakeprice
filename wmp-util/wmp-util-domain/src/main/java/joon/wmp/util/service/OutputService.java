package joon.wmp.util.service;

import joon.wmp.util.domain.Output;

public interface OutputService {
    Output getOutput(String inputValue, int condition);
}
