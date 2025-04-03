package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmey extends ffhv implements ffjm {
    final /* synthetic */ cmfb a;
    final /* synthetic */ boolean b;
    final /* synthetic */ epgr c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmey(cmfb cmfbVar, boolean z, epgr epgrVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmfbVar;
        this.b = z;
        this.c = epgrVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmey) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        epgp epgpVar = (epgp) epgu.a.createBuilder();
        epgpVar.getClass();
        epgt epgtVar = this.b ? epgt.PROVISIONING_UI_TYPE_RCS_DEFAULT_ON_OOB : epgt.PROVISIONING_UI_TYPE_RCS_SUCCESS;
        String str = this.d;
        cmfb cmfbVar = this.a;
        epgr epgrVar = this.c;
        epnr.d(epgtVar, epgpVar);
        epnr.c(epgrVar, epgpVar);
        epnr.b(((dijt) cmfbVar.b.b()).b(new djro(str)), epgpVar);
        this.a.b(epnr.a(epgpVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmey(this.a, this.b, this.c, this.d, ffguVar);
    }
}
