package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caaa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ caag b;
    final /* synthetic */ enpj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caaa(ffgu ffguVar, caag caagVar, enpj enpjVar) {
        super(2, ffguVar);
        this.b = caagVar;
        this.c = enpjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r14.b(1, r1, r13) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (r14.b(0, r1, r13) != r0) goto L33;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caaa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caaa caaaVar = new caaa(ffguVar, this.b, this.c);
        caaaVar.d = obj;
        return caaaVar;
    }
}
