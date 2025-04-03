package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dfrs extends dfrr {
    protected final dhri a;

    public dfrs(int i, dhri dhriVar) {
        super(i);
        this.a = dhriVar;
    }

    protected abstract void c(dfsz dfszVar);

    @Override // defpackage.dfrx
    public final void d(Status status) {
        this.a.c(new dfqu(status));
    }

    @Override // defpackage.dfrx
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.dfrx
    public final void f(dfsz dfszVar) {
        try {
            c(dfszVar);
        } catch (DeadObjectException e) {
            d(dfrx.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(dfrx.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.dfrx
    public void g(dfsp dfspVar, boolean z) {
    }
}
