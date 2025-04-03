package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyf extends ffhv implements ffjm {
    final /* synthetic */ dcyg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcyf(dcyg dcygVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dcygVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dcyf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dcyg dcygVar = this.a;
        boolean z = true;
        if (djai.z() && djai.ac()) {
            if (((cmgr) dcygVar.j.b()).a().equals(cmip.TOGGLE_STATE_USER_DISABLED)) {
                dcyg.a.n().q("Not showing Legal FYI: Global Toggle User Disabled");
            } else if (((crln) dcygVar.e.b()).f()) {
                dcyg.a.n().q("Not showing Legal FYI: ToS already accepted");
            } else if (((ctyx) dcygVar.d.b()).q("should_show_rcs_default_on_prompt", false)) {
                cmem a = dcygVar.k.a();
                if (!a.equals(cmem.LEGAL_FYI_SEEN)) {
                    for (djrm djrmVar : ((cort) dcygVar.i.b()).o()) {
                        a.getClass();
                        ewht c = ((cguo) dcygVar.h.b()).c(djrn.a(djrmVar).a);
                        if (!c.t) {
                            dcyg.a.n().q("Not showing Legal FYI for SIM: Feature flag is disabled");
                        } else if (!c.n) {
                            dcyg.a.n().q("Not showing Legal FYI for SIM: showGoogleTos is false");
                        } else {
                            if (!c.s || a != cmem.OOB_CONSENT || !((ckge) dcygVar.f.a()).w(djrmVar).equals(eqwf.AVAILABLE)) {
                                break;
                            }
                            dcyg.a.n().q("Not showing Legal FYI for SIM: already provisioned with OOB flow.");
                        }
                    }
                } else {
                    dcyg.a.n().t("Not showing Legal FYI: consent state is set to %s", a);
                }
            } else {
                dcyg.a.n().q("Not showing Legal FYI: the show bit is not set");
            }
            z = false;
        } else {
            if (((cmgr) dcygVar.j.b()).a().equals(cmip.TOGGLE_STATE_USER_DISABLED)) {
                dcyg.a.n().q("Not showing Legal FYI: Global Toggle User Disabled");
            } else if (!djai.G()) {
                dcyg.a.n().q("Not showing Legal FYI: Feature flag is disabled");
            } else if (!dimo.b()) {
                dcyg.a.n().q("Not showing Legal FYI: Not RCS eligible");
            } else if (((crln) dcygVar.e.b()).f()) {
                dcyg.a.n().q("Not showing Legal FYI: ToS already accepted");
            } else if (((ctyx) dcygVar.d.b()).q("should_show_rcs_default_on_prompt", false)) {
                cmem a2 = dcygVar.k.a();
                if (djai.J() && a2.equals(cmem.OOB_CONSENT)) {
                    ckge ckgeVar = (ckge) dcygVar.f.a();
                    String l = ((dkpp) dcygVar.g.b()).l();
                    l.getClass();
                    if (ckgeVar.w(new djro(l)).equals(eqwf.AVAILABLE)) {
                        dcyg.a.n().q("Not showing RCS Default On because user was already provisioned with OOB flow.");
                    }
                }
                if (a2.equals(cmem.LEGAL_FYI_SEEN)) {
                    dcyg.a.n().t("Not showing RCS Default On because consent state is set: %s", a2);
                }
            } else {
                dcyg.a.n().q("Not showing RCS Default On because the show bit is not set");
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dcyf(this.a, ffguVar);
    }
}
