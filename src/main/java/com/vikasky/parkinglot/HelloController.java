package com.vikasky.parkinglot;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.HashMap;

import com.vikasky.parkinglot.Game_Related.Game;
import com.vikasky.parkinglot.Game_Related.GameManager;
import com.vikasky.parkinglot.chesspiece.Piece;
import com.vikasky.parkinglot.powers.TeamColor;
import com.vikasky.parkinglot.time_factory.*;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class HelloController {

//	@Autowired
//    ParkingTicketRepository parkingTicketRepository;


	GameManager gameManager = new GameManager();

	@GetMapping("/")
	public String index() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {






		TimeFormat t = TimeFormatFactory.getTimeFormatFromKey("blitz");

		return String.valueOf(t.getTotalTime());
	}


	@GetMapping("/initializeNewGame")
	public HashMap<Pair<Integer, Character>, Piece> getNewGame() {
		TotalTimeAndTimePerMove t1 = new TotalTimeAndTimePerMove(Duration.ofMinutes(3), Duration.ZERO);
		Game g = gameManager.initializeNewGame(t1);
		g.startGame();
		return g.getPiecesAndTheirLocations();
//		return "new game initialized!!";
	}

	@GetMapping("/makeAMove")
	public Boolean movePiece(@RequestParam int fromRow, @RequestParam Character fromColumn, @RequestParam int toRow, @RequestParam Character toColumn, @RequestParam String teamColor) {
		Game g = gameManager.getOfflineGame();
		System.out.printf(fromRow+" "+fromColumn +" "+toRow+" "+toColumn+" "+ teamColor);
		TeamColor teamColor1 = teamColor.equalsIgnoreCase("white") ? TeamColor.WHITE : TeamColor.BLACK;
		return g.makeMove(new Pair<>(fromRow, fromColumn), new Pair<>(toRow, toColumn), teamColor1);
	}

//	public String startNewOfflineGame() {
//
//	}

//	@GetMapping("/setTimeFormat")
//	public String getApplicableTimeLimitRulesForATimeFormat() {
//
//	}

















	// BookingSpot[] = new BookingSpot[];

//	@PostMapping("/generateTicket")
//	public int generatedTicketNumber(@RequestBody String vehicleNumber) {
//		return 1;
//	}
//
//	@GetMapping("/getPrice")
//	public int getPriceFromTicketNumber(@RequestParam int ticketNumber) {
//		return 2;
//	}
}