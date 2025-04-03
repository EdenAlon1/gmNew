package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxz implements ffxy {
    final /* synthetic */ Set a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffxy c;

    public ahxz(Set set, ffjm ffjmVar, ffxy ffxyVar) {
        this.a = set;
        this.b = ffjmVar;
        this.c = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r6.fQ(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ahxy
            if (r0 == 0) goto L13
            r0 = r7
            ahxy r0 = (defpackage.ahxy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ahxy r0 = new ahxy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.b
            java.lang.Object r2 = r0.a
            ahxz r4 = r0.f
            defpackage.ffci.b(r7)
            goto L56
        L3c:
            defpackage.ffci.b(r7)
            java.util.Set r7 = r5.a
            ffjm r2 = r5.b
            r0.f = r5
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r2.a(r6, r0)
            if (r2 == r1) goto L71
            r4 = r2
            r2 = r6
            r6 = r7
            r7 = r4
            r4 = r5
        L56:
            boolean r6 = r6.add(r7)
            if (r6 == 0) goto L6e
            ffxy r6 = r4.c
            r7 = 0
            r0.f = r7
            r0.a = r7
            r0.b = r7
            r0.e = r3
            java.lang.Object r6 = r6.fQ(r2, r0)
            if (r6 != r1) goto L6e
            goto L71
        L6e:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxz.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
