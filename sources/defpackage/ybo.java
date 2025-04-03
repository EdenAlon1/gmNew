package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybo extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ybt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybo(ybt ybtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ybtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybo) c((Instant) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r6 != r0) goto L10;
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
            if (r1 == 0) goto L17
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r5.b
            defpackage.ffci.b(r6)
            return r0
        Lf:
            java.lang.Object r1 = r5.b
            j$.time.Instant r1 = (j$.time.Instant) r1
            defpackage.ffci.b(r6)
            goto L30
        L17:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            j$.time.Instant r1 = (j$.time.Instant) r1
            ybt r6 = r5.c
            ybn r3 = new ybn
            r3.<init>()
            r5.b = r1
            r5.a = r2
            java.lang.Object r6 = r6.a(r3, r5)
            if (r6 == r0) goto L4f
        L30:
            ybt r2 = r5.c
            r3 = r6
            ycu r3 = (defpackage.ycu) r3
            r5.b = r6
            r3 = 2
            r5.a = r3
            ybs r3 = new ybs
            r4 = 0
            r3.<init>(r1, r2, r4)
            ffhd r1 = r2.c
            java.lang.Object r1 = defpackage.ffra.a(r1, r3, r5)
            ffhh r2 = defpackage.ffhh.a
            if (r1 == r2) goto L4c
            ffcu r1 = defpackage.ffcu.a
        L4c:
            if (r1 == r0) goto L4f
            return r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ybo yboVar = new ybo(this.c, ffguVar);
        yboVar.b = obj;
        return yboVar;
    }
}
