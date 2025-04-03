package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajhd extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ajhh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajhd(ajhh ajhhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ajhhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajhd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0117, code lost:
    
        if (r11.l(r1, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0109, code lost:
    
        if (r11 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r11 != r0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajhd(this.c, ffguVar);
    }
}
