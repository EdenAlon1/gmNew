package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dhl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhj(dhl dhlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dhlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0011 -> B:4:0x001b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0019 -> B:4:0x001b). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L2d
        Ld:
            dhl r4 = r3.b
            ffwm r4 = r4.n
            if (r4 == 0) goto L1b
            r3.a = r2
            java.lang.Object r4 = r4.i(r3)
            if (r4 == r0) goto L2c
        L1b:
            dhl r4 = r3.b
            dip r4 = r4.o
            if (r4 == 0) goto Ld
            dhi r4 = defpackage.dhi.a
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.hhj.b(r4, r3)
            if (r4 != r0) goto L2d
        L2c:
            return r0
        L2d:
            dhl r4 = r3.b
            dip r4 = r4.o
            if (r4 == 0) goto Ld
            android.widget.Magnifier r4 = r4.a
            defpackage.abj$$ExternalSyntheticApiModelOutline0.m42m(r4)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dhj(this.b, ffguVar);
    }
}
