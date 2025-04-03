package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Calendar;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djjc implements djkh {
    public static final diyy a = dizd.a(180131982);
    public static final diyy b = diyv.b("log_sip_disabled_by_bugle_ignore_reason");
    public final Context c;
    public final dikt d;
    public final String e = UUID.randomUUID().toString();
    public final long f = Calendar.getInstance().getTimeInMillis();
    public long g = 0;
    public final deva h;
    public final deva i;
    public final deva j;
    public final deva k;
    final deva l;
    public final deva m;
    public final deva n;
    public final deva o;
    final deva p;
    final deva q;
    public Optional r;
    private final dkpq s;
    private final dkpp t;
    private final dkcp u;
    private final devc v;

    public djjc(Context context, dkpq dkpqVar, dkpp dkppVar, dikt diktVar, dkcp dkcpVar) {
        devc devcVar = new devc("uptime_tracker");
        this.v = devcVar;
        this.h = new deuv(devcVar, "last_registered_ts", 0L);
        this.i = new deuv(devcVar, "last_unregistered_ts", 0L);
        this.j = new deuv(devcVar, "last_ignore_ts", 0L);
        this.k = new deuy(devcVar, "last_ignore_reason", 0);
        this.l = new deuy(devcVar, "last_unregistered_reason", 0);
        this.m = new deuy(devcVar, "previous_state", 0);
        this.n = new deuy(devcVar, "current_state", 0);
        this.o = new deuy(devcVar, "last_registered_network_type", 0);
        this.p = new deuv(devcVar, "previous_event_ts", 0L);
        this.q = new deuy(devcVar, "previously_logged_state", 0);
        this.c = context;
        this.s = dkpqVar;
        this.t = dkppVar;
        this.d = diktVar;
        this.r = Optional.empty();
        this.u = dkcpVar;
    }

    public static final boolean o(eytk eytkVar) {
        return eytkVar != eytk.RCS_UPTIME_IGNORE_REASON_UNKNOWN;
    }

    private final NetworkInfo s() {
        return dkvo.f(this.c).d();
    }

    private final void t(dilc dilcVar) {
        eytk c = dilcVar == dilc.SHUTDOWN ? eytk.RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN : c();
        if (o(c)) {
            k(c);
        } else {
            m(dilcVar);
        }
    }

    private static final int u(deva devaVar) {
        int a2 = eytm.a(((Integer) devaVar.d()).intValue());
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public final eytf a() {
        eytf eytfVar = (eytf) b(Calendar.getInstance().getTimeInMillis()).toBuilder();
        if (r(2)) {
            eytk d = d(this.k);
            eytfVar.copyOnWrite();
            eyti eytiVar = (eyti) eytfVar.instance;
            eytiVar.e = d.j;
            eytiVar.b |= 4;
            return eytfVar;
        }
        if (r(3)) {
            int a2 = eyto.a(((Integer) this.l.d()).intValue());
            if (a2 == 0) {
                a2 = 1;
            }
            eytfVar.copyOnWrite();
            eyti eytiVar2 = (eyti) eytfVar.instance;
            eytiVar2.f = a2 - 1;
            eytiVar2.b |= 8;
        }
        return eytfVar;
    }

    final eyti b(long j) {
        eytf eytfVar = (eytf) eyti.a.createBuilder();
        eytfVar.copyOnWrite();
        eyti eytiVar = (eyti) eytfVar.instance;
        String str = this.e;
        str.getClass();
        eytiVar.b |= 512;
        eytiVar.l = str;
        eytfVar.copyOnWrite();
        eyti eytiVar2 = (eyti) eytfVar.instance;
        eytiVar2.b |= 1024;
        eytiVar2.m = this.f;
        long j2 = this.g + 1;
        this.g = j2;
        eytfVar.copyOnWrite();
        eyti eytiVar3 = (eyti) eytfVar.instance;
        eytiVar3.b |= 2048;
        eytiVar3.n = j2;
        int u = u(this.n);
        eytfVar.copyOnWrite();
        eyti eytiVar4 = (eyti) eytfVar.instance;
        eytiVar4.c = u - 1;
        eytiVar4.b |= 1;
        int u2 = u(this.m);
        eytfVar.copyOnWrite();
        eyti eytiVar5 = (eyti) eytfVar.instance;
        eytiVar5.d = u2 - 1;
        eytiVar5.b |= 2;
        long longValue = ((Long) this.j.d()).longValue();
        eytfVar.copyOnWrite();
        eyti eytiVar6 = (eyti) eytfVar.instance;
        eytiVar6.b |= 64;
        eytiVar6.i = longValue;
        long longValue2 = ((Long) this.h.d()).longValue();
        eytfVar.copyOnWrite();
        eyti eytiVar7 = (eyti) eytfVar.instance;
        eytiVar7.b |= 16;
        eytiVar7.g = longValue2;
        long longValue3 = ((Long) this.i.d()).longValue();
        eytfVar.copyOnWrite();
        eyti eytiVar8 = (eyti) eytfVar.instance;
        eytiVar8.b |= 32;
        eytiVar8.h = longValue3;
        eytg eytgVar = (eytg) eyth.a.createBuilder();
        int u3 = u(this.q);
        eytgVar.copyOnWrite();
        eyth eythVar = (eyth) eytgVar.instance;
        eythVar.d = u3 - 1;
        eythVar.b |= 2;
        long longValue4 = ((Long) this.p.d()).longValue();
        eytgVar.copyOnWrite();
        eyth eythVar2 = (eyth) eytgVar.instance;
        eythVar2.b |= 1;
        eythVar2.c = longValue4;
        eytfVar.copyOnWrite();
        eyti eytiVar9 = (eyti) eytfVar.instance;
        eyth eythVar3 = (eyth) eytgVar.build();
        eythVar3.getClass();
        eytiVar9.p = eythVar3;
        eytiVar9.b |= 8192;
        eytfVar.copyOnWrite();
        eyti eytiVar10 = (eyti) eytfVar.instance;
        eytiVar10.b |= 16384;
        eytiVar10.q = j;
        int a2 = ezel.a(((Integer) this.o.d()).intValue());
        if (a2 != 0) {
            eytfVar.copyOnWrite();
            eyti eytiVar11 = (eyti) eytfVar.instance;
            eytiVar11.k = a2 - 1;
            eytiVar11.b |= 256;
        }
        int q = q();
        eytfVar.copyOnWrite();
        eyti eytiVar12 = (eyti) eytfVar.instance;
        eytiVar12.j = q - 1;
        eytiVar12.b |= 128;
        return (eyti) eytfVar.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        return defpackage.eytk.RCS_UPTIME_IGNORE_MISSING_PERMISSION;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eytk c() {
        /*
            r5 = this;
            java.lang.String[] r0 = defpackage.dkuy.a
            int r1 = r0.length
            r1 = 0
            r2 = r1
        L5:
            android.content.Context r3 = r5.c
            r4 = 3
            if (r2 >= r4) goto L16
            r4 = r0[r2]
            boolean r3 = defpackage.dkve.a(r3, r4)
            if (r3 != 0) goto L13
            goto L38
        L13:
            int r2 = r2 + 1
            goto L5
        L16:
            boolean r0 = defpackage.ctid.b
            if (r0 == 0) goto L27
            dkvt r0 = defpackage.dkvt.g(r3)
            android.telephony.TelephonyManager r0 = r0.a
            boolean r0 = r0.hasCarrierPrivileges()
            if (r0 == 0) goto L27
            goto L3b
        L27:
            java.lang.String r0 = "android.permission.READ_PRIVILEGED_PHONE_STATE"
            boolean r0 = defpackage.dkve.a(r3, r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = defpackage.dkve.a(r3, r0)
            if (r0 == 0) goto L38
            goto L3b
        L38:
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_MISSING_PERMISSION
            return r0
        L3b:
            dkcp r0 = r5.u
            j$.util.Optional r0 = r0.j()
            djiz r2 = new djiz
            r2.<init>()
            j$.util.Optional r0 = r0.map(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5d
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_NO_VALID_CONFIG
            return r0
        L5d:
            dkpq r0 = r5.s
            boolean r0 = r0.f()
            if (r0 != 0) goto L68
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_NO_SIM
            return r0
        L68:
            dkcp r0 = r5.u
            boolean r0 = r0.y()
            if (r0 == 0) goto Ld1
            android.net.NetworkInfo r0 = r5.s()
            if (r0 == 0) goto La7
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto La7
            diyy r0 = defpackage.djjc.b
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La4
            j$.util.Optional r0 = r5.r
            djjb r1 = new djjb
            r1.<init>()
            j$.util.Optional r0 = r0.map(r1)
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La4
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE
            return r0
        La4:
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_REASON_UNKNOWN
            return r0
        La7:
            android.net.NetworkInfo r0 = r5.s()
            if (r0 != 0) goto Lae
            goto Lce
        Lae:
            android.net.NetworkInfo$DetailedState r2 = r0.getDetailedState()
            android.net.NetworkInfo$DetailedState r3 = android.net.NetworkInfo.DetailedState.BLOCKED
            if (r2 != r3) goto Lce
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Network is blocked. This should not happen. Something is wrong with this device's rcs engine doze exemption setup"
            defpackage.dkty.q(r3, r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "Network info: %s"
            defpackage.dkty.k(r0, r2)
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_BLOCKED_NETWORK
            return r0
        Lce:
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY
            return r0
        Ld1:
            eytk r0 = defpackage.eytk.RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djjc.c():eytk");
    }

    public final eytk d(deva devaVar) {
        eytk b2 = eytk.b(((Integer) devaVar.d()).intValue());
        return b2 == null ? eytk.RCS_UPTIME_IGNORE_REASON_UNKNOWN : b2;
    }

    public final Instant e(deva devaVar) {
        return Instant.ofEpochMilli(((Long) devaVar.d()).longValue());
    }

    public final String f(deva devaVar) {
        int u = u(devaVar) - 1;
        return u != 1 ? u != 2 ? u != 3 ? "RCS_UPTIME_STATE_UNKNOWN" : "RCS_UPTIME_STATE_REGISTERED" : "RCS_UPTIME_STATE_UNREGISTERED" : "RCS_UPTIME_STATE_IGNORE";
    }

    @Override // defpackage.djkh
    public final void g(dilc dilcVar) {
        if (n()) {
            try {
                t(dilcVar);
            } catch (dkvd unused) {
                dkty.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }

    @Override // defpackage.djkh
    public final void h() {
        if (n()) {
            l();
        }
    }

    @Override // defpackage.djkh
    public final void i(dilc dilcVar) {
        if (n()) {
            try {
                t(dilcVar);
            } catch (dkvd unused) {
                dkty.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }

    public final void j(final eytf eytfVar) {
        this.r.ifPresent(new Consumer() { // from class: djja
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                diyy diyyVar = djjc.a;
                boolean hasActiveRegistration = ((dikz) obj).hasActiveRegistration();
                eytf eytfVar2 = eytf.this;
                eytfVar2.copyOnWrite();
                eyti eytiVar = (eyti) eytfVar2.instance;
                eyti eytiVar2 = eyti.a;
                eytiVar.b |= 4096;
                eytiVar.o = hasActiveRegistration;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        djtp f = this.u.f(this.t.l());
        eysv eysvVar = (eysv) eysy.a.createBuilder();
        eysvVar.copyOnWrite();
        eysy eysyVar = (eysy) eysvVar.instance;
        eysyVar.b |= 1;
        eysyVar.c = f != null;
        if (f != null) {
            int e = f.e();
            eysvVar.copyOnWrite();
            eysy eysyVar2 = (eysy) eysvVar.instance;
            eysyVar2.b |= 2;
            eysyVar2.d = e;
            long g = f.g();
            eysvVar.copyOnWrite();
            eysy eysyVar3 = (eysy) eysvVar.instance;
            eysyVar3.b |= 4;
            eysyVar3.e = g;
            int a2 = eysx.a(f.a());
            eysvVar.copyOnWrite();
            eysy eysyVar4 = (eysy) eysvVar.instance;
            int i = a2 - 1;
            if (a2 == 0) {
                throw null;
            }
            eysyVar4.f = i;
            eysyVar4.b |= 8;
        }
        dikt diktVar = this.d;
        Context context = this.c;
        eyti eytiVar = (eyti) eytfVar.build();
        eysy eysyVar5 = (eysy) eysvVar.build();
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eytiVar.getClass();
        ezfoVar.d = eytiVar;
        ezfoVar.c = 6;
        ezfnVar.copyOnWrite();
        ezfo ezfoVar2 = (ezfo) ezfnVar.instance;
        eysyVar5.getClass();
        ezfoVar2.f = eysyVar5;
        ezfoVar2.b |= 8;
        diktVar.i(context, ezfnVar, ezee.RCS_UPTIME_EVENT);
        this.q.e(Integer.valueOf((eytm.a(((eyti) eytfVar.instance).c) != 0 ? r1 : 1) - 1));
        this.p.e(Long.valueOf(((eyti) eytfVar.instance).q));
    }

    public final void k(eytk eytkVar) {
        if (r(2) && ((Integer) this.k.d()).intValue() == eytkVar.j) {
            return;
        }
        dkty.o("Sending RCS uptime ignore event with reason: %s", eytkVar);
        long p = p(2);
        this.k.e(Integer.valueOf(eytkVar.j));
        eytf eytfVar = (eytf) b(p).toBuilder();
        eytfVar.copyOnWrite();
        eyti eytiVar = (eyti) eytfVar.instance;
        eytiVar.e = eytkVar.j;
        eytiVar.b |= 4;
        j(eytfVar);
    }

    public final void l() {
        if (r(4)) {
            return;
        }
        dkty.o("Sending RCS uptime registered event", new Object[0]);
        long p = p(4);
        this.o.e(Integer.valueOf(q() - 1));
        j((eytf) b(p).toBuilder());
    }

    public final void m(dilc dilcVar) {
        if (r(3)) {
            return;
        }
        dkty.o("Sending RCS uptime unregistered event with reason: %s", dilcVar);
        long p = p(3);
        this.l.e(Integer.valueOf(dilcVar.ordinal()));
        eytf eytfVar = (eytf) b(p).toBuilder();
        if (eyto.a(dilcVar.ordinal()) != 0) {
            int a2 = eyto.a(dilcVar.ordinal());
            eytfVar.copyOnWrite();
            eyti eytiVar = (eyti) eytfVar.instance;
            if (a2 == 0) {
                throw null;
            }
            eytiVar.f = a2 - 1;
            eytiVar.b |= 8;
        }
        j(eytfVar);
    }

    public final boolean n() {
        return dkuy.i(this.c) ? dkuy.a(this.c) != 2 : ((Integer) dkrz.f.d()).intValue() == 2;
    }

    final long p(int i) {
        this.m.e((Integer) this.n.d());
        int i2 = i - 1;
        this.n.e(Integer.valueOf(i2));
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 == 1) {
            this.j.e(Long.valueOf(timeInMillis));
            return timeInMillis;
        }
        if (i2 != 3) {
            this.i.e(Long.valueOf(timeInMillis));
            return timeInMillis;
        }
        this.h.e(Long.valueOf(timeInMillis));
        return timeInMillis;
    }

    final int q() {
        NetworkInfo networkInfo;
        try {
            networkInfo = s();
        } catch (dkvd unused) {
            dkty.g("Missing permission to retrieve network info for uptime metric.", new Object[0]);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return 1;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            return 7;
        }
        if (type != 1) {
            return (type == 17 && ((Boolean) a.a()).booleanValue()) ? 15 : 1;
        }
        return 5;
    }

    final boolean r(int i) {
        return ((Integer) this.n.d()).intValue() == i + (-1);
    }
}
