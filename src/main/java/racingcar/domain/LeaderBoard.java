package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderBoard {
	private List<Car> players;
	private List<Car> winners;
	private Integer farthestDistance;

	public LeaderBoard(List<Car> players){
		this.players = players;
		this.farthestDistance = 0;
		this.winners = new ArrayList<>();
	}

	public List<Car> whoIsWinner(){
		for (Car player: players) {
			updateWinner(player);
		}
		return this.winners;
	}

	private void updateWinner(Car player) {
		if(player.getDistance() > farthestDistance){
			winners = new ArrayList<>(Arrays.asList(player));
			updateMaxDistance(player.getDistance());
			return;
		}
		if(player.getDistance() == farthestDistance){
			winners.add(player);
			return;
		}
	}

	private void updateMaxDistance(Integer distance){
		this.farthestDistance = distance;
	}
}
