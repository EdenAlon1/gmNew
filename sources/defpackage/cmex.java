package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmex extends ffhv implements ffjm {
    final /* synthetic */ epgt a;
    final /* synthetic */ epgr b;
    final /* synthetic */ Integer c;
    final /* synthetic */ epbq d;
    final /* synthetic */ cmfb e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmex(ffgu ffguVar, epgt epgtVar, epgr epgrVar, Integer num, epbq epbqVar, cmfb cmfbVar) {
        super(2, ffguVar);
        this.a = epgtVar;
        this.b = epgrVar;
        this.c = num;
        this.d = epbqVar;
        this.e = cmfbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmex) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        epgp epgpVar = (epgp) epgu.a.createBuilder();
        epgpVar.copyOnWrite();
        epgu epguVar = (epgu) epgpVar.instance;
        epguVar.d = this.a.t;
        epguVar.b |= 4;
        epgpVar.copyOnWrite();
        epgu epguVar2 = (epgu) epgpVar.instance;
        epguVar2.c = this.b.U;
        epguVar2.b |= 1;
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            epgpVar.copyOnWrite();
            epgu epguVar3 = (epgu) epgpVar.instance;
            epguVar3.b |= 8;
            epguVar3.e = intValue;
        }
        epbq epbqVar = this.d;
        if (epbqVar != null) {
            epgpVar.copyOnWrite();
            epgu epguVar4 = (epgu) epgpVar.instance;
            epguVar4.i = epbqVar;
            epguVar4.b |= 128;
        }
        cmfb cmfbVar = this.e;
        eyfy build = epgpVar.build();
        build.getClass();
        cmfbVar.b((epgu) build);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmex cmexVar = new cmex(ffguVar, this.a, this.b, this.c, this.d, this.e);
        cmexVar.f = obj;
        return cmexVar;
    }
}
