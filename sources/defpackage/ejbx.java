package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbx extends ffhv implements ffjm {
    long a;
    Object b;
    int c;
    final /* synthetic */ ejby d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejbx(ejby ejbyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ejbyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejbx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e9, code lost:
    
        if (defpackage.fgfz.c(r12, r11) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (defpackage.fgfz.c(r12, r11) == r0) goto L24;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejbx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ejbx(this.d, ffguVar);
    }
}
