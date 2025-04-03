package defpackage;

import android.content.pm.PackageManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevr implements aevc {
    public static final entd a = entd.c("BugleInAppUpdate");
    public final PackageManager b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final aevb f;
    public final ffbr g;
    public final ffbr h;
    private final ehur i;

    public aevr(PackageManager packageManager, ehur ehurVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, aevb aevbVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = packageManager;
        this.i = ehurVar;
        this.c = errlVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = aevbVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
    }

    public static int e(ehun ehunVar) {
        Integer num = ehunVar.e;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean g(aevu aevuVar) {
        return (aevuVar.c == 0 && aevuVar.d == 0) ? false : true;
    }

    @Override // defpackage.aevc
    public final elfl a() {
        return f().h(new emwl() { // from class: aevq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aevu aevuVar = (aevu) obj;
                if (!aevr.g(aevuVar)) {
                    return Optional.empty();
                }
                epyt epytVar = (epyt) epyu.a.createBuilder();
                int i = aevuVar.c;
                epytVar.copyOnWrite();
                epyu epyuVar = (epyu) epytVar.instance;
                epyuVar.b |= 2;
                epyuVar.c = i;
                int i2 = aevuVar.d;
                epytVar.copyOnWrite();
                epyu epyuVar2 = (epyu) epytVar.instance;
                epyuVar2.b |= 4;
                epyuVar2.d = i2;
                return Optional.of((epyu) epytVar.build());
            }
        }, this.c);
    }

    @Override // defpackage.aevc
    public final elfl b() {
        final dhre a2 = this.i.a();
        return elfl.g(kfg.a(new kfd() { // from class: elgv
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                erpp erppVar = erpp.a;
                final elgw elgwVar = new elgw(kfbVar);
                final elds b = elds.b();
                dhre.this.o(erppVar, new dhqs() { // from class: elgx
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        elds eldsVar = elds.this;
                        elds g = elds.g();
                        elds.e(eldsVar);
                        try {
                            elgwVar.a(dhreVar);
                        } finally {
                            elds.e(g);
                        }
                    }
                });
                return "Task initializer";
            }
        })).h(new emwl() { // from class: aevk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.of((ehun) obj);
            }
        }, this.c).e(Throwable.class, new emwl() { // from class: aevl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) aevr.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getAppUpdateInfo", 215, "InAppUpdateDataServiceImpl.java")).q("Getting in-app update info failed.");
                return Optional.empty();
            }
        }, this.c).i(new eroh() { // from class: aevd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final elfl e;
                char c;
                final elfl e2;
                final elfl e3;
                elfl c2;
                elfl c3;
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(Optional.empty());
                }
                final ehun ehunVar = (ehun) optional.get();
                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 83, "InAppUpdateDataServiceImpl.java")).B("Package name: %s, version code: %s", ehunVar.a, ehunVar.b);
                if (ehunVar.d == 11) {
                    return elfo.e(Optional.of(aevw.a(0, ehunVar)));
                }
                int i = ehunVar.c;
                if (i == 1 || i == 0) {
                    ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 97, "InAppUpdateDataServiceImpl.java")).r("No update due to UpdateAvailability: %s", i);
                    return elfo.e(Optional.empty());
                }
                final aevr aevrVar = aevr.this;
                int e4 = aevr.e(ehunVar);
                long j = e4;
                final int i2 = j < Duration.ofDays(((Long) aevrVar.f.g.b()).longValue()).toDays() ? 0 : 1;
                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getAppUpdateType", 339, "InAppUpdateDataServiceImpl.java")).r("Selected update flow: %s", i2);
                if (i == 3) {
                    ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 107, "InAppUpdateDataServiceImpl.java")).q("Start update decision: resume update.");
                    return elfo.e(Optional.of(aevw.a(i2, ehunVar)));
                }
                if (((aspb) aevrVar.g.b()).a()) {
                    ajyr ajyrVar = (ajyr) aevrVar.h.b();
                    c3 = axol.c(ajyrVar.e, ffhe.a, ffsm.a, new ajxq(ajyrVar, null));
                    e = c3.h(new emwl() { // from class: aevh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = aevr.a;
                            if (((List) obj2).isEmpty()) {
                                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdate", 238, "InAppUpdateDataServiceImpl.java")).q("No update. No restore executions waiting for app update.");
                                return Optional.empty();
                            }
                            ehun ehunVar2 = ehun.this;
                            ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdate", 230, "InAppUpdateDataServiceImpl.java")).q("Update available, restore executions waiting for app update found");
                            return Optional.of(aevw.b(ehunVar2, 1));
                        }
                    }, aevrVar.c);
                } else {
                    e = elfo.e(Optional.empty());
                }
                if (((aspb) aevrVar.g.b()).a()) {
                    ajyr ajyrVar2 = (ajyr) aevrVar.h.b();
                    c = 1;
                    c2 = axol.c(ajyrVar2.e, ffhe.a, ffsm.a, new ajxt(ajyrVar2, null));
                    e2 = c2.h(new emwl() { // from class: aevp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = aevr.a;
                            if (((List) obj2).isEmpty()) {
                                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdateReprompt", 259, "InAppUpdateDataServiceImpl.java")).q("No update. No restore executions waiting for app update reprompt.");
                                return Optional.empty();
                            }
                            ehun ehunVar2 = ehun.this;
                            ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdateReprompt", 253, "InAppUpdateDataServiceImpl.java")).q("Update available, restore executions waiting for app update reprompt found");
                            return Optional.of(aevw.b(ehunVar2, 2));
                        }
                    }, aevrVar.c);
                } else {
                    c = 1;
                    e2 = elfo.e(Optional.empty());
                }
                if (j >= Duration.ofDays(((Long) aevrVar.f.a.b()).longValue()).toDays()) {
                    e3 = aevrVar.f().h(new emwl() { // from class: aeve
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Duration ofSeconds;
                            long longValue;
                            int i3;
                            int i4 = i2;
                            ehun ehunVar2 = ehunVar;
                            aevu aevuVar = (aevu) obj2;
                            int e5 = aevr.e(ehunVar2);
                            if (ehunVar2.a(ehuz.b(i4).a()) != null) {
                                aevr aevrVar2 = aevr.this;
                                if (i4 != 0) {
                                    ofSeconds = Duration.ofSeconds(((Long) aevrVar2.f.e.b()).longValue());
                                    longValue = ((Long) aevrVar2.f.c.b()).longValue();
                                    i3 = aevuVar.d;
                                } else {
                                    ofSeconds = Duration.ofSeconds(((Long) aevrVar2.f.d.b()).longValue());
                                    longValue = ((Long) aevrVar2.f.b.b()).longValue();
                                    i3 = aevuVar.c;
                                }
                                long j2 = i3;
                                Instant f = ((cqoh) aevrVar2.d.b()).f();
                                eyja eyjaVar = aevuVar.e;
                                if (eyjaVar == null) {
                                    eyjaVar = eyja.a;
                                }
                                Instant d = eykj.d(eyjaVar);
                                if (f.isBefore(d.plus(ofSeconds))) {
                                    ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 387, "InAppUpdateDataServiceImpl.java")).z("No update due to cooldown period. Last prompt: %s, reprompt interval days: %s", d.getEpochSecond(), ofSeconds.toDays());
                                } else {
                                    long j3 = e5;
                                    long days = Duration.ofDays(((Long) aevrVar2.f.f.b()).longValue()).toDays();
                                    boolean z = j2 < longValue;
                                    ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 397, "InAppUpdateDataServiceImpl.java")).K("Staleness day(s): %s, is under max retry count: %s, impression count: %s, max retry count: %s", Integer.valueOf(e5), Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(longValue));
                                    if (j3 >= days || z) {
                                        return Optional.of(aevw.a(i4, ehunVar2));
                                    }
                                }
                            } else {
                                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 360, "InAppUpdateDataServiceImpl.java")).q("No update due to update type not allowed.");
                            }
                            return Optional.empty();
                        }
                    }, aevrVar.c);
                } else {
                    ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRegularPromptNeeded", 269, "InAppUpdateDataServiceImpl.java")).r("No update. Low staleness: %s day(s)", e4);
                    e3 = elfo.e(Optional.empty());
                }
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                listenableFutureArr[0] = e;
                listenableFutureArr[c] = e2;
                listenableFutureArr[2] = e3;
                return elfo.k(listenableFutureArr).a(new Callable() { // from class: aevg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = aevr.a;
                        Optional optional2 = (Optional) erqt.q(elfl.this);
                        if (optional2.isPresent()) {
                            return optional2;
                        }
                        Optional optional3 = (Optional) erqt.q(e2);
                        return optional3.isPresent() ? optional3 : (Optional) erqt.q(e3);
                    }
                }, aevrVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.aevc
    public final elfl c(final boolean z) {
        return ((comc) this.e.b()).j(new emwl() { // from class: aevm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aevu aevuVar = (aevu) obj;
                aevt aevtVar = (aevt) aevuVar.toBuilder();
                eyja b = eykj.b(((cqoh) aevr.this.d.b()).f());
                aevtVar.copyOnWrite();
                aevu aevuVar2 = (aevu) aevtVar.instance;
                b.getClass();
                aevuVar2.e = b;
                aevuVar2.b |= 4;
                if (z) {
                    int i = aevuVar.c + 1;
                    aevtVar.copyOnWrite();
                    aevu aevuVar3 = (aevu) aevtVar.instance;
                    aevuVar3.b |= 1;
                    aevuVar3.c = i;
                } else {
                    int i2 = aevuVar.d + 1;
                    aevtVar.copyOnWrite();
                    aevu aevuVar4 = (aevu) aevtVar.instance;
                    aevuVar4.b |= 2;
                    aevuVar4.d = i2;
                }
                return (aevu) aevtVar.build();
            }
        }).h(new emwl() { // from class: aevn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) aevr.a.h()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "savePromptSeenToDevice", 162, "InAppUpdateDataServiceImpl.java")).q("Saved impression to device");
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.aevc
    public final elfl d() {
        return ((comc) this.e.b()).j(new emwl() { // from class: aevi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aevt aevtVar = (aevt) ((aevu) obj).toBuilder();
                eyja b = eykj.b(((cqoh) aevr.this.d.b()).f());
                aevtVar.copyOnWrite();
                aevu aevuVar = (aevu) aevtVar.instance;
                b.getClass();
                aevuVar.e = b;
                aevuVar.b |= 4;
                return (aevu) aevtVar.build();
            }
        }).h(new emwl() { // from class: aevj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) aevr.a.h()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "updateLastPromptTimestamp", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "InAppUpdateDataServiceImpl.java")).q("Updated last impression timestamp");
                return null;
            }
        }, this.c);
    }

    public final elfl f() {
        return ((comc) this.e.b()).h().i(new eroh() { // from class: aevf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Instant instant;
                aevu aevuVar = (aevu) obj;
                boolean g = aevr.g(aevuVar);
                aevr aevrVar = aevr.this;
                if (!g) {
                    return elfo.e(aevuVar);
                }
                eyja eyjaVar = aevuVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                Instant d = eykj.d(eyjaVar);
                try {
                    instant = Instant.ofEpochMilli(aevrVar.b.getPackageInfo("com.google.android.apps.messaging", 0).lastUpdateTime);
                } catch (Exception unused) {
                    ((ensz) ((ensz) aevr.a.j()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getLastUpdateInstant", 298, "InAppUpdateDataServiceImpl.java")).q("Could not get the last update timestamp");
                    instant = Instant.EPOCH;
                }
                ((ensz) aevr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getLastUpdateInstant", 302, "InAppUpdateDataServiceImpl.java")).t("Last update timestamp: %s", instant);
                return instant.isAfter(d) ? ((comc) aevrVar.e.b()).j(new emwl() { // from class: aevo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = aevr.a;
                        return aevu.a;
                    }
                }) : elfo.e(aevuVar);
            }
        }, this.c);
    }
}
