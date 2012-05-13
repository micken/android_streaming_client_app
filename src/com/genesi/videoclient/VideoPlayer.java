package com.genesi.videoclient;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.ProgressBar;
import android.widget.VideoView;
import android.widget.ZoomControls;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public class VideoPlayer 
extends Activity
implements OnPreparedListener, OnCompletionListener
{
	//private VideoView mVideo;
	
	private MyVideo mVideo;
	private ProgressBar mProgressBar;
	int zoomlevel;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    zoomlevel=1;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.video);

	    // TODO Auto-generated method stub
	    Bundle extras = getIntent().getExtras();
	    if (extras == null) {
	    		return;
	    }
	    // Get data via the key
	    String URL = extras.getString("URL");
	    Log.i("VideoPlayer", URL);
	    
	    
	    mVideo = (MyVideo) this.findViewById(R.id.myVideo1);
	    mProgressBar = (ProgressBar) this.findViewById(R.id.progressBar1);
		mProgressBar.setVisibility(View.VISIBLE);
		mProgressBar.setSystemUiVisibility(View.STATUS_BAR_HIDDEN);

		
	    mVideo.setVideoPath(URL);
	    //mVideo.setMediaController(new MediaController(this));
	    
	    mVideo.requestFocus();
	    mVideo.start();
	    //mVideo.setZoom(8);
	    mVideo.setOnPreparedListener(this);
	    mVideo.setOnCompletionListener(this);
	    ZoomControls zoomControls = (ZoomControls) findViewById(R.id.zoomControls1);
	    zoomControls.setIsZoomInEnabled(true);
	    zoomControls.setIsZoomOutEnabled(true);

	    zoomControls.setOnZoomInClickListener(new ZoomControls.OnClickListener(){
	        public void onClick(View v){
	                if(zoomlevel < 8){
	                    zoomlevel++;
	                    mVideo.setZoom(zoomlevel);
	                }
	        }
	    });
	    
	    zoomControls.setOnZoomOutClickListener(new ZoomControls.OnClickListener(){
	        public void onClick(View v){
	                if(zoomlevel > 1){
	                    zoomlevel--;
	                    mVideo.setZoom(zoomlevel);
	                }
	        }
	    });   
	}

	public void onPrepared(MediaPlayer mp) {
		mProgressBar.setVisibility(View.INVISIBLE);
	}

	public void onCompletion(MediaPlayer mp) {
		finish();		
	}

}
