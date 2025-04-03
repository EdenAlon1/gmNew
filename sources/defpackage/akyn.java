package defpackage;

import android.content.Context;
import com.android.vcard.VCardConfig;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akyn implements akyb, akyo {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl");
    private static final cskc d = cskc.g("BugleClearcutLogger", "ClearcutLoggerV2");
    public final Executor b;
    public final cqoh c;
    private final enhk e;
    private final Context f;
    private final ffbr g;
    private final albl h;
    private final enhk i;
    private final enhk j;
    private final enhk k;
    private final Long m;
    private final Long o;
    private final boolean p;
    private final emyl q;
    private final akxp r;
    private final akyi l = new akyi();
    private final AtomicLong n = new AtomicLong();

    public akyn(akxp akxpVar, Context context, boolean z, emyl emylVar, cqoh cqohVar, ffbr ffbrVar, albl alblVar, Executor executor, int i) {
        enhk enhkVar;
        this.r = akxpVar;
        this.f = context;
        this.q = emylVar;
        this.c = cqohVar;
        this.p = z;
        long max = Math.max(((Long) akzr.b.e()).longValue(), 1L);
        boolean z2 = max >= 0;
        int i2 = ermv.b;
        emxf.e(z2, "value (%s) is outside the range for an unsigned long value", max);
        ermv ermvVar = new ermv(max);
        long j = new ermv(UUID.randomUUID().getLeastSignificantBits()).a;
        long j2 = ermvVar.a;
        if (j2 < 0) {
            if (ermw.a(j, j2) >= 0) {
                j -= j2;
            }
        } else if (j >= 0) {
            j %= j2;
        } else {
            long j3 = (j >>> 1) / j2;
            long j4 = j - ((j3 + j3) * j2);
            j = j4 - (ermw.a(j4, j2) >= 0 ? j2 : 0L);
        }
        this.m = Long.valueOf(new ermv(j).a);
        this.o = Long.valueOf(Math.max(((Integer) akzr.a.e()).intValue(), 1L));
        this.k = enhk.o(alaw.PER_EVENT_THROTTLING, new akym(emylVar), alaw.ONCE_PER_APP_START, new akyl(), alaw.ALWAYS_LOGGING, new akyk(), alaw.NO_LOGGING, new akyj());
        this.g = ffbrVar;
        this.h = alblVar;
        this.b = executor;
        try {
            alap alapVar = (alap) eyfy.parseFrom(alap.a, (byte[]) akzr.c.e(), eyfc.a());
            enhd enhdVar = new enhd();
            for (alan alanVar : alapVar.b) {
                alal b = alal.b(alanVar.b);
                if (b == null) {
                    b = alal.LOG_SPEC_UNSPECIFIED;
                }
                enhdVar.k(b, alanVar);
            }
            enhkVar = enhdVar.b();
        } catch (Exception e) {
            d.s("Failed to parse logging configuration flag", e);
            enhkVar = enoz.a;
        }
        this.i = enhkVar;
        faxs faxsVar = faxs.DEFAULT;
        dfld d2 = d(i, faxsVar);
        faxs faxsVar2 = faxs.FAST_IF_RADIO_AWAKE;
        dfld d3 = d(i, faxsVar2);
        faxs faxsVar3 = faxs.UNMETERED_OR_DAILY;
        dfld d4 = d(i, faxsVar3);
        faxs faxsVar4 = faxs.UNMETERED_ONLY;
        this.e = enhk.o(faxsVar, d2, faxsVar2, d3, faxsVar3, d4, faxsVar4, d(i, faxsVar4));
        this.j = (enhk) Collection.EL.stream(enhkVar.entrySet()).collect(endq.a(new Function() { // from class: akyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (alal) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: akyd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new alas((alan) ((Map.Entry) obj).getValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    private final dfld d(int i, faxs faxsVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            akxp akxpVar = this.r;
            List list = dfld.m;
            dfla dflaVar = new dfla(akxpVar.a, "ANDROID_MESSAGING");
            dflaVar.b(faxsVar);
            return dflaVar.c();
        }
        if (i2 != 1) {
            dfla h = dfld.h(this.r.a, "ANDROID_MESSAGING");
            h.b(faxsVar);
            return h.c();
        }
        dfla g = dfld.g(this.r.a, "ANDROID_MESSAGING");
        g.b(faxsVar);
        return g.c();
    }

    @Override // defpackage.akyb
    public final akxn a() {
        akxj akxjVar = new akxj();
        akxjVar.a = this;
        return akxjVar;
    }

    @Override // defpackage.akyo
    public final Optional b(alal alalVar) {
        if (!this.i.containsKey(alalVar)) {
            return Optional.empty();
        }
        alaz alazVar = ((alan) this.i.get(alalVar)).d;
        if (alazVar == null) {
            alazVar = alaz.a;
        }
        if (((Random) this.q.get()).nextDouble() >= alazVar.b) {
            return Optional.empty();
        }
        try {
            Stream map = DesugarArrays.stream(Thread.currentThread().getStackTrace()).skip(Math.max(alazVar.c, 0)).limit(Math.max(alazVar.d, 0)).map(new Function() { // from class: akye
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((StackTraceElement) obj).toString();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            return Optional.of((List) map.collect(endq.a));
        } catch (RuntimeException e) {
            d.s("Failed to generate stacktrace", e);
            return Optional.of(engw.r("Failed to extract stacktrace"));
        }
    }

    @Override // defpackage.akyo
    public final void c(final akxo akxoVar) {
        boolean a2;
        elfl c;
        akxk akxkVar = (akxk) akxoVar;
        alal alalVar = akxkVar.b;
        if (this.i.containsKey(alalVar)) {
            alan alanVar = (alan) this.i.get(alalVar);
            enhk enhkVar = this.k;
            alax alaxVar = alanVar.c;
            if (alaxVar == null) {
                alaxVar = alax.a;
            }
            alaw b = alaw.b(alaxVar.b);
            if (b == null) {
                b = alaw.UNKNOWN_SAMPLING_MODE;
            }
            a2 = ((akyh) enhkVar.getOrDefault(b, this.l)).a(alanVar);
        } else {
            a2 = ((Boolean) akzr.d.e()).booleanValue();
        }
        if (a2) {
            epdc epdcVar = (epdc) epdd.a.createBuilder();
            alal alalVar2 = akxkVar.b;
            epdcVar.copyOnWrite();
            epdd epddVar = (epdd) epdcVar.instance;
            epddVar.c = alalVar2.ad;
            epddVar.b |= 1;
            int i = akxkVar.f;
            epdcVar.copyOnWrite();
            epdd epddVar2 = (epdd) epdcVar.instance;
            epddVar2.d = i - 1;
            epddVar2.b |= 2;
            Optional or = akxkVar.c.or(new Supplier() { // from class: akyf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return akyn.this.b(((akxk) akxoVar).b);
                }
            });
            if (!or.isEmpty()) {
                for (String str : (List) or.get()) {
                    epdcVar.copyOnWrite();
                    epdd epddVar3 = (epdd) epdcVar.instance;
                    str.getClass();
                    eygr eygrVar = epddVar3.e;
                    if (!eygrVar.c()) {
                        epddVar3.e = eyfy.mutableCopy(eygrVar);
                    }
                    epddVar3.e.add(str);
                }
            }
            final eolu eoluVar = akxkVar.a;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            epdd epddVar4 = (epdd) epdcVar.build();
            eolv eolvVar2 = eolv.a;
            epddVar4.getClass();
            eolvVar.bS = epddVar4;
            eolvVar.g |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (this.p) {
                long incrementAndGet = this.n.incrementAndGet();
                eyry eyryVar = (eyry) eyrz.a.createBuilder();
                long longValue = this.m.longValue();
                eyryVar.copyOnWrite();
                eyrz eyrzVar = (eyrz) eyryVar.instance;
                eyrzVar.b |= 4;
                eyrzVar.e = longValue;
                long longValue2 = incrementAndGet % this.o.longValue();
                eyryVar.copyOnWrite();
                eyrz eyrzVar2 = (eyrz) eyryVar.instance;
                eyrzVar2.b |= 8;
                eyrzVar2.f = longValue2;
                eoluVar.copyOnWrite();
                eolv eolvVar3 = (eolv) eoluVar.instance;
                eyrz eyrzVar3 = (eyrz) eyryVar.build();
                eyrzVar3.getClass();
                eolvVar3.bf = eyrzVar3;
                eolvVar3.f |= 4;
            }
            eolt b2 = eolt.b(((eolv) eoluVar.instance).j);
            if (b2 == null) {
                b2 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            final epyw epywVar = (epyw) akxkVar.e.orElse(epyw.UNKNOWN_BUGLE_EVENT_CODE);
            b2.getClass();
            epywVar.getClass();
            if (epywVar == epyw.UNKNOWN_BUGLE_EVENT_CODE) {
                Object fP = new akzy().fP(b2);
                if (fP == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                epywVar = (epyw) fP;
            }
            enhk enhkVar2 = this.j;
            alal alalVar3 = akxkVar.b;
            faxs faxsVar = faxs.DEFAULT;
            alas alasVar = (alas) enhkVar2.get(alalVar3);
            if (alasVar != null) {
                eolt b3 = eolt.b(((eolv) eoluVar.instance).j);
                if (b3 == null) {
                    b3 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                b3.getClass();
                if (alasVar.a.containsKey(b3)) {
                    Object obj = alasVar.a.get(b3);
                    obj.getClass();
                    faxsVar = (faxs) obj;
                } else if (alasVar.b.containsKey(epywVar)) {
                    Object obj2 = alasVar.b.get(epywVar);
                    obj2.getClass();
                    faxsVar = (faxs) obj2;
                } else {
                    faxsVar = alasVar.c;
                    faxsVar.getClass();
                }
            } else {
                ((enrr) d.i().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 199, "BugleClearcutLoggerV2Impl.java")).t("qosTierResolver for %s is null. Using DEFAULT QoS tier as there's no specific QoS configuration for this log spec.", akxkVar.b.name());
            }
            dfld dfldVar = (dfld) this.e.get(faxsVar);
            if (dfldVar == null) {
                throw new IllegalStateException("clearcutLogger for " + faxsVar.name() + " is null. ");
            }
            final dflc j = dfldVar.j(eoluVar.build(), dtql.b(this.f, new eohd()));
            j.i(epywVar.f11do);
            if (!dfldVar.e()) {
                j.g("com.google.android.ims.library");
            }
            if (akxkVar.d.isPresent()) {
                j.j(((akzo) akxkVar.d.get()).a, ((akzo) akxkVar.d.get()).b);
            }
            albl alblVar = this.h;
            eolt b4 = eolt.b(((eolv) eoluVar.instance).j);
            if (b4 == null) {
                b4 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            if (((asvv) alblVar.b.b()).a()) {
                if (((enhk) alblVar.d.get()).containsKey(b4)) {
                    if (TimeUnit.MILLISECONDS.toSeconds(alblVar.a.f().toEpochMilli()) > ((Integer) ((enhk) alblVar.d.get()).get(b4)).intValue()) {
                        return;
                    }
                }
                if (((enhk) alblVar.c.get()).containsKey(epywVar)) {
                    if (TimeUnit.MILLISECONDS.toSeconds(alblVar.a.f().toEpochMilli()) > ((Integer) ((enhk) alblVar.c.get()).get(epywVar)).intValue()) {
                        return;
                    }
                }
            }
            aleo aleoVar = (aleo) this.g.b();
            eolv eolvVar4 = (eolv) eoluVar.build();
            eolvVar4.getClass();
            c = axol.c(aleoVar.a, ffhe.a, ffsm.a, new alej(aleoVar, eolvVar4, epywVar, null));
            axnw.h(c.h(new emwl() { // from class: akyg
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    if (!((Boolean) obj3).booleanValue()) {
                        dflc.this.c();
                    }
                    epyw epywVar2 = epywVar;
                    eolv eolvVar5 = (eolv) eoluVar.build();
                    ensk f = akyn.a.f();
                    f.Y(ente.a, "BugleClearcutLogger");
                    enrr enrrVar = (enrr) f;
                    enrrVar.Y(algr.m, Boolean.valueOf(!r6.booleanValue()));
                    enrrVar.Y(algr.d, Integer.valueOf(eolvVar5.getSerializedSize()));
                    enrrVar.Y(algr.n, epywVar2);
                    enrrVar.Y(algr.c, eolvVar5);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 252, "BugleClearcutLoggerV2Impl.java")).q("\nprotobuf ");
                    return null;
                }
            }, this.b));
        }
    }
}
