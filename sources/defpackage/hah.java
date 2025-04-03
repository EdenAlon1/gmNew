package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hah extends ffhu implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ gvi d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hah(ffsk ffskVar, gvi gviVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffskVar;
        this.d = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hah) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0028 -> B:4:0x002b). Please report as a decompilation issue!!! */
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
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.e
            iju r2 = (defpackage.iju) r2
            defpackage.ffci.b(r7)
            goto L2b
        L10:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.e
            iju r7 = (defpackage.iju) r7
            ikk r1 = defpackage.ikk.b
            r2 = r7
        L1a:
            r6.e = r2
            r6.a = r1
            r7 = 1
            r6.b = r7
            r7 = r1
            ikk r7 = (defpackage.ikk) r7
            java.lang.Object r7 = r2.r(r7, r6)
            if (r7 != r0) goto L2b
            return r0
        L2b:
            iki r7 = (defpackage.iki) r7
            java.util.List r3 = r7.a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            iku r3 = (defpackage.iku) r3
            int r3 = r3.i
            r4 = 2
            boolean r3 = defpackage.ilq.b(r3, r4)
            if (r3 == 0) goto L1a
            int r7 = r7.e
            r3 = 4
            boolean r3 = defpackage.ikm.a(r7, r3)
            if (r3 == 0) goto L57
            ffsk r7 = r6.c
            gvi r3 = r6.d
            hag r4 = new hag
            r5 = 0
            r4.<init>(r3, r5)
            r3 = 3
            defpackage.ffqy.d(r7, r5, r5, r4, r3)
            goto L1a
        L57:
            r3 = 5
            boolean r7 = defpackage.ikm.a(r7, r3)
            if (r7 == 0) goto L1a
            gvi r7 = r6.d
            r7.b()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hah.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hah hahVar = new hah(this.c, this.d, ffguVar);
        hahVar.e = obj;
        return hahVar;
    }
}
