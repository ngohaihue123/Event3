package event3.project.ngohaihue.com.event3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editNumberA;
    private EditText editNumberB;
    private Button btnAdd;
    private TextView result;
    private int numberA, numberB, sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNumberA = (EditText) findViewById(R.id.edit_numberA);
                editNumberB = (EditText) findViewById(R.id.edit_numberB);
                result = (TextView) findViewById(R.id.text_result);
                if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {
                    numberA = (Integer.parseInt(editNumberA.getText().toString()));
                    numberB = (Integer.parseInt(editNumberB.getText().toString()));
                    sum = numberA + numberB;
                    result.setText(sum + "");

                } else {
                    result.setText("vui lòng nhập số ");
                }
            }
        });

    }

}
