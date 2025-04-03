package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvn implements ejuh {
    final /* synthetic */ ejuh a;
    final /* synthetic */ ejvo b;

    public ejvn(ejvo ejvoVar, ejuh ejuhVar) {
        this.a = ejuhVar;
        this.b = ejvoVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        erph a = this.a.a();
        final ejvo ejvoVar = this.b;
        return a.e(eldl.g(new erow() { // from class: ejvl
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                final ejvo ejvoVar2 = ejvo.this;
                return ((ejug) obj).c(new emwl() { // from class: ejvm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        engw n;
                        ejvo ejvoVar3 = ejvo.this;
                        synchronized (ejvoVar3.a) {
                            n = engw.n(ejvoVar3.a);
                        }
                        int size = n.size();
                        for (int i = 0; i < size; i++) {
                            obj2 = ((emwl) n.get(i)).apply(obj2);
                        }
                        return obj2;
                    }
                });
            }
        }), erpp.a);
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return erre.a;
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return ((ejuy) this.a).b;
    }
}
