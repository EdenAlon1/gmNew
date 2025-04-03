package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eron implements erog {
    final /* synthetic */ eros a;
    final /* synthetic */ erou b;

    public eron(eros erosVar, erou erouVar) {
        this.a = erosVar;
        this.b = erouVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        erou erouVar = new erou();
        try {
            erph a = this.a.a(erouVar.a);
            a.i(this.b);
            return a.c;
        } finally {
            this.b.b(erouVar, erpp.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
