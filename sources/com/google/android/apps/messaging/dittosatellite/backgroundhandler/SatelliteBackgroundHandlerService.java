package com.google.android.apps.messaging.dittosatellite.backgroundhandler;

import android.content.Intent;
import android.os.IBinder;
import defpackage.acjb;
import defpackage.acka;
import defpackage.ackb;
import defpackage.acrw;
import defpackage.akhb;
import defpackage.axnw;
import defpackage.efbd;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekqj;
import defpackage.ekzq;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.ensz;
import defpackage.fbaz;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SatelliteBackgroundHandlerService extends acjb implements ekhu<ackb> {
    public ekqj a;
    private ackb b;
    private boolean c;
    private final ekzq d = new ekzq(this);
    private boolean e;

    @Deprecated
    public SatelliteBackgroundHandlerService() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ackb.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ackb H() {
        ackb ackbVar = this.b;
        if (ackbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ackbVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        elav a = this.d.a(intent);
        try {
            ekqj ekqjVar = this.a;
            if (ekqjVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            ekqjVar.b();
            acka ackaVar = H().e;
            a.close();
            return ackaVar;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acjb, android.app.Service
    public final void onCreate() {
        elav b = this.d.b();
        try {
            this.c = true;
            emxf.l(getApplication() instanceof ekke);
            if (this.b == null) {
                if (!this.c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.e) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                ekzz f = eleg.f("CreateComponent");
                try {
                    aX();
                    f.close();
                    f = eleg.f("CreatePeer");
                    try {
                        try {
                            Object aX = aX();
                            this.b = new ackb(((akhb) aX).h, fbaz.a(((akhb) aX).k), fbaz.a(((akhb) aX).b.p));
                            f.close();
                        } finally {
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } finally {
                }
            }
            super.onCreate();
            H().d = Instant.now();
            ((ensz) ((ensz) ackb.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerServicePeer", "onCreate", 79, "SatelliteBackgroundHandlerServicePeer.java")).q("Created SatelliteBackgroundHandlerService");
            this.c = false;
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Object obj;
        elav c = this.d.c();
        try {
            ekqj ekqjVar = this.a;
            if (ekqjVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            ekqjVar.a();
            super.onDestroy();
            ackb H = H();
            ensz enszVar = (ensz) ((ensz) ackb.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerServicePeer", "onDestroy", 97, "SatelliteBackgroundHandlerServicePeer.java");
            long epochMilli = Instant.now().toEpochMilli();
            Instant instant = H.d;
            instant.getClass();
            enszVar.s("Destroying SatelliteBackgroundHandlerService. Ran for %d ms", epochMilli - instant.toEpochMilli());
            obj = H.b.get();
            ((acrw) obj).b().k(axnw.b(), H.c);
            this.e = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
