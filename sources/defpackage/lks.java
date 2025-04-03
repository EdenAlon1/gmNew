package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lks {
    public static final lkl a(lkr lkrVar) {
        lkk P = lkrVar.P();
        P.getClass();
        while (true) {
            lkn lknVar = (lkn) P.a.get();
            if (lknVar != null) {
                return lknVar;
            }
            ffvf ffvfVar = new ffvf(null);
            ffsd ffsdVar = fftc.a;
            lkn lknVar2 = new lkn(P, ffgz.d(ffvfVar, fghh.a.j()));
            AtomicReference atomicReference = P.a;
            while (!atomicReference.compareAndSet(null, lknVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            ffqy.d(lknVar2, fghh.a.j(), null, new lkm(lknVar2, null), 2);
            return lknVar2;
        }
    }
}
