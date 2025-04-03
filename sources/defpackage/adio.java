package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adio {
    private static final cskc a = cskc.g("BugleGaia", "AccountErrorHandler");
    private final cfyt b;
    private final eito c;
    private final Activity d;
    private final ffbr e;

    public adio(cfyt cfytVar, eito eitoVar, Activity activity, ffbr ffbrVar) {
        this.b = cfytVar;
        this.c = eitoVar;
        this.d = activity;
        this.e = ffbrVar;
    }

    public final void a(Throwable th) {
        ekzz f = eleg.f("handleAccountError");
        try {
            ((akzt) this.e.b()).c("Bugle.Gaia.HandleAccountError.Counts");
            csjb e = a.e();
            e.I("Error happened when selecting account. Sign out user");
            e.A("From screen", this.d.getClass().getName());
            e.s(th);
            if (((Boolean) ((cfup) adhu.b.get()).e()).booleanValue()) {
                this.b.c(th);
            }
            ((akzt) this.e.b()).c("Bugle.Gaia.AccountError.SwitchToPseudonymous");
            this.c.d(engw.r(ejed.class));
            f.close();
        } catch (Throwable th2) {
            try {
                f.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
