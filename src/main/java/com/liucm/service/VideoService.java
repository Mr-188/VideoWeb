package com.liucm.service;

import java.util.List;

import com.liucm.bean.User;
import com.liucm.bean.Video;
import com.liucm.util.Page;

public interface VideoService {
	
	public boolean verifyVideo(int videoId,int stateId);

	public List<Video> getVideoListByAjax(int curPage, int pageSize);
	
	public List<Video> getRecommendVideo(int curPage, int pageSize,int userId);
	
	public List<Video> getVideoListByAjax(int curPage, int pageSize,int videoTypeId);
	
	public String getVideoByPage(Page<Video> page);
	public String getVideoByPage2(Page<Video> page);
	public List<Video> getVideoRecommend(int pageSize);

	public Video getVideoByVideoId(int videoId);

	public boolean addVideo(Video video);

	public List<Video> getEnableVideoByUserId(int userId);

	public List<Video> getDisableVideoByUserId(int userId);

	public List<Video> getVerifyingVideoByUserId(int userId);

	public List<Video> getVerifiedVideoByUserId(int userId);

	public List<Video> getVideoByTitle(String title);
	public List<Video> getVerifyFalseVideoByUserId(int userId);

	public int upStore(int videoId);

	public int downStore(int videoId);

	public String deleteVideo(int videoId);

	public int updateVideo(Video video);

	public String addViewSum(int videoId);

	public String addVideoDianZanSum(User user, int videoId);

	public String addComment(int starNum, int userId, int videoId);	

}
