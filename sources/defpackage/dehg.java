package defpackage;

import j$.time.Duration;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehg implements cviz {
    public static final enru a = enru.c("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl");
    public static final cfva b = cfvl.f(cfvl.b, "is_wearable_installed_cache_seconds", 15);
    public final ffbr c;
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    public dehg(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    private static Boolean c(AtomicReference atomicReference, final ffbr ffbrVar) {
        return (Boolean) ((emyl) DesugarAtomicReference.updateAndGet(atomicReference, new UnaryOperator() { // from class: dehf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emyl emylVar = (emyl) obj;
                enru enruVar = dehg.a;
                if (emylVar != null) {
                    return emylVar;
                }
                final ffbr ffbrVar2 = ffbr.this;
                return emys.b(new emyl() { // from class: dehd
                    @Override // defpackage.emyl
                    public final Object get() {
                        enru enruVar2 = dehg.a;
                        Boolean bool = (Boolean) ffbr.this.b();
                        boolean booleanValue = bool.booleanValue();
                        ensk f = dehg.a.f();
                        f.Y(ente.a, "BugleWearable");
                        enrr enrrVar = (enrr) f;
                        enrrVar.Y(csux.O, "CachedWearableCompanionAppInstalledImpl");
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "getFromCache", 83, "CachedWearableCompanionAppInstalledImpl.java")).H("Memoizing value=%s and saving in cache with %d second(s) expiration", booleanValue, dehg.b.e());
                        return bool;
                    }
                }, Duration.ofSeconds(((Long) dehg.b.e()).longValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).get();
    }

    @Override // defpackage.cviz
    public final boolean a() {
        return c(this.e, new ffbr() { // from class: dehe
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                boolean a2 = ((dehh) dehg.this.c.b()).a();
                ensk f = dehg.a.f();
                f.Y(ente.a, "BugleWearable");
                enrr enrrVar = (enrr) f;
                enrrVar.Y(csux.O, "CachedWearableCompanionAppInstalledImpl");
                enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "companionHasMissingHapticsBugFix", 117, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean valueOf = Boolean.valueOf(a2);
                enrrVar2.t("Caching companionHasMissingHapticsBugFix with value=%s", valueOf);
                return valueOf;
            }
        }).booleanValue();
    }

    @Override // defpackage.cviz
    public final boolean b() {
        return c(this.d, new ffbr() { // from class: dehc
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                boolean b2 = ((dehh) dehg.this.c.b()).b();
                ensk f = dehg.a.f();
                f.Y(ente.a, "BugleWearable");
                enrr enrrVar = (enrr) f;
                enrrVar.Y(csux.O, "CachedWearableCompanionAppInstalledImpl");
                enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "isWearCompanionAppInstalled", 103, "CachedWearableCompanionAppInstalledImpl.java");
                Boolean valueOf = Boolean.valueOf(b2);
                enrrVar2.t("Caching isWearCompanionAppInstalled with value=%s", valueOf);
                return valueOf;
            }
        }).booleanValue();
    }
}
