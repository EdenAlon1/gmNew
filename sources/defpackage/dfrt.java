package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfrt extends dfrx {
    protected final dfsd a;

    public dfrt(int i, dfsd dfsdVar) {
        super(i);
        this.a = dfsdVar;
    }

    @Override // defpackage.dfrx
    public final void d(Status status) {
        try {
            this.a.i(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.dfrx
    public final void e(Exception exc) {
        try {
            this.a.i(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.dfrx
    public final void f(dfsz dfszVar) {
        try {
            this.a.h(dfszVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.dfrx
    public final void g(dfsp dfspVar, boolean z) {
        dfsd dfsdVar = this.a;
        dfspVar.a.put(dfsdVar, Boolean.valueOf(z));
        dfsdVar.d(new dfsn(dfspVar, dfsdVar));
    }
}
