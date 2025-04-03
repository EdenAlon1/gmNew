package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eegv {
    AUDIO("audio"),
    VIDEO("video"),
    APPLICATION("application"),
    DATA(GroupManagementRequest.DATA_TAG),
    MESSAGE("message");

    public final String f;

    eegv(String str) {
        this.f = str;
    }
}
