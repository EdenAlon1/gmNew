package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxg {
    public static final nxm a(Context context, nzh nzhVar, Bundle bundle, lkj lkjVar, nyk nykVar, String str, Bundle bundle2) {
        lkjVar.getClass();
        str.getClass();
        return new nxm(context, nzhVar, bundle, lkjVar, nykVar, str, bundle2);
    }

    public static /* synthetic */ nxm b(Context context, nzh nzhVar, Bundle bundle, lkj lkjVar, nyk nykVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return a(context, nzhVar, bundle, lkjVar, nykVar, uuid, null);
    }
}
