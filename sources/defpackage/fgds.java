package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgds implements fgcq {
    private final fgcq a;
    private final ffjm b;

    public fgds(fgcq fgcqVar, ffjm ffjmVar) {
        this.a = fgcqVar;
        this.b = ffjmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.fgcq, defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fgdr
            if (r0 == 0) goto L13
            r0 = r7
            fgdr r0 = (defpackage.fgdr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgdr r0 = new fgdr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.ffci.b(r7)
            goto L44
        L2f:
            defpackage.ffci.b(r7)
            fgcq r7 = r5.a
            ffjm r2 = r5.b
            fgdq r4 = new fgdq
            r4.<init>(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r7.a(r4, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            ffbx r6 = new ffbx
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgds.a(ffxy, ffgu):java.lang.Object");
    }

    @Override // defpackage.fgcq
    public final List d() {
        return this.a.d();
    }
}
