import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class AlphabetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        
        TextView alphabetTextView = findViewById(R.id.alphabetTextView);
        alphabetTextView.setText(loadAlphabetFromFile());
    }
    
              private String loadAlphabetFromFile() {
        
        return "";
    }
}
