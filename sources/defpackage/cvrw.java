package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrw extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cvsa d;
    final /* synthetic */ List e;
    final /* synthetic */ cvyr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvrw(cvsa cvsaVar, List list, cvyr cvyrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cvsaVar;
        this.e = list;
        this.f = cvyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvrw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r2.b(r1, (defpackage.aqux) r6, r3, r5) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L42
        Ld:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            goto L2b
        L15:
            defpackage.ffci.b(r6)
            cvsa r6 = r5.d
            java.util.List r1 = r5.e
            cwde r3 = r6.c
            r5.a = r3
            r5.b = r1
            r5.c = r2
            java.lang.Object r6 = r6.d()
            if (r6 == r0) goto L45
            r2 = r3
        L2b:
            cvyr r3 = r5.f
            aqux r6 = (defpackage.aqux) r6
            java.lang.String r3 = r3.a()
            r4 = 0
            r5.a = r4
            r5.b = r4
            r4 = 2
            r5.c = r4
            java.lang.Object r6 = r2.b(r1, r6, r3, r5)
            if (r6 != r0) goto L42
            goto L45
        L42:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvrw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvrw(this.d, this.e, this.f, ffguVar);
    }
}
