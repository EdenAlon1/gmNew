package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capj implements bzqi {
    public final effy a;
    public final errl b;
    private final ejvb c;
    private final errl d;
    private final ejvp e;
    private final bzqa f;

    public capj(effy effyVar, errl errlVar, errl errlVar2, ejvb ejvbVar, ejvp ejvpVar, bzqa bzqaVar) {
        this.a = effyVar;
        this.d = errlVar;
        this.b = errlVar2;
        this.c = ejvbVar;
        this.e = ejvpVar;
        this.f = bzqaVar;
    }

    @Override // defpackage.bzqi
    public final ejuh a() {
        return new ejuy(this.c, new eros() { // from class: capd
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(capj.this.d());
            }
        }, "user_etouffee_settings_data_service");
    }

    @Override // defpackage.bzqi
    public final ejuh b() {
        return new ejuy(this.c, new eros() { // from class: capf
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                capj capjVar = capj.this;
                return new erph(elfl.g(capjVar.a.a()).h(new emwl() { // from class: cape
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((capa) obj).d);
                    }
                }, capjVar.b));
            }
        }, "user_etouffee_enabled_setting_data_service");
    }

    @Override // defpackage.bzqi
    public final elfl c(boolean z) {
        return (z && this.f.o()) ? d() : elfo.e(true);
    }

    @Override // defpackage.bzqi
    public final elfl d() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: capg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((capa) obj).c);
            }
        }, this.b);
    }

    @Override // defpackage.bzqi
    public final elfl e(final boolean z) {
        return elfl.g(this.a.b(new emwl() { // from class: caph
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                caoz caozVar = (caoz) ((capa) obj).toBuilder();
                caozVar.copyOnWrite();
                capa capaVar = (capa) caozVar.instance;
                capaVar.b |= 1;
                capaVar.c = z;
                return (capa) caozVar.build();
            }
        }, this.d)).h(new emwl() { // from class: capi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                capj.this.g("user_etouffee_settings_data_service");
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.bzqi
    public final elfl f(final boolean z) {
        return elfl.g(this.a.b(new emwl() { // from class: capb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                caoz caozVar = (caoz) ((capa) obj).toBuilder();
                caozVar.copyOnWrite();
                capa capaVar = (capa) caozVar.instance;
                capaVar.b |= 2;
                capaVar.d = z;
                return (capa) caozVar.build();
            }
        }, this.d)).h(new emwl() { // from class: capc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                capj.this.g("user_etouffee_enabled_setting_data_service");
                return null;
            }
        }, this.b);
    }

    public final void g(String str) {
        this.e.a(elfo.e(null), str);
    }
}
