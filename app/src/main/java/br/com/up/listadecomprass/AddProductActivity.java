package br.com.up.listadecomprass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class AddProductActivity extends AppCompatActivity {
    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextQuant;
    private TextInputEditText inputEditTextDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        inputEditTextName = findViewById(R.id.input_text_name);
        inputEditTextQuant = findViewById(R.id.input_text_quant);
        inputEditTextDesc = findViewById(R.id.input_text_desc);

        String textEditTextName = inputEditTextName.getText().toString();
        String textEditTextQuant = inputEditTextQuant.getText().toString();
        String textEditTextDesc = inputEditTextDesc.getText().toString();
    }
}