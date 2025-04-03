package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqb b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypx(ffgu ffguVar, yqb yqbVar) {
        super(2, ffguVar);
        this.b = yqbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object r0 = r4.c
            java.lang.Object r1 = r4.d
            java.util.List r1 = (java.util.List) r1
            defpackage.ffci.b(r5)
            goto L3a
        L12:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffsk r5 = (defpackage.ffsk) r5
            fffs r5 = new fffs
            r1 = 0
            r5.<init>(r1)
            boolean r1 = defpackage.ctjd.d()
            if (r1 == 0) goto L57
            yqb r1 = r4.b
            dqza r1 = r1.o
            if (r1 == 0) goto L48
            r4.d = r5
            r4.c = r5
            r4.a = r3
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L47
            r0 = r5
            r5 = r1
            r1 = r0
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r3) goto L45
            r5 = r0
            r2 = r3
            goto L49
        L45:
            r5 = r0
            goto L49
        L47:
            return r0
        L48:
            r1 = r5
        L49:
            if (r2 == 0) goto L58
            yqb r0 = r4.b
            dszr r2 = defpackage.dszr.i
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            goto L58
        L57:
            r1 = r5
        L58:
            yqb r0 = r4.b
            dszr r2 = defpackage.dszr.b
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            yqb r0 = r4.b
            dszr r2 = defpackage.dszr.c
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            yqb r0 = r4.b
            dszr r2 = defpackage.dszr.f
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            java.util.List r5 = defpackage.ffdx.a(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ypx ypxVar = new ypx(ffguVar, this.b);
        ypxVar.d = obj;
        return ypxVar;
    }
}
