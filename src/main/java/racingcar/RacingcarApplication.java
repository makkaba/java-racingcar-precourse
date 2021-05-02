package racingcar;

import racingcar.view.InputView;

import java.util.List;

public class RacingcarApplication {
    public static void main(String[] args){
        System.out.println("hello world");
        List<String> result = InputView.enterCarNames();
    }
}
