package manzi.ur.awesomenavmanzi;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton loginbtn;
    ProgressBar progressBar;
    TextView attempts;
    int attempt_counter = 5;
    AppCompatEditText emailedittext, passwordedittext;
    TextInputLayout emailinputlayout, passwordinputlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        attempts.setText(attempt_counter);
        emailinputlayout=(TextInputLayout)findViewById(R.id.emailinputlayout);
        passwordinputlayout=(TextInputLayout)findViewById(R.id.passwordinputlayout);

        emailedittext= (AppCompatEditText) findViewById(R.id.emailedittext) ;
        passwordedittext= (AppCompatEditText) findViewById(R.id.passwordedittext) ;

       

        loginbtn = (AppCompatButton) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (emailedittext.getText().toString().equals("turatsinzejunior@gmail.com") && passwordedittext.getText().toString().equals("217063527") ){
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                }
else {
                    Toast.makeText(MainActivity.this, "Email or password is incorrect",Toast.LENGTH_LONG).show();


                }

            }
        });

        AppCompatButton registerbtn = (AppCompatButton) findViewById(R.id.registerbtn);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });


    }


    public void validate(){
        boolean isValid= true;
        String emailvalue=emailedittext.getText().toString();
        String passwordvalue=passwordedittext.getText().toString();
        if (emailvalue.isEmpty()){

            emailinputlayout.setError("Email Address Cant be Empty");
            isValid = false;
        }
        else {
            emailinputlayout.setErrorEnabled(false);
        }

        if (passwordvalue.trim().length()<8){
            passwordinputlayout.setError("MINIMUM 8 CHARACTERS REQUIRED");
            isValid = false;
        }
        else {
            passwordinputlayout.setErrorEnabled(false);
        }

        if (isValid){

            Toast.makeText(MainActivity.this, "Registration completed Successfully",Toast.LENGTH_LONG).show();

        }
    }
}
