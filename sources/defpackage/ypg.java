package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ yqb c;
    Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypg(ffgu ffguVar, boolean z, yqb yqbVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = yqbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
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
            java.lang.Object r0 = r4.d
            java.lang.Object r1 = r4.e
            java.util.List r1 = (java.util.List) r1
            defpackage.ffci.b(r5)
            goto L5d
        L12:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.e
            ffsk r5 = (defpackage.ffsk) r5
            boolean r5 = r4.b
            r1 = 0
            if (r5 == 0) goto L3d
            yqb r5 = r4.c
            xhw r0 = defpackage.xhw.a
            ffrp r0 = defpackage.ffrr.a(r0)
            r5.s = r0
            fffs r5 = new fffs
            r5.<init>(r1)
            yqb r0 = r4.c
            dszr r1 = defpackage.dszr.b
            dtbl r0 = r0.e(r1)
            r5.add(r0)
            java.util.List r5 = defpackage.ffdx.a(r5)
            return r5
        L3d:
            fffs r5 = new fffs
            r5.<init>(r1)
            boolean r1 = defpackage.ctjd.d()
            if (r1 == 0) goto L7a
            yqb r1 = r4.c
            dqza r1 = r1.o
            if (r1 == 0) goto L6b
            r4.e = r5
            r4.d = r5
            r4.a = r3
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L6a
            r0 = r5
            r5 = r1
            r1 = r0
        L5d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r3) goto L68
            r5 = r0
            r2 = r3
            goto L6c
        L68:
            r5 = r0
            goto L6c
        L6a:
            return r0
        L6b:
            r1 = r5
        L6c:
            if (r2 == 0) goto L7b
            yqb r0 = r4.c
            dszr r2 = defpackage.dszr.i
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            goto L7b
        L7a:
            r1 = r5
        L7b:
            yqb r0 = r4.c
            dszr r2 = defpackage.dszr.b
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            yqb r0 = r4.c
            dszr r2 = defpackage.dszr.c
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            yqb r0 = r4.c
            dszr r2 = defpackage.dszr.f
            dtbl r0 = r0.e(r2)
            r5.add(r0)
            java.util.List r5 = defpackage.ffdx.a(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ypg ypgVar = new ypg(ffguVar, this.b, this.c);
        ypgVar.e = obj;
        return ypgVar;
    }
}
