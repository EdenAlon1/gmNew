package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfrv extends dfrr {
    private final dfuo a;
    private final dhri b;
    private final dfuj d;

    public dfrv(int i, dfuo dfuoVar, dhri dhriVar, dfuj dfujVar) {
        super(i);
        this.b = dhriVar;
        this.a = dfuoVar;
        this.d = dfujVar;
        if (i == 2 && dfuoVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.dfrr
    public final boolean a(dfsz dfszVar) {
        return this.a.c;
    }

    @Override // defpackage.dfrr
    public final Feature[] b(dfsz dfszVar) {
        return this.a.b;
    }

    @Override // defpackage.dfrx
    public final void d(Status status) {
        this.b.c(this.d.a(status));
    }

    @Override // defpackage.dfrx
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.dfrx
    public final void f(dfsz dfszVar) {
        try {
            this.a.a(dfszVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(dfrx.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.dfrx
    public final void g(dfsp dfspVar, boolean z) {
        Map map = dfspVar.b;
        dhri dhriVar = this.b;
        map.put(dhriVar, Boolean.valueOf(z));
        dhriVar.a.s(new dfso(dfspVar, dhriVar));
    }
}
