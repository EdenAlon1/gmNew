package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbr {
    public static final engf a;
    public static final cskc b;
    public static final cfva c;
    public final effy d;
    public final cqoh e;
    public final ejvb f;
    public final cfyt g;
    public final errl h;
    private final comc i;
    private volatile boolean j = false;

    static {
        eten etenVar = eten.C11N;
        cvam cvamVar = cvam.C11N;
        eten etenVar2 = eten.RCS;
        cvam cvamVar2 = cvam.RCS;
        eten etenVar3 = eten.C11N_RCS;
        cvam cvamVar3 = cvam.C11N_RCS;
        endr.a(etenVar, cvamVar);
        endr.a(etenVar2, cvamVar2);
        endr.a(etenVar3, cvamVar3);
        a = new enot(new Object[]{etenVar, cvamVar, etenVar2, cvamVar2, etenVar3, cvamVar3}, 3);
        b = cskc.g("Bugle", "VerifiedSmsDataService");
        cfvl.i(cfvl.b, "verified_sms_enable_clearing_registration_data", true);
        c = cfvl.i(cfvl.b, "enable_vsms_keypair_consistency_read_check", false);
    }

    public cvbr(ffbr ffbrVar, effy effyVar, cqoh cqohVar, akzt akztVar, ejvb ejvbVar, cfyt cfytVar, errl errlVar) {
        this.d = effyVar;
        this.e = cqohVar;
        this.f = ejvbVar;
        comy comyVar = (comy) ffbrVar.b();
        comu c2 = comv.c();
        c2.d(comb.VERIFIED_SMS);
        c2.f(cvas.a);
        c2.e(new cvbp(effyVar, akztVar));
        this.i = comyVar.a(c2.a());
        this.g = cfytVar;
        this.h = errlVar;
    }

    public static Collection i(Collection collection, Object obj) {
        enev enevVar = new enev(5);
        enevVar.addAll(collection);
        enevVar.add(obj);
        return enevVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cvao a(cvas cvasVar, String str, cvbt cvbtVar, cvam cvamVar) {
        cvan cvanVar = cvan.a;
        eyhm eyhmVar = cvasVar.e;
        if (eyhmVar.containsKey(str)) {
            cvanVar = (cvan) eyhmVar.get(str);
        }
        cval cvalVar = (cval) cvanVar.toBuilder();
        cskc cskcVar = b;
        cskcVar.p("Setting registration time.");
        cvalVar.a(cvbtVar);
        long epochMilli = this.e.f().toEpochMilli();
        cvalVar.copyOnWrite();
        ((cvan) cvalVar.instance).c = epochMilli;
        csjb c2 = cskcVar.c();
        c2.A("Setting registration type", cvamVar);
        c2.r();
        cvalVar.copyOnWrite();
        ((cvan) cvalVar.instance).f = cvamVar.a();
        cvao cvaoVar = (cvao) cvasVar.toBuilder();
        while (true) {
            if (((cvan) cvalVar.instance).b.size() <= 2) {
                break;
            }
            cvbt cvbtVar2 = (cvbt) ((cvan) cvalVar.instance).b.get(0);
            if (cvbtVar2.equals(cvbtVar)) {
                b.r("Attempting to remove fresh key pair? Something is wrong with the order. Cleaning and now fresh pair is the only pair stored.");
                cvalVar.copyOnWrite();
                ((cvan) cvalVar.instance).b = cvan.emptyProtobufList();
                cvalVar.a(cvbtVar);
                cvah cvahVar = ((cvas) cvaoVar.instance).j;
                if (cvahVar == null) {
                    cvahVar = cvah.a;
                }
                cvaf cvafVar = (cvaf) cvahVar.toBuilder();
                cvafVar.copyOnWrite();
                ((cvah) cvafVar.instance).c = true;
                cvah cvahVar2 = (cvah) cvafVar.build();
                cvaoVar.copyOnWrite();
                cvas cvasVar2 = (cvas) cvaoVar.instance;
                cvahVar2.getClass();
                cvasVar2.j = cvahVar2;
                cvasVar2.b |= 2;
            } else {
                cskc cskcVar2 = b;
                cskcVar2.p("Removing a deprecated pair of keys.");
                cvalVar.copyOnWrite();
                cvan cvanVar2 = (cvan) cvalVar.instance;
                cvanVar2.a();
                cvanVar2.b.remove(0);
                if (cvasVar.h) {
                    cskcVar2.p("Populating diagnostic info with deprecated key pair.");
                    cvah cvahVar3 = ((cvas) cvaoVar.instance).j;
                    if (cvahVar3 == null) {
                        cvahVar3 = cvah.a;
                    }
                    cvai cvaiVar = (cvai) ((cvaj) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(cvahVar3.f), str, cvaj.a)).toBuilder();
                    Collection i = i(DesugarCollections.unmodifiableList(((cvaj) cvaiVar.instance).b), cvbtVar2);
                    cvaiVar.copyOnWrite();
                    ((cvaj) cvaiVar.instance).b = cvaj.emptyProtobufList();
                    cvaiVar.copyOnWrite();
                    cvaj cvajVar = (cvaj) cvaiVar.instance;
                    eygr eygrVar = cvajVar.b;
                    if (!eygrVar.c()) {
                        cvajVar.b = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(i, cvajVar.b);
                    cvah cvahVar4 = ((cvas) cvaoVar.instance).j;
                    if (cvahVar4 == null) {
                        cvahVar4 = cvah.a;
                    }
                    cvaf cvafVar2 = (cvaf) cvahVar4.toBuilder();
                    cvaj cvajVar2 = (cvaj) cvaiVar.build();
                    cvajVar2.getClass();
                    cvafVar2.copyOnWrite();
                    cvah cvahVar5 = (cvah) cvafVar2.instance;
                    eyhm eyhmVar2 = cvahVar5.f;
                    if (!eyhmVar2.b) {
                        cvahVar5.f = eyhmVar2.a();
                    }
                    cvahVar5.f.put(str, cvajVar2);
                    cvaoVar.copyOnWrite();
                    cvas cvasVar3 = (cvas) cvaoVar.instance;
                    cvah cvahVar6 = (cvah) cvafVar2.build();
                    cvahVar6.getClass();
                    cvasVar3.j = cvahVar6;
                    cvasVar3.b |= 2;
                }
            }
        }
        cvaoVar.d(str, (cvan) cvalVar.build());
        return cvaoVar;
    }

    public final elfl b(final String str, final String str2) {
        return h(new Function() { // from class: cvay
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                engf engfVar = cvbr.a;
                cvao cvaoVar = (cvao) ((cvas) obj).toBuilder();
                cvaoVar.c(str, str2);
                return cvaoVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl c() {
        return d().h(new emwl() { // from class: cvbe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((cvas) obj).f);
            }
        }, erpp.a);
    }

    public final elfl d() {
        return this.i.h().f(Exception.class, new eroh() { // from class: cvbg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cvbr cvbrVar = cvbr.this;
                final Exception exc = (Exception) obj;
                return cvbrVar.g.b(exc).i(new eroh() { // from class: cvaz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        engf engfVar = cvbr.a;
                        return elfo.d(exc);
                    }
                }, cvbrVar.h);
            }
        }, this.h);
    }

    public final elfl e() {
        return d().h(new emwl() { // from class: cvbf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cvas) obj).h);
            }
        }, erpp.a);
    }

    public final elfl f(final boolean z) {
        return h(new Function() { // from class: cvau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                engf engfVar = cvbr.a;
                cvao cvaoVar = (cvao) ((cvas) obj).toBuilder();
                cvaoVar.copyOnWrite();
                ((cvas) cvaoVar.instance).h = z;
                return cvaoVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl g(final long j) {
        return h(new Function() { // from class: cvbn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                engf engfVar = cvbr.a;
                cvao cvaoVar = (cvao) ((cvas) obj).toBuilder();
                cvaoVar.copyOnWrite();
                ((cvas) cvaoVar.instance).f = j;
                return cvaoVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl h(final Function function) {
        final long epochMilli = this.e.f().toEpochMilli();
        final Function function2 = new Function() { // from class: cvba
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                cvas cvasVar = (cvas) obj;
                engf engfVar = cvbr.a;
                apply = Function.this.apply(cvasVar);
                cvao cvaoVar = (cvao) apply;
                long j = epochMilli;
                eyja d = eykm.d(j);
                cvaoVar.copyOnWrite();
                cvas cvasVar2 = (cvas) cvaoVar.instance;
                cvas cvasVar3 = cvas.a;
                d.getClass();
                cvasVar2.i = d;
                cvasVar2.b |= 1;
                long j2 = cvasVar.k + 1;
                cvaoVar.copyOnWrite();
                ((cvas) cvaoVar.instance).k = j2;
                eyja eyjaVar = cvasVar.i;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                long b2 = eykm.b(eyjaVar);
                if (b2 > j) {
                    csjb e = cvbr.b.e();
                    e.I("Trying to update VerifiedSmsData with old data: update time must advance");
                    e.z("now", j);
                    eyja eyjaVar2 = cvasVar.i;
                    if (eyjaVar2 == null) {
                        eyjaVar2 = eyja.a;
                    }
                    e.A("oldUpdateTime", eyjaVar2);
                    e.z("diff_seconds", (b2 - j) / 1000);
                    e.r();
                    cvah cvahVar = ((cvas) cvaoVar.instance).j;
                    if (cvahVar == null) {
                        cvahVar = cvah.a;
                    }
                    cvaf cvafVar = (cvaf) cvahVar.toBuilder();
                    cvafVar.copyOnWrite();
                    ((cvah) cvafVar.instance).b = true;
                    cvah cvahVar2 = (cvah) cvafVar.build();
                    cvaoVar.copyOnWrite();
                    cvas cvasVar4 = (cvas) cvaoVar.instance;
                    cvahVar2.getClass();
                    cvasVar4.j = cvahVar2;
                    cvasVar4.b |= 2;
                }
                return (cvas) cvaoVar.build();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        return this.i.j(new cvbl(function2)).i(new eroh() { // from class: cvbb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cvbr.this.d.b(new cvbl(function2), erpp.a);
            }
        }, erpp.a);
    }
}
