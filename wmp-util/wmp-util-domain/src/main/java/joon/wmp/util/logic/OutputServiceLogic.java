package joon.wmp.util.logic;

import joon.wmp.util.domain.Output;
import joon.wmp.util.domain.RegularExpression;
import joon.wmp.util.domain.Sort;
import joon.wmp.util.service.OutputService;

public class OutputServiceLogic implements OutputService{

    @Override
    public Output getOutput(String inputValue, int condition) {
        RegularExpression regularExpression = new RegularExpression(inputValue);
        Sort sort = new Sort(regularExpression);

        return new Output(sort.getCrossSort(), condition);
    }
}
