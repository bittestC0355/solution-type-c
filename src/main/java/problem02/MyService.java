package problem02;

public class MyService extends BaseService {
	private final String DAY = "낮";
	private final String AFTERNOON = "오후";
	private final String NIGHT = "밤";
	
	private String state;
	private String resultMessage;
	
	@Override
	public void service(String state) {
		this.state = state;
		if(state.equalsIgnoreCase(DAY)) {
			day();
			System.out.println(this.resultMessage);
		}else if(state.equalsIgnoreCase(AFTERNOON)) {
			afternoon();
			System.out.println(this.resultMessage);
		}else if(state.equalsIgnoreCase(NIGHT)) {
			night();
			System.out.println(this.resultMessage);
		}
	}
	

	@Override
	public String day() {
		this.resultMessage = "낮서비스시작";
		return this.resultMessage;
	}


	@Override
	public String night() {
		this.resultMessage = "밤서비스시작";
		return this.resultMessage;
	}


	public String afternoon() {
		this.resultMessage = "오후서비스시작";
		return this.resultMessage;
	}
}
