package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtr {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/gaia/GaiaIntentsImpl");

    public final void a(Context context, boolean z) {
        ensk h = a.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/gaia/GaiaIntentsImpl", "launchGaiaPairing", 37, "GaiaIntentsImpl.java")).q("GaiaIntents: Launching GaiaPairing page.");
        Intent a2 = akuv.c(context, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
        a2.putExtra("turnOnGaiaPairing", z);
        eldl.p(context, a2);
    }
}
