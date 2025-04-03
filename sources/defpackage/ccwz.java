package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccxe b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwz(ccxe ccxeVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccxeVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (defpackage.fgfz.c(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        return r0;
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
            if (r1 == r2) goto L1d
            goto L43
        Ld:
            ccxe r5 = r4.b
            axkm r5 = r5.c
            elfl r5 = r5.s()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L46
        L1d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L43
            ccxe r5 = r4.b
            java.util.List r1 = r4.c
            int r1 = r1.size()
            long r1 = (long) r1
            axjn r3 = new axjn
            axkm r5 = r5.c
            r3.<init>()
            elfl r5 = r5.A(r3)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L43
            goto L46
        L43:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccwz(this.b, this.c, ffguVar);
    }
}
