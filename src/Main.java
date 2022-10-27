import java.math.BigDecimal;
import java.util.List;

public class Main {

	public static void main(final String[] args) {

		List<Integer> tempValues = BMSUtil.createTempSeq(20, 50, 5);
		BMSUtil.printSeq("Temperature Sequence", tempValues);

		List<Integer> cRValues = BMSUtil.createCRSeq(2, 50, 2);
		BMSUtil.printSeq("Charge Rate Sequence", cRValues);

	}
}
