import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
      
        findViewById(R.id.startButton).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
            startActivity(intent);
        });
    }
}
