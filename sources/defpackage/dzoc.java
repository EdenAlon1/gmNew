package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzoc extends dziu {
    private volatile transient boolean d;
    private volatile transient boolean e;

    public dzoc(String str, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        super(str, emxcVar, emxcVar2, emxcVar3, emxcVar4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (((defpackage.dzrq) r0.c()).equals(defpackage.dzrq.UNKNOWN) != false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.dzrh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r7 = this;
            boolean r0 = r7.e
            if (r0 != 0) goto L78
            monitor-enter(r7)
            boolean r0 = r7.e     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L73
            emxc r0 = r7.a     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            dzrq r1 = defpackage.dzrq.UNKNOWN     // Catch: java.lang.Throwable -> L75
            dzrq r0 = (defpackage.dzrq) r0     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L22
        L20:
            r3 = r2
            goto L6f
        L22:
            emxc r0 = r7.b     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            r3 = 0
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            r1 = r0
            enou r1 = (defpackage.enou) r1     // Catch: java.lang.Throwable -> L75
            int r1 = r1.c     // Catch: java.lang.Throwable -> L75
            r4 = r3
        L35:
            if (r4 >= r1) goto L4c
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L75
            dzrm r5 = (defpackage.dzrm) r5     // Catch: java.lang.Throwable -> L75
            dzro r5 = r5.a()     // Catch: java.lang.Throwable -> L75
            dzro r6 = defpackage.dzro.UNKNOWN     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L75
            int r4 = r4 + 1
            if (r5 == 0) goto L35
            goto L20
        L4c:
            emxc r0 = r7.c     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L6f
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            r1 = r0
            enou r1 = (defpackage.enou) r1     // Catch: java.lang.Throwable -> L75
            int r1 = r1.c     // Catch: java.lang.Throwable -> L75
            r4 = r3
        L5e:
            if (r4 >= r1) goto L6f
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L75
            dzrj r5 = (defpackage.dzrj) r5     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L75
            int r4 = r4 + 1
            if (r5 == 0) goto L5e
            goto L20
        L6f:
            r7.d = r3     // Catch: java.lang.Throwable -> L75
            r7.e = r2     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            throw r0
        L78:
            boolean r0 = r7.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzoc.f():boolean");
    }
}
