package defpackage;

import com.google.android.apps.messaging.shared.fcm.impl.BugleFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfwz extends FirebaseMessagingService implements fbat {
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
            BugleFirebaseMessagingService bugleFirebaseMessagingService = (BugleFirebaseMessagingService) this;
            akhb akhbVar = (akhb) aX();
            akko akkoVar = akhbVar.b.b;
            enhd h = enhk.h(6);
            h.k("account_deleted", akkoVar.qV);
            h.k("gnp_chime_message", akhbVar.b.b.qX);
            h.k("prewarm", akhbVar.b.b.qY);
            h.k("RCS_SERVICE_MESSAGE_PUSH", akhbVar.b.b.qZ);
            h.k("", akhbVar.p);
            h.k("check_tickle_connection", akhbVar.u);
            bugleFirebaseMessagingService.a = h.c();
            bugleFirebaseMessagingService.b = (akzt) akhbVar.b.a.f.b();
            bugleFirebaseMessagingService.c = (elbx) akhbVar.b.aJ.b();
            akkp akkpVar = akhbVar.b.a;
            bugleFirebaseMessagingService.d = akkpVar.az;
            bugleFirebaseMessagingService.e = akkpVar.br;
            bugleFirebaseMessagingService.f = akkpVar.gp;
        }
        super.onCreate();
    }
}
