package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfh {
    private final erpb a;

    public elfh(erpb erpbVar) {
        this.a = erpbVar;
    }

    public final elfj a(final elfg elfgVar, Executor executor) {
        return new elfj(this.a.a(eldl.h(new eroz() { // from class: elff
            @Override // defpackage.eroz
            public final erph a(erpc erpcVar, erpd erpdVar) {
                return elfg.this.a(new elfi(erpdVar));
            }
        }), executor));
    }
}
