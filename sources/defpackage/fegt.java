package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegt extends fegu {
    public fegt(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.fegu
    public final void a(int i, fegy fegyVar) {
        if (!c(i, fegyVar.b())) {
            throw new RemoteException(a.f(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
