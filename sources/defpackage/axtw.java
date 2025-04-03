package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtw implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ Duration b;

    public axtw(ffxy ffxyVar, Duration duration) {
        this.b = duration;
        this.a = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (defpackage.ernj.a(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axtv
            if (r0 == 0) goto L13
            r0 = r7
            axtv r0 = (defpackage.axtv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            axtv r0 = new axtv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            axtw r6 = r0.d
            defpackage.ffci.b(r7)
            goto L48
        L38:
            defpackage.ffci.b(r7)
            ffxy r7 = r5.a
            r0.d = r5
            r0.b = r4
            java.lang.Object r6 = r7.fQ(r6, r0)
            if (r6 == r1) goto L59
            r6 = r5
        L48:
            j$.time.Duration r6 = r6.b
            r7 = 0
            r0.d = r7
            r0.b = r3
            java.lang.Object r6 = defpackage.ernj.a(r6, r0)
            if (r6 != r1) goto L56
            goto L59
        L56:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axtw.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
