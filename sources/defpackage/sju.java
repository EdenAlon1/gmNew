package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sju extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aree b;
    final /* synthetic */ sjw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sju(aree areeVar, sjw sjwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = areeVar;
        this.c = sjwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0101, code lost:
    
        if (r8 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0104, code lost:
    
        r8 = (defpackage.arec) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        if ((r8 instanceof defpackage.ardz) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010a, code lost:
    
        r0 = (defpackage.ensz) defpackage.sjw.a.h();
        r1 = r7.b;
        r8 = (defpackage.ardz) r8;
        r0.D("Retry for %s failed with reason %s", r1.d, r8.a);
        r0 = r7.c;
        r0.h(r0.b(r8.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r8 != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r8 != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0038, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != 3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00db, code lost:
    
        r8 = ((java.lang.Boolean) r8).booleanValue();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sju.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sju(this.b, this.c, ffguVar);
    }
}
