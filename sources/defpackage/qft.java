package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qft extends ffhv implements ffjm {
    int a;
    final /* synthetic */ qgh b;
    final /* synthetic */ ffud c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ qfw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(qgh qghVar, ffud ffudVar, int i, int i2, qfw qfwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = qghVar;
        this.c = ffudVar;
        this.d = i;
        this.e = i2;
        this.f = qfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qft) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r4 = defpackage.hhj.c(new defpackage.qfp(r2, r4), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (r3.c.v() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r4 = r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        r4 = r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3.b.ordinal() == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r4 = r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        r2 = r3.f;
        r3.a = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r4 = defpackage.cyy.a(new defpackage.qfo(r2), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r4 != r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:3:0x000a). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            defpackage.ffci.b(r4)
            if (r1 == 0) goto La
            goto L42
        La:
            qgh r4 = r3.b
            int r4 = r4.ordinal()
            r1 = 1
            if (r4 == r1) goto L16
            int r4 = r3.d
            goto L23
        L16:
            ffud r4 = r3.c
            boolean r4 = r4.v()
            if (r4 == 0) goto L21
            int r4 = r3.d
            goto L23
        L21:
            int r4 = r3.e
        L23:
            qfw r2 = r3.f
            r3.a = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L36
            qfo r4 = new qfo
            r4.<init>()
            java.lang.Object r4 = defpackage.cyy.a(r4, r3)
            goto L3f
        L36:
            qfp r1 = new qfp
            r1.<init>()
            java.lang.Object r4 = defpackage.hhj.c(r1, r3)
        L3f:
            if (r4 != r0) goto L42
            return r0
        L42:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4b
            goto La
        L4b:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qft.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qft(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
