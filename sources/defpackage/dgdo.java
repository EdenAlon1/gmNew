package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgdo implements dgco {
    public final dgdc a;
    private final dgcy b;
    private final Executor c;
    private final String d;
    private final dgcn e;
    private IDroidGuardHandle f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final dgci h;

    public dgdo(dgcy dgcyVar, Executor executor, dgdc dgdcVar, String str, dgcn dgcnVar, dgci dgciVar, IDroidGuardHandle iDroidGuardHandle) {
        this.b = dgcyVar;
        this.c = executor;
        this.a = dgdcVar;
        this.d = str;
        this.e = dgcnVar;
        this.h = dgciVar;
        this.f = iDroidGuardHandle;
    }

    private static boolean d(IDroidGuardHandle iDroidGuardHandle) {
        return iDroidGuardHandle == null || iDroidGuardHandle.asBinder() == null || !iDroidGuardHandle.asBinder().pingBinder();
    }

    private final synchronized byte[] e(Map map) {
        byte[] snapshot;
        if (d(this.f)) {
            throw new dfqu(new Status(20, "The handle object on the module side is unreachable"));
        }
        try {
            snapshot = this.f.snapshot(map);
            if (snapshot == null) {
                throw new dfqu(new Status(8, "Received null response on snapshot"));
            }
        } catch (RemoteException e) {
            throw dgcq.b(e, "Failed to get a snapshot");
        }
        return snapshot;
    }

    private final synchronized void f(dfwc dfwcVar, dgci dgciVar) {
        if (((dgck) this.e).c && d(this.f)) {
            dgciVar.c(2, dgch.COARSE);
            this.f = ((dgcr) dgdj.b(dfwcVar, this.d, this.e, this.b.a(), dgciVar)).a;
        }
    }

    @Override // defpackage.dgco
    public final dhre a(final Map map) {
        dhre d;
        AtomicBoolean atomicBoolean = this.g;
        final long currentTimeMillis = System.currentTimeMillis();
        if (atomicBoolean.get()) {
            d = dhrt.b(new dfqu(new Status(10, "DroidGuard handle is closed")));
        } else {
            d = this.b.d(true != ((dgck) this.e).c ? 2 : 1, 2, new dgcx() { // from class: dgdm
                @Override // defpackage.dgcx
                public final Object a(dfwc dfwcVar) {
                    return dgdo.this.b(dfwcVar, map);
                }
            });
        }
        Executor executor = this.c;
        dhre a = dgdq.a(executor, d, ((dgck) this.e).b);
        a.o(executor, new dhqs() { // from class: dgdn
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                dgdo.this.a.a(35503, dhreVar, currentTimeMillis, System.currentTimeMillis());
            }
        });
        return a;
    }

    public final synchronized dgcp b(dfwc dfwcVar, Map map) {
        dgci clone;
        byte[] e;
        clone = this.h.clone();
        f(dfwcVar, clone);
        clone.c(14, dgch.COARSE);
        e = e(map);
        clone.c(15, dgch.COARSE);
        return new dgcp(dgce.b(dgce.a(dfwcVar.c, e, clone.b())));
    }

    public final synchronized void c() {
        if (d(this.f)) {
            Log.w("DGInternalHandle", "The handle object on the module side is unreachable for close");
            return;
        }
        try {
            this.f.close();
        } catch (RemoteException e) {
            Log.e("DGInternalHandle", "Error while closing the handle: ".concat(String.valueOf(e.getMessage())));
        }
        this.f = null;
    }

    @Override // defpackage.dgco, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.getAndSet(true)) {
            Log.w("DGInternalHandle", "Handle is already closed");
        } else {
            this.b.d(2, 3, new dgcx() { // from class: dgdk
                @Override // defpackage.dgcx
                public final Object a(dfwc dfwcVar) {
                    dgdo.this.c();
                    return null;
                }
            }).t(new dhqv() { // from class: dgdl
                @Override // defpackage.dhqv
                public final void d(Exception exc) {
                    Log.w("DGInternalHandle", "Client disconnected on close: ".concat(String.valueOf(exc.getMessage())));
                }
            });
        }
    }
}
