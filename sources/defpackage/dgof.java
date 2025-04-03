package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgof extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ dghd c;

    public dgof(Intent intent, WeakReference weakReference, dghd dghdVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = dghdVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onGoogleHelpProcessed(GoogleHelp googleHelp) {
        Intent intent = this.a;
        long nanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        if (this.c != null) {
            dgot.b(activity.getApplicationContext(), this.c, nanoTime, googleHelp);
        }
        googleHelp.z = dfpi.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            togglingData.c = dgor.a(activity);
        }
        dgom.b(activity, this.a, googleHelp);
    }
}
