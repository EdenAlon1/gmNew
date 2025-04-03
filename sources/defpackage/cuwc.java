package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ cuwf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwc(ffgu ffguVar, String str, cuwf cuwfVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = cuwfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r9 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003c, code lost:
    
        if (r9 != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuwc cuwcVar = new cuwc(ffguVar, this.b, this.c);
        cuwcVar.d = obj;
        return cuwcVar;
    }
}
