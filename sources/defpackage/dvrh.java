package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvrh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvdp b;
    final /* synthetic */ dvri c;
    final /* synthetic */ dvqt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvrh(dvdp dvdpVar, dvri dvriVar, dvqt dvqtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvdpVar;
        this.c = dvriVar;
        this.d = dvqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvrh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            evub evubVar = this.b.c().c;
            if (evubVar == null) {
                evubVar = evub.a;
            }
            String b = dvmu.b(evubVar);
            evzm evzmVar = (evzm) dvri.b.get(b);
            eg egVar = (eg) dvri.c.get(b);
            if (evzmVar == null || egVar == null) {
                ((ensz) dvri.a.i()).I("Theme or activity not found for promotion logging. IsThemeNull [%s], IsActivityNull [%s]", evzmVar == null, egVar == null);
                this.c.d(this.b);
                return ffcu.a;
            }
            dvri dvriVar = this.c;
            dvqt dvqtVar = this.d;
            dvdp dvdpVar = this.b;
            this.a = 1;
            obj = ffra.a(dvriVar.d, new dvrf(dvqtVar, dvriVar, dvdpVar, egVar, evzmVar, null), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ((ensz) dvri.a.h()).t("Promotion render result - %s", bool);
        if (this.d == dvqt.SUCCESS) {
            evzd evzdVar = this.b.c().f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            if (!evzdVar.f) {
                this.c.f(this.b, this.d);
                return ffcu.a;
            }
        }
        this.c.d(this.b);
        dvqt dvqtVar2 = this.d;
        if (dvqtVar2 != dvqt.SUCCESS) {
            this.c.f(this.b, dvqtVar2);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvrh(this.b, this.c, this.d, ffguVar);
    }
}
