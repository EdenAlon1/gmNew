package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqc implements copj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl");
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final Map d;
    public final Map e;
    public final fgcm f;
    private final ffsk g;
    private final ffbr h;
    private final Set i;

    public csqc(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.g = ffskVar;
        this.h = ffbrVar3;
        this.b = new AtomicReference(cnok.a);
        new AtomicReference(cnok.a);
        this.c = new AtomicBoolean(false);
        new AtomicInteger(4);
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        newKeySet.getClass();
        this.i = newKeySet;
        this.f = fgdm.a(cspu.b);
        axol.m(ffskVar, new cspz(this, null));
    }

    @Override // defpackage.copj
    public final void a(Set set) {
        set.getClass();
        c("SIM loaded");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cosz coszVar = (cosz) it.next();
            if (!this.i.contains(Integer.valueOf(coszVar.d))) {
                int i = coszVar.d;
                ensk e = a.e();
                e.Y(ente.a, "BugleConnectivity");
                ((enrr) e.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "registerWithSatelliteManager", 160, "ManualSatelliteEligibilityTrackerImpl.kt")).r("Registering CarrierRoamingNtnModeChangedListener for subId %d", i);
                ((cnoc) this.h.b()).a(i, new csqb(this));
            }
        }
    }

    @Override // defpackage.copj
    public final void b(Set set) {
        c("SIM removed");
        boolean d = d();
        final ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((cosz) it.next()).d));
        }
        Set keySet = this.e.keySet();
        final ffji ffjiVar = new ffji() { // from class: cspv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(arrayList.contains(num));
            }
        };
        Collection.EL.removeIf(keySet, new Predicate() { // from class: cspw
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
                return ((Boolean) ffji.this.invoke(obj)).booleanValue();
            }
        });
        Set set2 = this.i;
        final ffji ffjiVar2 = new ffji() { // from class: cspx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(arrayList.contains(num));
            }
        };
        Collection.EL.removeIf(set2, new Predicate() { // from class: cspy
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
                return ((Boolean) ffji.this.invoke(obj)).booleanValue();
            }
        });
        if (!d || d() || this.c.get()) {
            return;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleConnectivity");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "handleSimRemoved", 107, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Previously eligible SIM is no longer available and no other SIMs are satellite eligible. Notifying listeners of lost manual satellite eligibility.");
        e(false);
    }

    public final void c(String str) {
        ensk h = a.h();
        h.Y(ente.a, "BugleConnectivity");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "logConnectionStateOnEvent", 357, "ManualSatelliteEligibilityTrackerImpl.kt")).K("Connection state change: %s, data connection: %s, manual connection eligibility: %b, ntn roaming: %b", str, this.b, Boolean.valueOf(d()), Boolean.valueOf(this.c.get()));
    }

    public final boolean d() {
        return this.e.containsValue(true);
    }

    public final void e(boolean z) {
        axol.m(this.g, new csqa(z, this, null));
    }
}
