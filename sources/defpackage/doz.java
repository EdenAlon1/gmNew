package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doz extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ fflb d;
    final /* synthetic */ dpb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doz(fflb fflbVar, dpb dpbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = fflbVar;
        this.e = dpbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doz) c((ffji) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0038 -> B:5:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0045 -> B:4:0x0048). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.c
            ffji r2 = (defpackage.ffji) r2
            defpackage.ffci.b(r5)
            goto L48
        L10:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffji r5 = (defpackage.ffji) r5
            r2 = r5
        L18:
            fflb r5 = r4.d
            java.lang.Object r5 = r5.a
            boolean r1 = r5 instanceof defpackage.dno
            if (r1 != 0) goto L50
            boolean r1 = r5 instanceof defpackage.dnl
            if (r1 != 0) goto L50
            boolean r1 = r5 instanceof defpackage.dnm
            r3 = 0
            if (r1 == 0) goto L2c
            dnm r5 = (defpackage.dnm) r5
            goto L2d
        L2c:
            r5 = r3
        L2d:
            if (r5 == 0) goto L32
            r2.invoke(r5)
        L32:
            fflb r1 = r4.d
            dpb r5 = r4.e
            ffwm r5 = r5.h
            if (r5 == 0) goto L4b
            r4.c = r2
            r4.a = r1
            r3 = 1
            r4.b = r3
            java.lang.Object r5 = r5.i(r4)
            if (r5 != r0) goto L48
            return r0
        L48:
            r3 = r5
            dnp r3 = (defpackage.dnp) r3
        L4b:
            fflb r1 = (defpackage.fflb) r1
            r1.a = r3
            goto L18
        L50:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        doz dozVar = new doz(this.d, this.e, ffguVar);
        dozVar.c = obj;
        return dozVar;
    }
}
