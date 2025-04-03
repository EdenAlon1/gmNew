package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuol implements cunw {
    public static final emyl a = cfvl.w("moirai_v1_catch_initialization_errors");
    public static final entd b = entd.c("BugleDataModel");
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final fazb f;
    private final errl g;
    private final errl h;

    public cuol(ffbr ffbrVar, ffbr ffbrVar2, fazb fazbVar, errl errlVar, errl errlVar2, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.e = ffbrVar2;
        this.f = fazbVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.d = ffbrVar3;
    }

    public static String h(Exception exc) {
        ((ensz) ((ensz) ((ensz) b.j()).g(exc)).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "logErrorDetectingLanguage", (char) 361, "BugleMoiraiApiImpl.java")).q("Unable to detect language.");
        return "";
    }

    private final elfl i(culh culhVar, final String str, final eylu eyluVar, final rum rumVar, final eylw eylwVar) {
        final String str2 = culhVar.b;
        return (str2 == null || str2.trim().isEmpty()) ? elfo.e(new dlgu()) : j(culhVar).i(new eroh() { // from class: cunx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                boolean booleanValue = ((Boolean) ((cfup) ctjd.bz.get()).e()).booleanValue();
                cuol cuolVar = cuol.this;
                if (booleanValue) {
                    ((cuql) cuolVar.d.b()).a(str3);
                }
                String str4 = str2;
                rqp rqpVar = (rqp) rqq.a.createBuilder();
                rqpVar.copyOnWrite();
                rqq rqqVar = (rqq) rqpVar.instance;
                rqqVar.b |= 1;
                rqqVar.c = str4;
                if (str3 != null) {
                    rqpVar.copyOnWrite();
                    rqq rqqVar2 = (rqq) rqpVar.instance;
                    rqqVar2.b |= 2;
                    rqqVar2.d = str3;
                }
                String str5 = str;
                rqj rqjVar = (rqj) rqk.a.createBuilder();
                rse rseVar = (rse) rsf.a.createBuilder();
                rseVar.copyOnWrite();
                rsf rsfVar = (rsf) rseVar.instance;
                rqq rqqVar3 = (rqq) rqpVar.build();
                rqqVar3.getClass();
                rsfVar.d = rqqVar3;
                rsfVar.b |= 2;
                rsf rsfVar2 = (rsf) rseVar.build();
                rqjVar.copyOnWrite();
                rqk rqkVar = (rqk) rqjVar.instance;
                rsfVar2.getClass();
                rqkVar.c = rsfVar2;
                rqkVar.b |= 1;
                rsb rsbVar = (rsb) rsc.a.createBuilder();
                if (str5 != null) {
                    rsk rskVar = (rsk) rsl.a.createBuilder();
                    rrs rrsVar = (rrs) rrz.a.createBuilder();
                    rrsVar.copyOnWrite();
                    rrz rrzVar = (rrz) rrsVar.instance;
                    rrzVar.b |= 1;
                    rrzVar.c = str5;
                    rrz rrzVar2 = (rrz) rrsVar.build();
                    rskVar.copyOnWrite();
                    rsl rslVar = (rsl) rskVar.instance;
                    rrzVar2.getClass();
                    rslVar.c = rrzVar2;
                    rslVar.b |= 1;
                    rsl rslVar2 = (rsl) rskVar.build();
                    rqjVar.copyOnWrite();
                    rqk rqkVar2 = (rqk) rqjVar.instance;
                    rslVar2.getClass();
                    rqkVar2.e = rslVar2;
                    rqkVar2.b |= 4;
                }
                eylu eyluVar2 = eyluVar;
                if (eyluVar2 != null) {
                    try {
                        rrd rrdVar = (rrd) eyfy.parseFrom(rrd.a, eyluVar2.toByteString(), eyfc.a());
                        rsbVar.copyOnWrite();
                        rsc rscVar = (rsc) rsbVar.instance;
                        rrdVar.getClass();
                        rscVar.d = rrdVar;
                        rscVar.b |= 2;
                    } catch (Exception e) {
                        return elfo.d(new IllegalArgumentException("BugleMoiraiApiImpl#callHadesClassify: unable to parse MessageContext", e));
                    }
                }
                eylw eylwVar2 = eylwVar;
                if (eylwVar2 != null) {
                    try {
                        rrh rrhVar = (rrh) eyfy.parseFrom(rrh.a, eylwVar2.toByteString(), eyfc.a());
                        rsbVar.copyOnWrite();
                        rsc rscVar2 = (rsc) rsbVar.instance;
                        rrhVar.getClass();
                        rscVar2.c = rrhVar;
                        rscVar2.b |= 1;
                    } catch (Exception e2) {
                        return elfo.d(new IllegalArgumentException("BugleMoiraiApiImpl#callHadesClassify: unable to parse SInfoParams", e2));
                    }
                }
                rum rumVar2 = rumVar;
                rsc rscVar3 = (rsc) rsbVar.build();
                rqjVar.copyOnWrite();
                rqk rqkVar3 = (rqk) rqjVar.instance;
                rscVar3.getClass();
                rqkVar3.f = rscVar3;
                rqkVar3.b |= 8;
                dlfy a2 = dlfx.a((rqk) rqjVar.build());
                return rumVar2 != null ? cuolVar.g(a2, rumVar2) : cuolVar.e(a2);
            }
        }, erpp.a);
    }

    private final elfl j(culh culhVar) {
        ctit ctitVar = (ctit) this.f.b();
        fbuo fbuoVar = (fbuo) fbup.a.createBuilder();
        fbum fbumVar = (fbum) fbun.a.createBuilder();
        String str = culhVar.b;
        str.getClass();
        fbumVar.copyOnWrite();
        fbun fbunVar = (fbun) fbumVar.instance;
        fbunVar.b = 30;
        fbunVar.c = str;
        fbuoVar.b((fbun) fbumVar.build());
        return ctitVar.a((fbup) fbuoVar.build()).h(new emwl() { // from class: cuod
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Locale locale = (Locale) obj;
                if (locale != null) {
                    ((ensz) cuol.b.o().h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "getLanguageAsync", 342, "BugleMoiraiApiImpl.java")).q("Detected language.");
                    return locale.getLanguage();
                }
                ((ensz) ((ensz) cuol.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "getLanguageAsync", 345, "BugleMoiraiApiImpl.java")).q("Unable to detect language.");
                return "";
            }
        }, erpp.a).e(IllegalStateException.class, new emwl() { // from class: cuoe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cuol.h((IllegalStateException) obj);
            }
        }, erpp.a).e(IllegalArgumentException.class, new emwl() { // from class: cuof
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cuol.h((IllegalArgumentException) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.cunw
    public final elfl a(culh culhVar, String str, eylu eyluVar) {
        if (((Boolean) ((cfup) cubs.e.get()).e()).booleanValue()) {
            return i(culhVar, str, eyluVar, null, null);
        }
        final String str2 = culhVar.b;
        return (str2 == null || str2.trim().isEmpty()) ? elfo.e(new dlgu()) : j(culhVar).i(new eroh() { // from class: cuoj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                boolean booleanValue = ((Boolean) ((cfup) ctjd.bz.get()).e()).booleanValue();
                cuol cuolVar = cuol.this;
                if (booleanValue) {
                    ((cuql) cuolVar.d.b()).a(str3);
                }
                return cuolVar.f(str2, str3, null);
            }
        }, erpp.a);
    }

    @Override // defpackage.cunw
    public final elfl b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return e(dlfx.b(str));
        }
        ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "classifyDestination", 131, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#classify: empty phone number");
        return elfo.e(new dlgu());
    }

    @Override // defpackage.cunw
    public final elfl c(culh culhVar, String str, eylu eyluVar, eylw eylwVar) {
        return i(culhVar, str, eyluVar, null, eylwVar);
    }

    @Override // defpackage.cunw
    public final elfl d(culh culhVar, final rum rumVar) {
        if (((Boolean) ((cfup) cubs.e.get()).e()).booleanValue()) {
            return i(culhVar, null, null, rumVar, null);
        }
        final String str = culhVar.b;
        return (str == null || str.trim().isEmpty()) ? elfo.e(new dlgu()) : j(culhVar).i(new eroh() { // from class: cuoc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cuol.this.f(str, (String) obj, rumVar);
            }
        }, erpp.a);
    }

    public final elfl e(final dlfy dlfyVar) {
        elfl i;
        ekzz f = eleg.f("BugleMoiraiApiImpl#callHadesClassify");
        try {
            if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
                i = ((cupd) this.e.b()).a().i(new eroh() { // from class: cuog
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((cupl) cuol.this.c.b()).a(dlfyVar);
                    }
                }, this.h).e(IllegalStateException.class, new emwl() { // from class: cuoh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((ensz) ((ensz) cuol.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "callHadesClassify", 279, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#callHadesClassify: failed to initialize");
                        return new dlgu("NOT_AVAILABLE", dlfs.e, 4);
                    }
                }, this.g);
                f.b(i);
            } else {
                i = ((cupd) this.e.b()).a().i(new eroh() { // from class: cuoi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((cupl) cuol.this.c.b()).a(dlfyVar);
                    }
                }, erpp.a);
                f.b(i);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl f(final String str, final String str2, rum rumVar) {
        dlfy a2 = dlfz.a(new ffji() { // from class: dlfv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                enhd enhdVar = (enhd) obj;
                enhdVar.getClass();
                final String str3 = str;
                final String str4 = str2;
                dlfz.b(enhdVar, new ffji() { // from class: dlft
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        rqm rqmVar = (rqm) obj2;
                        rqmVar.getClass();
                        rse rseVar = (rse) rsf.a.createBuilder();
                        rseVar.getClass();
                        rqp rqpVar = (rqp) rqq.a.createBuilder();
                        rqpVar.getClass();
                        rqr.c(str3, rqpVar);
                        String str5 = str4;
                        if (str5 != null) {
                            rqr.b(str5, rqpVar);
                        }
                        rsg.c(rqr.a(rqpVar), rseVar);
                        rqmVar.c(rsg.a(rseVar));
                        return ffcu.a;
                    }
                });
                return ffcu.a;
            }
        });
        return rumVar != null ? g(a2, rumVar) : e(a2);
    }

    public final elfl g(final dlfy dlfyVar, final rum rumVar) {
        elfl h;
        ekzz f = eleg.f("BugleMoiraiApiImpl#callHadesReportUserFeedback");
        try {
            if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
                h = ((cupd) this.e.b()).a().i(new eroh() { // from class: cuok
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((cupl) cuol.this.c.b()).b(dlfyVar, rumVar);
                    }
                }, this.h).h(new emwl() { // from class: cuny
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        emyl emylVar = cuol.a;
                        return new dlgu();
                    }
                }, this.g).e(IllegalStateException.class, new emwl() { // from class: cunz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((ensz) ((ensz) cuol.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "callHadesReportUserFeedback", 311, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#callHadesReportUserFeedback: failed to initialize");
                        return new dlgu("NOT_AVAILABLE", dlfs.e, 4);
                    }
                }, this.g);
                f.b(h);
            } else {
                h = ((cupd) this.e.b()).a().i(new eroh() { // from class: cuoa
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ((cupl) cuol.this.c.b()).b(dlfyVar, rumVar);
                    }
                }, erpp.a).h(new emwl() { // from class: cuob
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        emyl emylVar = cuol.a;
                        return new dlgu();
                    }
                }, erpp.a);
                f.b(h);
            }
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
}
