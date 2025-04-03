package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ degd b;
    final /* synthetic */ cvia c;
    final /* synthetic */ String d;
    Object e;
    Object f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defu(ffgu ffguVar, degd degdVar, cvia cviaVar, String str) {
        super(2, ffguVar);
        this.b = degdVar;
        this.c = cviaVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117 A[Catch: all -> 0x0018, TryCatch #3 {all -> 0x0018, blocks: (B:6:0x0013, B:7:0x0161, B:20:0x0073, B:18:0x00a3, B:14:0x00d2, B:16:0x0117, B:22:0x002d, B:24:0x0039), top: B:2:0x0009 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.defu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defu defuVar = new defu(ffguVar, this.b, this.c, this.d);
        defuVar.g = obj;
        return defuVar;
    }
}
