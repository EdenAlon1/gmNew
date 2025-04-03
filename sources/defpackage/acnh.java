package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnh implements acus {
    public final AtomicReference a = new AtomicReference(new Runnable() { // from class: acng
        @Override // java.lang.Runnable
        public final void run() {
            throw new IllegalStateException("Cannot switch accounts; no runnable registered");
        }
    });

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        ((Runnable) this.a.get()).run();
        esnt esntVar = esnt.a;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        esntVar.getClass();
        esnnVar.c = esntVar;
        esnnVar.b = 109;
        return elfo.e(esnlVar.build());
    }
}
