package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgog extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ dghd b;

    public dgog(WeakReference weakReference, dghd dghdVar) {
        this.a = weakReference;
        this.b = dghdVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onInProductHelpProcessed(InProductHelp inProductHelp) {
        long nanoTime = System.nanoTime();
        GoogleHelp googleHelp = inProductHelp.a;
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_START_TICK", nanoTime);
        PendingIntent pendingIntent = googleHelp.y;
        if (pendingIntent != null) {
            putExtra.putExtra("EXTRA_CUSTOM_FEEDBACK", pendingIntent);
            googleHelp.y = null;
        }
        dfxl.b(inProductHelp, putExtra);
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        if (this.b != null) {
            dgot.b(activity.getApplicationContext(), this.b, nanoTime, googleHelp);
        }
        googleHelp.z = dfpi.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            togglingData.c = dgor.a(activity);
        }
        dgom.b(activity, putExtra, googleHelp);
    }
}
