package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csht implements cshn {
    private final axkm a;
    private final ffbr b;
    private final arep c;

    public csht(axkm axkmVar, ffbr ffbrVar, arep arepVar) {
        this.a = axkmVar;
        this.b = ffbrVar;
        this.c = arepVar;
    }

    @Override // defpackage.cshn
    public final void a() {
        this.a.aa(true);
        this.a.af(axeu.ENABLING);
        if (this.c.a()) {
            return;
        }
        ((cmgr) this.b.b()).m(cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
    }
}
