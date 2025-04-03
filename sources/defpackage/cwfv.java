package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ cwfx c;
    Object d;
    final /* synthetic */ cwir e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwfv(ffgu ffguVar, cwir cwirVar, String str, cwfx cwfxVar) {
        super(2, ffguVar);
        this.e = cwirVar;
        this.b = str;
        this.c = cwfxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwfv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        if (r3 != r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e8  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwfv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwfv cwfvVar = new cwfv(ffguVar, this.e, this.b, this.c);
        cwfvVar.f = obj;
        return cwfvVar;
    }
}
