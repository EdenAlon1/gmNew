package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sph extends ffhv implements ffji {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjk c;
    final /* synthetic */ ffbc d;
    final /* synthetic */ Duration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sph(spw spwVar, dfjk dfjkVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = spwVar;
        this.c = dfjkVar;
        this.d = ffbcVar;
        this.e = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r1.b(r2, r5, r4) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
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
            if (r1 == r2) goto L19
            goto L3b
        Ld:
            spw r5 = r4.b
            dfjk r1 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 == r0) goto L3e
        L19:
            ffbc r1 = r4.d
            sow r5 = (defpackage.sow) r5
            sos r2 = r5.d
            defpackage.spw.g(r1, r2)
            spw r1 = r4.b
            ffbr r1 = r1.g
            java.lang.Object r1 = r1.b()
            sqf r1 = (defpackage.sqf) r1
            j$.time.Duration r2 = r4.e
            r2.getClass()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.b(r2, r5, r4)
            if (r5 != r0) goto L3b
            goto L3e
        L3b:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sph.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new sph(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
