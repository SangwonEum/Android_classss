package androidbook.ch03.layout.framelayout;

import android.app.Activity;
import android.os.Bundle;
import androidbook.ch03.R;

public class ForegroundFrameLayout extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foreground_framelayout);
    }
}
