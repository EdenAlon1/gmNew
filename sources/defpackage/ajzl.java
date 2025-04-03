package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzl extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ akag c;
    final /* synthetic */ UUID d;
    final /* synthetic */ ffkz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzl(akag akagVar, UUID uuid, ffkz ffkzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = akagVar;
        this.d = uuid;
        this.e = ffkzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r5.s(r1, r3, r4) != r0) goto L9;
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
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L3f
        Lf:
            defpackage.ffci.b(r5)
            goto L2c
        L13:
            defpackage.ffci.b(r5)
            akag r5 = r4.c
            ffbr r5 = r5.b
            java.lang.Object r5 = r5.b()
            ajyr r5 = (defpackage.ajyr) r5
            java.util.UUID r1 = r4.d
            akci r3 = defpackage.akci.ATTACHMENTS_RESTORING
            r4.b = r2
            java.lang.Object r5 = r5.s(r1, r3, r4)
            if (r5 == r0) goto L4c
        L2c:
            ffkz r5 = r4.e
            akag r1 = r4.c
            java.util.UUID r2 = r4.d
            r4.a = r5
            r3 = 2
            r4.b = r3
            java.lang.Object r1 = r1.j(r2, r4)
            if (r1 == r0) goto L4c
            r0 = r5
            r5 = r1
        L3f:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            ffkz r0 = (defpackage.ffkz) r0
            r0.a = r5
            ffcu r5 = defpackage.ffcu.a
            return r5
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ajzl(this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
