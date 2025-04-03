package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpkx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ Duration c;
    final /* synthetic */ cxj d;
    final /* synthetic */ cxj e;
    final /* synthetic */ cxj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkx(cxj cxjVar, Duration duration, cxj cxjVar2, cxj cxjVar3, cxj cxjVar4, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = duration;
        this.d = cxjVar2;
        this.e = cxjVar3;
        this.f = cxjVar4;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpkx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (defpackage.ffsl.a(r4, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (defpackage.ffsl.a(r4, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return defpackage.ffcu.a;
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
            r2 = 0
            r3 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L1f
            goto L34
        Le:
            cxj r6 = r5.b
            j$.time.Duration r1 = r5.c
            dpks r4 = new dpks
            r4.<init>(r6, r1, r2)
            r5.a = r3
            java.lang.Object r6 = defpackage.ffsl.a(r4, r5)
            if (r6 == r0) goto L37
        L1f:
            cxj r6 = r5.d
            cxj r1 = r5.e
            cxj r3 = r5.f
            dpkw r4 = new dpkw
            r4.<init>(r6, r1, r3, r2)
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.ffsl.a(r4, r5)
            if (r6 != r0) goto L34
            goto L37
        L34:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpkx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpkx(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
