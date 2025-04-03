package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmez extends ffhv implements ffjm {
    final /* synthetic */ cmfb a;
    final /* synthetic */ epgr b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmez(cmfb cmfbVar, epgr epgrVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmfbVar;
        this.b = epgrVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        epgp epgpVar = (epgp) epgu.a.createBuilder();
        epgpVar.getClass();
        epnr.d(epgt.PROVISIONING_UI_TYPE_CARRIER_TOS_PROMO, epgpVar);
        epnr.c(this.b, epgpVar);
        epnr.b(((dijt) this.a.b.b()).b(new djro(this.c)), epgpVar);
        this.a.b(epnr.a(epgpVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmez(this.a, this.b, this.c, ffguVar);
    }
}
