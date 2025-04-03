package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgr {
    public final evgy a;

    public clgr(Context context, evgy evgyVar) {
        this.a = evgyVar;
        HashMap hashMap = new HashMap();
        feez.b("bugle.smapi.rcs.MessagingEngineNotificationService", evcv.c(context, enip.r("com.google.android.ims", "com.google.android.apps.messaging")), hashMap);
        evgyVar.b(feez.a(hashMap));
    }
}
