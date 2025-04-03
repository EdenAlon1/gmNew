package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgod implements dgnx {
    final /* synthetic */ dgoq a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ Intent c;
    final /* synthetic */ dghd d;

    public dgod(dgoq dgoqVar, WeakReference weakReference, Intent intent, dghd dghdVar) {
        this.a = dgoqVar;
        this.b = weakReference;
        this.c = intent;
        this.d = dghdVar;
    }

    @Override // defpackage.dgnx
    public final void a(GoogleHelp googleHelp) {
        try {
            ((IGoogleHelpService) this.a.w()).processGoogleHelpAndPip(googleHelp, null, new dgof(this.c, this.b, this.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
        }
    }
}
