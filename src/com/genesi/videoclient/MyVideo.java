package com.genesi.videoclient;

import android.content.Context;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.MediaController;
import android.widget.VideoView;

public class MyVideo extends VideoView {

	public MyVideo(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MyVideo(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#canPause()
	 */
	@Override
	public boolean canPause() {
		// TODO Auto-generated method stub
		return super.canPause();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#canSeekBackward()
	 */
	@Override
	public boolean canSeekBackward() {
		// TODO Auto-generated method stub
		return super.canSeekBackward();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#canSeekForward()
	 */
	@Override
	public boolean canSeekForward() {
		// TODO Auto-generated method stub
		return super.canSeekForward();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#getBufferPercentage()
	 */
	@Override
	public int getBufferPercentage() {
		// TODO Auto-generated method stub
		return super.getBufferPercentage();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#getCurrentPosition()
	 */
	@Override
	public int getCurrentPosition() {
		// TODO Auto-generated method stub
		return super.getCurrentPosition();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#getDuration()
	 */
	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return super.getDuration();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#isPlaying()
	 */
	@Override
	public boolean isPlaying() {
		// TODO Auto-generated method stub
		return super.isPlaying();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#onKeyDown(int, android.view.KeyEvent)
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyDown(keyCode, event);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#onTouchEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(ev);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#onTrackballEvent(android.view.MotionEvent)
	 */
	@Override
	public boolean onTrackballEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.onTrackballEvent(ev);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#pause()
	 */
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		super.pause();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#resolveAdjustedSize(int, int)
	 */
	@Override
	public int resolveAdjustedSize(int desiredSize, int measureSpec) {
		// TODO Auto-generated method stub
		return super.resolveAdjustedSize(desiredSize, measureSpec);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#resume()
	 */
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		super.resume();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#seekTo(int)
	 */
	@Override
	public void seekTo(int msec) {
		// TODO Auto-generated method stub
		super.seekTo(msec);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setMediaController(android.widget.MediaController)
	 */
	@Override
	public void setMediaController(MediaController controller) {
		// TODO Auto-generated method stub
		super.setMediaController(controller);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener)
	 */
	@Override
	public void setOnCompletionListener(OnCompletionListener l) {
		// TODO Auto-generated method stub
		super.setOnCompletionListener(l);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setOnErrorListener(android.media.MediaPlayer.OnErrorListener)
	 */
	@Override
	public void setOnErrorListener(OnErrorListener l) {
		// TODO Auto-generated method stub
		super.setOnErrorListener(l);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener)
	 */
	@Override
	public void setOnPreparedListener(OnPreparedListener l) {
		// TODO Auto-generated method stub
		super.setOnPreparedListener(l);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setVideoPath(java.lang.String)
	 */
	@Override
	public void setVideoPath(String path) {
		// TODO Auto-generated method stub
		super.setVideoPath(path);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#setVideoURI(android.net.Uri)
	 */
	@Override
	public void setVideoURI(Uri uri) {
		// TODO Auto-generated method stub
		super.setVideoURI(uri);
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#stopPlayback()
	 */
	@Override
	public void stopPlayback() {
		// TODO Auto-generated method stub
		super.stopPlayback();
	}

	/* (non-Javadoc)
	 * @see android.widget.VideoView#suspend()
	 */
	@Override
	public void suspend() {
		// TODO Auto-generated method stub
		super.suspend();
	}

	int mVideoWidth;
	int mVideoHeight;
	
	public MyVideo(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	 public enum DisplayMode {
	       ORIGINAL,       // original aspect ratio
	       FULL_SCREEN,    // fit to screen
	       ZOOM            // zoom in
	    };
	    DisplayMode screenMode;
	    int zoom;
	    @Override
	    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) 
	    {
	        int width =getDefaultSize(getWidth(), widthMeasureSpec);
	        int height =getDefaultSize(getHeight(), heightMeasureSpec);
	        
	        
	       
	        setMeasuredDimension(width*zoom, height*zoom);
	    } 

	    public void setZoom(int zoomfactor)
	    {
	    	
	        zoom=zoomfactor;
	        
	        getHolder().setFixedSize(640, 480); 
	        
	        requestLayout();
	        invalidate();     
	    } 

}
