package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdw extends ffhv implements ffji {
    int a;
    final /* synthetic */ dpea b;
    final /* synthetic */ dpeb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdw(dpea dpeaVar, dpeb dpebVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dpeaVar;
        this.c = dpebVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r4.b(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r4.i.a(r1, r3) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return defpackage.ffcu.a;
     */
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
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L27
        Ld:
            dpea r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 == r0) goto L2a
        L17:
            dpeb r4 = r3.c
            dpea r1 = r3.b
            r2 = 2
            r3.a = r2
            ffjm r4 = r4.i
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L27
            goto L2a
        L27:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpdw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dpdw(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
