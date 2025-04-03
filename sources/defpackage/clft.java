package defpackage;

import com.google.android.apps.messaging.shared.rcs.messaging.MessagingEngineNotificationServer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clft extends lkx implements fbat {
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

    @Override // defpackage.lkx, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            aX();
            ((MessagingEngineNotificationServer) this).a = akhb.a();
        }
        super.onCreate();
    }
}
