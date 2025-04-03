package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvep extends ffhv implements ffjm {
    long a;
    Object b;
    int c;
    final /* synthetic */ cves d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvep(cves cvesVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cvesVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvep) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        if (r14.e.d(r1, r13) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvep.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvep(this.d, ffguVar);
    }
}
