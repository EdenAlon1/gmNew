package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpdx extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dpea c;
    final /* synthetic */ dpeb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdx(dpea dpeaVar, dpeb dpebVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dpeaVar;
        this.d = dpebVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpdx) c((Exception) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r5.j.a(r3, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r5.b(r4) != r0) goto L12;
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r5)
            goto L46
        Le:
            java.lang.Object r1 = r4.b
            java.lang.Exception r1 = (java.lang.Exception) r1
            defpackage.ffci.b(r5)
            goto L34
        L16:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.b
            r1 = r5
            java.lang.Exception r1 = (java.lang.Exception) r1
            dpea r5 = r4.c
            dpcj r5 = r5.e
            if (r5 != 0) goto L2a
            java.lang.String r5 = "audioGraph"
            defpackage.ffkj.c(r5)
            r5 = r2
        L2a:
            r4.b = r1
            r4.a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L49
        L34:
            dpeb r5 = r4.d
            dpea r3 = r4.c
            r4.b = r2
            r2 = 2
            r4.a = r2
            ffjn r5 = r5.j
            java.lang.Object r5 = r5.a(r3, r1, r4)
            if (r5 != r0) goto L46
            goto L49
        L46:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpdx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpdx dpdxVar = new dpdx(this.c, this.d, ffguVar);
        dpdxVar.b = obj;
        return dpdxVar;
    }
}
