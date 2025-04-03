package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmev extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmfb b;
    final /* synthetic */ epgr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmev(cmfb cmfbVar, epgr epgrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmfbVar;
        this.c = epgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cmfb cmfbVar = this.b;
            epgr epgrVar = this.c;
            epgt epgtVar = epgt.PROVISIONING_UI_TYPE_LEGAL_FYI;
            this.a = 1;
            if (cmfbVar.a(epgtVar, epgrVar, null, null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmev(this.b, this.c, ffguVar);
    }
}
