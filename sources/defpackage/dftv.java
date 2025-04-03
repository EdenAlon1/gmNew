package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dftv implements ServiceConnection, dfqr {
    public final dfsm a;
    public IBinder b;
    private final String d;
    private final String e;
    private final ComponentName f;
    private final Context g;
    private final Handler h;
    private final dftw i;
    public boolean c = false;
    private String j = null;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dftv(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, defpackage.dfsm r7, defpackage.dftw r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.j = r0
            r1.g = r2
            dgxx r2 = new dgxx
            r2.<init>(r3)
            r1.h = r2
            r1.a = r7
            r1.i = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dftv.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, dfsm, dftw):void");
    }

    private final void d() {
        if (Thread.currentThread() != this.h.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // defpackage.dfqr
    public final int a() {
        return 0;
    }

    public final IBinder b() {
        d();
        return this.b;
    }

    public final void c() {
        String.valueOf(this.b);
    }

    @Override // defpackage.dfqr
    public final boolean h() {
        return false;
    }

    @Override // defpackage.dfqr
    public final String j() {
        return this.j;
    }

    @Override // defpackage.dfqr
    public final Set k() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.dfqr
    public final void l(dfvk dfvkVar) {
        d();
        c();
        if (p()) {
            try {
                n("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.d).setAction(this.e);
            }
            boolean bindService = this.g.bindService(intent, this, dfwe.a);
            this.c = bindService;
            if (!bindService) {
                this.b = null;
                this.i.onConnectionFailed(new ConnectionResult(16));
            }
            c();
        } catch (SecurityException e) {
            this.c = false;
            this.b = null;
            throw e;
        }
    }

    @Override // defpackage.dfqr
    public final void m() {
        throw null;
    }

    @Override // defpackage.dfqr
    public final void n(String str) {
        d();
        this.j = str;
        d();
        c();
        try {
            this.g.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c = false;
        this.b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.h.post(new Runnable() { // from class: dftu
            @Override // java.lang.Runnable
            public final void run() {
                dftv dftvVar = dftv.this;
                dftvVar.c = false;
                dftvVar.b = iBinder;
                dftvVar.c();
                dftvVar.a.onConnected(new Bundle());
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h.post(new Runnable() { // from class: dftt
            @Override // java.lang.Runnable
            public final void run() {
                dftv dftvVar = dftv.this;
                dftvVar.c = false;
                dftvVar.b = null;
                dftvVar.c();
                dftvVar.a.onConnectionSuspended(1);
            }
        });
    }

    @Override // defpackage.dfqr
    public final boolean p() {
        d();
        return this.b != null;
    }

    @Override // defpackage.dfqr
    public final boolean q() {
        d();
        return this.c;
    }

    @Override // defpackage.dfqr
    public final boolean r() {
        return false;
    }

    @Override // defpackage.dfqr
    public final Feature[] s() {
        return new Feature[0];
    }

    @Override // defpackage.dfqr
    public final void u() {
        if (this.d != null) {
            return;
        }
        dfwv.n(this.f);
        this.f.getPackageName();
    }

    @Override // defpackage.dfqr
    public final void t(dfsy dfsyVar) {
    }

    @Override // defpackage.dfqr
    public final void o(IAccountAccessor iAccountAccessor, Set set) {
    }
}
