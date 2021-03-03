package project;

import java.util.Arrays;
import java.util.List;

public class PlaceService {
	public List<Place> getReservation() {
		return Arrays.asList(new Place(1, 5), new Place(2, 7));

	}
	public boolean isPlaceFree(Place  place) {
		return getReservation().stream().anyMatch(p->p.row==place.row&&p.place==place.place);
	}
}
