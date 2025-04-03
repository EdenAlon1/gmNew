package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvrf extends ffhv implements ffjm {
    final /* synthetic */ dvqt a;
    final /* synthetic */ dvri b;
    final /* synthetic */ dvdp c;
    final /* synthetic */ eg d;
    final /* synthetic */ evzm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvrf(dvqt dvqtVar, dvri dvriVar, dvdp dvdpVar, eg egVar, evzm evzmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dvqtVar;
        this.b = dvriVar;
        this.c = dvdpVar;
        this.d = egVar;
        this.e = evzmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvrf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dvqt dvqtVar = dvqt.SUCCESS;
        dvqt dvqtVar2 = this.a;
        if (dvqtVar != dvqtVar2) {
            this.b.g.b(this.c, "Error rendering promotion, result=%s.", dvqtVar2);
            this.b.h.h(this.c, this.a);
            return false;
        }
        dvdk dvdkVar = new dvdk(this.d.getResources().getConfiguration().orientation, this.e);
        evts c = this.c.c();
        evzd evzdVar = c.f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        if (evzdVar.f) {
            this.b.g.c(this.c, "NOT DISPLAYED (control group).", new Object[0]);
            this.b.h.f(this.c, dvdkVar);
        } else {
            this.b.g.c(this.c, "DISPLAYED.", new Object[0]);
            this.b.h.j(this.c, dvdkVar);
        }
        ears earsVar = (ears) this.b.e.b();
        dvri dvriVar = this.b;
        evzd evzdVar2 = c.f;
        if (evzdVar2 == null) {
            evzdVar2 = evzd.a;
        }
        evzc b = evzc.b(evzdVar2.e);
        if (b == null) {
            b = evzc.UITYPE_NONE;
        }
        String str = dvriVar.f;
        ((efkw) earsVar.h.get()).a(str, b.name());
        return true;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvrf(this.a, this.b, this.c, this.d, this.e, ffguVar);
    }
}
