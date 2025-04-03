package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsi implements cfvv {
    private static final enru a = enru.c("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler");
    private final Context b;
    private final ffbr c;

    public adsi(Context context, ffbr ffbrVar) {
        this.b = context;
        this.c = ffbrVar;
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        return 0;
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        if (((eain) this.c.b()).a(this.b, euxgVar)) {
            ensk h = a.h();
            h.Y(ente.a, "GnpFcmHandler");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler", "onMessageReceived", 32, "GnpFcmHandler.java")).q("Successful FCM message handled by GnpFirebaseHandler");
        } else {
            ensk j = a.j();
            j.Y(ente.a, "GnpFcmHandler");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler", "onMessageReceived", 34, "GnpFcmHandler.java")).q("GnpFirebaseHandler failed to handle FCM messages");
        }
    }

    @Override // defpackage.cfvv
    public final void c() {
    }
}
