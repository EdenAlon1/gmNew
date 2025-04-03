package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zot extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zot(cxj cxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zot) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(0.0f);
            this.a = 1;
            if (cxj.j(cxjVar, f, null, null, this, 14) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zot(this.b, ffguVar);
    }
}
