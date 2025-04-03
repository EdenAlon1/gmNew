package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import com.google.android.gms.droidguard.internal.IDroidGuardService;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbk implements Runnable, dfsm, dftw {
    private static dgbk c;
    public final Handler b;
    private final dfwc e;
    private final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public int a = 0;

    private dgbk(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        dgxx dgxxVar = new dgxx(handlerThread.getLooper());
        this.b = dgxxVar;
        this.e = new dgbe(context, dgxxVar.getLooper(), this, this);
    }

    static synchronized dgbk a(Context context) {
        dgbk dgbkVar;
        synchronized (dgbk.class) {
            if (c == null) {
                c = new dgbk(context);
            }
            dgbkVar = c;
        }
        return dgbkVar;
    }

    private final void e(String str) {
        while (true) {
            dgbi dgbiVar = (dgbi) this.d.poll();
            if (dgbiVar == null) {
                return;
            }
            dfwc dfwcVar = this.e;
            dgbiVar.d(new dgbh(dfwcVar.c, this, str, dgbiVar.g));
        }
    }

    private final void f() {
        dgbk dgbkVar;
        dgbh dgbhVar;
        IDroidGuardHandle createDroidGuardHandle;
        while (true) {
            dgbi dgbiVar = (dgbi) this.d.poll();
            if (dgbiVar == null) {
                c();
                return;
            }
            if (!dgbiVar.f) {
                dgci dgciVar = dgbiVar.g;
                dgciVar.c(3, dgch.FINE);
                try {
                    createDroidGuardHandle = ((IDroidGuardService) this.e.w()).createDroidGuardHandle();
                    dgciVar.c(4, dgch.FINE);
                    dgbiVar.e.b(this.a);
                    DroidGuardInitReply initWithExtras = createDroidGuardHandle.initWithExtras(dgbiVar.d, dgbiVar.e);
                    if (initWithExtras == null) {
                        createDroidGuardHandle.init(dgbiVar.d);
                    }
                    dgciVar.c(5, dgch.FINE);
                    if (initWithExtras != null) {
                        dgbo.a(this.e.c, dgciVar, initWithExtras);
                    }
                    this.a++;
                    dgbkVar = this;
                } catch (Exception e) {
                    e = e;
                    dgbkVar = this;
                }
                try {
                    dgbhVar = new dgbh(this.e.c, dgbkVar, createDroidGuardHandle, dgbiVar.e.a(), dgciVar);
                } catch (Exception e2) {
                    e = e2;
                    dgciVar = dgciVar;
                    Exception exc = e;
                    dgbhVar = new dgbh(dgbkVar.e.c, dgbkVar, "Initialization failed: ".concat(exc.toString()), dgciVar, exc);
                    dgbiVar.g.c(13, dgch.COARSE);
                    dgbiVar.d(dgbhVar);
                }
                dgbiVar.g.c(13, dgch.COARSE);
                dgbiVar.d(dgbhVar);
            }
        }
    }

    public final void b(dgbi dgbiVar) {
        dgbiVar.g.c(2, dgch.COARSE);
        this.d.offer(dgbiVar);
        this.b.post(this);
    }

    public final void c() {
        if (this.d.isEmpty() && this.a == 0 && this.e.p()) {
            this.e.m();
        }
    }

    final void d(Runnable runnable) {
        if (Looper.myLooper() == this.b.getLooper()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    @Override // defpackage.dfsm
    public final void onConnected(Bundle bundle) {
        dfwv.d(this.b);
        f();
    }

    @Override // defpackage.dftw
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        dfwv.d(this.b);
        e("Connection failed: ".concat(connectionResult.toString()));
    }

    @Override // defpackage.dfsm
    public final void onConnectionSuspended(int i) {
        dfwv.d(this.b);
        e(a.h(i, "Disconnected: "));
    }

    @Override // java.lang.Runnable
    public final void run() {
        dfwv.d(this.b);
        if (this.e.p()) {
            f();
        } else {
            if (this.e.q() || this.d.isEmpty()) {
                return;
            }
            this.e.A();
        }
    }
}
