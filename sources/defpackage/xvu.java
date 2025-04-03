package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doyd b;
    final /* synthetic */ xvy c;
    final /* synthetic */ String d;
    final /* synthetic */ dlyg e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvu(doyd doydVar, xvy xvyVar, String str, dlyg dlygVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doydVar;
        this.c = xvyVar;
        this.d = str;
        this.e = dlygVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvu) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r1.fQ(r4, r11) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r12 != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.ffci.b(r12)
            goto L79
        Le:
            java.lang.Object r1 = r11.f
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r12)
            goto L3d
        L16:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.f
            r1 = r12
            ffxy r1 = (defpackage.ffxy) r1
            doyd r12 = r11.b
            java.lang.String r12 = r12.d
            if (r12 != 0) goto L50
            xvy r12 = r11.c
            java.lang.String r4 = r11.d
            ffhd r12 = r12.c
            ffhd r12 = defpackage.ekxi.a(r12)
            xvt r5 = new xvt
            r5.<init>(r3, r4)
            r11.f = r1
            r11.a = r2
            java.lang.Object r12 = defpackage.ffra.a(r12, r5, r11)
            if (r12 == r0) goto L78
        L3d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L4b
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toUpperCase(r2)
            r12.getClass()
            goto L4c
        L4b:
            r12 = r3
        L4c:
            if (r12 != 0) goto L50
            java.lang.String r12 = r11.d
        L50:
            r6 = r12
            dlyg r5 = r11.e
            xvy r12 = r11.c
            doyd r2 = r11.b
            android.content.Context r4 = r12.b
            r7 = r4
            dlvy r4 = new dlvy
            long r8 = r2.c
            java.lang.String r7 = android.text.format.Formatter.formatFileSize(r7, r8)
            athc r12 = r12.e
            boolean r10 = r12.a()
            r9 = 0
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.f = r3
            r12 = 2
            r11.a = r12
            java.lang.Object r12 = r1.fQ(r4, r11)
            if (r12 != r0) goto L79
        L78:
            return r0
        L79:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xvu xvuVar = new xvu(this.b, this.c, this.d, this.e, ffguVar);
        xvuVar.f = obj;
        return xvuVar;
    }
}
