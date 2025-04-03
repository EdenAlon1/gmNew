package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsa {
    public final cop b;
    public final jxl c;
    private final Object d = null;
    public final cnq a = new cnq(16);

    public jsa() {
        long[] jArr = cpg.a;
        this.b = new cop((byte[]) null);
        this.c = new jxl();
    }

    public static /* synthetic */ void a(jsa jsaVar, jsd jsdVar, Object obj) {
        jry jryVar = new jry(jsdVar);
        synchronized (jsaVar.c) {
            if (obj == null) {
                cop copVar = jsaVar.b;
                Object obj2 = jsaVar.d;
                copVar.e(jryVar, new jrx(null));
            } else {
                jsaVar.a.d(jryVar, new jrx(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.jsd r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jrz
            if (r0 == 0) goto L13
            r0 = r7
            jrz r0 = (defpackage.jrz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jrz r0 = new jrz
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jry r5 = r0.e
            jsa r6 = r0.d
            defpackage.ffci.b(r7)
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            jry r7 = new jry
            r7.<init>(r5)
            jxl r5 = r4.c
            monitor-enter(r5)
            cnq r2 = r4.a     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.c(r7)     // Catch: java.lang.Throwable -> L8a
            jrx r2 = (defpackage.jrx) r2     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L50
            cop r2 = r4.b     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.f(r7)     // Catch: java.lang.Throwable -> L8a
            jrx r2 = (defpackage.jrx) r2     // Catch: java.lang.Throwable -> L8a
        L50:
            if (r2 == 0) goto L56
            java.lang.Object r6 = r2.a     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r5)
            return r6
        L56:
            monitor-exit(r5)
            r0.d = r4
            r0.e = r7
            r0.c = r3
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 == r1) goto L89
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L67:
            jxl r0 = r6.c
            monitor-enter(r0)
            if (r7 != 0) goto L7a
            cop r1 = r6.b     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = r6.d     // Catch: java.lang.Throwable -> L86
            jrx r6 = new jrx     // Catch: java.lang.Throwable -> L86
            r2 = 0
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r1.e(r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L84
        L7a:
            cnq r6 = r6.a     // Catch: java.lang.Throwable -> L86
            jrx r1 = new jrx     // Catch: java.lang.Throwable -> L86
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L86
            r6.d(r5, r1)     // Catch: java.lang.Throwable -> L86
        L84:
            monitor-exit(r0)
            return r7
        L86:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L89:
            return r1
        L8a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsa.b(jsd, ffji, ffgu):java.lang.Object");
    }
}
