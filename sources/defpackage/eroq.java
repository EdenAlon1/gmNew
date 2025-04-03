package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eroq implements eroh {
    final /* synthetic */ erot a;
    final /* synthetic */ erph b;

    public eroq(erph erphVar, erot erotVar) {
        this.a = erotVar;
        this.b = erphVar;
    }

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        erou erouVar = new erou();
        erou erouVar2 = this.b.b;
        try {
            erph a = this.a.a(erouVar.a, obj);
            a.i(erouVar);
            return a.c;
        } finally {
            erouVar2.b(erouVar, erpp.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
