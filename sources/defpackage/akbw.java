package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ akby c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbw(akby akbyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = akbyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f8, code lost:
    
        if (r15.i(r1, r14) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
        if (r15 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akbw(this.c, ffguVar);
    }
}
