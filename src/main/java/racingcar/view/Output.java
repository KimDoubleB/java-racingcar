package racingcar.view;

import racingcar.domain.Car;
import java.util.ArrayList;

public class Output {
    public static void printInputMessage(String inputInfo){
        System.out.println(inputInfo + "을(를) 입력해주세요.");
    }

    public static void printCurrentCarsState(ArrayList<Car> carsList){
        System.out.println("\n실행 결과");
        for(Car car : carsList){
            printCarInfo(car);
        }
    }

    private static void printCarInfo(Car car){
        StringBuffer carInfo = new StringBuffer();
        carInfo.append(car.getName());
        carInfo.append(" : ");
        for(int i = 0; i < car.getDistance(); ++i){
            carInfo.append("-");
        }
        System.out.println(carInfo);
    }

    public static void printWinners(ArrayList<Car> carsList, int maxDistance) {
        System.out.print("최종 우승자 : ");
        for(Car car : carsList) {
            printWinner(car, maxDistance);
        }
        System.out.println("");
    }

    private static void printWinner(Car car, int maxDistance) {
        if(car.getDistance() == maxDistance) {
            System.out.print(car.getName() + " ");
        }
    }
}
