package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwk implements AutoCloseable, lkp, erqj {
    public final Executor a;
    private final AtomicReference b;
    private final lkj c;

    public duwk(Executor executor, lkj lkjVar, duwl duwlVar) {
        this.a = executor;
        this.c = lkjVar;
        this.b = new AtomicReference(duwlVar);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        engw engwVar = ((duwl) this.b.get()).b;
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            afg$$ExternalSyntheticApiModelOutline0.m104m((Object) engwVar.get(i2)).accept(obj);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = engw.d;
        engw engwVar = enou.a;
        lkr lkrVar = ((duwl) this.b.getAndSet(new duwl(engwVar, engwVar, engwVar))).a;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkrVar.P().a().a(this.c)) {
            return;
        }
        close();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        duwl duwlVar = (duwl) this.b.get();
        int i = 0;
        if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
            engw engwVar = duwlVar.d;
            int i2 = ((enou) engwVar).c;
            while (i < i2) {
                afg$$ExternalSyntheticApiModelOutline0.m104m((Object) engwVar.get(i)).accept(th);
                i++;
            }
            return;
        }
        engw engwVar2 = duwlVar.c;
        int i3 = ((enou) engwVar2).c;
        while (i < i3) {
            afg$$ExternalSyntheticApiModelOutline0.m104m((Object) engwVar2.get(i)).accept(th);
            i++;
        }
    }
}
