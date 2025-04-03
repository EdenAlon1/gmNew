package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzai implements coup {
    public static final cskc a = cskc.g("Bugle", "DittoContactsRefreshListener");
    public static final cfup b = cfvl.e(cfvl.b, "conversation_update_threshold", 50);
    private final fazb c;

    public bzai(fazb fazbVar) {
        this.c = fazbVar;
    }

    @Override // defpackage.coup
    public final void a(int i) {
        if (i > ((Integer) b.e()).intValue()) {
            ((bzef) this.c.b()).q(1).h(new emwl() { // from class: bzah
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    cskc cskcVar = bzai.a;
                    if (bool.booleanValue()) {
                        bzai.a.m("Successfully resumed the Bugle to the Ditto push stream.");
                    }
                    return bool;
                }
            }, erpp.a).k(axnw.b(), erpp.a);
        }
    }

    @Override // defpackage.coup
    public final void b(int i) {
        if (i > ((Integer) b.e()).intValue()) {
            ((bzef) this.c.b()).p(1).h(new emwl() { // from class: bzag
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    cskc cskcVar = bzai.a;
                    if (bool.booleanValue()) {
                        bzai.a.m("Successfully paused the Bugle to the Ditto push stream.");
                    }
                    return bool;
                }
            }, erpp.a).k(axnw.b(), erpp.a);
        }
    }
}
