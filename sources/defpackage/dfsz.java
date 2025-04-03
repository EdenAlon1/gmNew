package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsz implements dfrc, dfrd {
    public final dfqr b;
    public final dfrz c;
    public final int e;
    public boolean f;
    public final /* synthetic */ dftd i;
    private final dfsp j;
    private final SignInCoordinator l;
    public final Queue a = new LinkedList();
    private final Set k = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private ConnectionResult m = null;
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public dfsz(dftd dftdVar, dfra dfraVar) {
        this.i = dftdVar;
        Looper looper = dftdVar.o.getLooper();
        dfvs a = dfraVar.g().a();
        dfqj dfqjVar = dfraVar.f.a;
        dfwv.n(dfqjVar);
        dfqr b = dfqjVar.b(dfraVar.c, looper, a, dfraVar.g, this, this);
        dfzg dfzgVar = dfraVar.e;
        if (dfzgVar != null && (b instanceof BaseGmsClient)) {
            ((BaseGmsClient) b).n = dfzgVar;
        } else if (dfzgVar == null || !(b instanceof dftv)) {
            String str = dfraVar.d;
            if (str != null && (b instanceof BaseGmsClient)) {
                ((BaseGmsClient) b).m = str;
            }
            if (str != null && (b instanceof dftv)) {
            }
        }
        this.b = b;
        this.c = dfraVar.h;
        this.j = new dfsp();
        this.e = dfraVar.j;
        if (b.h()) {
            this.l = new SignInCoordinator(dftdVar.g, dftdVar.o, dfraVar.g().a());
        } else {
            this.l = null;
        }
    }

    private final Feature n(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] s = this.b.s();
            if (s == null) {
                s = new Feature[0];
            }
            cmh cmhVar = new cmh(s.length);
            for (Feature feature : s) {
                cmhVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) cmhVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status o(ConnectionResult connectionResult) {
        return dftd.a(this.c, connectionResult);
    }

    private final void p(ConnectionResult connectionResult) {
        Iterator it = this.k.iterator();
        if (!it.hasNext()) {
            this.k.clear();
            return;
        }
        if (dfwq.a(connectionResult, ConnectionResult.a)) {
            this.b.u();
        }
        throw null;
    }

    private final void q(Status status, Exception exc, boolean z) {
        dfwv.d(this.i.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dfrx dfrxVar = (dfrx) it.next();
            if (!z || dfrxVar.c == 2) {
                if (status != null) {
                    dfrxVar.d(status);
                } else {
                    dfrxVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void r() {
        this.i.o.removeMessages(12, this.c);
        dftd dftdVar = this.i;
        Handler handler = dftdVar.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), dftdVar.e);
    }

    private final void s(dfrx dfrxVar) {
        dfrxVar.g(this.j, l());
        try {
            dfrxVar.f(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.n("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean t(dfrx dfrxVar) {
        if (!(dfrxVar instanceof dfrr)) {
            s(dfrxVar);
            return true;
        }
        dfrr dfrrVar = (dfrr) dfrxVar;
        Feature n = n(dfrrVar.b(this));
        if (n == null) {
            s(dfrxVar);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + n.a + ", " + n.a() + ").");
        if (!this.i.p || !dfrrVar.a(this)) {
            dfrrVar.e(new dfrq(n));
            return true;
        }
        dfta dftaVar = new dfta(this.c, n);
        int indexOf = this.g.indexOf(dftaVar);
        if (indexOf >= 0) {
            dfta dftaVar2 = (dfta) this.g.get(indexOf);
            this.i.o.removeMessages(15, dftaVar2);
            Handler handler = this.i.o;
            handler.sendMessageDelayed(Message.obtain(handler, 15, dftaVar2), 5000L);
            return false;
        }
        this.g.add(dftaVar);
        Handler handler2 = this.i.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, dftaVar), 5000L);
        Handler handler3 = this.i.o;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, dftaVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (u(connectionResult)) {
            return false;
        }
        this.i.i(connectionResult, this.e);
        return false;
    }

    private final boolean u(ConnectionResult connectionResult) {
        synchronized (dftd.c) {
            dftd dftdVar = this.i;
            if (dftdVar.m == null || !dftdVar.n.contains(this.c)) {
                return false;
            }
            dfsq dfsqVar = this.i.m;
            dfsf dfsfVar = new dfsf(connectionResult, this.e);
            AtomicReference atomicReference = dfsqVar.b;
            while (true) {
                if (atomicReference.compareAndSet(null, dfsfVar)) {
                    dfsqVar.c.post(new dfsh(dfsqVar, dfsfVar));
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return true;
        }
    }

    public final void a() {
        dfwv.d(this.i.o);
        this.m = null;
    }

    public final void b() {
        dfwv.d(this.i.o);
        if (this.b.p() || this.b.q()) {
            return;
        }
        try {
            dftd dftdVar = this.i;
            dfwl dfwlVar = dftdVar.i;
            Context context = dftdVar.g;
            dfqr dfqrVar = this.b;
            dfwv.n(context);
            dfwv.n(dfqrVar);
            int i = 0;
            if (dfqrVar.r()) {
                int a = dfqrVar.a();
                int b = dfwlVar.b(a);
                if (b == -1) {
                    synchronized (dfwlVar.a) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= dfwlVar.a.size()) {
                                i = -1;
                                break;
                            }
                            int keyAt = dfwlVar.a.keyAt(i2);
                            if (keyAt > a && dfwlVar.a.get(keyAt) == 0) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i == -1) {
                            i = dfwlVar.b.i(context, a);
                        }
                        dfwlVar.a.put(a, i);
                    }
                } else {
                    i = b;
                }
            }
            if (i != 0) {
                ConnectionResult connectionResult = new ConnectionResult(i, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                onConnectionFailed(connectionResult);
                return;
            }
            dftd dftdVar2 = this.i;
            dfqr dfqrVar2 = this.b;
            dftc dftcVar = new dftc(dftdVar2, dfqrVar2, this.c);
            if (dfqrVar2.h()) {
                SignInCoordinator signInCoordinator = this.l;
                dfwv.n(signInCoordinator);
                signInCoordinator.startSignIn(dftcVar);
            }
            try {
                this.b.l(dftcVar);
            } catch (SecurityException e) {
                g(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            g(new ConnectionResult(10), e2);
        }
    }

    public final void c(dfrx dfrxVar) {
        dfwv.d(this.i.o);
        if (this.b.p()) {
            if (t(dfrxVar)) {
                r();
                return;
            } else {
                this.a.add(dfrxVar);
                return;
            }
        }
        this.a.add(dfrxVar);
        ConnectionResult connectionResult = this.m;
        if (connectionResult == null || !connectionResult.a()) {
            b();
        } else {
            onConnectionFailed(connectionResult);
        }
    }

    public final void d(Status status) {
        dfwv.d(this.i.o);
        q(status, null, false);
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dfrx dfrxVar = (dfrx) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (t(dfrxVar)) {
                this.a.remove(dfrxVar);
            }
        }
    }

    public final void f() {
        a();
        p(ConnectionResult.a);
        k();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            dftz dftzVar = (dftz) it.next();
            if (n(dftzVar.a.b) != null) {
                it.remove();
            } else {
                try {
                    dftzVar.a.b(this.b, new dhri());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.n("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        e();
        r();
    }

    public final void g(ConnectionResult connectionResult, Exception exc) {
        dfwv.d(this.i.o);
        SignInCoordinator signInCoordinator = this.l;
        if (signInCoordinator != null) {
            signInCoordinator.stopSignIn();
        }
        a();
        this.i.i.a();
        p(connectionResult);
        if ((this.b instanceof dfxp) && connectionResult.c != 24) {
            dftd dftdVar = this.i;
            dftdVar.f = true;
            Handler handler = dftdVar.o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            d(dftd.b);
            return;
        }
        if (i == 25) {
            d(o(connectionResult));
            return;
        }
        if (this.a.isEmpty()) {
            this.m = connectionResult;
            return;
        }
        if (exc != null) {
            dfwv.d(this.i.o);
            q(null, exc, false);
            return;
        }
        if (!this.i.p) {
            d(o(connectionResult));
            return;
        }
        q(o(connectionResult), null, true);
        if (this.a.isEmpty() || u(connectionResult) || this.i.i(connectionResult, this.e)) {
            return;
        }
        if (connectionResult.c == 18) {
            this.f = true;
        }
        if (!this.f) {
            d(o(connectionResult));
            return;
        }
        dftd dftdVar2 = this.i;
        dfrz dfrzVar = this.c;
        Handler handler2 = dftdVar2.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 9, dfrzVar), 5000L);
    }

    public final void h(int i) {
        a();
        this.f = true;
        String j = this.b.j();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j);
        }
        this.j.a(true, new Status(20, sb.toString()));
        dftd dftdVar = this.i;
        dfrz dfrzVar = this.c;
        Handler handler = dftdVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, dfrzVar), 5000L);
        dftd dftdVar2 = this.i;
        dfrz dfrzVar2 = this.c;
        Handler handler2 = dftdVar2.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, dfrzVar2), 120000L);
        this.i.i.a();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Runnable runnable = ((dftz) it.next()).c;
        }
    }

    public final void i(ConnectionResult connectionResult) {
        dfwv.d(this.i.o);
        dfqr dfqrVar = this.b;
        dfqrVar.n("onSignInFailed for " + dfqrVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        onConnectionFailed(connectionResult);
    }

    public final void j() {
        dfwv.d(this.i.o);
        d(dftd.a);
        this.j.a(false, dftd.a);
        for (dftn dftnVar : (dftn[]) this.d.keySet().toArray(new dftn[0])) {
            c(new dfrw(dftnVar, new dhri()));
        }
        p(new ConnectionResult(4));
        if (this.b.p()) {
            this.b.t(new dfsy(this));
        }
    }

    public final void k() {
        if (this.f) {
            dftd dftdVar = this.i;
            dftdVar.o.removeMessages(11, this.c);
            dftd dftdVar2 = this.i;
            dftdVar2.o.removeMessages(9, this.c);
            this.f = false;
        }
    }

    public final boolean l() {
        return this.b.h();
    }

    public final boolean m(boolean z) {
        dfwv.d(this.i.o);
        if (!this.b.p() || !this.d.isEmpty()) {
            return false;
        }
        dfsp dfspVar = this.j;
        if (dfspVar.a.isEmpty() && dfspVar.b.isEmpty()) {
            this.b.n("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        r();
        return false;
    }

    @Override // defpackage.dfsm
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            f();
            return;
        }
        dftd dftdVar = this.i;
        dftdVar.o.post(new dfsv(this));
    }

    @Override // defpackage.dftw
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        g(connectionResult, null);
    }

    @Override // defpackage.dfsm
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.i.o.getLooper()) {
            h(i);
            return;
        }
        dftd dftdVar = this.i;
        dftdVar.o.post(new dfsw(this, i));
    }
}
