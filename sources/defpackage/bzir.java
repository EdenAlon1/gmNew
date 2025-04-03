package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzir extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzir(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bzid bzidVar = this.b;
        c = axol.c(bzidVar.h, ffhe.a, ffsm.a, new bzii(bzidVar, null));
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzir(this.b, (ffgu) obj).b(ffcu.a);
    }
}
