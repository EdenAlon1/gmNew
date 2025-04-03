package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjy implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ Set b;

    public cfjy(ffxy ffxyVar, Set set) {
        this.a = ffxyVar;
        this.b = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cfjx
            if (r0 == 0) goto L13
            r0 = r9
            cfjx r0 = (defpackage.cfjx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cfjx r0 = new cfjx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L51
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            r2 = r8
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.Set r2 = r7.b
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L51
            r0.b = r3
            java.lang.Object r8 = r9.fQ(r8, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjy.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
