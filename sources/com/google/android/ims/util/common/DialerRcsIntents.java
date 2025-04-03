package com.google.android.ims.util.common;

import defpackage.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DialerRcsIntents {
    public static final String ACTION_CALL_CAPABILITIES_UPDATE = "dialer.rcs.intent.action.callCapabilitiesUpdate";
    public static final String ACTION_INCOMING_CALL_COMPOSER_MESSAGE = "dialer.rcs.intent.action.incomingCallComposerMessage";
    public static final String ACTION_INCOMING_PICTURE_MESSAGE = "dialer.rcs.intent.action.incomingPictureMessage";
    public static final String ACTION_INCOMING_VIDEO_SHARE = "dialer.rcs.intent.action.incomingVideoShare";
    public static final String ACTION_MESSAGE_STATUS_UPDATE = "dialer.rcs.intent.action.messageStatusUpdate";
    public static final String ACTION_SESSION_STATUS_UPDATE = "dialer.rcs.intent.action.sessionStatusUpdate";
    public static final String EXTRA_CALL_COMPOSER_SUPPORTED = "rcs.intent.extra.callComposerSupported";
    public static final String EXTRA_CODEC = "rcs.intent.extra.codec";
    public static final String EXTRA_HEIGHT = "rcs.intent.extra.height";
    public static final String EXTRA_IS_TEMPORARILY_OFFLINE = "rcs.intent.extra.temporarilyOffline";
    public static final String EXTRA_ORIENTATION = "rcs.intent.extra.orientation";
    public static final String EXTRA_POST_CALL_SUPPORTED = "rcs.intent.extra.postCallSupported";
    public static final String EXTRA_VIDEO_SHARE_SUPPORTED = "rcs.intent.extra.videoShareSupported";
    public static final String EXTRA_WIDTH = "rcs.intent.extra.width";
    public static final int MESSAGE_STATE_FAILED = 5;
    public static final int MESSAGE_STATE_SENT = 4;
    public static final int SESSION_STATE_CLOSED = 3;
    public static final int SESSION_STATE_STARTED = 2;
    public static final int SESSION_STATE_STARTING = 0;
    public static final int SESSION_STATE_START_FAILED = 1;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageState {
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SessionState {
    }

    public static boolean isMessageState(int i) {
        return i == 4 || i == 5;
    }

    public static boolean isSessionState(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public static String messageStateToString(int i) {
        if (i == 4) {
            return "MESSAGE_STATE_SENT";
        }
        if (i == 5) {
            return "MESSAGE_STATE_FAILED";
        }
        throw new IllegalArgumentException(a.h(i, "Unrecognized messageState: "));
    }

    public static String sessionStateToString(int i) {
        if (i == 0) {
            return "SESSION_STATE_STARTING";
        }
        if (i == 1) {
            return "SESSION_STATE_START_FAILED";
        }
        if (i == 2) {
            return "SESSION_STATE_STARTED";
        }
        if (i == 3) {
            return "SESSION_STATE_CLOSED";
        }
        throw new IllegalArgumentException(a.h(i, "Unrecognized sessionState: "));
    }
}
