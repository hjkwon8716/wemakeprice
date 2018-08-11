package joon.wmp.util.cp.spring;

import joon.wmp.util.domain.Output;
import joon.wmp.util.logic.OutputServiceLogic;
import org.springframework.stereotype.Service;

@Service("outputService")
public class OutputSpringService extends OutputServiceLogic{

    @Override
    public Output getOutput(String inputValue, int condition) {
        return super.getOutput(inputValue, condition);
    }

    @Override
    public String getOutputStep1(String inputValue) {
        return super.getOutputStep1(inputValue);
    }

    @Override
    public String getOutputStep2(String inputValue) {
        return super.getOutputStep2(inputValue);
    }
}
