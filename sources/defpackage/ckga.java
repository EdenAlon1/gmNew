package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckga implements ckfg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ctvs E;
    private final ffbr F;
    private final cguo G;
    private final dkay H;
    private final ffbr I;
    private final cvjg J;
    private final ffbr K;
    private final ffbr L;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final cslx e;
    public final ckgl f;
    public final errl g;
    public final dkvu h;
    public final cort j;
    public final asqs k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    private final ffbr t;
    private final Context u;
    private final ffbr v;
    private final ffbr w;
    private final ckfb x;
    private final ffbr y;
    private final ffbr z;
    private final ReadWriteLock r = new ReentrantReadWriteLock();
    public Optional i = Optional.empty();
    public boolean q = false;
    private final CopyOnWriteArraySet s = new CopyOnWriteArraySet();

    public ckga(ffbr ffbrVar, Context context, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ckfb ckfbVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, cslx cslxVar, ffbr ffbrVar10, ckgl ckglVar, errl errlVar, ffbr ffbrVar11, ffbr ffbrVar12, dkvu dkvuVar, ffbr ffbrVar13, cort cortVar, asqs asqsVar, ffbr ffbrVar14, ctvs ctvsVar, ffbr ffbrVar15, cguo cguoVar, dkay dkayVar, ffbr ffbrVar16, cvjg cvjgVar, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21) {
        this.p = ffbrVar;
        this.u = context;
        this.v = ffbrVar4;
        this.b = ffbrVar3;
        this.z = ffbrVar7;
        this.t = ffbrVar2;
        this.l = ffbrVar14;
        this.c = ffbrVar5;
        this.y = ffbrVar6;
        this.A = ffbrVar8;
        this.d = ffbrVar9;
        this.x = ckfbVar;
        this.e = cslxVar;
        this.w = ffbrVar10;
        this.f = ckglVar;
        this.g = errlVar;
        this.B = ffbrVar11;
        this.C = ffbrVar12;
        this.h = dkvuVar;
        this.D = ffbrVar13;
        this.j = cortVar;
        this.k = asqsVar;
        this.E = ctvsVar;
        this.F = ffbrVar15;
        this.G = cguoVar;
        this.H = dkayVar;
        this.I = ffbrVar16;
        this.J = cvjgVar;
        this.m = ffbrVar17;
        this.n = ffbrVar18;
        this.o = ffbrVar19;
        this.K = ffbrVar20;
        this.L = ffbrVar21;
    }

    private final elfl v() {
        ensk h = a.h();
        h.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "canReshowSuccessFuture", 975, "RcsAvailabilityUpdaterLocal.java")).I("canReshowSuccessFuture: cacheReshownStatus: %s, hasReshownSuccess: %s", djai.A(), this.q);
        return (djai.A() && this.q) ? elfo.e(false) : ((cmel) this.D.b()).e().h(new emwl() { // from class: cmdj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cmbx) obj).o);
            }
        }, erpp.a).h(new emwl() { // from class: ckfz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckga.this.q = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(!r3.booleanValue());
            }
        }, this.g);
    }

    private final elfl w(final boolean z, final String str) {
        return elfo.g(new Callable() { // from class: ckfm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ckga ckgaVar = ckga.this;
                boolean a2 = ((atri) ckgaVar.p.b()).a();
                final String str2 = str;
                final boolean z2 = z;
                if (!a2) {
                    ((ckds) ckgaVar.b.b()).z();
                }
                if (((aupa) ckgaVar.n.b()).a()) {
                    return null;
                }
                final ckgl ckglVar = ckgaVar.f;
                try {
                    final cmes b = ((cmel) ckglVar.h.b()).b(str2);
                    axnw.h(((algm) ckglVar.i.b()).b().h(new emwl() { // from class: ckgi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            long longValue = ((Long) obj).longValue();
                            cmes cmesVar = b;
                            boolean equals = cmesVar.equals(cmes.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED);
                            ckgl ckglVar2 = ckgl.this;
                            String str3 = str2;
                            if (equals && longValue > 0 && (!((asqs) ckglVar2.j.b()).a() || ((cort) ckglVar2.k.b()).n().size() <= 1)) {
                                ((enrr) ((enrr) ckgl.a.e()).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "setRcsSuccessNotificationStateIfApplicable", 125, "RcsUpdateNotifier.java")).t("updateRcsSuccessNotificationState: suppressed RCS success popup for simId: %s", dktx.SIM_ID.c(str3));
                                ((cmel) ckglVar2.h.b()).k(str3, cmes.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED);
                                return null;
                            }
                            if ((cmesVar == cmes.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED && !z2) || cmesVar == cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY) {
                                return null;
                            }
                            if (((djai.z() && djai.ac()) ? ((cguo) ckglVar2.g.b()).c(str3).n : dimo.b()) || djai.O()) {
                                ((akzt) ckglVar2.f.b()).c("Bugle.FastTrack.Provisioning.Succeeded");
                            } else if (((ctwb) ckglVar2.e.b()).e() <= 1) {
                                return null;
                            }
                            ((enrr) ((enrr) ckgl.a.e()).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "setRcsSuccessNotificationStateIfApplicable", 147, "RcsUpdateNotifier.java")).t("updateRcsSuccessNotificationState: queued RCS success popup for simId: %s", dktx.SIM_ID.c(str3));
                            ((cmel) ckglVar2.h.b()).k(str3, cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY);
                            ckglVar2.b.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST));
                            return null;
                        }
                    }, ckglVar.c).e(IOException.class, new emwl() { // from class: ckgj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ckgl.a((IOException) obj);
                            return null;
                        }
                    }, ckglVar.d).e(FileNotFoundException.class, new emwl() { // from class: ckgk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ckgl.a((FileNotFoundException) obj);
                            return null;
                        }
                    }, ckglVar.d));
                    return null;
                } catch (eygu e) {
                    ((enrr) ((enrr) ((enrr) ckgl.a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "propagateProvisioningSuccess", 84, "RcsUpdateNotifier.java")).t("Failed to get RCS success notification state for simId: %s", dktx.SIM_ID.c(str2));
                    return null;
                }
            }
        }, this.g);
    }

    @Override // defpackage.ckfg
    public final elfl a(final ckgb ckgbVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForAllSimsAsync", 293, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityForAllSimsAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", ckgbVar, Boolean.valueOf(djai.O()), Boolean.valueOf(djai.X()));
        return (djai.O() && djai.X()) ? v().h(new emwl() { // from class: ckfk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckga.this.p(ckgbVar, ((Boolean) obj).booleanValue());
                return null;
            }
        }, this.g) : elfo.f(new Runnable() { // from class: ckfl
            @Override // java.lang.Runnable
            public final void run() {
                ckga.this.p(ckgbVar, false);
            }
        }, this.g);
    }

    @Override // defpackage.ckfg
    public final elfl b(final djrm djrmVar, final ckgb ckgbVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForRcsProvisioningIdAsync", 422, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityForRcsProvisioningIdAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", ckgbVar, Boolean.valueOf(djai.O()), Boolean.valueOf(djai.X()));
        return (djai.O() && djai.X()) ? v().h(new emwl() { // from class: ckfh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckga.this.u(djrmVar, ckgbVar, ((Boolean) obj).booleanValue());
                return null;
            }
        }, this.g) : elfo.f(new Runnable() { // from class: ckfr
            @Override // java.lang.Runnable
            public final void run() {
                ckga.this.i(djrmVar, ckgbVar);
            }
        }, this.g);
    }

    @Override // defpackage.ckfg
    public final eqwf c() {
        return ((ckgv) this.w.b()).a();
    }

    @Override // defpackage.ckfg
    public final eqwf d(String str) {
        return ((ckgv) this.w.b()).b(str);
    }

    @Override // defpackage.ckfg
    public final eqwf e(int i) {
        String l;
        if (i == -1 || i == ((ctwb) this.v.b()).f()) {
            l = ((dkpp) this.t.b()).l();
        } else {
            Optional g = this.j.g(i, false);
            l = g.isPresent() ? djrn.a((djrm) g.get()).a : ((ctwb) this.v.b()).h(i).w();
        }
        if (l != null) {
            return ((ckgv) this.w.b()).b(l);
        }
        throw new IllegalStateException("Sim id is null.");
    }

    @Override // defpackage.ckfg
    public final void f(ckgc ckgcVar) {
        this.i = Optional.ofNullable(ckgcVar);
    }

    @Override // defpackage.ckfg
    @Deprecated
    public final void h(final ckgb ckgbVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityAsync", 885, "RcsAvailabilityUpdaterLocal.java")).J("updateAvailabilityAsync: scheduling updateRcsAvailability call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", ckgbVar, Boolean.valueOf(djai.O()), Boolean.valueOf(djai.X()));
        if (djai.O() && djai.X()) {
            v().h(new emwl() { // from class: ckfv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ckga.this.q(ckgbVar, ((Boolean) obj).booleanValue());
                    return null;
                }
            }, this.g).k(axnw.b(), erpp.a);
        } else {
            elfo.f(new Runnable() { // from class: ckfw
                @Override // java.lang.Runnable
                public final void run() {
                    ckga.this.j(ckgbVar);
                }
            }, this.g).k(axnw.b(), erpp.a);
        }
    }

    @Override // defpackage.ckfg
    public final void i(djrm djrmVar, ckgb ckgbVar) {
        u(djrmVar, ckgbVar, false);
    }

    @Override // defpackage.ckfg
    @Deprecated
    public final void j(ckgb ckgbVar) {
        q(ckgbVar, false);
    }

    @Override // defpackage.ckfg
    public final eqwf k(djrm djrmVar) {
        eqwf d = d(djrn.a(djrmVar).a);
        if (d != eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return d;
        }
        i(djrmVar, ckgb.NO_HINT);
        return d(djrn.a(djrmVar).a);
    }

    @Override // defpackage.ckfg
    @Deprecated
    public final eqwf l() {
        eqwf c = c();
        if (c != eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return c;
        }
        j(ckgb.NO_HINT);
        return c();
    }

    @Override // defpackage.ckfg
    @Deprecated
    public final void m() {
        j(ckgb.NO_HINT);
    }

    @Override // defpackage.ckfg
    public final eqwf n(djrm djrmVar) {
        u(djrmVar, ckgb.NO_HINT, false);
        return d(djrn.a(djrmVar).a);
    }

    public final void o(ckgd ckgdVar) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((ckgc) it.next()).al(ckgdVar);
        }
    }

    public final void p(final ckgb ckgbVar, final boolean z) {
        if (!this.k.a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleRcsProvisioning");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForDefaultCallSim", 266, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForDefaultCallSim: hint: %s, canReshowWelcomeMessage: %s", ckgbVar, z);
            this.j.h(cors.a).ifPresent(new Consumer() { // from class: ckfn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ckga.this.u(new djro(((cosz) obj).c), ckgbVar, z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForMultipleSims", 281, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForMultipleSims: hint: %s, canReshowWelcomeMessage: %s", ckgbVar, z);
        Iterator it = this.j.n().iterator();
        while (it.hasNext()) {
            u((djrm) it.next(), ckgbVar, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01e9, code lost:
    
        if (r2 == defpackage.eqwf.AVAILABLE) goto L91;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.ckgb r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckga.q(ckgb, boolean):void");
    }

    public final boolean r(String str) {
        return ((cmfj) this.I.b()).j(new djro(str));
    }

    public final boolean s(String str, dkvg dkvgVar) {
        dkvg dkvgVar2 = dkvg.UNKNOWN;
        Configuration.InvalidConfigReason invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
        int ordinal = dkvgVar.ordinal();
        boolean z = ordinal != 1 ? ordinal != 2 ? false : ((dkcp) this.c.b()).z(str) : ((dkcp) this.c.b()).B(str);
        ensk h = a.h();
        h.Y(ente.a, "BugleRcsProvisioning");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "isAvailable", 948, "RcsAvailabilityUpdaterLocal.java")).J("RcsAvailability configuration availability and enabled status: simId: %s, SipConnectionType: %s, isConfigurationAvailableAndEnabled: %s", dktx.SIM_ID.c(str), dkvgVar, Boolean.valueOf(z));
        return z;
    }

    public final boolean t(String str) {
        return !((dkcp) this.c.b()).f(str).r().mChatAuth;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0090 A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:3:0x0011, B:5:0x001b, B:27:0x0020, B:29:0x002e, B:31:0x003c, B:32:0x003f, B:34:0x004d, B:35:0x0050, B:37:0x0057, B:39:0x005d, B:42:0x0088, B:44:0x0090, B:45:0x0093, B:47:0x00a1, B:48:0x00a5, B:51:0x0189, B:52:0x00c4, B:54:0x00d0, B:56:0x00de, B:58:0x00f1, B:59:0x00f5, B:61:0x0103, B:62:0x0107, B:67:0x0128, B:69:0x0130, B:70:0x0134, B:72:0x013c, B:73:0x0140, B:75:0x0148, B:77:0x0152, B:78:0x0156, B:79:0x017d, B:80:0x0181, B:81:0x0185, B:83:0x006e, B:84:0x0071, B:86:0x0085), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:3:0x0011, B:5:0x001b, B:27:0x0020, B:29:0x002e, B:31:0x003c, B:32:0x003f, B:34:0x004d, B:35:0x0050, B:37:0x0057, B:39:0x005d, B:42:0x0088, B:44:0x0090, B:45:0x0093, B:47:0x00a1, B:48:0x00a5, B:51:0x0189, B:52:0x00c4, B:54:0x00d0, B:56:0x00de, B:58:0x00f1, B:59:0x00f5, B:61:0x0103, B:62:0x0107, B:67:0x0128, B:69:0x0130, B:70:0x0134, B:72:0x013c, B:73:0x0140, B:75:0x0148, B:77:0x0152, B:78:0x0156, B:79:0x017d, B:80:0x0181, B:81:0x0185, B:83:0x006e, B:84:0x0071, B:86:0x0085), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(final defpackage.djrm r10, final defpackage.ckgb r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckga.u(djrm, ckgb, boolean):void");
    }

    @Override // defpackage.ckfg
    public final void g() {
    }
}
