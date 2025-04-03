package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dftc implements dfui, dfvk {
    public final dfqr a;
    public final dfrz b;
    final /* synthetic */ dftd d;
    private IAccountAccessor e = null;
    private Set f = null;
    public boolean c = false;

    public dftc(dftd dftdVar, dfqr dfqrVar, dfrz dfrzVar) {
        this.d = dftdVar;
        this.a = dfqrVar;
        this.b = dfrzVar;
    }

    @Override // defpackage.dfvk
    public final void a(ConnectionResult connectionResult) {
        this.d.o.post(new dftb(this, connectionResult));
    }

    @Override // defpackage.dfui
    public final void b(ConnectionResult connectionResult) {
        dfsz dfszVar = (dfsz) this.d.l.get(this.b);
        if (dfszVar != null) {
            dfszVar.i(connectionResult);
        }
    }

    @Override // defpackage.dfui
    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
        } else {
            this.e = iAccountAccessor;
            this.f = set;
            e();
        }
    }

    @Override // defpackage.dfui
    public final void d(int i) {
        dfsz dfszVar = (dfsz) this.d.l.get(this.b);
        if (dfszVar != null) {
            if (dfszVar.f) {
                dfszVar.i(new ConnectionResult(17));
            } else {
                dfszVar.onConnectionSuspended(i);
            }
        }
    }

    public final void e() {
        IAccountAccessor iAccountAccessor;
        if (!this.c || (iAccountAccessor = this.e) == null) {
            return;
        }
        this.a.o(iAccountAccessor, this.f);
    }
}
