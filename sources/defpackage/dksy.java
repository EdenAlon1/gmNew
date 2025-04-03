package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksy {
    public static dfmc b;
    private static dfld c;
    private static dkpm f;
    private static dfpi g;
    private static ctwb h;
    private static dhvo i;
    private static errl j;
    public static final dktn a = new dktn("RcsAnalyticsUtil");
    private static final SparseArray d = new SparseArray();
    private static final AtomicInteger e = new AtomicInteger();

    public static int a(final String str) {
        dflr dflrVar;
        if (!h()) {
            dkty.d(a, "Analytics are disabled. Ignoring UMA timer %s", str);
            return -1;
        }
        final dfmc dfmcVar = b;
        dfmcVar.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = dfmcVar.d;
        final dflt dfltVar = dfmc.k;
        reentrantReadWriteLock.writeLock().lock();
        try {
            dflq dflqVar = (dflq) dfmcVar.h.get(str);
            if (dflqVar == null) {
                dflrVar = (dfmb) dfmcVar.b(str, new emyl() { // from class: dflo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return new dfmb(dfmc.this, str, dfltVar);
                    }
                });
            } else {
                try {
                    dflr dflrVar2 = (dflr) dflqVar;
                    if (!dfltVar.equals(dflrVar2.f)) {
                        throw new IllegalArgumentException(a.t(str, "alias mismatch: "));
                    }
                    dfmcVar.d.writeLock().unlock();
                    dflrVar = dflrVar2;
                } catch (ClassCastException e2) {
                    throw new IllegalArgumentException(a.t(str, "another type of counter exists with name: "), e2);
                }
            }
            dfma dfmaVar = new dfma((dfmb) dflrVar);
            int andIncrement = e.getAndIncrement();
            SparseArray sparseArray = d;
            synchronized (sparseArray) {
                sparseArray.put(andIncrement, dfmaVar);
            }
            return andIncrement;
        } finally {
            dfmcVar.d.writeLock().unlock();
        }
    }

    public static eowq b(Context context) {
        String m = dkvt.g(context).m();
        eowp eowpVar = (eowp) eowq.a.createBuilder();
        if (m != null) {
            if (m.length() >= 5) {
                int parseInt = Integer.parseInt(m.substring(0, 3));
                eowpVar.copyOnWrite();
                eowq eowqVar = (eowq) eowpVar.instance;
                eowqVar.b = 1 | eowqVar.b;
                eowqVar.c = parseInt;
                int parseInt2 = Integer.parseInt(m.substring(3));
                eowpVar.copyOnWrite();
                eowq eowqVar2 = (eowq) eowpVar.instance;
                eowqVar2.b |= 2;
                eowqVar2.d = parseInt2;
                return (eowq) eowpVar.build();
            }
        }
        dkty.d(a, "Invalid mcc/mnc from system %s.", m);
        eowpVar.copyOnWrite();
        eowq eowqVar3 = (eowq) eowpVar.instance;
        eowqVar3.b = 1 | eowqVar3.b;
        eowqVar3.c = 0;
        eowpVar.copyOnWrite();
        eowq eowqVar4 = (eowq) eowpVar.instance;
        eowqVar4.b |= 2;
        eowqVar4.d = 0;
        return (eowq) eowpVar.build();
    }

    public static void c(int i2) {
        if (i2 == -1) {
            dkty.d(a, "CancelTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            sparseArray.remove(i2);
        }
    }

    public static void d(String str) {
        if (!h()) {
            dkty.d(a, "Analytics are disabled. Ignoring UMA counter %s", str);
            return;
        }
        dfmc dfmcVar = b;
        dfmcVar.getClass();
        dfmcVar.c(str).a(0L, 1L, dfmc.b);
        f();
    }

    public static void e(Context context, dkpm dkpmVar, dfpi dfpiVar, ctwb ctwbVar, errl errlVar, dhvo dhvoVar) {
        g = dfpiVar;
        h = ctwbVar;
        i = dhvoVar;
        j = errlVar;
        dfpiVar.getClass();
        if (dfpiVar.i(context, 12200000) != 0) {
            dkty.d(a, "Google Play Service unavailable. Clearcut logging is disabled!", new Object[0]);
            return;
        }
        f = dkpmVar;
        List list = dfld.m;
        c = new dfla(context, "ANDROID_MESSAGING").c();
        b = new dfmc(c, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
        d.clear();
        e.set(0);
    }

    public static void f() {
        if (!h()) {
            dkty.r(a, "sendCounters invoked though logging disabled!", new Object[0]);
            return;
        }
        dkty.l(a, "Sending counters: %s", b);
        dfmc dfmcVar = b;
        dfmcVar.getClass();
        dfmcVar.f();
    }

    public static void g(int i2) {
        dfma dfmaVar;
        if (i2 == -1) {
            dkty.d(a, "StopTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            dfmaVar = (dfma) sparseArray.get(i2);
            sparseArray.remove(i2);
        }
        if (dfmaVar == null) {
            dkty.r(a, "StopTimer: Unknown UMA timer key %d", Integer.valueOf(i2));
            return;
        }
        dfmaVar.a.a(SystemClock.elapsedRealtime() - dfmaVar.b, 1L, dfmc.b);
        f();
    }

    public static boolean h() {
        if (c == null) {
            return false;
        }
        return ((Boolean) dimn.E().f().a()).booleanValue();
    }

    public static void i(Context context) {
        eoli eoliVar;
        boolean isDataEnabled;
        eouk eoukVar;
        eosi eosiVar = (eosi) eosj.a.createBuilder();
        eosiVar.copyOnWrite();
        eosj eosjVar = (eosj) eosiVar.instance;
        int i2 = 8;
        eosjVar.c = 8;
        eosjVar.b |= 1;
        eole eoleVar = (eole) eoli.a.createBuilder();
        ctwb ctwbVar = h;
        ctwbVar.getClass();
        ctwi k = ctwbVar.k();
        String u = k.u();
        if (u != null) {
            eoleVar.copyOnWrite();
            eoli eoliVar2 = (eoli) eoleVar.instance;
            eoliVar2.b |= 1;
            eoliVar2.c = u;
        }
        String q = k.q();
        if (q != null) {
            eoleVar.copyOnWrite();
            eoli eoliVar3 = (eoli) eoleVar.instance;
            eoliVar3.b |= 2;
            eoliVar3.d = q;
        }
        if (h()) {
            dkpm dkpmVar = f;
            dkpmVar.getClass();
            int i3 = true != dkpmVar.k() ? 1 : 2;
            eoleVar.copyOnWrite();
            eoli eoliVar4 = (eoli) eoleVar.instance;
            eoliVar4.e = i3 - 1;
            eoliVar4.b |= 4;
            eoliVar = (eoli) eoleVar.build();
        } else {
            dkty.d(a, "RcsAnalytics is NOT initialized, event will be ignored", new Object[0]);
            eoliVar = (eoli) eoleVar.build();
        }
        eosiVar.copyOnWrite();
        eosj eosjVar2 = (eosj) eosiVar.instance;
        eoliVar.getClass();
        eosjVar2.f = eoliVar;
        eosjVar2.b |= 16;
        int i4 = 3;
        int i5 = context.getSharedPreferences("bugle", 0).getInt("seamless_provisioning_progress", 0) == 2 ? 3 : 2;
        eosiVar.copyOnWrite();
        eosj eosjVar3 = (eosj) eosiVar.instance;
        eosjVar3.g = i5 - 1;
        eosjVar3.b |= 32;
        eowq b2 = b(context);
        eosiVar.copyOnWrite();
        eosj eosjVar4 = (eosj) eosiVar.instance;
        b2.getClass();
        eosjVar4.h = b2;
        eosjVar4.b |= 64;
        ctwb ctwbVar2 = h;
        ctwbVar2.getClass();
        ctwi k2 = ctwbVar2.k();
        int i6 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        eohu eohuVar = (eohu) eohv.b.createBuilder();
        boolean C = k2.C();
        eohuVar.copyOnWrite();
        eohv eohvVar = (eohv) eohuVar.instance;
        eohvVar.c |= 4;
        eohvVar.f = C;
        eohuVar.copyOnWrite();
        eohv eohvVar2 = (eohv) eohuVar.instance;
        eohvVar2.c |= 16;
        eohvVar2.h = i6 != 0;
        isDataEnabled = dkvt.g(context).a.isDataEnabled();
        eohuVar.copyOnWrite();
        eohv eohvVar3 = (eohv) eohuVar.instance;
        eohvVar3.c |= 32;
        eohvVar3.i = isDataEnabled;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            eohuVar.copyOnWrite();
            eohv eohvVar4 = (eohv) eohuVar.instance;
            eohvVar4.e = 6;
            eohvVar4.c |= 2;
            eohuVar.copyOnWrite();
            eohv eohvVar5 = (eohv) eohuVar.instance;
            eohvVar5.d = 0;
            eohvVar5.c |= 1;
        } else {
            switch (dksx.a[activeNetworkInfo.getDetailedState().ordinal()]) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    break;
                case 8:
                    i2 = 9;
                    break;
                case 9:
                    i2 = 10;
                    break;
                case 10:
                    i2 = 11;
                    break;
                case 11:
                    i2 = 12;
                    break;
                case 12:
                    i2 = 13;
                    break;
                case 13:
                    i2 = 14;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            eohuVar.copyOnWrite();
            eohv eohvVar6 = (eohv) eohuVar.instance;
            eohvVar6.e = i2 - 1;
            eohvVar6.c |= 2;
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                i4 = 2;
            } else if (type != 1) {
                i4 = type != 6 ? 5 : 4;
            }
            eohuVar.copyOnWrite();
            eohv eohvVar7 = (eohv) eohuVar.instance;
            eohvVar7.d = i4 - 1;
            eohvVar7.c |= 1;
        }
        eohv eohvVar8 = (eohv) eohuVar.build();
        eosiVar.copyOnWrite();
        eosj eosjVar5 = (eosj) eosiVar.instance;
        eohvVar8.getClass();
        eosjVar5.d = eohvVar8;
        eosjVar5.b |= 2;
        eosiVar.copyOnWrite();
        eosj eosjVar6 = (eosj) eosiVar.instance;
        eosjVar6.e = 6;
        eosjVar6.b |= 4;
        eosj eosjVar7 = (eosj) eosiVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_RCS_PROVISIONING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eosjVar7.getClass();
        eolvVar2.t = eosjVar7;
        eolvVar2.b |= 4096;
        if (!h()) {
            dktn dktnVar = a;
            eolt b3 = eolt.b(((eolv) eoluVar.instance).j);
            if (b3 == null) {
                b3 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            dkty.d(dktnVar, "Analytics are disabled. Ignoring Clearcut event of type %d", Integer.valueOf(b3.dk));
            return;
        }
        int intValue = ((Integer) dimn.E().D().a()).intValue();
        if (intValue == -1) {
            eoukVar = null;
        } else {
            eouj eoujVar = (eouj) eouk.a.createBuilder();
            eoujVar.copyOnWrite();
            eouk eoukVar2 = (eouk) eoujVar.instance;
            eoukVar2.b |= 1;
            eoukVar2.c = intValue;
            eoukVar = (eouk) eoujVar.build();
        }
        if (eoukVar != null) {
            eoluVar.copyOnWrite();
            eolv eolvVar3 = (eolv) eoluVar.instance;
            eolvVar3.s = eoukVar;
            eolvVar3.b |= 2048;
        }
        dfld dfldVar = c;
        dfldVar.getClass();
        dflc i7 = dfldVar.i(eoluVar.build());
        i7.i(-1);
        if (!dizg.B()) {
            i7.c();
            return;
        }
        dhvo dhvoVar = i;
        dhvoVar.getClass();
        ListenableFuture a2 = duin.a(dhvoVar.b());
        dksw dkswVar = new dksw(i7);
        errl errlVar = j;
        errlVar.getClass();
        elfr.l(a2, dkswVar, errlVar);
    }
}
