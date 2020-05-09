package com.example.journeyunderthesea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity
{
    ConstraintLayout mConstraintLayout;
    ImageView mBackgroundImageView;
    TextView mStoryTextView;
    ImageButton mInfoImageButton;
    Button mTopButton;
    Button mBottomButton;
    Switch mSwitchView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.CONSTRAINT_LAYOUT);
        mBackgroundImageView = findViewById(R.id.BACKGROUND_IMAGEVIEW);
        mStoryTextView = findViewById(R.id.STORY_TEXTVIEW);
        mInfoImageButton = findViewById(R.id.INFO_BUTTON);
        mTopButton = findViewById(R.id.TOP_BUTTON);
        mBottomButton = findViewById(R.id.BOTTOM_BUTTON);
        mSwitchView = findViewById(R.id.SWITCH_VIEW);

        mBackgroundImageView.setImageAlpha(70);

        AlertDialog.Builder splashScreen = new AlertDialog.Builder(MainActivity.this);
        splashScreen.setTitle("ADVENTURE INSTRUCTIONS");
        splashScreen.setMessage("Developer: Rishav Nath Pati" +
                "\nClick START below to begin the adventure");
        splashScreen.setCancelable(false);
        splashScreen.setPositiveButton("START", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                page2();
            }
        });
        splashScreen.show();

        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.colorAccent));

        mSwitchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    mBackgroundImageView.setImageAlpha(255);
                    mStoryTextView.setVisibility(View.INVISIBLE);
                    mInfoImageButton.setVisibility(View.INVISIBLE);
                } else
                {
                    mBackgroundImageView.setImageAlpha(70);
                    mStoryTextView.setVisibility(View.VISIBLE);
                    mInfoImageButton.setVisibility(View.VISIBLE);
                }
            }
        });

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
                Log.d("Clicked", "Top Clicked");
                if (mTopButton.getText() == getString(R.string.ans2goto6))
                    page6();
                else if (mTopButton.getText() == getString(R.string.ans5goto8))
                    page8();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans8goto11))
                    page11();
                else if (mTopButton.getText() == getString(R.string.ans9goto16))
                    page16();
                else if (mTopButton.getText() == getString(R.string.ans10goto17))
                    page17();
                else if (mTopButton.getText() == getString(R.string.ans11goto24))
                    page24();
                else if (mTopButton.getText() == getString(R.string.ans12goto21))
                    page21();
                else if (mTopButton.getText() == getString(R.string.ans14goto26))
                    page26();
                else if (mTopButton.getText() == getString(R.string.ans15goto23))
                    page23();
                else if (mTopButton.getText() == getString(R.string.ans16goto29))
                    page29();
                else if (mTopButton.getText() == getString(R.string.ans17goto32))
                    page32();
                else if (mTopButton.getText() == getString(R.string.ans18goto34))
                    page34();
                else if (mTopButton.getText() == getString(R.string.ans22goto38))
                    page38();
                else if (mTopButton.getText() == getString(R.string.ans24goto6))
                    page6();
                else if (mTopButton.getText() == getString(R.string.ans27goto39))
                    page39();
                /*else if (mTopButton.getText() == getString(R.string.ans28goto41))
                    page41();
                else if (mTopButton.getText() == getString(R.string.ans29goto43))
                    page43();
                else if (mTopButton.getText() == getString(R.string.ans33goto45))
                    page45();
                else if (mTopButton.getText() == getString(R.string.ans34goto48))
                    page48();
                else if (mTopButton.getText() == getString(R.string.ans35goto50))
                    page50();
                else if (mTopButton.getText() == getString(R.string.ans38goto55))
                    page55();
                else if (mTopButton.getText() == getString(R.string.ans39goto56))
                    page56();
                else if (mTopButton.getText() == getString(R.string.ans41goto58))
                    page58();
                else if (mTopButton.getText() == getString(R.string.ans42goto6))
                    page6();
                else if (mTopButton.getText() == getString(R.string.ans43goto60))
                    page66();
                else if (mTopButton.getText() == getString(R.string.ans44goto64))
                    page64();
                else if (mTopButton.getText() == getString(R.string.ans45goto65))
                    page65();
                else if (mTopButton.getText() == getString(R.string.ans46goto48))
                    page48();
                else if (mTopButton.getText() == getString(R.string.ans48goto9))
                    page9();
                else if (mTopButton.getText() == getString(R.string.ans50goto67))
                    page67();
                else if (mTopButton.getText() == getString(R.string.ans51goto72))
                    page72();
                else if (mTopButton.getText() == getString(R.string.ans53goto69))
                    page69();
                else if (mTopButton.getText() == getString(R.string.ans55goto71))
                    page71();
                else if (mTopButton.getText() == getString(R.string.ans56goto75))
                    page75();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();
                else if (mTopButton.getText() == getString(R.string.ans6goto10))
                    page10();*/


            }
        });


        mBottomButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Clicked", "Bottom Clicked");
                if (mBottomButton.getText() == getString(R.string.ans2goto5))
                    page5();
                else if (mBottomButton.getText() == getString(R.string.ans8goto15))
                    page15();
                else if (mBottomButton.getText() == getString(R.string.ans9goto14))
                    page14();
                else if (mBottomButton.getText() == getString(R.string.ans11goto22))
                    page22();
                else if (mBottomButton.getText() == getString(R.string.ans24goto6))
                    page6();
                else if (mBottomButton.getText() == getString(R.string.exit))
                    finish();
            }
        });
    }

    public void page2()
    {
        Log.d("Reached", "Page 2");
        mStoryTextView.setText(R.string.story2);
        mTopButton.setText(R.string.ans2goto6);
        mBottomButton.setText(R.string.ans2goto5);
        mBackgroundImageView.setImageResource(R.drawable.image2);
    }

    public void page5()
    {
        Log.d("Reached", "Page 5");
        mStoryTextView.setText(R.string.story5);
        mTopButton.setText(R.string.ans5goto8);
        mBottomButton.setText(R.string.ans5goto9);
        mBackgroundImageView.setImageResource(R.drawable.image5);
    }

    public void page6()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story6);
        mTopButton.setText(R.string.ans6goto10);
        mBottomButton.setText(R.string.ans6goto12);
        mBackgroundImageView.setImageResource(R.drawable.image6);
        mTopButton.setVisibility(View.VISIBLE);
    }

    public void page8()
    {
        Log.d("Reached", "Page 8");
        mStoryTextView.setText(R.string.story8);
        mTopButton.setText(R.string.ans8goto11);
        mBottomButton.setText(R.string.ans8goto15);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page9()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story9);
        mTopButton.setText(R.string.ans9goto16);
        mBottomButton.setText(R.string.ans9goto14);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page10()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story10);
        mTopButton.setText(R.string.ans10goto17);
        mBottomButton.setText(R.string.ans10goto18);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page11()
    {
        Log.d("Reached", "Page 11");
        mStoryTextView.setText(R.string.story11);
        mTopButton.setText(R.string.ans11goto24);
        mBottomButton.setText(R.string.ans11goto22);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page12()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story12);
        mTopButton.setText(R.string.ans12goto21);
        mBottomButton.setText(R.string.ans12goto19);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page14()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story14);
        mTopButton.setText(R.string.ans14goto26);
        mBottomButton.setText(R.string.ans14goto28);
        mBackgroundImageView.setImageResource(R.drawable.image14);
    }

    public void page15()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story6);
        mTopButton.setText(R.string.ans6goto10);
        mBottomButton.setText(R.string.ans6goto12);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page16()
    {
        Log.d("Reached", "Page 16");
        mStoryTextView.setText(R.string.story16);
        mTopButton.setText(R.string.ans16goto29);
        mBottomButton.setText(R.string.ans16goto31);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page17()
    {
        Log.d("Reached", "Page 17");
        mStoryTextView.setText(R.string.story17);
        mTopButton.setText(R.string.ans17goto32);
        mBottomButton.setText(R.string.ans17goto33);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page18()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story18);
        mTopButton.setText(R.string.ans18goto34);
        mBottomButton.setText(R.string.ans18goto37);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page19()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end19);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page21()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end21);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image21);
    }

    public void page22()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story22);
        mTopButton.setText(R.string.ans22goto38);
        mBottomButton.setText(R.string.ans22goto35);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page23()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end23);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page24()
    {
        Log.d("Reached", "Page 24");
        mStoryTextView.setText(R.string.story24);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.ans24goto6);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page26()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end26);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image26);
    }

    public void page27()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story27);
        mTopButton.setText(R.string.ans27goto39);
        mBottomButton.setText(R.string.ans27goto40);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page28()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story28);
        mTopButton.setText(R.string.ans28goto41);
        mBottomButton.setText(R.string.ans28goto42);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page29()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story29);
        mTopButton.setText(R.string.ans29goto43);
        mBottomButton.setText(R.string.ans29goto44);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page31()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end31);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image31);
    }

    public void page32()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end32);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page33()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story33);
        mTopButton.setText(R.string.ans33goto45);
        mBottomButton.setText(R.string.ans33goto46);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page34()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story34);
        mTopButton.setText(R.string.ans34goto48);
        mBottomButton.setText(R.string.ans34goto47);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page35()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story35);
        mTopButton.setText(R.string.ans35goto50);
        mBottomButton.setText(R.string.ans35goto53);
        mBackgroundImageView.setVisibility(View.INVISIBLE);
    }

    public void page37()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end37);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image37);
    }

    public void page38()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story38);
        mTopButton.setText(R.string.ans38goto55);
        mBottomButton.setText(R.string.ans38goto51);
        mBackgroundImageView.setVisibility(View.INVISIBLE);
    }

    public void page39()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story39);
        mTopButton.setText(R.string.ans39goto56);
        mBottomButton.setText(R.string.ans39goto57);
        mBackgroundImageView.setVisibility(View.INVISIBLE);
    }

    public void page40()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end40);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setVisibility(View.INVISIBLE);

    }

    public void page42()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story42);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.ans42goto6);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page43()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story43);
        mTopButton.setText(R.string.ans43goto60);
        mBottomButton.setText(R.string.ans43goto61);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page44()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story44);
        mTopButton.setText(R.string.ans44goto64);
        mBottomButton.setText(R.string.ans44goto63);
        mBackgroundImageView.setImageResource(R.drawable.image44);
    }

    public void page45()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story45);
        mTopButton.setText(R.string.ans45goto65);
        mBottomButton.setText(R.string.ans45goto66);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page46()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story41);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.ans46goto48);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page47()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.end47);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.exit);
        mBackgroundImageView.setImageResource(R.drawable.image0);

    }

    public void page48()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story48);
        mTopButton.setVisibility(View.INVISIBLE);
        mBottomButton.setText(R.string.ans48goto9);
        mBackgroundImageView.setImageResource(R.drawable.image48);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page51()
    {
        Log.d("Reached", "Page 51");
        mStoryTextView.setText(R.string.story51);
        mTopButton.setText(R.string.ans51goto72);
        mBottomButton.setText(R.string.ans51goto74);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page53()
    {
        Log.d("Reached", "Page 53");
        mStoryTextView.setText(R.string.story53);
        mTopButton.setText(R.string.ans53goto69);
        mBottomButton.setText(R.string.ans53goto70);
        mBackgroundImageView.setImageResource(R.drawable.image53);
    }

    public void page55()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story55);
        mTopButton.setText(R.string.ans55goto71);
        mBottomButton.setText(R.string.ans55goto73);
        mBackgroundImageView.setImageResource(R.drawable.image55);
    }

    public void page56()
    {
        Log.d("Reached", "Page 56");
        mStoryTextView.setText(R.string.story56);
        mTopButton.setText(R.string.ans56goto75);
        mBottomButton.setText(R.string.ans56goto76);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page57()
    {
        mStoryTextView.setText(R.string.story57);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }

    public void page50()
    {
        Log.d("Reached", "Page 6");
        mStoryTextView.setText(R.string.story50);
        mTopButton.setText(R.string.ans50goto67);
        mBottomButton.setText(R.string.ans50goto68);
        mBackgroundImageView.setImageResource(R.drawable.image0);
    }
}