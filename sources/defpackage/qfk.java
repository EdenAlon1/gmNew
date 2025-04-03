package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qfn d;
    final /* synthetic */ qci e;
    final /* synthetic */ int f;
    final /* synthetic */ float g;
    final /* synthetic */ qgk h;
    final /* synthetic */ qgh i;
    final /* synthetic */ hho j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfk(boolean z, boolean z2, qfn qfnVar, qci qciVar, int i, float f, qgk qgkVar, qgh qghVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = z2;
        this.d = qfnVar;
        this.e = qciVar;
        this.f = i;
        this.g = f;
        this.h = qgkVar;
        this.i = qghVar;
        this.j = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qfk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (defpackage.qfx.b(r11, r10) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        if (defpackage.qfm.a(r1, r2, r3, r4, r5, r6, r7, r10, 514) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        return r0;
     */
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
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2d
            goto L59
        Ld:
            boolean r11 = r10.b
            if (r11 == 0) goto L2d
            hho r11 = r10.j
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L2d
            boolean r11 = r10.c
            if (r11 == 0) goto L2d
            qfn r11 = r10.d
            r10.a = r2
            java.lang.Object r11 = defpackage.qfx.b(r11, r10)
            if (r11 == r0) goto L58
        L2d:
            hho r11 = r10.j
            boolean r1 = r10.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.b(r1)
            boolean r11 = r10.b
            if (r11 == 0) goto L59
            qfn r1 = r10.d
            qci r2 = r10.e
            int r3 = r10.f
            float r4 = r10.g
            qgk r5 = r10.h
            qgh r7 = r10.i
            float r6 = r1.e()
            r11 = 2
            r10.a = r11
            r9 = 514(0x202, float:7.2E-43)
            r8 = r10
            java.lang.Object r11 = defpackage.qfm.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L59
        L58:
            return r0
        L59:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qfk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ffguVar);
    }
}
