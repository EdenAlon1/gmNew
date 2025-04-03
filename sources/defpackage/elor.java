package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elor extends elnx {
    public elor() {
        super(elox.b);
    }

    public final void b(final elnz elnzVar) {
        this.c = new elnz() { // from class: eloq
            @Override // defpackage.elnz
            public final ListenableFuture b(Object obj) {
                elop elopVar = (elop) obj;
                if (elopVar.a().isPresent()) {
                    return elnz.this.b(elopVar.a().get());
                }
                final elod elodVar = elox.a;
                return kfg.a(new kfd() { // from class: elpg
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        return Boolean.valueOf(kfbVar.b(elodVar));
                    }
                });
            }
        };
    }

    public final void c(elws elwsVar) {
        elwf elwfVar = (elwf) elwsVar;
        elwq elwqVar = new elwq(elwfVar.b);
        if (!elwfVar.a.isEmpty()) {
            for (elwr elwrVar : elwfVar.a) {
                elwrVar.b();
                elwrVar.b();
                elwqVar.b(elwrVar.a());
            }
        }
        elwqVar.b = true;
        elwqVar.c = true;
        this.b = new eloi(elwqVar.a());
    }
}
