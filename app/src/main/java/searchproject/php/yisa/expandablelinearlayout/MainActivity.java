package searchproject.php.yisa.expandablelinearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //使用默认底部
    public void useDefaultBottom(View view){
        Intent intent = new Intent(this, EllDefaultBottomDemoActivity.class);
        startActivity(intent);
    }

    //使用自定义底部
    public void useCustomBottom(View view){
        Intent intent = new Intent(this, EllCustomBottomDemoActivity.class);
        startActivity(intent);
    }
}
