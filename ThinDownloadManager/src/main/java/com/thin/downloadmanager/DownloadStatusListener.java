package com.thin.downloadmanager;

import android.net.Uri;

public interface DownloadStatusListener {

	// Callback when download is successfully completed
	void onDownloadComplete(int id, Uri downloadedFile);

    //Callback if download is failed. Corresponding error code and error messages are provided
    void onDownloadFailed (int id, int errorCode, String errorMessage);

    //Callback provides download progress
	void onProgress (int id, long totalBytes, long downloadedBytes, int progress);
}
