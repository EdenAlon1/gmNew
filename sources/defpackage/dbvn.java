package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvn {
    public static final void a(Context context, eisx eisxVar, boolean z) {
        Intent a = akuv.c(context, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
        a.getClass();
        eiuy.c(a, eisxVar);
        a.putExtra("turnOnGaiaPairing", z);
        eldl.p(context, a);
    }
}
