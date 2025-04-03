package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sps extends ffhv implements ffji {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjo c;
    final /* synthetic */ UUID d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sps(spw spwVar, dfjo dfjoVar, UUID uuid, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = spwVar;
        this.c = dfjoVar;
        this.d = uuid;
        this.e = ffbcVar;
        this.f = duration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r1.c(r2, r3, r6, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
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
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L3f
        Ld:
            spw r6 = r5.b
            dfjo r1 = r5.c
            java.util.UUID r3 = r5.d
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r3, r5)
            if (r6 == r0) goto L42
        L1b:
            ffbc r1 = r5.e
            sox r6 = (defpackage.sox) r6
            sos r2 = r6.c
            defpackage.spw.g(r1, r2)
            spw r1 = r5.b
            ffbr r1 = r1.g
            java.lang.Object r1 = r1.b()
            sqf r1 = (defpackage.sqf) r1
            j$.time.Duration r2 = r5.f
            r2.getClass()
            java.util.UUID r3 = r5.d
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.c(r2, r3, r6, r5)
            if (r6 != r0) goto L3f
            goto L42
        L3f:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sps.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new sps(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
