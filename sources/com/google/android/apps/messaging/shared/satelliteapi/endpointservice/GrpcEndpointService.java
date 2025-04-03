package com.google.android.apps.messaging.shared.satelliteapi.endpointservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.akhb;
import defpackage.cnpy;
import defpackage.cnpz;
import defpackage.efbd;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekqj;
import defpackage.ekzq;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.errl;
import defpackage.evgy;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class GrpcEndpointService extends cnpz implements ekhu<cnpy> {
    public ekqj a;
    private cnpy b;
    private boolean c;
    private final ekzq d = new ekzq(this);
    private boolean e;

    @Deprecated
    public GrpcEndpointService() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cnpy.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cnpy H() {
        cnpy cnpyVar = this.b;
        if (cnpyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cnpyVar;
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
            IBinder a2 = H().a.a();
            a.close();
            return a2;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cnpz, defpackage.lkx, android.app.Service
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
                            this.b = new cnpy((evgy) ((akhb) aX).d.b(), (Context) ((akhb) aX).b.q.b(), (errl) ((akhb) aX).b.t.b());
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
