package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfwf implements ServiceConnection, dfwi {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final dfwd e;
    public ComponentName f;
    final /* synthetic */ dfwh g;

    public dfwf(dfwh dfwhVar, dfwd dfwdVar) {
        this.g = dfwhVar;
        this.e = dfwdVar;
    }

    static /* bridge */ /* synthetic */ ConnectionResult c(dfwf dfwfVar, String str) {
        Intent component;
        ConnectionResult connectionResult;
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        try {
            Context context = dfwfVar.g.e;
            dfwd dfwdVar = dfwfVar.e;
            Uri uri = dfxb.a;
            String str2 = dfwdVar.a;
            if (str2 != null) {
                component = null;
                if (dfwdVar.e) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("serviceActionBundleKey", str2);
                    try {
                        acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(dfxb.a);
                    } catch (RemoteException | IllegalArgumentException e) {
                        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundle = null;
                    }
                    if (acquireUnstableContentProviderClient == null) {
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                    try {
                        bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                        acquireUnstableContentProviderClient.release();
                        if (bundle != null) {
                            Intent intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                            if (intent != null) {
                                component = intent;
                            } else {
                                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                                if (pendingIntent != null) {
                                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                    throw new dfww(new ConnectionResult(25, pendingIntent));
                                }
                            }
                        }
                        if (component == null) {
                            Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                        }
                    } catch (Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                }
                if (component == null) {
                    component = new Intent(str2).setPackage(dfwdVar.b);
                }
            } else {
                component = new Intent().setComponent(dfwdVar.c);
            }
            Intent intent2 = component;
            dfwfVar.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(dfyy.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                dfwh dfwhVar = dfwfVar.g;
                boolean d = dfwhVar.g.d(dfwhVar.e, str, intent2, dfwfVar, dfwfVar.e.d);
                dfwfVar.c = d;
                if (d) {
                    dfwfVar.g.f.sendMessageDelayed(dfwfVar.g.f.obtainMessage(1, dfwfVar.e), dfwfVar.g.h);
                    connectionResult = ConnectionResult.a;
                } else {
                    dfwfVar.b = 2;
                    try {
                        dfwh dfwhVar2 = dfwfVar.g;
                        dfwhVar2.g.b(dfwhVar2.e, dfwfVar);
                    } catch (IllegalArgumentException unused) {
                    }
                    connectionResult = new ConnectionResult(16);
                }
                return connectionResult;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (dfww e2) {
            return e2.a;
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            this.g.f.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
