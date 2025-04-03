package com.google.android.apps.messaging.backup;

import android.content.Intent;
import android.os.IBinder;
import defpackage.akhb;
import defpackage.efbd;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekqj;
import defpackage.ekzq;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.evgy;
import defpackage.fbaz;
import defpackage.feep;
import defpackage.feey;
import defpackage.feez;
import defpackage.fefa;
import defpackage.soq;
import defpackage.sqo;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomD2DSourceEndpointService extends sqo implements ekhu<soq> {
    public ekqj a;
    private soq b;
    private boolean c;
    private final ekzq d = new ekzq(this);
    private boolean e;

    @Deprecated
    public CustomD2DSourceEndpointService() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return soq.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final soq H() {
        soq soqVar = this.b;
        if (soqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return soqVar;
    }

    @Override // defpackage.lkx, android.app.Service
    public final IBinder onBind(Intent intent) {
        elav a = this.d.a(intent);
        try {
            ekqj ekqjVar = this.a;
            if (ekqjVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            ekqjVar.b();
            super.onBind(intent);
            soq H = H();
            evgy evgyVar = (evgy) H.a.b();
            HashMap hashMap = new HashMap();
            feez.b("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", (feey) H.b.b(), hashMap);
            fefa a2 = feez.a(hashMap);
            feep feepVar = new feep();
            feepVar.b();
            evgyVar.c(a2, feepVar.a());
            IBinder a3 = ((evgy) H.a.b()).a();
            a.close();
            return a3;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.sqo, defpackage.lkx, android.app.Service
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
                            this.b = new soq(fbaz.a(((akhb) aX).d), fbaz.a(((akhb) aX).b.b.qR));
                            f.close();
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } finally {
                    }
                } finally {
                }
            }
            super.onCreate();
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

    @Override // defpackage.lkx, android.app.Service
    public final void onDestroy() {
        elav c = this.d.c();
        try {
            ekqj ekqjVar = this.a;
            if (ekqjVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            ekqjVar.a();
            super.onDestroy();
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
