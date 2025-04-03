package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spb extends ffhv implements ffji {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjg c;
    final /* synthetic */ fdyn d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spb(spw spwVar, dfjg dfjgVar, fdyn fdynVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = spwVar;
        this.c = dfjgVar;
        this.d = fdynVar;
        this.e = ffbcVar;
        this.f = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1.a(r2, r5, r4) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        return defpackage.ffcu.a;
     */
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
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1e
            goto L40
        Ld:
            spw r5 = r4.b
            dfjg r1 = r4.c
            fdyn r3 = r4.d
            r3.getClass()
            r4.a = r2
            java.lang.Object r5 = r5.a(r1, r3, r4)
            if (r5 == r0) goto L43
        L1e:
            ffbc r1 = r4.e
            sou r5 = (defpackage.sou) r5
            sos r2 = r5.d
            defpackage.spw.g(r1, r2)
            spw r1 = r4.b
            ffbr r1 = r1.g
            java.lang.Object r1 = r1.b()
            sqf r1 = (defpackage.sqf) r1
            j$.time.Duration r2 = r4.f
            r2.getClass()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.a(r2, r5, r4)
            if (r5 != r0) goto L40
            goto L43
        L40:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new spb(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
