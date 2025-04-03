package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dht extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ dhw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dht(dhw dhwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dhwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dht) c((Float) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        if (r14.h.e(r0, r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (defpackage.cxj.j(r7, r8, r9, null, r11, 12) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cxt] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dht.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dht dhtVar = new dht(this.d, ffguVar);
        dhtVar.c = obj;
        return dhtVar;
    }
}
