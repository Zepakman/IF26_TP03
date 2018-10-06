

package fr.utt.if26.bois_tp03;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * This class is my whole application, this is for Javadoc testing purpose
 * @author martin
 */

public class MainActivity extends AppCompatActivity {

    String message = "Bonjour IF26 !";

    /**
     * This method is my whole application, this is for Javadoc testing purpose
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText(getResources().getString(R.string.message));

        Button bt = (Button) findViewById(R.id.bouton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
            } });
    }
}
