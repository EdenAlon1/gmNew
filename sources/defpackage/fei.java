package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fei extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fei(ffji ffjiVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fei) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0021 -> B:4:0x0024). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r4.c
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r5)
            goto L24
        Lf:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            iju r5 = (defpackage.iju) r5
            r1 = r5
        L17:
            ikk r5 = defpackage.ikk.a
            r4.c = r1
            r4.a = r2
            java.lang.Object r5 = r1.r(r5, r4)
            if (r5 != r0) goto L24
            return r0
        L24:
            iki r5 = (defpackage.iki) r5
            boolean r5 = defpackage.fek.g(r5)
            r5 = r5 ^ r2
            ffji r3 = r4.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.invoke(r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fei.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fei feiVar = new fei(this.b, ffguVar);
        feiVar.c = obj;
        return feiVar;
    }
}
