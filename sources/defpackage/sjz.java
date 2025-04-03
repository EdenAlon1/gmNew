package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ skf b;
    final /* synthetic */ aree c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjz(ffgu ffguVar, skf skfVar, aree areeVar) {
        super(2, ffguVar);
        this.b = skfVar;
        this.c = areeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sjz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        if (defpackage.ffra.a(r3, r4, r9) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r10 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        if (r10 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        if (r10 != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sjz sjzVar = new sjz(ffguVar, this.b, this.c);
        sjzVar.d = obj;
        return sjzVar;
    }
}
