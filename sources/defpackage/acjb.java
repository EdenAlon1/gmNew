package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.dittosatellite.backgroundhandler.SatelliteBackgroundHandlerService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acjb extends Service implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fbaj(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            aX();
            ((SatelliteBackgroundHandlerService) this).a = akhb.a();
        }
        super.onCreate();
    }
}
