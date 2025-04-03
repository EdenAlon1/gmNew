package com.google.android.ims.provisioning.config;

import android.text.TextUtils;
import defpackage.djti;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SecondaryDeviceConfiguration implements Serializable {
    private static final long serialVersionUID = 3571080866179902281L;
    private boolean mIsChatEnabled;
    private boolean mIsFileTransferEnabled;
    private boolean mIsImageShareEnabled;
    private boolean mIsSendSmsEnabled;
    private boolean mIsVideoShareEnabled;
    private boolean mIsVoiceCallEnabled;

    public SecondaryDeviceConfiguration() {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
    }

    private static boolean a(djti djtiVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String e = djtiVar.e(str);
        if (e == null) {
            e = "";
        }
        return !e.equals("1");
    }

    public SecondaryDeviceConfiguration(djti djtiVar) {
        this.mIsVoiceCallEnabled = true;
        this.mIsChatEnabled = true;
        this.mIsSendSmsEnabled = true;
        this.mIsFileTransferEnabled = true;
        this.mIsVideoShareEnabled = true;
        this.mIsImageShareEnabled = true;
        this.mIsVoiceCallEnabled = a(djtiVar, "VoiceCall");
        this.mIsChatEnabled = a(djtiVar, "Chat");
        this.mIsSendSmsEnabled = a(djtiVar, "SendSms");
        this.mIsFileTransferEnabled = a(djtiVar, "FileTransfer");
        this.mIsVideoShareEnabled = a(djtiVar, "VideoShare");
        this.mIsImageShareEnabled = a(djtiVar, "ImageShare");
    }
}
