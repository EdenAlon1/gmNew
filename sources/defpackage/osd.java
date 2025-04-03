package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class osd extends ffkh implements ffji {
    public osd(Object obj) {
        super(1, obj, osg.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001f A[SYNTHETIC] */
    @Override // defpackage.ffji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.Set r10 = (java.util.Set) r10
            r10.getClass()
            java.lang.Object r0 = r9.g
            osg r0 = (defpackage.osg) r0
            java.util.concurrent.locks.ReentrantLock r1 = r0.d
            r1.lock()
            java.util.Map r0 = r0.c     // Catch: java.lang.Throwable -> L7d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L7d
            java.util.List r0 = defpackage.ffdx.ak(r0)     // Catch: java.lang.Throwable -> L7d
            r1.unlock()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            oso r1 = (defpackage.oso) r1
            int[] r2 = r1.b
            int r3 = r2.length
            if (r3 == 0) goto L6c
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L5d
            ffgg r2 = new ffgg
            r2.<init>()
            int[] r3 = r1.b
            int r5 = r3.length
            r6 = r4
        L3d:
            if (r4 >= r5) goto L58
            r7 = r3[r4]
            int r8 = r6 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r10.contains(r7)
            if (r7 == 0) goto L54
            java.lang.String[] r7 = r1.c
            r6 = r7[r6]
            r2.add(r6)
        L54:
            int r4 = r4 + 1
            r6 = r8
            goto L3d
        L58:
            java.util.Set r2 = defpackage.fffi.a(r2)
            goto L6e
        L5d:
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L6c
            java.util.Set r2 = r1.d
            goto L6e
        L6c:
            ffen r2 = defpackage.ffen.a
        L6e:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1f
            osb r1 = r1.a
            r1.a(r2)
            goto L1f
        L7a:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L7d:
            r10 = move-exception
            r1.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osd.invoke(java.lang.Object):java.lang.Object");
    }
}
