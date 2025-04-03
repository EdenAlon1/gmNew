package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cole extends ffhv implements ffjm {
    int a;
    final /* synthetic */ colf b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cole(colf colfVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = colfVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cole) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011e, code lost:
    
        return j$.util.Optional.ofNullable((defpackage.awui) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
    
        if (r15 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0115, code lost:
    
        if (r15 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011f, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cole.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cole(this.b, this.c, ffguVar);
    }
}
