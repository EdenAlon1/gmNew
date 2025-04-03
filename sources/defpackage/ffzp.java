package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzp implements ffxx {
    final /* synthetic */ ffxx a;
    final /* synthetic */ ffjo b;

    public ffzp(ffxx ffxxVar, ffjo ffjoVar) {
        this.a = ffxxVar;
        this.b = ffjoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r12 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ffjo] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0081 -> B:11:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:14:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ffzo
            if (r0 == 0) goto L13
            r0 = r12
            ffzo r0 = (defpackage.ffzo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffzo r0 = new ffzo
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            long r6 = r0.f
            java.lang.Object r11 = r0.e
            java.lang.Object r2 = r0.d
            ffzp r8 = r0.h
            defpackage.ffci.b(r12)
            goto L83
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            int r11 = r0.g
            long r6 = r0.f
            java.lang.Object r11 = r0.d
            ffzp r2 = r0.h
            defpackage.ffci.b(r12)
            r8 = r2
        L47:
            r2 = r11
            goto L67
        L49:
            defpackage.ffci.b(r12)
            r6 = 0
            r12 = r10
        L4f:
            ffxx r2 = r12.a
            r0.h = r12
            r0.d = r11
            r8 = 0
            r0.e = r8
            r0.f = r6
            r0.g = r3
            r0.b = r5
            java.lang.Object r2 = defpackage.ffzq.a(r2, r11, r0)
            if (r2 == r1) goto L9d
            r8 = r12
            r12 = r2
            goto L47
        L67:
            r11 = r12
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 == 0) goto L94
            ffjo r12 = r8.b
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r0.h = r8
            r0.d = r2
            r0.e = r11
            r0.f = r6
            r0.b = r4
            java.lang.Object r12 = r12.a(r2, r11, r9, r0)
            if (r12 == r1) goto L9d
        L83:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L91
            r11 = 1
            long r6 = r6 + r11
            r11 = r2
            r2 = r5
            goto L96
        L91:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            throw r11
        L94:
            r11 = r2
            r2 = r3
        L96:
            r12 = r8
            if (r2 == 0) goto L9a
            goto L4f
        L9a:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzp.a(ffxy, ffgu):java.lang.Object");
    }
}
