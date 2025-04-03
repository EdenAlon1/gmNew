package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgoe implements dgnx {
    final /* synthetic */ InProductHelp a;
    final /* synthetic */ dgoq b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ dghd d;

    public dgoe(InProductHelp inProductHelp, dgoq dgoqVar, WeakReference weakReference, dghd dghdVar) {
        this.a = inProductHelp;
        this.b = dgoqVar;
        this.c = weakReference;
        this.d = dghdVar;
    }

    @Override // defpackage.dgnx
    public final void a(GoogleHelp googleHelp) {
        this.a.a = googleHelp;
        try {
            ((IGoogleHelpService) this.b.w()).processInProductHelpAndPip(this.a, null, new dgog(this.c, this.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
        }
    }
}
