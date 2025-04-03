package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ada extends adg {
    private final acj a;

    public ada(acj acjVar) {
        this.a = acjVar;
    }

    @Override // defpackage.adg
    public final void a(Object obj, kli kliVar) {
        ffcu ffcuVar;
        adg adgVar = this.a.a;
        if (adgVar != null) {
            adgVar.a(obj, kliVar);
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // defpackage.adg
    @ffbs
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
