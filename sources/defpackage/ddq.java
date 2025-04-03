package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddq extends ffhv implements ffjm {
    boolean a;
    int b;
    final /* synthetic */ dqt c;
    final /* synthetic */ long d;
    final /* synthetic */ ddx e;
    final /* synthetic */ dwn f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddq(dqt dqtVar, long j, dwn dwnVar, ddx ddxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqtVar;
        this.d = j;
        this.f = dwnVar;
        this.e = ddxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008c, code lost:
    
        if (r14.a(r1, r13) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r3.a(r14, r13) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r2.a(r14, r13) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r14 != r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 == r5) goto L16
            defpackage.ffci.b(r14)
            goto Lb0
        L16:
            java.lang.Object r1 = r13.g
            dwq r1 = (defpackage.dwq) r1
            defpackage.ffci.b(r14)
            goto L82
        L1e:
            boolean r1 = r13.a
            defpackage.ffci.b(r14)
            goto L68
        L24:
            java.lang.Object r1 = r13.g
            ffud r1 = (defpackage.ffud) r1
            defpackage.ffci.b(r14)
            goto L4f
        L2c:
            defpackage.ffci.b(r14)
            java.lang.Object r14 = r13.g
            ffsk r14 = (defpackage.ffsk) r14
            ddx r8 = r13.e
            long r9 = r13.d
            dwn r11 = r13.f
            ddp r7 = new ddp
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            ffud r1 = defpackage.ffqy.d(r14, r6, r6, r7, r5)
            dqt r14 = r13.c
            r13.g = r1
            r13.b = r4
            java.lang.Object r14 = r14.b(r13)
            if (r14 == r0) goto Lb7
        L4f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            boolean r4 = r1.v()
            if (r4 == 0) goto L8f
            r13.g = r6
            r13.a = r14
            r13.b = r3
            java.lang.Object r1 = defpackage.ffui.a(r1, r13)
            if (r1 == r0) goto Lb7
            r1 = r14
        L68:
            if (r1 == 0) goto Lb0
            long r3 = r13.d
            dwp r14 = new dwp
            r14.<init>(r3)
            dwq r1 = new dwq
            r1.<init>(r14)
            dwn r3 = r13.f
            r13.g = r1
            r13.b = r5
            java.lang.Object r14 = r3.a(r14, r13)
            if (r14 == r0) goto Lb7
        L82:
            dwn r14 = r13.f
            r13.g = r6
            r13.b = r2
            java.lang.Object r14 = r14.a(r1, r13)
            if (r14 != r0) goto Lb0
            goto Lb7
        L8f:
            ddx r1 = r13.e
            dwp r1 = r1.e
            if (r1 == 0) goto Lb0
            dwn r2 = r13.f
            if (r14 == 0) goto L9f
            dwq r14 = new dwq
            r14.<init>(r1)
            goto La4
        L9f:
            dwo r14 = new dwo
            r14.<init>(r1)
        La4:
            r13.g = r6
            r1 = 5
            r13.b = r1
            java.lang.Object r14 = r2.a(r14, r13)
            if (r14 != r0) goto Lb0
            goto Lb7
        Lb0:
            ddx r14 = r13.e
            r14.e = r6
            ffcu r14 = defpackage.ffcu.a
            return r14
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ddq ddqVar = new ddq(this.c, this.d, this.f, this.e, ffguVar);
        ddqVar.g = obj;
        return ddqVar;
    }
}
