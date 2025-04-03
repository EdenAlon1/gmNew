package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzji extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzji(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bzid bzidVar = this.b;
        this.a = 1;
        Object d = bzidVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzji(this.b, (ffgu) obj).b(ffcu.a);
    }
}
