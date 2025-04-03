package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akou implements cvlg {
    private static final entd a = entd.c("SignatureProvider");
    private final aknc b;

    public akou(aknc akncVar) {
        this.b = akncVar;
    }

    @Override // defpackage.cvlg
    public final elfl a() {
        ekzz f = eleg.f("SignatureProvider#getSignature");
        try {
            ((ensz) a.n().h("com/google/android/apps/messaging/samsung/signature/SignatureProvider", "getSignature", 30, "SignatureProvider.java")).q("Querying Knox Provider for signature");
            elfl a2 = this.b.a(aknb.SIGNATURE);
            f.b(a2);
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
