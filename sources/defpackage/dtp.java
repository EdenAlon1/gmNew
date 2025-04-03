package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtp extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ikk b;
    final /* synthetic */ fflb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtp(ikk ikkVar, fflb fflbVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ikkVar;
        this.c = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtp) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
    
        r12.c.a = defpackage.dpw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (defpackage.dts.a(r13) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        r12.c.a = defpackage.dpy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r13 = r13.a;
        r4 = r13.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r5 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r6 = (defpackage.iku) r13.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r6.c() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (defpackage.ikj.g(r6, r1.b(), r1.a()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r12.c.a = defpackage.dpw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        r13 = defpackage.ikk.c;
        r12.d = r1;
        r12.a = 2;
        r13 = r1.r(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008f -> B:5:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L13
            java.lang.Object r1 = r12.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r13)
            goto L92
        L13:
            java.lang.Object r1 = r12.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r13)
            goto L31
        L1b:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.d
            iju r13 = (defpackage.iju) r13
        L22:
            r12.d = r13
            r12.a = r3
            ikk r1 = r12.b
            java.lang.Object r1 = r13.r(r1, r12)
            if (r1 == r0) goto Lcd
            r11 = r1
            r1 = r13
            r13 = r11
        L31:
            iki r13 = (defpackage.iki) r13
            java.util.List r4 = r13.a
            int r5 = r4.size()
            r6 = r2
        L3a:
            if (r6 >= r5) goto Lb9
            java.lang.Object r7 = r4.get(r6)
            iku r7 = (defpackage.iku) r7
            boolean r7 = defpackage.ikj.e(r7)
            if (r7 != 0) goto Lb6
            boolean r4 = defpackage.dts.a(r13)
            if (r4 == 0) goto L56
            fflb r13 = r12.c
            dpy r0 = defpackage.dpy.a
            r13.a = r0
            goto Lca
        L56:
            java.util.List r13 = r13.a
            int r4 = r13.size()
            r5 = r2
        L5d:
            if (r5 >= r4) goto L84
            java.lang.Object r6 = r13.get(r5)
            iku r6 = (defpackage.iku) r6
            boolean r7 = r6.c()
            if (r7 != 0) goto L7d
            long r7 = r1.b()
            long r9 = r1.a()
            boolean r6 = defpackage.ikj.g(r6, r7, r9)
            if (r6 == 0) goto L7a
            goto L7d
        L7a:
            int r5 = r5 + 1
            goto L5d
        L7d:
            fflb r13 = r12.c
            dpw r0 = defpackage.dpw.a
            r13.a = r0
            goto Lca
        L84:
            ikk r13 = defpackage.ikk.c
            r12.d = r1
            r4 = 2
            r12.a = r4
            java.lang.Object r13 = r1.r(r13, r12)
            if (r13 != r0) goto L92
            goto Lcd
        L92:
            iki r13 = (defpackage.iki) r13
            java.util.List r13 = r13.a
            int r4 = r13.size()
            r5 = r2
        L9b:
            if (r5 >= r4) goto Lb3
            java.lang.Object r6 = r13.get(r5)
            iku r6 = (defpackage.iku) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto Lb0
            fflb r13 = r12.c
            dpw r0 = defpackage.dpw.a
            r13.a = r0
            goto Lca
        Lb0:
            int r5 = r5 + 1
            goto L9b
        Lb3:
            r13 = r1
            goto L22
        Lb6:
            int r6 = r6 + 1
            goto L3a
        Lb9:
            fflb r0 = r12.c
            java.util.List r13 = r13.a
            dpx r1 = new dpx
            java.lang.Object r13 = r13.get(r2)
            iku r13 = (defpackage.iku) r13
            r1.<init>(r13)
            r0.a = r1
        Lca:
            ffcu r13 = defpackage.ffcu.a
            return r13
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtp dtpVar = new dtp(this.b, this.c, ffguVar);
        dtpVar.d = obj;
        return dtpVar;
    }
}
