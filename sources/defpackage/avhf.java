package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever");
    public static final cfva b = cfvl.m(cfvl.b, "rbm_business_info_retrieval_version_parameter", "1.5");
    public static final cfva c = cfvl.e(cfvl.b, "rbm_business_info_retrieval_short_code_http_timeout_millis", 5000);
    public static final Duration d;
    public final avhp e;
    public final aver f;
    public final errm g;
    public final cqoh h;
    public final asuv i;
    public final LruCache j;
    public final ezgw k;
    public volatile long l;
    private final errl m;
    private final errl n;

    static {
        cfvl.i(cfvl.b, "rbm_business_info_retrieval_enable_short_code_http_timeout", true);
        d = Duration.ofDays(7L);
    }

    public avhf(avhp avhpVar, aver averVar, errm errmVar, errl errlVar, errl errlVar2, cqoh cqohVar, LruCache lruCache, asuv asuvVar, ezgw ezgwVar) {
        this.e = avhpVar;
        this.f = averVar;
        this.g = errmVar;
        this.m = errlVar;
        this.n = errlVar2;
        this.h = cqohVar;
        this.j = lruCache;
        this.i = asuvVar;
        this.k = ezgwVar;
    }

    public static engw c(String str) {
        bwqd a2 = bwqg.a();
        a2.s(bwqg.b.b, 4);
        bwqf bwqfVar = new bwqf();
        axuf axufVar = axuf.PROPERTY_X_GOOGLE_SHORT_CODE;
        bwqfVar.aq(new dtwe("rbm_business_info_properties.type", 1, Integer.valueOf(axufVar == null ? 0 : axufVar.ordinal())));
        bwqfVar.aq(new dtrt("rbm_business_info_properties.property_value", 1, String.valueOf(str)));
        a2.k(new bwqe(bwqfVar));
        a2.z("getBusinessInfoDataSync-rbm_business_info_properties_by_short_code");
        Stream map = Collection.EL.stream(a2.b().y()).map(new Function() { // from class: avhc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = avhf.a;
                String[] strArr = bwso.a;
                return (bwqm) ((bwox) obj).aw("rbm_business_info", bwqm.class);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final elfl a(final String str, final boolean z) {
        avhd avhdVar;
        if (TextUtils.isEmpty(str)) {
            return elfo.d(new avhg("Retrieval requested for invalid bot ID", 2));
        }
        if (((Objects.equals(b.e(), "2") && this.i.a()) || this.e.b(str)) && (avhdVar = (avhd) this.j.get(str)) != null) {
            if (avhdVar.c > this.h.f().toEpochMilli()) {
                return elfo.e(avhdVar);
            }
            this.j.remove(str);
        }
        return elfo.g(new Callable() { // from class: avgz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enru enruVar = avhf.a;
                return bwso.a(str);
            }
        }, this.n).i(new eroh() { // from class: avha
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                bwqm bwqmVar = (bwqm) obj;
                final String str2 = null;
                if (bwqmVar != null && z) {
                    str2 = bwqmVar.q();
                }
                final String str3 = str;
                final avhf avhfVar = avhf.this;
                ensk h = avhf.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "retrieve", 175, "RbmBusinessInfoJsonRetriever.java")).D("Building HTTP request, Bot ID: %s, version: %s", str3, str2);
                return elfl.g(kfg.a(new kfd() { // from class: avgy
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        aveo aveoVar;
                        avhf avhfVar2 = avhf.this;
                        avhe avheVar = new avhe(avhfVar2, kfbVar);
                        boolean isEmpty = TextUtils.isEmpty((CharSequence) avic.g.e());
                        avhp avhpVar = avhfVar2.e;
                        String str4 = str3;
                        if (isEmpty) {
                            if (((Boolean) ((cfup) avic.f.get()).e()).booleanValue()) {
                                Optional map = ((djry) avhpVar.f.b()).m().map(new Function() { // from class: avhm
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return ((djtp) obj2).i().botInfoDomain;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (map.isPresent()) {
                                    avhp.a.p("using bot domain root from RCS config");
                                    aveoVar = ((Boolean) ((cfup) avic.h.get()).e()).booleanValue() ? avhp.a((String) map.get()) : new aveo((String) map.get());
                                }
                            }
                            avhp.a.p("generating bot domain from bot ID");
                            String[] split = str4.split("@", 2);
                            if (split.length < 2 || TextUtils.isEmpty(split[1])) {
                                throw new avhg("Cannot get domain from invalid botID: ".concat(str4), 3);
                            }
                            aveoVar = new aveo(split[1]);
                        } else {
                            avhp.a.p("using bot domain override");
                            aveoVar = ((Boolean) ((cfup) avic.h.get()).e()).booleanValue() ? avhp.a((String) avic.g.e()) : new aveo((String) avic.g.e());
                        }
                        final Uri.Builder authority = new Uri.Builder().scheme("https").authority(aveoVar.a);
                        authority.getClass();
                        aveoVar.b.ifPresent(new Consumer() { // from class: avhn
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                authority.path((String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        authority.appendPath("bot").appendQueryParameter("id", "sip:".concat(str4)).appendQueryParameter("hl", ctid.c(avhpVar.e).getLanguage());
                        if (avhpVar.b(str4)) {
                            authority.appendQueryParameter("v", "2");
                        } else {
                            authority.appendQueryParameter("v", (String) avhf.b.e());
                        }
                        CronetEngine cronetEngine = avhpVar.b;
                        String str5 = str2;
                        avhpVar.d.h().ifPresent(new Consumer() { // from class: avho
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                authority.appendQueryParameter("ho", (String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        String uri = authority.build().toString();
                        csjb c2 = avhp.a.c();
                        c2.A("Business Info URL successfully built", uri);
                        c2.r();
                        UrlRequest.Builder trafficStatsTag = cronetEngine.newUrlRequestBuilder(uri, avheVar, avhpVar.c).setTrafficStatsTag(8192);
                        if (!TextUtils.isEmpty(str5)) {
                            trafficStatsTag = trafficStatsTag.addHeader("If-None-Match", str5);
                        }
                        UrlRequest build = trafficStatsTag.build();
                        ensk h2 = avhf.a.h();
                        h2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "retrieve", 185, "RbmBusinessInfoJsonRetriever.java")).t("Starting HTTP request for %s", str4);
                        build.start();
                        return "HTTP request for ".concat(str4);
                    }
                }));
            }
        }, this.n).h(new emwl() { // from class: avhb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avhd avhdVar2 = (avhd) obj;
                boolean equals = Objects.equals(avhf.b.e(), "2");
                avhf avhfVar = avhf.this;
                String str2 = str;
                if ((equals && avhfVar.i.a()) || avhfVar.k.b.contains(str2)) {
                    avhfVar.j.put(str2, avhdVar2);
                }
                return avhdVar2;
            }
        }, this.m);
    }

    public final elfl b(String str, final Duration duration) {
        final String a2 = aver.a(str);
        return TextUtils.isEmpty(a2) ? elfo.d(new avhg("Invalid Short Code: ".concat(String.valueOf(a2)), 2)) : elfo.g(new Callable() { // from class: avgw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return avhf.c(a2);
            }
        }, this.n).i(new eroh() { // from class: avgx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                int size = engwVar.size();
                final String str2 = a2;
                if (size > 1) {
                    ensk j = avhf.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 245, "RbmBusinessInfoJsonRetriever.java")).D("Multiple bots (%s) for short code: %s", Collection.EL.stream(engwVar).map(new Function() { // from class: avgt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((bwqm) obj2).n();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.b), str2);
                }
                Duration duration2 = duration;
                final avhf avhfVar = avhf.this;
                Optional findFirst = Collection.EL.stream(engwVar).findFirst();
                String str3 = (String) findFirst.map(new Function() { // from class: avgt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bwqm) obj2).n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                final String str4 = (String) findFirst.map(new Function() { // from class: avgu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bwqm) obj2).q();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                elfl g = elfl.g(kfg.a(new kfd() { // from class: avgv
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        avhf avhfVar2 = avhf.this;
                        avhe avheVar = new avhe(avhfVar2, kfbVar);
                        String str5 = str2;
                        String a3 = aver.a(str5);
                        aveo aveoVar = aver.b;
                        final Uri.Builder authority = new Uri.Builder().scheme("https").authority(aveoVar.a);
                        Optional optional = aveoVar.b;
                        authority.getClass();
                        optional.ifPresent(new Consumer() { // from class: avep
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                authority.path((String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Uri.Builder appendQueryParameter = authority.appendPath("bot").appendQueryParameter("id", "tel:".concat(String.valueOf(a3)));
                        aver averVar = avhfVar2.f;
                        appendQueryParameter.appendQueryParameter("hl", ctid.c(averVar.f).getLanguage());
                        if (averVar.g.b.contains(a3)) {
                            authority.appendQueryParameter("v", "2");
                        } else {
                            authority.appendQueryParameter("v", (String) avhf.b.e());
                        }
                        CronetEngine cronetEngine = averVar.c;
                        String str6 = str4;
                        averVar.e.h().ifPresent(new Consumer() { // from class: aveq
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                enru enruVar = aver.a;
                                authority.appendQueryParameter("ho", (String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        String uri = authority.build().toString();
                        ensk h = aver.a.h();
                        h.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator", "createUrl", 159, "RbmBusinessInfoAndShortCodeUrlCreator.java")).t("Business Info URL successfully built: %s", uri);
                        UrlRequest.Builder trafficStatsTag = cronetEngine.newUrlRequestBuilder(uri, avheVar, averVar.d).setTrafficStatsTag(8193);
                        if (!TextUtils.isEmpty(str6)) {
                            trafficStatsTag = trafficStatsTag.addHeader("If-None-Match", str6);
                        }
                        UrlRequest build = trafficStatsTag.build();
                        ensk h2 = avhf.a.h();
                        h2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 262, "RbmBusinessInfoJsonRetriever.java")).t("Starting HTTP request for %s...", str5);
                        build.start();
                        return "HTTP request for ".concat(String.valueOf(str5));
                    }
                }));
                avhfVar.l = duration2.toMillis();
                ensk h = avhf.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 267, "RbmBusinessInfoJsonRetriever.java")).K("Short code: %s - %s, v: %s (timeout: %s)", str2, str3, str4, duration2);
                return g.j(duration2.toMillis(), TimeUnit.MILLISECONDS, avhfVar.g);
            }
        }, this.n);
    }
}
