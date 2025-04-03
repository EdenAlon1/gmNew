package defpackage;

import com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class smx extends cel implements fbat {
    private volatile fbaj c;
    private final Object d = new Object();
    private boolean e = false;

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new fbaj(this);
                }
            }
        }
        return this.c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.e) {
            this.e = true;
            MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule = (MessagingTemplateScreenServiceModule) this;
            akhb akhbVar = (akhb) aX();
            messagingTemplateScreenServiceModule.d = akhbVar.c;
            akis akisVar = akhbVar.b;
            messagingTemplateScreenServiceModule.e = akisVar.ot;
            messagingTemplateScreenServiceModule.f = akisVar.a.al;
            messagingTemplateScreenServiceModule.g = akisVar.b.qh;
        }
        super.onCreate();
    }
}
