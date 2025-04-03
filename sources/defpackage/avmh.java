package defpackage;

import android.content.ContentValues;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmh implements avmb {
    public static final entd a = entd.c("BugleRcsCapabilities");
    public final avmw b;
    private final errl c;
    private final errl d;

    public avmh(avmw avmwVar, errl errlVar, errl errlVar2) {
        this.b = avmwVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    @Override // defpackage.avmb
    public final elfl a(final awui awuiVar) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 43, "RcsCapabilitiesDatabaseCachingSource.java")).t("RcsCapabilitiesDatabaseCachingSource: get with chatEndpoint %s", cskt.b(awuiVar.d));
        return elfo.g(new Callable() { // from class: avmf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = avmh.a;
                awui awuiVar2 = awui.this;
                awuh b = awuh.b(awuiVar2.c);
                if (b == null) {
                    b = awuh.UNKNOWN_TYPE;
                }
                if (!ersy.a("bugle.enable_rbm_bot_capabilities_fetch", "bugle")) {
                    emxf.a(b.equals(awuh.PHONE));
                }
                final String str = awuiVar2.d;
                emxf.b(!str.isEmpty(), "Invalid MSISDN while trying to get RCS Capabilities from RcsRemoteCapabilitiesCacheTable");
                String[] strArr = avod.a;
                avny avnyVar = new avny(avod.a);
                avnyVar.z("getRcsCapabilities");
                avnyVar.c(new Function() { // from class: avmq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        avoc avocVar = (avoc) obj;
                        avocVar.b(str);
                        return avocVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                avnd avndVar = (avnd) ((avnp) avnyVar.b().o()).cS();
                if (avndVar == null) {
                    ((enrr) ((enrr) avmw.a.h()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "getRcsCapabilities", 111, "RcsCapabilitiesDatabaseOperations.java")).q("No RCS Capabilities found cached in database");
                    return Optional.empty();
                }
                int i = avmz.b;
                avml avmlVar = new avml();
                avmlVar.c(avndVar.d());
                avmlVar.b(avndVar.e());
                return Optional.of(avmlVar.a());
            }
        }, this.c);
    }

    @Override // defpackage.avmb
    public final elfl b(final Iterable iterable) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 54, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: reading %d chatEndpoints", enjk.b(iterable));
        return elfo.g(new Callable() { // from class: avmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = avmh.a;
                return avmw.b(iterable);
            }
        }, this.d);
    }

    @Override // defpackage.avmb
    public final elfl c(final Map map) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 90, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: writing %d chatEndpoints", map.size());
        return elfo.f(new Runnable() { // from class: avme
            @Override // java.lang.Runnable
            public final void run() {
                final Map map2 = map;
                avmh.this.b.b.d("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresherBatched", new Runnable() { // from class: avmo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map3 = map2;
                        enhk b = avmw.b(map3.keySet());
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map3.entrySet()) {
                            if (b.containsKey(entry.getKey())) {
                                if (((avmz) entry.getValue()).b().isAfter(((avmz) b.get(entry.getKey())).b())) {
                                    arrayList.add(avmw.a(entry));
                                }
                            } else {
                                arrayList.add(avmw.a(entry));
                            }
                        }
                        dtub.A(avod.a(), 5, false, new BiConsumer() { // from class: avna
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                String[] strArr = avod.a;
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer);
                            }
                        }, (avnd[]) arrayList.toArray(new avnd[arrayList.size()]));
                    }
                });
            }
        }, this.d);
    }

    @Override // defpackage.avmb
    public final elfl d(final awui awuiVar, final avmz avmzVar) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 66, "RcsCapabilitiesDatabaseCachingSource.java")).D("RcsCapabilitiesDatabaseCachingSource: put with chatEndpoint %s and capabilities %s", cskt.b(awuiVar.d), avmzVar.a().b);
        return elfo.g(new Callable() { // from class: avmc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awui awuiVar2 = awuiVar;
                avmz avmzVar2 = avmzVar;
                final avoi a2 = avmzVar2.a();
                final Instant b = avmzVar2.b();
                final String str = awuiVar2.d;
                emxf.b(!str.isEmpty(), "Cannot insert RCS capabilities into RcsRemoteCapabilitiesCacheTable, MSISDN is empty");
                Boolean bool = (Boolean) avmh.this.b.b.c("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresher", new emyl() { // from class: avmp
                    @Override // defpackage.emyl
                    public final Object get() {
                        Object apply;
                        String[] strArr = avod.a;
                        avoa avoaVar = new avoa();
                        avoaVar.ap("writeRcsCapabilitiesIfFresher");
                        ContentValues contentValues = avoaVar.a;
                        final String str2 = str;
                        dtub.u(contentValues, "msisdn", str2);
                        ContentValues contentValues2 = avoaVar.a;
                        avoi avoiVar = a2;
                        contentValues2.put("rcs_capabilities", avoiVar.toByteArray());
                        ContentValues contentValues3 = avoaVar.a;
                        final Instant instant = b;
                        contentValues3.put("last_refresh_timestamp", Long.valueOf(bdgw.a(instant)));
                        apply = new Function() { // from class: avmv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                avoc avocVar = (avoc) obj;
                                avocVar.b(str2);
                                avocVar.aq(new dtrt("rcs_remote_capabilities_cache.last_refresh_timestamp", 10, Long.valueOf(bdgw.a(instant))));
                                return avocVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(new avoc());
                        avoaVar.af(new avob((avoc) apply));
                        if (avoaVar.b().e() <= 0) {
                            avng avngVar = new avng();
                            avngVar.c(str2);
                            avngVar.d(avoiVar);
                            avngVar.b(instant);
                            avnd a3 = avngVar.a();
                            final dtve a4 = avod.a();
                            long b2 = dtub.b(avod.a(), "rcs_remote_capabilities_cache", a3, new Function() { // from class: avnb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dtve.this.T("rcs_remote_capabilities_cache", (ContentValues) obj, 4));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: avnc
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            Long.valueOf(b2).getClass();
                            if (b2 == -1) {
                                ((enrr) ((enrr) avmw.a.h()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "writeRcsCapabilitiesIfFresher", 282, "RcsCapabilitiesDatabaseOperations.java")).t("RCS capabilities were not inserted or updated in the database for MessagingIdentity %s", cskt.b(str2));
                                return false;
                            }
                        }
                        return true;
                    }
                });
                bool.booleanValue();
                return bool;
            }
        }, this.c).h(new emwl() { // from class: avmd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = avmh.a;
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                ((ensz) ((ensz) avmh.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 80, "RcsCapabilitiesDatabaseCachingSource.java")).q("Did not put capabilities into the database cache.");
                return null;
            }
        }, this.c);
    }
}
