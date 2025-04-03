package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbaj implements fbas {
    private final Service a;
    private Object b;

    /* compiled from: PG */
    public interface a {
        akgz iH();
    }

    public fbaj(Service service) {
        this.a = service;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            fbau.a(application instanceof fbas, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            akgz iH = ((a) fazh.a(application, a.class)).iH();
            iH.b = this.a;
            fbbe.a(iH.b, Service.class);
            this.b = new akhb(iH.a, iH.b);
        }
        return this.b;
    }
}
