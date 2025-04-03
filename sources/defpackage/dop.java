package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dop extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpb b;
    final /* synthetic */ ild c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffji e;
    final /* synthetic */ ffix f;
    final /* synthetic */ ffix g;
    final /* synthetic */ ffjm h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dop(dpb dpbVar, ild ildVar, ffjn ffjnVar, ffji ffjiVar, ffix ffixVar, ffix ffixVar2, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpbVar;
        this.c = ildVar;
        this.d = ffjnVar;
        this.e = ffjiVar;
        this.f = ffixVar;
        this.g = ffixVar2;
        this.h = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dop) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            if (r1 == 0) goto L14
            java.lang.Object r0 = r10.i
            r1 = r0
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r11)     // Catch: java.util.concurrent.CancellationException -> L10
            r9 = r10
            goto L4f
        L10:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L3e
        L14:
            defpackage.ffci.b(r11)
            java.lang.Object r11 = r10.i
            r1 = r11
            ffsk r1 = (defpackage.ffsk) r1
            dpb r11 = r10.b     // Catch: java.util.concurrent.CancellationException -> L3b
            dqs r7 = r11.e     // Catch: java.util.concurrent.CancellationException -> L3b
            ild r2 = r10.c     // Catch: java.util.concurrent.CancellationException -> L3b
            ffjn r3 = r10.d     // Catch: java.util.concurrent.CancellationException -> L3b
            ffji r4 = r10.e     // Catch: java.util.concurrent.CancellationException -> L3b
            ffix r5 = r10.f     // Catch: java.util.concurrent.CancellationException -> L3b
            ffix r6 = r10.g     // Catch: java.util.concurrent.CancellationException -> L3b
            ffjm r8 = r10.h     // Catch: java.util.concurrent.CancellationException -> L3b
            r10.i = r1     // Catch: java.util.concurrent.CancellationException -> L3b
            r11 = 1
            r10.a = r11     // Catch: java.util.concurrent.CancellationException -> L3b
            r9 = r10
            java.lang.Object r11 = defpackage.doo.i(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L39
            if (r11 != r0) goto L4f
            return r0
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r9 = r10
        L3d:
            r11 = r0
        L3e:
            dpb r0 = r9.b
            ffwm r0 = r0.h
            if (r0 == 0) goto L49
            dnl r2 = defpackage.dnl.a
            r0.b(r2)
        L49:
            boolean r0 = defpackage.ffsl.g(r1)
            if (r0 == 0) goto L52
        L4f:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L52:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dop.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dop dopVar = new dop(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
        dopVar.i = obj;
        return dopVar;
    }
}
