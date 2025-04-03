package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cccs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cccu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cccs(cccu cccuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cccuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cccs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cccu cccuVar = this.b;
        this.a = 1;
        Object f = cccuVar.f(this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cccs(this.b, ffguVar);
    }
}
