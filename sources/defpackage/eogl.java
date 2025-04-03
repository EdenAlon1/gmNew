package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogl implements ffji {
    private final fgjb a = new fgjf();
    private eogn b;

    public eogl(ffji ffjiVar) {
        this.b = new eogm(ffjiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:26:0x0057, B:28:0x005d, B:29:0x0062, B:31:0x0066, B:35:0x0089, B:36:0x008e), top: B:25:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:26:0x0057, B:28:0x005d, B:29:0x0062, B:31:0x0066, B:35:0x0089, B:36:0x008e), top: B:25:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.eogk
            if (r0 == 0) goto L13
            r0 = r8
            eogk r0 = (defpackage.eogk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eogk r0 = new eogk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            fgjf r1 = r0.e
            eogl r0 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L7c
        L2f:
            r8 = move-exception
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            fgjf r2 = r0.e
            eogl r4 = r0.d
            defpackage.ffci.b(r8)
            r8 = r2
            goto L57
        L42:
            defpackage.ffci.b(r8)
            fgjb r8 = r7.a
            r0.d = r7
            r2 = r8
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.c = r4
            java.lang.Object r2 = r8.a(r5, r0)
            if (r2 == r1) goto L96
            r4 = r7
        L57:
            eogn r2 = r4.b     // Catch: java.lang.Throwable -> L8f
            boolean r6 = r2 instanceof defpackage.eogj     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L62
            eogj r2 = (defpackage.eogj) r2     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r2.a     // Catch: java.lang.Throwable -> L8f
            goto L85
        L62:
            boolean r6 = r2 instanceof defpackage.eogm     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L89
            eogm r2 = (defpackage.eogm) r2     // Catch: java.lang.Throwable -> L8f
            ffji r2 = r2.a     // Catch: java.lang.Throwable -> L8f
            r0.d = r4     // Catch: java.lang.Throwable -> L8f
            r6 = r8
            fgjf r6 = (defpackage.fgjf) r6     // Catch: java.lang.Throwable -> L8f
            r0.e = r6     // Catch: java.lang.Throwable -> L8f
            r0.c = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == r1) goto L96
            r1 = r8
            r8 = r0
            r0 = r4
        L7c:
            eogj r2 = new eogj     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r0.b = r2     // Catch: java.lang.Throwable -> L2f
            r0 = r8
            r8 = r1
        L85:
            r8.b(r5)
            return r0
        L89:
            ffcd r0 = new ffcd     // Catch: java.lang.Throwable -> L8f
            r0.<init>()     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L92:
            r1.b(r5)
            throw r8
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eogl.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffgu ffguVar = (ffgu) obj;
        eogn eognVar = this.b;
        if (eognVar instanceof eogj) {
            return ((eogj) eognVar).a;
        }
        if (eognVar instanceof eogm) {
            return a(ffguVar);
        }
        throw new ffcd();
    }
}
