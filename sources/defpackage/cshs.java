package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshs implements cshn {
    private static final cskc a = cskc.g("BugleCms", "OptInMDWhenNoFeatureIsOn");
    private final babf b;
    private final axkm c;
    private final eisx d;
    private final axmm e;
    private final ffbr f;
    private final arep g;

    public cshs(babf babfVar, axkm axkmVar, eisx eisxVar, axmm axmmVar, ffbr ffbrVar, arep arepVar) {
        this.b = babfVar;
        this.c = axkmVar;
        this.d = eisxVar;
        this.e = axmmVar;
        this.f = ffbrVar;
        this.g = arepVar;
    }

    @Override // defpackage.cshn
    public final void a() {
        a.m("configure for [opt in Multi-Device] when [no feature is on]");
        this.b.c(this.d);
        this.c.aj(UUID.randomUUID().toString());
        this.e.i();
        this.c.S(axeu.ENABLING);
        this.c.Z(true);
        if (csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue()) {
            this.c.ai(true);
        }
        this.c.aa(true);
        this.c.af(axeu.ENABLING);
        if (this.g.a()) {
            return;
        }
        ((cmgr) this.f.b()).m(cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
    }
}
