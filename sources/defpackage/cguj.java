package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cguj implements cguo {
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever");
    public final ffbr a;
    private final errl f;
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final HashSet h = new HashSet();

    public cguj(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.f = errlVar;
    }

    private final synchronized boolean j(String str) {
        return this.h.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // defpackage.cguo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enhk a(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cguj.a(java.lang.String):enhk");
    }

    @Override // defpackage.cguo
    public final enhk b(String str) {
        ewhw d = d(str);
        int i = cgum.a;
        enhd enhdVar = new enhd();
        enhdVar.k("upi_policy_id", d.b);
        return enhdVar.c();
    }

    @Override // defpackage.cguo
    public final ewht c(String str) {
        if (str.isEmpty()) {
            ensk j = e.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) j;
            enrrVar.aa(ensy.FULL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", 88, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: simId is missing, return default rcs onboarding flags.");
            return b;
        }
        ewht ewhtVar = (ewht) f(cgue.c(str, ewgz.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS)).map(new Function() { // from class: cgug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ewgw ewgwVar = (ewgw) obj;
                return ewgwVar.c == 3 ? (ewht) ewgwVar.d : ewht.c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(b);
        if (ewhtVar.equals(b)) {
            ensk h = e.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar2 = (enrr) h;
            enrrVar2.aa(ensy.MEDIUM);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getRcsOnboardingFlags", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot retrieve rcs onboarding flags in configuration right now, return default flags instead.");
        }
        return ewhtVar;
    }

    @Override // defpackage.cguo
    public final ewhw d(String str) {
        return str.isEmpty() ? c : (ewhw) f(cgue.c(str, ewgz.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)).map(new Function() { // from class: cguh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ewgw ewgwVar = (ewgw) obj;
                return ewgwVar.c == 5 ? (ewhw) ewgwVar.d : ewhw.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(c);
    }

    @Override // defpackage.cguo
    public final ewie e() {
        return (ewie) f(cgue.c(ewgz.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION.name(), ewgz.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION)).map(new Function() { // from class: cgui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ewgw ewgwVar = (ewgw) obj;
                return ewgwVar.c == 6 ? (ewie) ewgwVar.d : ewie.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(d);
    }

    @Override // defpackage.cguo
    public final Optional f(cgue cgueVar) {
        final String d = cgueVar.d();
        if (((Optional) this.a.b()).isEmpty()) {
            ensk j = e.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 148, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Could not access MobileConfigurationApi");
            return Optional.empty();
        }
        if (!this.g.containsKey(d)) {
            if (efbd.g()) {
                if (j(d)) {
                    elfo.f(new Runnable() { // from class: cguf
                        @Override // java.lang.Runnable
                        public final void run() {
                            cguj cgujVar = cguj.this;
                            dlqm dlqmVar = (dlqm) ((Optional) cgujVar.a.b()).get();
                            String str = d;
                            Optional a = dlqmVar.a(str);
                            if (a.isPresent()) {
                                cgujVar.i(str, (ewgw) a.get());
                            }
                            cgujVar.h(str);
                        }
                    }, this.f).k(axnw.b(), erpp.a);
                }
            } else if (j(d)) {
                Optional a = ((dlqm) ((Optional) this.a.b()).get()).a(d);
                if (a.isPresent()) {
                    i(d, (ewgw) a.get());
                } else {
                    ensk j2 = e.j();
                    j2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 187, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot find configuration from the current mobileConfigurationDataId");
                }
                h(d);
            } else {
                ensk j3 = e.j();
                j3.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) j3;
                enrrVar.aa(ensy.FULL);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 193, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: Cannot access SSOT for the same mobileConfigurationDataId that currrently being accessed by another thread");
            }
        }
        if (this.g.containsKey(d)) {
            return Optional.ofNullable((ewgw) this.g.get(d));
        }
        if (efbd.g()) {
            ensk j4 = e.j();
            j4.Y(ente.a, "Bugle");
            enrr enrrVar2 = (enrr) j4;
            enrrVar2.aa(ensy.FULL);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 206, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on main thread.");
        } else {
            ensk j5 = e.j();
            j5.Y(ente.a, "Bugle");
            enrr enrrVar3 = (enrr) j5;
            enrrVar3.aa(ensy.FULL);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "getConfiguration", 209, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: config is not cached when running on background thread.");
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cguo
    public final void g(engw engwVar) {
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) engwVar.get(i);
            if (this.g.containsKey(str)) {
                this.g.remove(str);
            } else {
                ensk i2 = e.i();
                i2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "removeFromConfigurationCache", 69, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: The mobileConfigurationDataId cannot be removed as it is not present in the configurationCache");
            }
        }
        ensk e2 = e.e();
        e2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "invalidateCache", 80, "MobileConfigurationRetriever.java")).t("MobileConfigurationRetriever: Invalidating the configurationCache for updated IDs : %s", engwVar);
    }

    public final synchronized void h(String str) {
        if (this.h.remove(str)) {
            return;
        }
        ensk i = e.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationRetriever", "removeFromSynchronizationHashSet", 232, "MobileConfigurationRetriever.java")).q("MobileConfigurationRetriever: The mobileConfigurationDataId was not present in the object used for synchronization");
    }

    public final void i(String str, ewgw ewgwVar) {
        this.g.put(str, ewgwVar);
    }
}
