package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqus extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aquu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqus(aquu aquuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aquuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqus) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aquu aquuVar = this.b;
        this.a = 1;
        Object d = aquuVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqus(this.b, ffguVar);
    }
}
