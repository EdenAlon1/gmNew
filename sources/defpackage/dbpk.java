package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbpk extends ffhv implements ffji {
    final /* synthetic */ dbpr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbpk(dbpr dbprVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = dbprVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dbpe dbpeVar = (dbpe) this.a.b.b();
        return fgck.a(dbpeVar.d, dbpeVar.c, dbpeVar.e, new dbol(null));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbpk(this.a, (ffgu) obj).b(ffcu.a);
    }
}
