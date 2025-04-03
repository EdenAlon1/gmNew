package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sio extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ sip d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sio(sip sipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = sipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sio) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sio.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sio sioVar = new sio(this.d, ffguVar);
        sioVar.e = obj;
        return sioVar;
    }
}
