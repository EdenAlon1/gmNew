package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmew extends ffhv implements ffjm {
    final /* synthetic */ cmfb a;
    final /* synthetic */ epgt b;
    final /* synthetic */ epgr c;
    final /* synthetic */ epgo d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmew(cmfb cmfbVar, epgt epgtVar, epgr epgrVar, int i, epgo epgoVar, int i2, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmfbVar;
        this.b = epgtVar;
        this.c = epgrVar;
        this.g = i;
        this.d = epgoVar;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmew) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        epgp epgpVar = (epgp) epgu.a.createBuilder();
        epgpVar.getClass();
        epnr.d(this.b, epgpVar);
        epnr.c(this.c, epgpVar);
        epgpVar.copyOnWrite();
        epgu epguVar = (epgu) epgpVar.instance;
        epguVar.h = clzd.a(this.g);
        epguVar.b |= 64;
        epgpVar.copyOnWrite();
        epgu epguVar2 = (epgu) epgpVar.instance;
        epguVar2.g = this.d;
        epguVar2.b |= 32;
        epgpVar.copyOnWrite();
        epgu epguVar3 = (epgu) epgpVar.instance;
        epguVar3.b |= 16;
        epguVar3.f = this.e;
        epnr.b(((dijt) this.a.b.b()).b(new djro(this.f)), epgpVar);
        this.a.b(epnr.a(epgpVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmew(this.a, this.b, this.c, this.g, this.d, this.e, this.f, ffguVar);
    }
}
