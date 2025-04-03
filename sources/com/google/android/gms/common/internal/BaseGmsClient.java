package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.dfpj;
import defpackage.dfsx;
import defpackage.dfsy;
import defpackage.dfvi;
import defpackage.dfvj;
import defpackage.dfvk;
import defpackage.dfvl;
import defpackage.dfvm;
import defpackage.dfvn;
import defpackage.dfvo;
import defpackage.dfwa;
import defpackage.dfwb;
import defpackage.dfwd;
import defpackage.dfwe;
import defpackage.dfwk;
import defpackage.dfwv;
import defpackage.dfwz;
import defpackage.dfzg;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    private static final Feature[] sG = new Feature[0];
    dfwk b;
    public final Context c;
    public final Looper d;
    public final Handler e;
    public IGmsServiceBroker h;
    public dfvk i;
    public final int l;
    public volatile String m;
    public volatile dfzg n;
    public final dfwa s;
    private final dfwe sH;
    private final dfpj sI;
    public final dfwb t;
    private IInterface x;
    private dfvl y;
    private final String z;
    private volatile String u = null;
    public final Object f = new Object();
    public final Object g = new Object();
    public final ArrayList j = new ArrayList();
    public int k = 1;
    public ConnectionResult o = null;
    public boolean p = false;
    public volatile ConnectionInfo q = null;
    public final AtomicInteger r = new AtomicInteger(0);

    /* compiled from: PG */
    public static final class GmsCallbacks extends IGmsCallbacks.Stub {
        private BaseGmsClient a;
        private final int b;

        public GmsCallbacks(BaseGmsClient baseGmsClient, int i) {
            this.a = baseGmsClient;
            this.b = i;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onAccountValidationComplete(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
            dfwv.o(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.C(i, iBinder, bundle, this.b);
            this.a = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public void onPostInitCompleteWithConnectionInfo(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
            BaseGmsClient baseGmsClient = this.a;
            dfwv.o(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            dfwv.n(connectionInfo);
            baseGmsClient.q = connectionInfo;
            if (baseGmsClient.gK()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                dfwz.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            onPostInitComplete(i, iBinder, connectionInfo.a);
        }
    }

    protected BaseGmsClient(Context context, Looper looper, dfwe dfweVar, dfpj dfpjVar, int i, dfwa dfwaVar, dfwb dfwbVar, String str) {
        dfwv.o(context, "Context must not be null");
        this.c = context;
        dfwv.o(looper, "Looper must not be null");
        this.d = looper;
        dfwv.o(dfweVar, "Supervisor must not be null");
        this.sH = dfweVar;
        dfwv.o(dfpjVar, "API availability must not be null");
        this.sI = dfpjVar;
        this.e = new dfvi(this, looper);
        this.l = i;
        this.s = dfwaVar;
        this.t = dfwbVar;
        this.z = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gJ(int i, IInterface iInterface) {
        dfwk dfwkVar;
        dfwv.a((i == 4) == (iInterface != null));
        synchronized (this.f) {
            this.k = i;
            this.x = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                dfvl dfvlVar = this.y;
                if (dfvlVar != null) {
                    dfwe dfweVar = this.sH;
                    dfwk dfwkVar2 = this.b;
                    String str = dfwkVar2.a;
                    String str2 = dfwkVar2.b;
                    int i2 = dfwkVar2.c;
                    x();
                    dfweVar.e(str, str2, i2, dfvlVar, this.b.d);
                    this.y = null;
                }
            } else if (i == 2 || i == 3) {
                dfvl dfvlVar2 = this.y;
                if (dfvlVar2 != null && (dfwkVar = this.b) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + dfwkVar.a + " on " + dfwkVar.b);
                    dfwe dfweVar2 = this.sH;
                    dfwk dfwkVar3 = this.b;
                    String str3 = dfwkVar3.a;
                    String str4 = dfwkVar3.b;
                    int i3 = dfwkVar3.c;
                    x();
                    dfweVar2.e(str3, str4, i3, dfvlVar2, this.b.d);
                    this.r.incrementAndGet();
                }
                dfvl dfvlVar3 = new dfvl(this, this.r.get());
                this.y = dfvlVar3;
                dfwk dfwkVar4 = new dfwk(y(), d(), dfwe.a, i());
                this.b = dfwkVar4;
                if (dfwkVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(dfwkVar4.a));
                }
                dfwe dfweVar3 = this.sH;
                String str5 = dfwkVar4.a;
                String str6 = dfwkVar4.b;
                int i4 = dfwkVar4.c;
                String x = x();
                boolean z = this.b.d;
                K();
                ConnectionResult b = dfweVar3.b(new dfwd(str5, str6, i4, z), dfvlVar3, x);
                if (!b.b()) {
                    dfwk dfwkVar5 = this.b;
                    Log.w("GmsClient", "unable to connect to service: " + dfwkVar5.a + " on " + dfwkVar5.b);
                    int i5 = b.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    if (b.d != null) {
                        bundle = new Bundle();
                        bundle.putParcelable(RcsIntents.EXTRA_PENDING_INTENT, b.d);
                    }
                    D(i5, bundle, this.r.get());
                }
            } else if (i == 4) {
                dfwv.n(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final void A() {
        int i = this.sI.i(this.c, a());
        if (i == 0) {
            l(new dfvm(this));
        } else {
            gJ(1, null);
            E(new dfvm(this), i, null);
        }
    }

    protected final void B() {
        if (!p()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected void C(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.e.sendMessage(this.e.obtainMessage(1, i2, -1, new dfvn(this, i, iBinder, bundle)));
    }

    public final void D(int i, Bundle bundle, int i2) {
        this.e.sendMessage(this.e.obtainMessage(7, i2, -1, new dfvo(this, i, bundle)));
    }

    protected final void E(dfvk dfvkVar, int i, PendingIntent pendingIntent) {
        this.i = dfvkVar;
        this.e.sendMessage(this.e.obtainMessage(3, this.r.get(), i, pendingIntent));
    }

    public final boolean F(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            if (this.k != i) {
                return false;
            }
            gJ(i2, iInterface);
            return true;
        }
    }

    public final boolean G() {
        return this.q != null;
    }

    public boolean H() {
        return false;
    }

    public Feature[] I() {
        throw null;
    }

    protected void K() {
        throw null;
    }

    public void L() {
        System.currentTimeMillis();
    }

    public int a() {
        throw null;
    }

    public abstract IInterface b(IBinder iBinder);

    public abstract String c();

    protected abstract String d();

    protected Bundle g() {
        return new Bundle();
    }

    public boolean gK() {
        return false;
    }

    public Feature[] gL() {
        return sG;
    }

    public boolean h() {
        return false;
    }

    protected boolean i() {
        return a() >= 211700000;
    }

    public final String j() {
        return this.u;
    }

    public void l(dfvk dfvkVar) {
        this.i = dfvkVar;
        gJ(2, null);
    }

    public void m() {
        this.r.incrementAndGet();
        synchronized (this.j) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                ((dfvj) this.j.get(i)).e();
            }
            this.j.clear();
        }
        synchronized (this.g) {
            this.h = null;
        }
        gJ(1, null);
    }

    public final void n(String str) {
        this.u = str;
        m();
    }

    public final void o(IAccountAccessor iAccountAccessor, Set set) {
        AttributionSource attributionSource;
        String attributionTag;
        String attributionTag2;
        Bundle g = g();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.m;
        } else if (this.n == null || (attributionSource = this.n.a) == null) {
            attributionTag2 = this.m;
        } else {
            attributionTag = attributionSource.getAttributionTag();
            attributionTag2 = attributionTag == null ? this.m : attributionSource.getAttributionTag();
        }
        String str = attributionTag2;
        int i = this.l;
        int i2 = dfpj.c;
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.c.getPackageName();
        getServiceRequest.i = g;
        if (set != null) {
            getServiceRequest.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (h()) {
            Account v = v();
            if (v == null) {
                v = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = v;
            if (iAccountAccessor != null) {
                getServiceRequest.g = iAccountAccessor.asBinder();
            }
        } else if (H()) {
            getServiceRequest.j = v();
        }
        getServiceRequest.k = I();
        getServiceRequest.l = gL();
        if (gK()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.g) {
                IGmsServiceBroker iGmsServiceBroker = this.h;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new GmsCallbacks(this, this.r.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.r.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.r.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.r.get());
        }
    }

    public final boolean p() {
        boolean z;
        synchronized (this.f) {
            z = this.k == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.f) {
            int i = this.k;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return true;
    }

    public final Feature[] s() {
        ConnectionInfo connectionInfo = this.q;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void t(dfsy dfsyVar) {
        dfsyVar.a.i.o.post(new dfsx(dfsyVar));
    }

    public final void u() {
        if (!p() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public Account v() {
        throw null;
    }

    public final IInterface w() {
        IInterface iInterface;
        synchronized (this.f) {
            if (this.k == 5) {
                throw new DeadObjectException();
            }
            B();
            iInterface = this.x;
            dfwv.o(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String x() {
        String str = this.z;
        return str == null ? this.c.getClass().getName() : str;
    }

    protected String y() {
        return "com.google.android.gms";
    }

    public Set z() {
        throw null;
    }
}
