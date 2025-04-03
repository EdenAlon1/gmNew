package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtma implements dtll {
    public final Context a;
    public final ffsk b;
    public final dtlk c;
    public final ffji d;
    private final ffji e;
    private final ffji f;

    public dtma(Context context, ffsk ffskVar, dtlk dtlkVar) {
        context.getClass();
        ffskVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = dtlkVar;
        this.d = new eogl(new dtlz(this, null));
        this.e = new eogl(new dtlw(this, null));
        this.f = new eogl(new dtlt(this, null));
    }

    @Override // defpackage.dtll
    public final dszq a(String str) {
        return (dszq) this.c.e.get(str);
    }

    @Override // defpackage.dtll
    public final Integer b(String str) {
        return (Integer) this.c.d.get(str);
    }

    @Override // defpackage.dtll
    public final Object c(ffgu ffguVar) {
        Object invoke = this.d.invoke(ffguVar);
        return invoke == ffhh.a ? invoke : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dtll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dtlu
            if (r0 == 0) goto L13
            r0 = r6
            dtlu r0 = (defpackage.dtlu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtlu r0 = new dtlu
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            dtma r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L38:
            defpackage.ffci.b(r6)
            ffji r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 == r1) goto L5a
            r2 = r5
        L48:
            ffji r6 = r2.e
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L56
            goto L5a
        L56:
            r6.getClass()
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtma.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [ffji] */
    @Override // defpackage.dtll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, defpackage.ffji r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtma.e(java.lang.String, ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.dtll
    public final String f(String str) {
        String string;
        Integer num = (Integer) this.c.c.get(str);
        return (num == null || (string = this.a.getString(num.intValue())) == null) ? str : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dtll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fadq r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dtlq
            if (r0 == 0) goto L13
            r0 = r6
            dtlq r0 = (defpackage.dtlq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtlq r0 = new dtlq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            faco r5 = r0.d
            defpackage.ffci.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffji r6 = r4.d
            r2 = r5
            faco r2 = (defpackage.faco) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            faem r6 = new faem
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtma.g(fadq, ffgu):java.lang.Object");
    }
}
