package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
final class n4 extends p4 {
    @Override // j$.util.stream.r4
    final Spliterator b(Spliterator spliterator) {
        return new n4((Spliterator.OfInt) spliterator, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r6.b.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r7.accept(r6.f);
     */
    @Override // j$.util.Spliterator.OfInt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.IntConsumer r7) {
        /*
            r6 = this;
            boolean r0 = r6.c
            j$.util.Spliterator r1 = r6.a
            if (r0 == 0) goto L34
            r0 = 0
            r6.c = r0
        L9:
            r2 = r1
            j$.util.Spliterator$OfInt r2 = (j$.util.Spliterator.OfInt) r2
            boolean r2 = r2.tryAdvance(r6)
            r3 = 1
            if (r2 == 0) goto L25
            boolean r4 = r6.a()
            if (r4 == 0) goto L25
            java.util.function.IntPredicate r4 = r6.e
            int r5 = r6.f
            boolean r4 = r4.test(r5)
            if (r4 == 0) goto L25
            r0 = 1
            goto L9
        L25:
            if (r2 == 0) goto L33
            if (r0 == 0) goto L2e
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            r0.set(r3)
        L2e:
            int r0 = r6.f
            r7.accept(r0)
        L33:
            return r2
        L34:
            j$.util.Spliterator$OfInt r1 = (j$.util.Spliterator.OfInt) r1
            boolean r7 = r1.tryAdvance(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.n4.tryAdvance(java.util.function.IntConsumer):boolean");
    }
}
