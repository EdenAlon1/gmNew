package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhi implements eyhq {
    private final eyhq[] a;

    public eyhi(eyhq... eyhqVarArr) {
        this.a = eyhqVarArr;
    }

    @Override // defpackage.eyhq
    public final eyhp a(Class cls) {
        for (int i = 0; i < 2; i++) {
            eyhq eyhqVar = this.a[i];
            if (eyhqVar.b(cls)) {
                return eyhqVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.eyhq
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
