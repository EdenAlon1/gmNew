package defpackage;

import android.os.StrictMode;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawh implements caze {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker");
    public final ThreadLocal b;

    public cawh(ThreadLocal threadLocal) {
        this.b = threadLocal;
    }

    @Override // defpackage.caze
    public final StrictMode.ThreadPolicy a() {
        StrictMode.ThreadPolicy.Builder penaltyListener;
        penaltyListener = new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskReads().detectDiskWrites().penaltyListener(erpp.a, new cawg(this));
        return penaltyListener.build();
    }
}
