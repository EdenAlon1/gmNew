package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ilj extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilj(ffji ffjiVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ilj) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0021 -> B:4:0x0024). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto Le
            java.lang.Object r1 = r3.c
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r4)
            goto L24
        Le:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            iju r4 = (defpackage.iju) r4
            r1 = r4
        L16:
            ikk r4 = defpackage.ikk.a
            r3.c = r1
            r2 = 1
            r3.a = r2
            java.lang.Object r4 = r1.r(r4, r3)
            if (r4 != r0) goto L24
            return r0
        L24:
            iki r4 = (defpackage.iki) r4
            android.view.MotionEvent r4 = r4.a()
            if (r4 == 0) goto L16
            ffji r2 = r3.b
            r2.invoke(r4)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ilj iljVar = new ilj(this.b, ffguVar);
        iljVar.c = obj;
        return iljVar;
    }
}
