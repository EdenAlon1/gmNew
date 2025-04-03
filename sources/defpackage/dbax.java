package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbax extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbbj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbax(dbbj dbbjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbbjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dbbj dbbjVar = this.b;
        this.a = 1;
        dbcd dbcdVar = dbbjVar.a;
        Object a = ffra.a(ekxi.a(dbcdVar.d), new dbcf(null, dbcdVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbax(this.b, (ffgu) obj).b(ffcu.a);
    }
}
