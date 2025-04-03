package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgot {
    public static final void a(dgnx dgnxVar, GoogleHelp googleHelp) {
        dgnxVar.a(googleHelp);
    }

    public static final void b(Context context, dghd dghdVar, long j, GoogleHelp googleHelp) {
        if (dghdVar != null) {
            googleHelp.B = true;
            c(new dgnv(context, googleHelp, dghdVar, j));
            c(new dgnw(context, googleHelp, dghdVar, j));
        }
    }

    private static final void c(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }
}
