package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovq extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ otb f;
    final /* synthetic */ ffji g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovq(boolean z, boolean z2, otb otbVar, ffgu ffguVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.d = z;
        this.e = z2;
        this.f = otbVar;
        this.g = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ovq) c((otx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r7 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r7.a(r6) != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L16
            java.lang.Object r0 = r6.c
            defpackage.ffci.b(r7)
            goto La0
        L16:
            java.lang.Object r1 = r6.c
            otx r1 = (defpackage.otx) r1
            defpackage.ffci.b(r7)
            goto L8f
        L1f:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.c
            otx r3 = (defpackage.otx) r3
            defpackage.ffci.b(r7)
            r5 = r1
            r1 = r3
            goto L79
        L2b:
            java.lang.Object r1 = r6.a
            java.lang.Object r4 = r6.c
            otx r4 = (defpackage.otx) r4
            defpackage.ffci.b(r7)
            goto L5b
        L35:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.c
            otx r7 = (defpackage.otx) r7
            boolean r1 = r6.d
            if (r1 == 0) goto Lb4
            boolean r1 = r6.e
            if (r1 == 0) goto L47
            otw r5 = defpackage.otw.a
            goto L49
        L47:
            otw r5 = defpackage.otw.b
        L49:
            if (r1 != 0) goto L78
            r6.c = r7
            r6.a = r5
            r6.b = r4
            java.lang.Object r1 = r7.c()
            if (r1 != r0) goto L58
            goto Lb3
        L58:
            r4 = r7
            r7 = r1
            r1 = r5
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L75
            otb r7 = r6.f
            osg r7 = r7.b()
            r6.c = r4
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto Lb3
        L75:
            r5 = r1
            r1 = r4
            goto L79
        L78:
            r1 = r7
        L79:
            ffji r7 = r6.g
            ovp r3 = new ovp
            r4 = 0
            r3.<init>(r4, r7)
            r6.c = r1
            r6.a = r4
            r6.b = r2
            otw r5 = (defpackage.otw) r5
            java.lang.Object r7 = r1.b(r5, r3, r6)
            if (r7 == r0) goto Lb3
        L8f:
            boolean r2 = r6.e
            if (r2 != 0) goto Lb2
            r6.c = r7
            r2 = 4
            r6.b = r2
            java.lang.Object r1 = r1.c()
            if (r1 == r0) goto Lb3
            r0 = r7
            r7 = r1
        La0:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb1
            otb r7 = r6.f
            osg r7 = r7.b()
            r7.b()
        Lb1:
            return r0
        Lb2:
            return r7
        Lb3:
            return r0
        Lb4:
            r7.getClass()
            ouy r7 = (defpackage.ouy) r7
            ouz r7 = r7.d()
            ffji r0 = r6.g
            java.lang.Object r7 = r0.invoke(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ovq ovqVar = new ovq(this.d, this.e, this.f, ffguVar, this.g);
        ovqVar.c = obj;
        return ovqVar;
    }
}
