package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dif {
    public final AtomicReference a = new AtomicReference(null);
    public final fgjb b = new fgjf();

    public final Object a(dhy dhyVar, ffji ffjiVar, ffgu ffguVar) {
        return ffsl.a(new dic(dhyVar, this, ffjiVar, null), ffguVar);
    }

    public final Object b(Object obj, dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        return ffsl.a(new die(dhyVar, this, ffjmVar, obj, null), ffguVar);
    }

    public final void c(dia diaVar) {
        while (true) {
            dia diaVar2 = (dia) this.a.get();
            if (diaVar2 != null && diaVar.a.compareTo(diaVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference atomicReference = this.a;
            while (!atomicReference.compareAndSet(diaVar2, diaVar)) {
                if (atomicReference.get() != diaVar2) {
                    break;
                }
            }
            if (diaVar2 != null) {
                diaVar2.b.t(new dhz());
                return;
            }
            return;
        }
    }

    public final void d() {
        this.b.b(null);
    }
}
