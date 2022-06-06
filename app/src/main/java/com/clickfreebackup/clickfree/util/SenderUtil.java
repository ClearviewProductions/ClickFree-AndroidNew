package com.clickfreebackup.clickfree.util;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import timber.log.Timber;

public class SenderUtil {
//  private static final String RECIPIENT_VALUE = "wecare@clickfreebackup.com";
    private static final String RECIPIENT_VALUE = "clearview.demo1@gmail.com";
    private static final String RECIPIENT = "&to=";
    private static final String MAIL_TO_TAG = "mailto:";
    private static final String SUBJECT_VALUE = "Mo Disc (Android)";
    private static final String SUBJECT = "?subject=";

    public static void sendMessageToBackup(final Context context) {
        final Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(MAIL_TO_TAG + SUBJECT + SUBJECT_VALUE + RECIPIENT + RECIPIENT_VALUE));
        try{
            context.startActivity(intent);
        }catch (Exception exception){
            Timber.e(exception, "Enable to send email.");
        }
    }
}
