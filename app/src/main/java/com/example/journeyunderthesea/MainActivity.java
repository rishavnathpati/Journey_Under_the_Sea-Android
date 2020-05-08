package com.example.journeyunderthesea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    ImageButton mInfoImageButton;
    Button mTopButton, mBottomButton;
    TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoImageButton = findViewById(R.id.INFO_BUTTON);
        mTopButton=findViewById(R.id.TOP_BUTTON);
        mBottomButton=findViewById(R.id.BOTTOM_BUTTON);
        mStoryTextView=findViewById(R.id.STORY_TEXTVIEW);

        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.colorAccent));

        mInfoImageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AlertDialog.Builder devInfo = new AlertDialog.Builder(MainActivity.this);
                devInfo.setTitle("Dev Information");
                devInfo.setMessage("Developer: Rishav Nath Pati" +
                        "\nClick the links below to visit profiles");
                devInfo.setCancelable(true);
                devInfo.setNeutralButton("Facebook", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        goToUrl("https://www.facebook.com/rishav.pati.1");
                    }
                });
                devInfo.setPositiveButton("Github", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        goToUrl("https://github.com/rishavnathpati");
                    }
                });
                devInfo.setNegativeButton("LinkedIn", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        goToUrl("https://www.linkedin.com/in/rishav-nath-p-67223bb9/");
                    }
                });
                devInfo.show();
            }

            private void goToUrl(String url)
            {
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        mTopButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mStoryTextView.setText(R.string.story28);
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mStoryTextView.setText(R.string.story29);
            }
        });
    }
}
