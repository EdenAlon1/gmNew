package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrv extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cvsa d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvrv(cvsa cvsaVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cvsaVar;
        this.e = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvrv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r2.a(r1, (defpackage.aqux) r6, r5) == r0) goto L15;
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
            goto L46
        Ld:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            goto L35
        L15:
            defpackage.ffci.b(r6)
            cvsa r6 = r5.d
            java.util.List r1 = r5.e
            java.lang.Object r1 = defpackage.ffdx.K(r1)
            aoku r1 = (defpackage.aoku) r1
            cvsa r3 = r5.d
            cwde r6 = r6.c
            r5.a = r6
            r5.b = r1
            r5.c = r2
            java.lang.Object r2 = r3.d()
            if (r2 == r0) goto L49
            r4 = r2
            r2 = r6
            r6 = r4
        L35:
            aqux r6 = (defpackage.aqux) r6
            r3 = 0
            r5.a = r3
            r5.b = r3
            r3 = 2
            r5.c = r3
            java.lang.Object r6 = r2.a(r1, r6, r5)
            if (r6 != r0) goto L46
            goto L49
        L46:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvrv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvrv(this.d, this.e, ffguVar);
    }
}
