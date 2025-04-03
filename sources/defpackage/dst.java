package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dst extends ffhu implements ffjm {
    long a;
    int b;
    final /* synthetic */ iku c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dst(iku ikuVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ikuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dst) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:4:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            if (r1 == 0) goto L10
            long r1 = r6.a
            java.lang.Object r3 = r6.d
            iju r3 = (defpackage.iju) r3
            defpackage.ffci.b(r7)
            goto L35
        L10:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            iju r7 = (defpackage.iju) r7
            iku r1 = r6.c
            jgi r2 = r7.q()
            r2.h()
            long r1 = r1.b
            r3 = 40
            long r1 = r1 + r3
            r3 = r7
        L26:
            r6.d = r3
            r6.a = r1
            r7 = 1
            r6.b = r7
            r7 = 0
            r4 = 3
            java.lang.Object r7 = defpackage.dtr.g(r3, r7, r6, r4)
            if (r7 == r0) goto L3f
        L35:
            iku r7 = (defpackage.iku) r7
            long r4 = r7.b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L3e
            goto L26
        L3e:
            return r7
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dst.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dst dstVar = new dst(this.c, ffguVar);
        dstVar.d = obj;
        return dstVar;
    }
}
