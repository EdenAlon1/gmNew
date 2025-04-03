package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctzv implements ehxi {
    public kfb a;
    public ehxc b;

    @Override // defpackage.ehxi
    public final void d(String str, ehxh ehxhVar) {
        ekzz f = eleg.f("ConnectedRcsServiceFactory#handleServiceConnectFailed");
        try {
            this.a.c(new cual(str, ehxhVar));
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehxi
    public final void e(String str) {
        ((ensz) ctzw.b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 60, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() start for serviceClassName %s", str);
        ekzz f = eleg.f("ConnectedRcsServiceFactory#handleServiceConnected");
        try {
            ehxc ehxcVar = this.b;
            if (ehxcVar != null) {
                this.a.b(ehxcVar);
                ((ensz) ctzw.b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 66, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() completer.set rcsService %s", this.b);
            } else {
                ((ensz) ctzw.b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 68, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() rcsService is Null for serviceClassName %s", str);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehxi
    public final void f(String str) {
        ekzz f = eleg.f("ConnectedRcsServiceFactory#handleServiceDisconnected");
        try {
            this.b = null;
            f.close();
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
