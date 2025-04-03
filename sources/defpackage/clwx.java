package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwx implements clws {
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final csjk n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final bbfo r;
    private final List s = new CopyOnWriteArrayList();
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final errl z;
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(true);
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl");

    public clwx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, csjk csjkVar, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, bbfo bbfoVar, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ctud ctudVar, ffbr ffbrVar18, ffbr ffbrVar19, errl errlVar) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = csjkVar;
        this.o = ffbrVar11;
        this.p = ffbrVar12;
        this.q = ffbrVar13;
        this.r = bbfoVar;
        this.t = ffbrVar14;
        this.u = ffbrVar15;
        this.v = ffbrVar16;
        this.w = ffbrVar17;
        this.x = ffbrVar18;
        this.y = ffbrVar19;
        this.z = errlVar;
        csmz csmzVar = (csmz) csjkVar.a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = ctudVar.l() ? csmu.ALL_ACTIVE_SUBSCRIPTIONS : csmu.DEFAULT_SYSTEM_SUBSCRIPTION;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.m(this, (csmv) csmsVar.build());
    }

    private final eosl u(int i) {
        awui a2 = ((ckac) this.x.b()).a(i);
        if (a2 != null) {
            return r(a2);
        }
        enrr enrrVar = (enrr) a.h();
        enrrVar.Y(csux.t, Integer.valueOf(i));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 419, "ChatReadinessManagerImpl.java")).q("Missing identity mapping for subId, assuming that RCS is disabled");
        return v(eqwf.DISABLED_FROM_PREFERENCES, eqna.TRANSPORT_UNKNOWN);
    }

    private final eosl v(eqwf eqwfVar, eqna eqnaVar) {
        eosl eoslVar;
        ekzz f = eleg.f("ChatReadinessManager::calculateRcsReadinessConditions");
        try {
            eosk eoskVar = (eosk) eosl.a.createBuilder();
            eoskVar.copyOnWrite();
            eosl eoslVar2 = (eosl) eoskVar.instance;
            eoslVar2.c = eqwfVar.N;
            eoslVar2.b |= 2;
            eoskVar.copyOnWrite();
            eosl eoslVar3 = (eosl) eoskVar.instance;
            eoslVar3.o = eqnaVar.e;
            eoslVar3.b |= 16384;
            if (eqwfVar.equals(eqwf.AVAILABLE)) {
                int x = x(Objects.equals(((csmz) this.n.a()).f(), csod.AVAILABLE));
                eoskVar.copyOnWrite();
                eosl eoslVar4 = (eosl) eoskVar.instance;
                eoslVar4.r = x - 1;
                eoslVar4.b |= 131072;
                if (eqnaVar.equals(eqna.TRANSPORT_SINGLE_REGISTRATION) || eqnaVar.equals(eqna.TRANSPORT_RCS)) {
                    int x2 = x(((ImsConnectionTrackerService) this.g.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar5 = (eosl) eoskVar.instance;
                    eoslVar5.g = x2 - 1;
                    eoslVar5.b |= 32;
                    int x3 = x(((LocationSharingService) this.h.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar6 = (eosl) eoskVar.instance;
                    eoslVar6.h = x3 - 1;
                    eoslVar6.b |= 64;
                    int x4 = x(((FileTransferService) this.i.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar7 = (eosl) eoskVar.instance;
                    eoslVar7.i = x4 - 1;
                    eoslVar7.b |= 128;
                    int x5 = x(((ContactsService) this.k.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar8 = (eosl) eoskVar.instance;
                    eoslVar8.j = x5 - 1;
                    eoslVar8.b |= 256;
                    int x6 = x(((RcsProfileService) this.j.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar9 = (eosl) eoskVar.instance;
                    eoslVar9.k = x6 - 1;
                    eoslVar9.b |= 512;
                    int x7 = x(((RcsMessagingService) this.m.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar10 = (eosl) eoskVar.instance;
                    eoslVar10.q = x7 - 1;
                    eoslVar10.b |= 65536;
                    int x8 = x(((EventService) this.l.b()).isConnected());
                    eoskVar.copyOnWrite();
                    eosl eoslVar11 = (eosl) eoskVar.instance;
                    eoslVar11.p = x8 - 1;
                    eoslVar11.b |= 32768;
                    try {
                        if (((ImsConnectionTrackerService) this.g.b()).isConnected()) {
                            ImsRegistrationState registrationState = ((ImsConnectionTrackerService) this.g.b()).getRegistrationState();
                            if (registrationState != null) {
                                int i = registrationState.a.l;
                                eoskVar.copyOnWrite();
                                eosl eoslVar12 = (eosl) eoskVar.instance;
                                eoslVar12.b |= 1024;
                                eoslVar12.l = i;
                                int ordinal = registrationState.b.ordinal();
                                eoskVar.copyOnWrite();
                                eosl eoslVar13 = (eosl) eoskVar.instance;
                                eoslVar13.b |= 2048;
                                eoslVar13.m = ordinal;
                            }
                            boolean isRegistered = ((ImsConnectionTrackerService) this.g.b()).isRegistered();
                            eoskVar.copyOnWrite();
                            eosl eoslVar14 = (eosl) eoskVar.instance;
                            eoslVar14.b |= 8192;
                            eoslVar14.n = isRegistered;
                        }
                    } catch (ehxg e) {
                        ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateSipReadinessConditions", (char) 504, "ChatReadinessManagerImpl.java")).q("Failed to get SIP connection status for determining RCS Readiness");
                    }
                    eoslVar = (eosl) eoskVar.build();
                    ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 463, "ChatReadinessManagerImpl.java")).D("calculateRcsReadinessConditions: Enabled ChatTransportType is: %s, BugleRcsReadinessConditions: %s", eqnaVar, eoslVar);
                } else {
                    eoslVar = (eosl) eoskVar.build();
                    ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 470, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: BugleRcsReadinessConditions: %s", eoslVar);
                }
            } else {
                eosr c2 = ((ckge) ((csjk) this.q.b()).a()).c();
                eoskVar.copyOnWrite();
                eosl eoslVar15 = (eosl) eoskVar.instance;
                eoslVar15.d = c2.j;
                eoslVar15.b |= 4;
                int s = ((ctyz) this.d.b()).s();
                eoskVar.copyOnWrite();
                eosl eoslVar16 = (eosl) eoskVar.instance;
                eoslVar16.e = s - 1;
                eoslVar16.b |= 8;
                eoslVar = (eosl) eoskVar.build();
                ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 448, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: RCS is not available. BugleRcsReadinessConditions: %s", eoslVar);
            }
            f.close();
            return eoslVar;
        } finally {
        }
    }

    private final boolean w() {
        return eqna.TRANSPORT_TACHYGRAM.equals(((crgh) this.t.b()).d());
    }

    private static int x(boolean z) {
        return z ? 3 : 2;
    }

    @Override // defpackage.csmw
    public final void a(Intent intent) {
        if (w() && !intent.getBooleanExtra("noConnectivity", false)) {
            csjy.c("Bugle", "onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
            p();
        }
    }

    @Override // defpackage.clws
    public final elfl b(final SelfIdentityId selfIdentityId) {
        ekzz f = eleg.f("ChatReadinessManager::isReadyToSendAndReceiveChatAsync");
        try {
            elfl h = ((ckac) this.x.b()).c(selfIdentityId).h(new emwl() { // from class: clwt
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    awui awuiVar = (awui) ((Optional) obj).orElse(null);
                    clwx clwxVar = clwx.this;
                    if (awuiVar != null) {
                        return clwxVar.r(awuiVar);
                    }
                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                    enrr enrrVar = (enrr) clwx.a.j();
                    enrrVar.Y(csux.v, selfIdentityId2);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "isReadyToSendAndReceiveChatAsyncInTrace", 268, "ChatReadinessManagerImpl.java")).q("The mapping for selfIdentityId is missing.");
                    return clwxVar.s();
                }
            }, this.z).h(new clwu(this), this.z);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final elfl c(final int i) {
        ekzz f = eleg.f("ChatReadinessManager::readyToSendAndReceiveChatAsync");
        try {
            elfl h = ((ckac) this.x.b()).e(i).h(new emwl() { // from class: clww
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    clwx clwxVar = clwx.this;
                    awui awuiVar = (awui) obj;
                    if (awuiVar != null) {
                        return clwxVar.r(awuiVar);
                    }
                    int i2 = i;
                    enrr enrrVar = (enrr) clwx.a.j();
                    enrrVar.Y(csux.t, Integer.valueOf(i2));
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "readyToSendAndReceiveChatAsyncInTrace", 230, "ChatReadinessManagerImpl.java")).q("The mapping for subId is missing.");
                    return clwxVar.s();
                }
            }, this.z).h(new clwu(this), this.z);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final eosl d() {
        ekzz f = eleg.f("ChatReadinessManager::getRcsReadinessConditions");
        try {
            Optional empty = Optional.empty();
            ckge ckgeVar = (ckge) ((csjk) this.q.b()).a();
            empty.isPresent();
            eosl v = v(ckgeVar.d(), ((crgh) this.t.b()).d());
            f.close();
            return v;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final eosl e(int i) {
        ekzz f = eleg.f("ChatReadinessManager::getRcsReadinessConditions");
        try {
            eosl u = u(i);
            f.close();
            return u;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final eosl f(awui awuiVar) {
        ekzz f = eleg.f("ChatReadinessManager::getRcsReadinessConditions");
        try {
            eosl r = r(awuiVar);
            f.close();
            return r;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final String g() {
        return i(d());
    }

    @Override // defpackage.clws
    public final String h(awui awuiVar) {
        return i(r(awuiVar));
    }

    @Override // defpackage.clws
    public final String i(eosl eoslVar) {
        int s;
        ckge ckgeVar = (ckge) ((csjk) this.q.b()).a();
        eqwf b2 = eqwf.b(eoslVar.c);
        if (b2 == null) {
            b2 = eqwf.INVALID_PRE_KOTO;
        }
        eosr b3 = eosr.b(eoslVar.d);
        if (b3 == null) {
            b3 = eosr.UNKNOWN_UNINITIALIZED_REASON;
        }
        if ((b2.equals(eqwf.CARRIER_SETUP_PENDING) || (((aunc) this.y.b()).a() && new djtc(b2).b())) && ((ctyz) this.d.b()).s() - 1 != 0) {
            int a2 = eovg.a(s);
            String str = a2 != 1 ? a2 != 21 ? a2 != 31 ? a2 != 44 ? a2 != 47 ? a2 != 51 ? a2 != 11 ? a2 != 12 ? a2 != 41 ? a2 != 42 ? "null" : "RCS_ONBOARDING_FLOW_COMPLETED_STARTED_PROVISIONING" : "RCS_ONBOARDING_SAW_BOEW_DOUBLECHECK_DIALOG" : "RCS_ONBOARDING_SAW_PROMO_UPSELL_RECTIFIED" : "RCS_ONBOARDING_SAW_PROMO_UPSELL" : "RCS_ONBOARDING_FLOW_COMPLETED_SAW_CHECKMARK" : "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS_DOUBLECHECK_DIALOG" : "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS" : "RCS_ONBOARDING_SAW_BOEW_SYSTEM_DIALOG" : "RCS_ONBOARDING_SAW_FULL_SCREEN_PROMO" : "RCS_ONBOARDING_UNKNOWN";
            if (a2 != 0) {
                return str;
            }
            throw null;
        }
        if (!eqwf.AVAILABLE.equals(b2)) {
            return ckgeVar.g(b2, b3);
        }
        eqna eqnaVar = eqna.TRANSPORT_TACHYGRAM;
        eqna b4 = eqna.b(eoslVar.o);
        if (b4 == null) {
            b4 = eqna.TRANSPORT_UNKNOWN;
        }
        if (eqnaVar.equals(b4)) {
            int a3 = eoxc.a(eoslVar.r);
            return (a3 != 0 && a3 == 3) ? "RCS appears to be active" : "No network connection";
        }
        int a4 = eoxc.a(eoslVar.p);
        if (a4 == 0 || a4 != 3) {
            return "RCS EventService not connected";
        }
        int a5 = eoxc.a(eoslVar.g);
        if (a5 == 0 || a5 != 3) {
            return "RCS ImsConnectionTrackerService not connected";
        }
        int a6 = eoxc.a(eoslVar.h);
        if (a6 == 0 || a6 != 3) {
            return "RCS LocationSharingService not connected";
        }
        int a7 = eoxc.a(eoslVar.i);
        if (a7 == 0 || a7 != 3) {
            return "RCS FileTransferService not connected";
        }
        int a8 = eoxc.a(eoslVar.j);
        if (a8 == 0 || a8 != 3) {
            return "RCS ContactsService not connected";
        }
        int a9 = eoxc.a(eoslVar.k);
        if (a9 == 0 || a9 != 3) {
            return "RCS ProfileService not connected";
        }
        int a10 = eoxc.a(eoslVar.q);
        return (a10 != 0 && a10 == 3) ? !eoslVar.n ? (eoslVar.b & 1024) != 0 ? "RCS not connected to server: ".concat(new ImsRegistrationState(dkoo.a(eoslVar.l), dilc.a(eoslVar.m)).toString()) : "RCS is not connected to server and getImsRegistrationState is empty! This is a bug!" : "RCS appears to be active" : "RCS MessagingService not connected";
    }

    @Override // defpackage.clws
    public final Set j() {
        return (Set) Collection.EL.stream(((crgh) this.t.b()).e()).filter(new Predicate() { // from class: clwv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return clwx.this.m((awui) obj);
            }
        }).collect(endq.b);
    }

    @Override // defpackage.clws
    public final void k(clwr clwrVar) {
        this.s.add(clwrVar);
        if (n()) {
            clwrVar.a();
        }
    }

    @Override // defpackage.clws
    public final void l(clwr clwrVar) {
        this.s.remove(clwrVar);
    }

    @Override // defpackage.clws
    public final boolean m(awui awuiVar) {
        ekzz f = eleg.f("ChatReadinessManager::isReadyToSendAndReceiveChat");
        try {
            boolean t = t(r(awuiVar));
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final boolean n() {
        ekzz f = eleg.f("ChatReadinessManager::readyToSendAndReceiveChat");
        try {
            boolean t = t(d());
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final boolean o(int i) {
        ekzz f = eleg.f("ChatReadinessManager::readyToSendAndReceiveChatWithSubId");
        try {
            boolean t = t(u(i));
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.clws
    public final void p() {
        boolean n = n();
        AtomicBoolean atomicBoolean = c;
        if (!atomicBoolean.get()) {
            ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 316, "ChatReadinessManagerImpl.java")).q("shouldLaunchPostReadyWork is false. Returning from the method");
            return;
        }
        if (!n) {
            if (csod.AVAILABLE.equals(((csmz) this.n.a()).f())) {
                ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 342, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is not ready but RCS is available. Trigger scheduling: [processPendingMessagesActionForStartup]");
                this.r.e();
                return;
            }
            return;
        }
        enru enruVar = a;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 321, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is ready and it was off. Trigger scheduling: [scheduleProcessPendingMessagesActionForStartup, scheduleOnlyForCurrentProcess, maybeScheduleImmediately]");
        if (eqna.TRANSPORT_RCS.equals(((crgh) this.t.b()).d())) {
            ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 327, "ChatReadinessManagerImpl.java")).q("Trigger scheduling: [schedulePendingMessagesCatchup]");
            clfp clfpVar = (clfp) this.u.b();
            if (((Boolean) clfp.a.e()).booleanValue()) {
                clfpVar.c().b();
            }
        }
        if (auke.a()) {
            this.r.d(9);
        } else {
            this.r.d(1);
        }
        ((bbgg) this.f.b()).a(bdhb.a, bdgq.a, 3, eooi.CHAT_READINESS_MANAGER).G(0L);
        ((bbfq) this.o.b()).a();
        atomicBoolean.set(false);
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((clwr) it.next()).a();
        }
        Iterator it2 = ((Set) this.v.b()).iterator();
        while (it2.hasNext()) {
            ((clwr) it2.next()).a();
        }
    }

    @Override // defpackage.clws
    public final void q(cniz cnizVar) {
        if (n()) {
            return;
        }
        csjy.l("Bugle", "Rcs services not connected. Queueing action");
        bbax bbaxVar = (bbax) this.e.b();
        bbbe bbbeVar = (bbbe) bbaxVar.a.b();
        bbbeVar.getClass();
        bbbh bbbhVar = (bbbh) bbaxVar.b.b();
        bbbhVar.getClass();
        new WaitForRcsServiceConnectionAction(bbbeVar, bbbhVar).r(cnizVar);
    }

    public final eosl r(awui awuiVar) {
        return v(((djrv) this.w.b()).w(awuiVar.d) ? eqwf.AVAILABLE : eqwf.DISABLED_SIM_ABSENT, ((crgh) this.t.b()).c(awuiVar).f);
    }

    public final eosl s() {
        return v(eqwf.DISABLED_SIM_ABSENT, eqna.TRANSPORT_UNKNOWN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r0 == 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        if (r0 == 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(defpackage.eosl r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwx.t(eosl):boolean");
    }

    @Override // defpackage.csmx
    public final void y() {
        if (w()) {
            if (csod.AVAILABLE.equals(((csmz) this.n.a()).f())) {
                csjy.c("Bugle", "onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
                p();
            }
        }
    }
}
