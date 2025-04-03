package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drwu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqza b;
    final /* synthetic */ drwz c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drwu(dqza dqzaVar, drwz drwzVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqzaVar;
        this.c = drwzVar;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drwu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r6 = ((java.lang.Boolean) r6).booleanValue();
        r0 = r5.c.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (true == r5.d.contains(defpackage.dszr.i)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r1 = r5.c;
        r2 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        defpackage.ffkj.c("views");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r2 = r3.h;
        r2.setVisibility(0);
        r0.b(new java.lang.Float(defpackage.drwz.e(r1).h), new defpackage.drwr(r1));
        r0.b(java.lang.Boolean.valueOf(defpackage.drwz.e(r1).i), new defpackage.drws(r1));
        r0.a(r2, r6, new defpackage.drwt(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r6 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2b
        Ld:
            dqza r6 = r5.b
            r5.a = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L8a
        L17:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L87
            dqza r6 = r5.b
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L2b
            goto L8a
        L2b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            drwz r0 = r5.c
            dsgb r0 = r0.f()
            if (r0 == 0) goto L87
            java.util.List r1 = r5.d
            dszr r3 = defpackage.dszr.i
            boolean r1 = r1.contains(r3)
            r3 = 0
            if (r2 == r1) goto L45
            r0 = r3
        L45:
            if (r0 == 0) goto L87
            drwz r1 = r5.c
            drxb r2 = r1.b
            if (r2 != 0) goto L53
            java.lang.String r2 = "views"
            defpackage.ffkj.c(r2)
            goto L54
        L53:
            r3 = r2
        L54:
            androidx.compose.ui.platform.ComposeView r2 = r3.h
            r3 = 0
            r2.setVisibility(r3)
            drxd r3 = defpackage.drwz.e(r1)
            float r3 = r3.h
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r3)
            drwr r3 = new drwr
            r3.<init>()
            r0.b(r4, r3)
            drxd r3 = defpackage.drwz.e(r1)
            boolean r3 = r3.i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            drws r4 = new drws
            r4.<init>()
            r0.b(r3, r4)
            drwt r3 = new drwt
            r3.<init>()
            r0.a(r2, r6, r3)
        L87:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drwu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drwu(this.b, this.c, this.d, ffguVar);
    }
}
