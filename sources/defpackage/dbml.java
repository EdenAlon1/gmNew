package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbml implements cije {
    public static final emyl a = cfvl.w("propagate_registration_debugging_state");
    private final ejvp b;

    public dbml(ejvp ejvpVar) {
        this.b = ejvpVar;
    }

    @Override // defpackage.cije
    public final elfl l(String str, choc chocVar, choc chocVar2, int i) {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            this.b.a(erqt.i(null), new ejtz("debug_tachyon_state_data_source"));
        }
        return elfo.e(null);
    }
}
