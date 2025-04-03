package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eroy implements erog {
    final /* synthetic */ eroz a;
    final /* synthetic */ erpb b;

    public eroy(erpb erpbVar, eroz erozVar) {
        this.a = erozVar;
        this.b = erpbVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        erpd erpdVar = new erpd(this.b.b);
        erpdVar.a = true;
        erou erouVar = new erou();
        eroz erozVar = this.a;
        erou erouVar2 = this.b.a;
        try {
            erph a = erozVar.a(erouVar.a, erpdVar);
            a.i(erouVar2);
            return a.c;
        } finally {
            erouVar2.b(erouVar, erpp.a);
            erpdVar.a = false;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
