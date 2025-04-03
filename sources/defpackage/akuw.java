package defpackage;

import android.app.IntentService;
import com.google.android.apps.messaging.shared.NoConfirmationSmsSendService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class akuw extends IntentService implements fbat {
    private volatile fbaj a;
    private final Object b;
    private boolean c;

    public akuw() {
        super("com.google.android.apps.messaging.shared.NoConfirmationSmsSendService");
        this.b = new Object();
        this.c = false;
    }

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

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((NoConfirmationSmsSendService) this).a = (bbfh) ((akhb) aX()).b.b.dZ.b();
        }
        super.onCreate();
    }
}
