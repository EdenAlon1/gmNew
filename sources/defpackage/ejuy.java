package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuy implements ejuh {
    final /* synthetic */ eros a;
    final /* synthetic */ Object b;
    final /* synthetic */ ejvb c;

    public ejuy(ejvb ejvbVar, eros erosVar, Object obj) {
        this.a = erosVar;
        this.b = obj;
        this.c = ejvbVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        return erph.d(this.a, erpp.a).e(eldl.g(new erow() { // from class: ejux
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                return ejug.a(obj, ejuy.this.c.b.f());
            }
        }), erpp.a);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return erre.a;
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return this.b;
    }

    public final String toString() {
        return "LocalDataSource[" + this.a.toString() + "]";
    }
}
