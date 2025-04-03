package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdj(dsed dsedVar, boolean z, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r5 == r0) goto L26;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L12
            goto L88
        Le:
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L12
            goto L22
        L12:
            r5 = move-exception
            goto L55
        L14:
            defpackage.ffci.b(r5)
            dsed r5 = r4.b     // Catch: java.lang.Exception -> L12
            r4.a = r2     // Catch: java.lang.Exception -> L12
            java.lang.Object r5 = defpackage.dsed.bx(r5, r4)     // Catch: java.lang.Exception -> L12
            if (r5 != r0) goto L22
            goto L54
        L22:
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r4.d     // Catch: java.lang.Exception -> L12
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L12
        L2a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L12
            r3 = r2
            dscj r3 = (defpackage.dscj) r3     // Catch: java.lang.Exception -> L12
            java.lang.String r3 = r3.a     // Catch: java.lang.Exception -> L12
            boolean r3 = defpackage.ffkj.e(r3, r1)     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L2a
            goto L41
        L40:
            r2 = 0
        L41:
            dscj r2 = (defpackage.dscj) r2     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L49
            boolean r5 = r4.c     // Catch: java.lang.Exception -> L12
            r2.f = r5     // Catch: java.lang.Exception -> L12
        L49:
            dsed r5 = r4.b     // Catch: java.lang.Exception -> L12
            r1 = 2
            r4.a = r1     // Catch: java.lang.Exception -> L12
            java.lang.Object r5 = defpackage.dsed.bu(r5, r4)     // Catch: java.lang.Exception -> L12
            if (r5 != r0) goto L88
        L54:
            return r0
        L55:
            boolean r0 = r5 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L69
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L68
            dsed r0 = r4.b
            dsct r0 = defpackage.dsed.bm(r0)
            boolean r0 = r0.b
            if (r0 == 0) goto L68
            goto L69
        L68:
            throw r5
        L69:
            enru r0 = defpackage.dsed.a
            ensk r0 = r0.i()
            enrr r0 = (defpackage.enrr) r0
            ensk r5 = r0.g(r5)
            java.lang.String r0 = "invokeSuspend"
            r1 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$onViewCreated$10$onStickerPackFavoriteChanged$1"
            java.lang.String r3 = "StickerScreen.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Unable to update favorites."
            r5.q(r0)
        L88:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsdj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdj(this.b, this.c, this.d, ffguVar);
    }
}
