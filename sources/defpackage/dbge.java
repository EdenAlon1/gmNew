package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbge extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbgh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbge(dbgh dbghVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbghVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r5 != r0) goto L8;
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
            return r5
        Ld:
            dbgh r5 = r4.b
            r4.a = r2
            ffss r5 = r5.e
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L32
        L19:
            dbfl r5 = (defpackage.dbfl) r5
            r1 = 2
            r4.a = r1
            ffhd r1 = r5.b
            ffhd r1 = defpackage.ekxi.a(r1)
            dbfk r2 = new dbfk
            r3 = 0
            r2.<init>(r3, r5)
            java.lang.Object r5 = defpackage.ffra.a(r1, r2, r4)
            if (r5 != r0) goto L31
            goto L32
        L31:
            return r5
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbge.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbge(this.b, (ffgu) obj).b(ffcu.a);
    }
}
