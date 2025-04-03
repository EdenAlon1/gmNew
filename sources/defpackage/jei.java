package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jei extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ffwm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jei(ffwm ffwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jei) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:5:0x000a, B:6:0x0028, B:8:0x0030, B:9:0x001a, B:17:0x0015), top: B:2:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:6:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.c
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> Le
            goto L28
        Le:
            r5 = move-exception
            goto L47
        L10:
            defpackage.ffci.b(r5)
            ffwm r2 = r4.d
            ffwo r5 = r2.r()     // Catch: java.lang.Throwable -> Le
            r1 = r5
        L1a:
            r4.a = r2     // Catch: java.lang.Throwable -> Le
            r4.b = r1     // Catch: java.lang.Throwable -> Le
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> Le
            if (r5 != r0) goto L28
            return r0
        L28:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Le
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r5 == 0) goto L40
            java.lang.Object r5 = r1.b()     // Catch: java.lang.Throwable -> Le
            ffcu r5 = (defpackage.ffcu) r5     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.jek.b     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> Le
            defpackage.hrv.f()     // Catch: java.lang.Throwable -> Le
            goto L1a
        L40:
            r5 = 0
            defpackage.ffww.a(r2, r5)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L47:
            throw r5     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            defpackage.ffww.a(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jei.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jei(this.d, ffguVar);
    }
}
