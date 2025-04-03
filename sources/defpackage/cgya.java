package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cgya extends Service implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            DittoForegroundService dittoForegroundService = (DittoForegroundService) this;
            akhb akhbVar = (akhb) aX();
            dittoForegroundService.c = (cthp) akhbVar.b.a.an.b();
            akis akisVar = akhbVar.b;
            dittoForegroundService.d = akisVar.ip;
            akkp akkpVar = akisVar.a;
            dittoForegroundService.e = akkpVar.Py;
            dittoForegroundService.f = akisVar.b.by;
            dittoForegroundService.g = akhbVar.v;
            dittoForegroundService.h = akkpVar.cX;
            dittoForegroundService.i = akkpVar.au;
            dittoForegroundService.j = akisVar.t;
        }
        super.onCreate();
    }
}
