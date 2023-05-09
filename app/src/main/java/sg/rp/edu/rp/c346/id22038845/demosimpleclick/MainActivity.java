package sg.rp.edu.rp.c346.id22038845.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //declaration of field variables which need to import class to clear the red font color
    TextView tvDisplay; // type of variable + variableName
    Button btnDisplay;
    ToggleButton tbtn;
    EditText etInput;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link field variables to UI components in layout, linking of the id with the variable declared
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        tbtn=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.genderRd);

        //function for button for display
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action to be perform inserted below
                String stringResponse = etInput.getText().toString(); //assigns the get text converted to a string to a var
                int checkRadioId =rgGender.getCheckedRadioButtonId();
                if(checkRadioId==R.id.rbMale){
                    stringResponse="He says "+stringResponse;
                }else{
                    stringResponse="She says "+stringResponse;
                }

                tvDisplay.setText(stringResponse); //set the text from the var stringResponse


            }
        });

        //function for button to enable/disable
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbtn.isChecked()==true){
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }
            }
        });

    }
}