package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoji implements aobh {
    public static final entd a = entd.c("Bugle");
    public final Context b;
    public final fazb c;
    public final fazb d;
    public final fazb e;
    public final fazb f;
    public final fazb g;
    private final fazb h;
    private final fazb i;
    private final fazb j;

    public aoji(Context context, fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5, fazb fazbVar6, fazb fazbVar7, fazb fazbVar8) {
        this.b = context;
        this.h = fazbVar;
        this.c = fazbVar2;
        this.d = fazbVar3;
        this.e = fazbVar4;
        this.i = fazbVar5;
        this.f = fazbVar6;
        this.g = fazbVar7;
        this.j = fazbVar8;
    }

    public static evhq o(ayvm ayvmVar, ctvf ctvfVar) {
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(ayvmVar, ctvfVar != null ? ctvfVar.toString() : null));
    }

    public static evhq p(final ayvm ayvmVar, engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: aoik
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aoji.a;
                return aoji.s(ayvm.this, ((ctvf) obj).toString());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, ((engw) map.collect(endq.a)).toString());
    }

    public static evhq q(ayvm ayvmVar, String str) {
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, ((ayhf) ayvmVar.a(String.valueOf(str))).b);
    }

    public static evhq r(ayvm ayvmVar, String str) {
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(ayvmVar, str));
    }

    public static String s(ayvm ayvmVar, String str) {
        return str == null ? "null" : ctxu.a(str) ? "AUTO" : ayvmVar.c(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku a(final String str) {
        return l(this.h.b().a(str), new emyl() { // from class: aojb
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().a(str);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku b(final awui awuiVar) {
        return l(this.h.b().b(awuiVar), new emyl() { // from class: aoim
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().b(awuiVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku c(final String str, final emyl emylVar) {
        return l(this.h.b().c(str, emylVar), new emyl() { // from class: aoje
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().c(str, emylVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku d(final djrj djrjVar) {
        return l(this.h.b().d(djrjVar), new emyl() { // from class: aoit
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().d(djrjVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku e(final String str, final String str2, final String str3, final boolean z, final String str4, final emyl emylVar) {
        return l(this.h.b().e(str, str2, str3, z, str4, emylVar), new emyl() { // from class: aojg
            /* JADX WARN: Type inference failed for: r1v0, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().e(str, str2, str3, z, str4, emylVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku f() {
        return l(this.h.b().f(), new emyl() { // from class: aojf
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().f();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku g(final aoku aokuVar, final emyl emylVar) {
        return l(this.h.b().g(aokuVar, emylVar), new emyl() { // from class: aoiz
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().g(aokuVar, emylVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku h(final aoku aokuVar, final String str) {
        return l(this.h.b().h(aokuVar, str), new emyl() { // from class: aoja
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().h(aokuVar, str);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku i(final aoku aokuVar, final boolean z) {
        return l(this.h.b().i(aokuVar, z), new emyl() { // from class: aoin
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().i(aokuVar, z);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku j(final aoku aokuVar, final int i) {
        return l(this.h.b().j(aokuVar, i), new emyl() { // from class: aoij
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().j(aokuVar, i);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku k(final aoku aokuVar) {
        return l(this.h.b().k(aokuVar), new emyl() { // from class: aoil
            /* JADX WARN: Type inference failed for: r0v2, types: [aobh, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                return aoji.this.c.b().k(aokuVar);
            }
        });
    }

    final aoku l(aoku aokuVar, emyl emylVar) {
        emyl a2 = emys.a(emylVar);
        aojh aojhVar = new aojh();
        return ((aokt) this.j.b()).c(n("local", new Function() { // from class: aoio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).j();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("raw", new Function() { // from class: aoip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("international", new Function() { // from class: aoiq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aoji.a;
                return ((aoku) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("legacy_normalized", new Function() { // from class: aoir
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aoji.a;
                String l = ((aoku) obj).l();
                l.getClass();
                return l;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("comparable", new Function() { // from class: aois
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aoji.a;
                return ((aoku) obj).o();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("rcsIdentifier", new Function() { // from class: aoiu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("display", new Function() { // from class: aoiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = aoji.a;
                return ((aoku) obj).G();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new Function() { // from class: aoiw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("callCode", new Function() { // from class: aoix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar), n("regionCode", new Function() { // from class: aoiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aokuVar, a2, aojhVar));
    }

    public final ctvf m(String str) {
        return (str == null || str.length() != 2) ? new ctvf(0) : new ctvf(((esfl) this.i.b()).a(str.toUpperCase(Locale.US)));
    }

    final emyl n(final String str, final Function function, final aoku aokuVar, final emyl emylVar, final Throwable th) {
        return emys.a(new emyl() { // from class: aoii
            @Override // defpackage.emyl
            public final Object get() {
                Object apply;
                Object apply2;
                Function function2 = function;
                aoku aokuVar2 = aokuVar;
                apply = function2.apply(aokuVar2);
                Double d = (Double) dizg.o().a.ac.a();
                double doubleValue = d.doubleValue();
                if (doubleValue < 1.0d) {
                    if (doubleValue <= eobe.a) {
                        ((ensz) aoji.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 269, "CsMessagingIdentityFactoryV2ShadowImpl.java")).q("CsMessagingIdentityFactoryV2ShadowImpl not logging because ratio=0%");
                        return apply;
                    }
                    if (ThreadLocalRandom.current().nextDouble() >= doubleValue) {
                        ((ensz) aoji.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 276, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging (ratio=%s%%)", d);
                        return apply;
                    }
                }
                aoku aokuVar3 = (aoku) emylVar.get();
                apply2 = function2.apply(aokuVar3);
                if (Objects.equals(apply, apply2)) {
                    ((ensz) aoji.a.o().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shadowGet", 253, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging because both returned %s", apply);
                    return apply;
                }
                final aoji aojiVar = aoji.this;
                String valueOf = String.valueOf(apply);
                String valueOf2 = String.valueOf(apply2);
                ayvm a2 = ((ayvn) aojiVar.d.b()).a();
                List m = ((ctwb) aojiVar.e.b()).m();
                Stream map = Collection.EL.stream(m).map(new Function() { // from class: aojc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return aoji.this.m(((ctwi) obj).p());
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) map.collect(endq.a);
                engw engwVar2 = (engw) Collection.EL.stream(m).map(new Function() { // from class: aojd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return aoji.this.m(((ctwi) obj).s());
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).collect(endq.a);
                Locale c = ctid.c(aojiVar.b);
                String upperCase = c != null ? c.getCountry().toUpperCase(c) : "";
                Throwable th2 = th;
                String str2 = str;
                String a3 = ((ctve) aojiVar.f.b()).a();
                ctvf m2 = aojiVar.m(((ctvb) aojiVar.g.b()).r());
                ensz enszVar = (ensz) aoji.a.j();
                enszVar.W(2, TimeUnit.SECONDS);
                ensz enszVar2 = (ensz) enszVar.g(th2);
                enszVar2.aa(ensy.SMALL);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "logMiDifference", 313, "CsMessagingIdentityFactoryV2ShadowImpl.java")).P("MessagingIdentityV2#%s has different result than MessagingIdentityV1: v2{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  v1{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCountryCodes=[%s], networkCountryCodes=[%s], settingsCountryCode=[%s]", new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, str2), aoji.q(a2, valueOf2), aoji.q(a2, aokuVar3.n()), aoji.q(a2, aokuVar3.j()), aoji.o(a2, (ctvf) aokuVar3.f().orElse(null)), new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, aokuVar3.a().name()), aoji.q(a2, valueOf), aoji.q(a2, aokuVar2.n()), aoji.q(a2, aokuVar2.j()), aoji.o(a2, (ctvf) aokuVar2.f().orElse(null)), new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, aokuVar2.a().name()), aoji.r(a2, upperCase), aoji.r(a2, a3), aoji.p(a2, engwVar2), aoji.p(a2, engwVar), aoji.o(a2, m2));
                return apply;
            }
        });
    }
}
