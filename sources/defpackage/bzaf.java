package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzaf {
    private static final cskc f = cskc.g("BugleNetwork", "DittoBroadcastReceiverManager");
    public fcek a;
    public String b;
    public final ffbr c;
    public final akzt d;
    public final elbx e;
    private final Context g;
    private final csjk h;
    private final bbfs i;
    private bzae j = new bzae(this);
    private csmx k;

    public bzaf(Context context, csjk csjkVar, bbfs bbfsVar, ffbr ffbrVar, akzt akztVar, elbx elbxVar) {
        this.g = context;
        this.h = csjkVar;
        this.i = bbfsVar;
        this.c = ffbrVar;
        this.d = akztVar;
        this.e = elbxVar;
    }

    public static boolean i(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    static final int j(Intent intent) {
        int intExtra = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", 1);
        if (intExtra < 0) {
            return -1;
        }
        return intExtra;
    }

    final elfl a(boolean z) {
        String str;
        fcek fcekVar = this.a;
        if (fcekVar != null && (str = this.b) != null) {
            return z ? this.i.f(5, fcekVar, str) : this.i.f(6, fcekVar, str);
        }
        csjb e = f.e();
        e.I("Changes in battery level should not be notified with null values");
        e.A("desktopId", this.a);
        e.A("requestId", this.b);
        e.r();
        return elfo.e(null);
    }

    final elfl b() {
        this.d.c("Bugle.Ditto.Connectivity.UpdateOnWorker.Start.Count");
        ((bzpm) this.c.b()).a(this.a, this.b);
        return elfo.e(null);
    }

    final ListenableFuture c() {
        Optional d = d();
        return d.isEmpty() ? erqt.i(null) : a(((Boolean) d.get()).booleanValue());
    }

    public final Optional d() {
        Intent registerReceiver = this.g.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return Optional.empty();
        }
        int j = j(registerReceiver);
        if (j < 0) {
            return Optional.empty();
        }
        boolean z = false;
        if (j <= 15 && !i(registerReceiver)) {
            z = true;
        }
        return Optional.of(Boolean.valueOf(z));
    }

    final void e(fcek fcekVar, String str) {
        f(fcekVar, str);
        if (this.k == null) {
            bzad bzadVar = new bzad(this);
            this.k = bzadVar;
            csmz csmzVar = (csmz) this.h.a();
            csms csmsVar = (csms) csmv.a.createBuilder();
            csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
            csmsVar.copyOnWrite();
            csmv csmvVar = (csmv) csmsVar.instance;
            csmvVar.c = csmuVar.e;
            csmvVar.b |= 1;
            csmzVar.m(bzadVar, (csmv) csmsVar.build());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        bzae bzaeVar = new bzae(this);
        this.j = bzaeVar;
        this.g.registerReceiver(bzaeVar, intentFilter);
    }

    final void f(fcek fcekVar, String str) {
        this.a = fcekVar;
        this.b = str;
        if (fcekVar != null) {
            b();
            c();
        }
    }

    final void g(fcek fcekVar, String str) {
        this.a = fcekVar;
        this.b = str;
    }

    final void h() {
        csmx csmxVar = this.k;
        if (csmxVar != null) {
            this.k = null;
            csmz csmzVar = (csmz) this.h.a();
            csms csmsVar = (csms) csmv.a.createBuilder();
            csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
            csmsVar.copyOnWrite();
            csmv csmvVar = (csmv) csmsVar.instance;
            csmvVar.c = csmuVar.e;
            csmvVar.b |= 1;
            csmzVar.n(csmxVar, (csmv) csmsVar.build());
        }
        this.g.unregisterReceiver(this.j);
        f(null, null);
        ((bzod) ((bzpm) this.c.b()).a.b()).c.set(bzoc.UNKNOWN);
    }
}
