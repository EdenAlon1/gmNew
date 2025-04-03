package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixg {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.common.util.concurrent.ListenableFuture a(java.util.List r4, defpackage.emxg r5, java.util.concurrent.Executor r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r4.next()
            erog r1 = (defpackage.erog) r1
            com.google.common.util.concurrent.ListenableFuture r1 = r1.a()     // Catch: java.lang.Exception -> L4d
            boolean r2 = r1.isDone()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L49
            java.lang.Object r2 = defpackage.erqt.q(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            boolean r3 = r1.isCancelled()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r3 != 0) goto L33
            boolean r2 = r5.a(r2)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r2 == 0) goto Ld
        L33:
            boolean r4 = r0.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r4 == 0) goto L3a
            goto L44
        L3a:
            r0.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            goto L5c
        L3e:
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L45
        L44:
            return r1
        L45:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto L5c
        L49:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto Ld
        L4d:
            r4 = move-exception
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.erqt.h(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L59
            return r4
        L59:
            r0.add(r4)
        L5c:
            eixf r4 = new eixf
            r4.<init>(r0, r5, r6)
            int r5 = r4.d
            r6 = -1
            if (r5 != r6) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            defpackage.emxf.l(r5)
            com.google.common.util.concurrent.ListenableFuture r5 = r4.b()
            eixe r6 = new eixe
            r6.<init>()
            java.util.concurrent.Executor r4 = r4.c
            r5.b(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eixg.a(java.util.List, emxg, java.util.concurrent.Executor):com.google.common.util.concurrent.ListenableFuture");
    }
}
