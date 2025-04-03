package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akan extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ akbo c;
    final /* synthetic */ UUID d;
    final /* synthetic */ ffkz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akan(akbo akboVar, UUID uuid, ffkz ffkzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = akboVar;
        this.d = uuid;
        this.e = ffkzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r6.s(r1, r3, r5) != r0) goto L9;
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
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            goto L4b
        Lf:
            defpackage.ffci.b(r6)
            goto L2c
        L13:
            defpackage.ffci.b(r6)
            akbo r6 = r5.c
            ffbr r6 = r6.b
            java.lang.Object r6 = r6.b()
            ajyr r6 = (defpackage.ajyr) r6
            java.util.UUID r1 = r5.d
            akci r3 = defpackage.akci.ATTACHMENTS_RESTORING
            r5.b = r2
            java.lang.Object r6 = r6.s(r1, r3, r5)
            if (r6 == r0) goto L58
        L2c:
            ffkz r6 = r5.e
            akbo r1 = r5.c
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            ajwb r1 = (defpackage.ajwb) r1
            java.util.UUID r2 = r5.d
            akbo r3 = r5.c
            ajwe r3 = r3.k
            r5.a = r6
            r4 = 2
            r5.b = r4
            java.lang.Object r1 = r1.f(r2, r3, r5)
            if (r1 == r0) goto L58
            r0 = r6
            r6 = r1
        L4b:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ffkz r0 = (defpackage.ffkz) r0
            r0.a = r6
            ffcu r6 = defpackage.ffcu.a
            return r6
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akan.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akan(this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
