package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eiq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eil(eiq eiqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eiqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eiq eiqVar = this.b;
            Float f = new Float(1.0f);
            this.a = 1;
            if (eiqVar.f.e(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eil(this.b, ffguVar);
    }
}
