package androidbook.ch03.layout.linearlayout;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import androidbook.ch03.Main;
import androidbook.ch03.R;
import androidbook.ch03.SampleActivity;

public class LinearlayoutActivity extends Activity implements OnItemClickListener{
	
	private ListView list;
	private ArrayList<String> activity;
	private ArrayAdapter<String> adapter;
	private Intent intent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);
        list = (ListView)findViewById(R.id.list);
        activity = new ArrayList<String>();
        activity.add("BasicLinearLayout");
        activity.add("ReiterationLinearLayout");
        activity.add("SizeLinearLayout");
        activity.add("WeightLinearLayout");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activity);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
		// TODO Auto-generated method stub
		switch(position)
		{
		case 0 :
			intent = new Intent(LinearlayoutActivity.this,BasicLinearLayout.class);
			startActivity(intent);
			break;
		case 1 :
			intent = new Intent(LinearlayoutActivity.this,ReiterationLinearLayout.class);
			startActivity(intent);
			break;
		case 2 :
			intent = new Intent(LinearlayoutActivity.this,SizeLinearLayout.class);
			startActivity(intent);
			break;
		case 3 :
			intent = new Intent(LinearlayoutActivity.this,WeightLinearLayout.class);
			startActivity(intent);
			break;
			
		}
		
	}
}
