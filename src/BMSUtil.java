import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BMSUtil {

	public static List<Integer> createSeq(int startVal, int endVal, int step) {
		return IntStream.iterate(startVal, i -> i + step).limit(endVal).boxed().collect(Collectors.toList());
	}

	public static List<Integer> createTempSeq(int startVal, int endVal, int step) {
		return createSeq(startVal, endVal, step);
	}

	public static List<Integer> createCRSeq(int startVal, int endVal, int step) {
		return createSeq(startVal, endVal, step);
	}

	public static void printSeq(String msg, final List<Integer> seqList) {
		System.out.println(msg + " - " + seqList);
	}

}
