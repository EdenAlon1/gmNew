package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlo {
    public final effy a;
    public final ejvp b;
    private final ejvb c;
    private final errl d;

    public cnlo(effy effyVar, errl errlVar, ejvb ejvbVar, ejvp ejvpVar) {
        this.a = effyVar;
        this.d = errlVar;
        this.c = ejvbVar;
        this.b = ejvpVar;
    }

    public final ejuh a() {
        return new ejuy(this.c, new eros() { // from class: cnlk
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(cnlo.this.b());
            }
        }, "reminder_settings_data_service");
    }

    public final elfl b() {
        return elfl.g(this.a.a()).h(new emwl() { // from class: cnln
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cnli cnliVar = (cnli) obj;
                return Boolean.valueOf(cnliVar.c ? cnliVar.d : ((Boolean) ddjr.e.e()).booleanValue());
            }
        }, this.d);
    }
}
