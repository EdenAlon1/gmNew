package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegv implements aegr {
    public static final /* synthetic */ int b = 0;
    private static final ejui c = new ejtz("GROUP_UPGRADE_SETTINGS_DATA_SERVICE_KEY");
    public final comc a;
    private final ffhd d;
    private final ejvp e;

    public aegv(ffsk ffskVar, ffhd ffhdVar, comc comcVar, ejvp ejvpVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ejvpVar.getClass();
        this.d = ffhdVar;
        this.a = comcVar;
        this.e = ejvpVar;
    }

    @Override // defpackage.aegr
    public final Object a(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new aegu(null, this), ffguVar);
    }

    @Override // defpackage.aegr
    public final void b(final int i) {
        final ffji ffjiVar = new ffji() { // from class: aegs
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i2 = aegv.b;
                aegp aegpVar = (aegp) aegq.a.createBuilder();
                aegpVar.getClass();
                aegpVar.copyOnWrite();
                aegq aegqVar = (aegq) aegpVar.instance;
                aegqVar.b |= 1;
                aegqVar.c = i;
                eyfy build = aegpVar.build();
                build.getClass();
                return (aegq) build;
            }
        };
        this.e.a(this.a.j(new emwl() { // from class: aegt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = aegv.b;
                return ffji.this.invoke(obj);
            }
        }), c);
    }
}
