package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyto extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cytp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyto(cytp cytpVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cytpVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cyto cytoVar = new cyto(this.c, (ffgu) obj3);
        cytoVar.a = (alxj) obj;
        cytoVar.b = (engw) obj2;
        return cytoVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r1.length() <= 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            cytp r1 = r4.c
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            crpw r1 = (defpackage.crpw) r1
            engw r0 = (defpackage.engw) r0
            dnwn r5 = r1.b(r5, r0)
            r0 = 0
            if (r5 == 0) goto L29
            android.net.Uri r1 = r5.a
            java.lang.String r1 = r1.toString()
            r1.getClass()
            int r1 = r1.length()
            if (r1 > 0) goto L2a
        L29:
            r5 = r0
        L2a:
            cytp r1 = r4.c
            cytn r2 = new cytn
            r2.<init>()
            cytr r1 = new cytr
            cytq r3 = new cytq
            r3.<init>(r0)
            r1.<init>(r5, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyto.b(java.lang.Object):java.lang.Object");
    }
}
