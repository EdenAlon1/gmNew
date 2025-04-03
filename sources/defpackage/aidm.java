package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidm implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ aidp b;

    public aidm(ffxy ffxyVar, aidp aidpVar) {
        this.a = ffxyVar;
        this.b = aidpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r9.fQ(r10, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aidl
            if (r0 == 0) goto L13
            r0 = r10
            aidl r0 = (defpackage.aidl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aidl r0 = new aidl
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r10)
            goto L65
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.c
            defpackage.ffci.b(r10)
            goto L5a
        L39:
            defpackage.ffci.b(r10)
            ffxy r10 = r8.a
            java.lang.String r9 = (java.lang.String) r9
            aidp r2 = r8.b
            r0.c = r10
            r0.b = r5
            ffhd r5 = r2.b
            ffhd r5 = defpackage.ekxi.a(r5)
            aidk r6 = new aidk
            r6.<init>(r3, r9, r2)
            java.lang.Object r9 = defpackage.ffra.a(r5, r6, r0)
            if (r9 == r1) goto L68
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            r0.c = r3
            r0.b = r4
            java.lang.Object r9 = r9.fQ(r10, r0)
            if (r9 != r1) goto L65
            goto L68
        L65:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidm.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
