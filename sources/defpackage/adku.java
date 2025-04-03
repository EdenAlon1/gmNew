package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adku extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adkv b;
    final /* synthetic */ eisx c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adku(ffgu ffguVar, adkv adkvVar, eisx eisxVar, String str) {
        super(2, ffguVar);
        this.b = adkvVar;
        this.c = eisxVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adku) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (r7 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002f, code lost:
    
        if (r7 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adku.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        adku adkuVar = new adku(ffguVar, this.b, this.c, this.d);
        adkuVar.e = obj;
        return adkuVar;
    }
}
