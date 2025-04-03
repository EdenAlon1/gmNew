package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxn extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffwm c;
    final /* synthetic */ cxj d;
    final /* synthetic */ hkx e;
    final /* synthetic */ hkx f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxn(ffwm ffwmVar, cxj cxjVar, hkx hkxVar, hkx hkxVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffwmVar;
        this.d = cxjVar;
        this.e = hkxVar;
        this.f = hkxVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:4:0x002c). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r10.a
            java.lang.Object r2 = r10.g
            ffsk r2 = (defpackage.ffsk) r2
            defpackage.ffci.b(r11)
            goto L2c
        L10:
            defpackage.ffci.b(r11)
            java.lang.Object r11 = r10.g
            ffsk r11 = (defpackage.ffsk) r11
            ffwm r1 = r10.c
            ffwo r1 = r1.r()
            r2 = r11
        L1e:
            r10.g = r2
            r10.a = r1
            r11 = 1
            r10.b = r11
            java.lang.Object r11 = r1.a(r10)
            if (r11 != r0) goto L2c
            return r0
        L2c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L59
            java.lang.Object r11 = r1.b()
            ffwm r3 = r10.c
            java.lang.Object r3 = r3.m()
            java.lang.Object r3 = defpackage.ffws.a(r3)
            if (r3 == 0) goto L46
            r5 = r3
            goto L47
        L46:
            r5 = r11
        L47:
            cxj r6 = r10.d
            hkx r7 = r10.e
            hkx r8 = r10.f
            cxm r4 = new cxm
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            r3 = 0
            defpackage.ffqy.d(r2, r3, r3, r4, r11)
            goto L1e
        L59:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cxn cxnVar = new cxn(this.c, this.d, this.e, this.f, ffguVar);
        cxnVar.g = obj;
        return cxnVar;
    }
}
