package templete;

/**
 * 
 * @author HEYKJ
 *
 * 울고 나서 총 3단계의 알고리즘 레이아웃을 구성
 * 상세한 알고리즘 정의 및 코딩은 해당 템플릿을 참조하는 서브 클래스에게 위임 
 * 
 */
public interface TempleteAfterCry {

	public void afterCrying(); //울고 난 직후
	public void oneDayPassedAfterCrying(); //울고나서 1일 후
	public void oneWeekPassedAfterCrying(); //울고나서 일주일 후

}
