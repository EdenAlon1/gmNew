package defpackage;

import com.google.android.apps.messaging.restore.service.CustomD2DTargetEndpointService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class akeh extends lkx implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.lkx, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            aX();
            ((CustomD2DTargetEndpointService) this).a = akhb.a();
        }
        super.onCreate();
    }
}
