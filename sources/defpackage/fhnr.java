package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnr {
    private static final fhnq a = new fhnq(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final fhnq a() {
        AtomicReference c2 = c();
        fhnq fhnqVar = a;
        fhnq fhnqVar2 = (fhnq) c2.getAndSet(fhnqVar);
        if (fhnqVar2 == fhnqVar) {
            return new fhnq();
        }
        if (fhnqVar2 == null) {
            c2.set(null);
            return new fhnq();
        }
        c2.set(fhnqVar2.f);
        fhnqVar2.f = null;
        fhnqVar2.c = 0;
        return fhnqVar2;
    }

    public static final void b(fhnq fhnqVar) {
        if (fhnqVar.f != null || fhnqVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fhnqVar.d) {
            return;
        }
        AtomicReference c2 = c();
        fhnq fhnqVar2 = a;
        fhnq fhnqVar3 = (fhnq) c2.getAndSet(fhnqVar2);
        if (fhnqVar3 != fhnqVar2) {
            int i = fhnqVar3 != null ? fhnqVar3.c : 0;
            if (i >= 65536) {
                c2.set(fhnqVar3);
                return;
            }
            fhnqVar.f = fhnqVar3;
            fhnqVar.b = 0;
            fhnqVar.c = i + 8192;
            c2.set(fhnqVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
