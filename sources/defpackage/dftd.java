package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dftd implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static dftd d;
    public final Context g;
    public final dfpi h;
    public final dfwl i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData q;
    private dfxf r;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public dfsq m = null;
    public final Set n = new cmj();
    private final Set s = new cmj();

    private dftd(Context context, Looper looper, dfpi dfpiVar) {
        this.p = true;
        this.g = context;
        dgxx dgxxVar = new dgxx(looper, this);
        this.o = dgxxVar;
        this.h = dfpiVar;
        this.i = new dfwl(dfpiVar);
        PackageManager packageManager = context.getPackageManager();
        if (dfyn.b == null) {
            dfyn.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (dfyn.b.booleanValue()) {
            this.p = false;
        }
        dgxxVar.sendMessage(dgxxVar.obtainMessage(6));
    }

    public static Status a(dfrz dfrzVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + dfrzVar.a.c + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    public static dftd c(Context context) {
        dftd dftdVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (dfwe.b) {
                    handlerThread = dfwe.c;
                    if (handlerThread == null) {
                        dfwe.c = new HandlerThread("GoogleApiHandler", 9);
                        dfwe.c.start();
                        handlerThread = dfwe.c;
                    }
                }
                d = new dftd(context.getApplicationContext(), handlerThread.getLooper(), dfpi.a);
            }
            dftdVar = d;
        }
        return dftdVar;
    }

    private final dfsz j(dfra dfraVar) {
        Map map = this.l;
        dfrz dfrzVar = dfraVar.h;
        dfsz dfszVar = (dfsz) map.get(dfrzVar);
        if (dfszVar == null) {
            dfszVar = new dfsz(this, dfraVar);
            this.l.put(dfrzVar, dfszVar);
        }
        if (dfszVar.l()) {
            this.s.add(dfrzVar);
        }
        dfszVar.b();
        return dfszVar;
    }

    private final dfxf k() {
        if (this.r == null) {
            this.r = new dfxo(this.g, dfxg.a);
        }
        return this.r;
    }

    private final void l() {
        TelemetryData telemetryData = this.q;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.q = null;
        }
    }

    final dfsz b(dfrz dfrzVar) {
        return (dfsz) this.l.get(dfrzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dhri r9, int r10, defpackage.dfra r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L74
            dfrz r3 = r11.h
            boolean r11 = r8.h()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            dfwz r11 = defpackage.dfwz.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            dfsz r2 = r8.b(r3)
            if (r2 == 0) goto L47
            dfqr r4 = r2.b
            boolean r5 = r4 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            com.google.android.gms.common.internal.BaseGmsClient r4 = (com.google.android.gms.common.internal.BaseGmsClient) r4
            boolean r5 = r4.G()
            if (r5 == 0) goto L47
            boolean r5 = r4.q()
            if (r5 != 0) goto L47
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.dftr.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            dftr r0 = new dftr
            r4 = 0
            if (r1 == 0) goto L53
            long r6 = java.lang.System.currentTimeMillis()
            goto L54
        L53:
            r6 = r4
        L54:
            if (r1 == 0) goto L5a
            long r4 = android.os.SystemClock.elapsedRealtime()
        L5a:
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
        L62:
            if (r0 == 0) goto L75
            dhrm r9 = r9.a
            android.os.Handler r10 = r1.o
            r10.getClass()
            dfst r11 = new dfst
            r11.<init>()
            r9.o(r11, r0)
            return
        L74:
            r1 = r8
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dftd.d(dhri, int, dfra):void");
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (i(connectionResult, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(dfsq dfsqVar) {
        synchronized (c) {
            if (this.m != dfsqVar) {
                this.m = dfsqVar;
                this.n.clear();
            }
            this.n.addAll(dfsqVar.e);
        }
    }

    final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = dfwz.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int b2 = this.i.b(203400000);
        return b2 == -1 || b2 == 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Feature[] b2;
        dfsz dfszVar = null;
        switch (message.what) {
            case 1:
                this.e = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.o.removeMessages(12);
                for (dfrz dfrzVar : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, dfrzVar), this.e);
                }
                return true;
            case 2:
                throw null;
            case 3:
                for (dfsz dfszVar2 : this.l.values()) {
                    dfszVar2.a();
                    dfszVar2.b();
                }
                return true;
            case 4:
            case 8:
            case 13:
                dftx dftxVar = (dftx) message.obj;
                dfsz dfszVar3 = (dfsz) this.l.get(dftxVar.c.h);
                if (dfszVar3 == null) {
                    dfszVar3 = j(dftxVar.c);
                }
                if (!dfszVar3.l() || this.k.get() == dftxVar.b) {
                    dfszVar3.c(dftxVar.a);
                } else {
                    dftxVar.a.d(a);
                    dfszVar3.j();
                }
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        dfsz dfszVar4 = (dfsz) it.next();
                        if (dfszVar4.e == i) {
                            dfszVar = dfszVar4;
                        }
                    }
                }
                if (dfszVar == null) {
                    Log.wtf("GoogleApiManager", a.f(i, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                } else if (connectionResult.c == 13) {
                    int i2 = dfqf.d;
                    dfszVar.d(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + connectionResult.e));
                } else {
                    dfszVar.d(a(dfszVar.c, connectionResult));
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    dfsc.b((Application) this.g.getApplicationContext());
                    dfsc.a.a(new dfsu(this));
                    dfsc dfscVar = dfsc.a;
                    if (!dfscVar.c.get()) {
                        if (!dfyx.b()) {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!dfscVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                dfscVar.b.set(true);
                            }
                        }
                    }
                    if (!dfscVar.c()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                j((dfra) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    dfsz dfszVar5 = (dfsz) this.l.get(message.obj);
                    dfwv.d(dfszVar5.i.o);
                    if (dfszVar5.f) {
                        dfszVar5.b();
                    }
                }
                return true;
            case 10:
                cmi cmiVar = new cmi((cmj) this.s);
                while (cmiVar.hasNext()) {
                    dfsz dfszVar6 = (dfsz) this.l.remove((dfrz) cmiVar.next());
                    if (dfszVar6 != null) {
                        dfszVar6.j();
                    }
                }
                this.s.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    dfsz dfszVar7 = (dfsz) this.l.get(message.obj);
                    dfwv.d(dfszVar7.i.o);
                    if (dfszVar7.f) {
                        dfszVar7.k();
                        dftd dftdVar = dfszVar7.i;
                        dfszVar7.d(dftdVar.h.h(dftdVar.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        dfszVar7.b.n("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    ((dfsz) this.l.get(message.obj)).m(true);
                }
                return true;
            case 14:
                dfsr dfsrVar = (dfsr) message.obj;
                dfrz dfrzVar2 = dfsrVar.a;
                if (this.l.containsKey(dfrzVar2)) {
                    dfsrVar.b.b(Boolean.valueOf(((dfsz) this.l.get(dfrzVar2)).m(false)));
                } else {
                    dfsrVar.b.b(false);
                }
                return true;
            case 15:
                dfta dftaVar = (dfta) message.obj;
                if (this.l.containsKey(dftaVar.a)) {
                    dfsz dfszVar8 = (dfsz) this.l.get(dftaVar.a);
                    if (dfszVar8.g.contains(dftaVar) && !dfszVar8.f) {
                        if (dfszVar8.b.p()) {
                            dfszVar8.e();
                        } else {
                            dfszVar8.b();
                        }
                    }
                }
                return true;
            case 16:
                dfta dftaVar2 = (dfta) message.obj;
                if (this.l.containsKey(dftaVar2.a)) {
                    dfsz dfszVar9 = (dfsz) this.l.get(dftaVar2.a);
                    if (dfszVar9.g.remove(dftaVar2)) {
                        dfszVar9.i.o.removeMessages(15, dftaVar2);
                        dfszVar9.i.o.removeMessages(16, dftaVar2);
                        Feature feature = dftaVar2.b;
                        ArrayList arrayList = new ArrayList(dfszVar9.a.size());
                        for (dfrx dfrxVar : dfszVar9.a) {
                            if ((dfrxVar instanceof dfrr) && (b2 = ((dfrr) dfrxVar).b(dfszVar9)) != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= b2.length) {
                                        break;
                                    }
                                    if (dfwq.a(b2[i3], feature)) {
                                        arrayList.add(dfrxVar);
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            dfrx dfrxVar2 = (dfrx) arrayList.get(i4);
                            dfszVar9.a.remove(dfrxVar2);
                            dfrxVar2.e(new dfrq(feature));
                        }
                    }
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                dfts dftsVar = (dfts) message.obj;
                if (dftsVar.c == 0) {
                    k().a(new TelemetryData(dftsVar.b, Arrays.asList(dftsVar.a)));
                } else {
                    TelemetryData telemetryData = this.q;
                    if (telemetryData != null) {
                        List list = telemetryData.b;
                        if (telemetryData.a != dftsVar.b || (list != null && list.size() >= dftsVar.d)) {
                            this.o.removeMessages(17);
                            l();
                        } else {
                            TelemetryData telemetryData2 = this.q;
                            MethodInvocation methodInvocation = dftsVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(dftsVar.a);
                        this.q = new TelemetryData(dftsVar.b, arrayList2);
                        Handler handler2 = this.o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), dftsVar.c);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    final boolean i(ConnectionResult connectionResult, int i) {
        Context context = this.g;
        if (dfzh.a(context)) {
            return false;
        }
        dfpi dfpiVar = this.h;
        PendingIntent k = connectionResult.a() ? connectionResult.d : dfpiVar.k(context, connectionResult.c, null);
        if (k == null) {
            return false;
        }
        dfpiVar.g(context, connectionResult.c, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, k, i, true), dgxs.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        return true;
    }
}
