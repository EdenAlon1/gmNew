package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chze {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder");
    public final Context b;
    public final fcbq c;
    public final errl d;
    public ListenableFuture h;
    public elfl i;
    public elfl j;
    public String m;
    public eyee n;
    private final cqoh p;
    private final cfvu q;
    private final Optional r;
    private final Set s;
    private final Set t;
    private final Set u;
    private final errl v;
    private long w;
    private boolean x;
    private final Object y = new Object();
    public Map l = new HashMap();
    public Optional k = Optional.empty();
    public ListenableFuture e = erqt.i("");
    public elfl f = elfo.e(Optional.empty());
    public elfl g = elfo.e(Optional.empty());
    public final elfl o = elfo.e(Optional.empty());

    public chze(Context context, cqoh cqohVar, cfvu cfvuVar, Optional optional, Set set, Set set2, Set set3, errl errlVar, errl errlVar2) {
        this.b = context;
        this.p = cqohVar;
        this.q = cfvuVar;
        this.r = optional;
        this.s = set;
        this.t = set2;
        this.v = errlVar;
        this.d = errlVar2;
        this.u = set3;
        fcbq fcbqVar = (fcbq) fcbr.a.createBuilder();
        this.c = fcbqVar;
        this.h = erqt.i(fcbqVar);
        this.j = elfo.e((fced) fcee.b.createBuilder());
        this.i = elfo.e((fcea) fceb.a.createBuilder());
    }

    public static boolean d(List list, final List list2, String str) {
        Stream filter = Collection.EL.stream(list).filter(new Predicate() { // from class: chzd
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
                return !list2.contains(obj);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) filter.collect(endq.a);
        if (engwVar.isEmpty()) {
            return false;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "hasValueRemoved", 247, "TachyonRegisterDataBuilder.java")).D("Decorator removed %s: %s", str, engwVar);
        return true;
    }

    final long a() {
        long j;
        synchronized (this.y) {
            if (this.x && this.w <= 0) {
                this.w = TimeUnit.MILLISECONDS.toMicros(this.p.f().toEpochMilli());
            }
            j = this.w;
        }
        return j;
    }

    final ListenableFuture b() {
        return elfr.d(this.h, this.e, this.f, this.g, this.o, this.j, this.i).a(new Callable() { // from class: chza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String c;
                chze chzeVar = chze.this;
                fcbq fcbqVar = (fcbq) erqt.q(chzeVar.h);
                String str = (String) erqt.q(chzeVar.e);
                Optional optional = (Optional) erqt.q(chzeVar.f);
                Optional optional2 = (Optional) erqt.q(chzeVar.g);
                fced fcedVar = (fced) erqt.q(chzeVar.j);
                fcea fceaVar = (fcea) erqt.q(chzeVar.i);
                String languageTag = ctid.c(chzeVar.b).toLanguageTag();
                fcbqVar.copyOnWrite();
                fcbr fcbrVar = (fcbr) fcbqVar.instance;
                fcbr fcbrVar2 = fcbr.a;
                languageTag.getClass();
                fcbrVar.j = languageTag;
                if (TextUtils.isEmpty(str)) {
                    ensk e = chze.a.e();
                    e.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 425, "TachyonRegisterDataBuilder.java")).q("GCM token is empty");
                } else {
                    fceh fcehVar = (fceh) fcei.a.createBuilder();
                    fcehVar.copyOnWrite();
                    ((fcei) fcehVar.instance).b = 1;
                    fcehVar.copyOnWrite();
                    fcei fceiVar = (fcei) fcehVar.instance;
                    str.getClass();
                    fceiVar.c = str;
                    fcbqVar.copyOnWrite();
                    fcbr fcbrVar3 = (fcbr) fcbqVar.instance;
                    fcei fceiVar2 = (fcei) fcehVar.build();
                    fceiVar2.getClass();
                    fcbrVar3.e = fceiVar2;
                    fcbrVar3.b |= 1;
                    fcbqVar.copyOnWrite();
                    fcbr fcbrVar4 = (fcbr) fcbqVar.instance;
                    str.getClass();
                    fcbrVar4.f = str;
                }
                if (optional.isPresent()) {
                    String str2 = (String) optional.get();
                    fcbqVar.copyOnWrite();
                    ((fcbr) fcbqVar.instance).r = str2;
                } else {
                    ensk e2 = chze.a.e();
                    e2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 431, "TachyonRegisterDataBuilder.java")).q("Constellation IID token is not available.");
                }
                ensk e3 = chze.a.e();
                e3.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 437, "TachyonRegisterDataBuilder.java")).q("Public client app data is not set.");
                if (optional2.isPresent()) {
                    fiwb fiwbVar = (fiwb) optional2.get();
                    fcez fcezVar = (fcez) fcfa.a.createBuilder();
                    fcezVar.copyOnWrite();
                    ((fcfa) fcezVar.instance).b = fgtk.a(3);
                    eyee x = eyee.x(fiwbVar.a.a());
                    fcezVar.copyOnWrite();
                    ((fcfa) fcezVar.instance).c = x;
                    fcbqVar.copyOnWrite();
                    fcbr fcbrVar5 = (fcbr) fcbqVar.instance;
                    fcfa fcfaVar = (fcfa) fcezVar.build();
                    fcfaVar.getClass();
                    fcbrVar5.i = fcfaVar;
                    fcbrVar5.b |= 4;
                } else {
                    ensk e4 = chze.a.e();
                    e4.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "updateRegisterData", 443, "TachyonRegisterDataBuilder.java")).q("Key pair is not available.");
                }
                if (chzeVar.l.isEmpty()) {
                    long a2 = chzeVar.a();
                    Optional optional3 = chzeVar.k;
                    if (chzeVar.m == null) {
                        chzeVar.m = "Bugle";
                    }
                    String str3 = chzeVar.m;
                    String str4 = true != emxe.c(str3) ? str3 : "Bugle";
                    final ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("APP_NAME", str4);
                    if (a2 > 0) {
                        arrayMap.put("ISSUED_AT", String.valueOf(a2));
                    }
                    optional3.ifPresent(new Consumer() { // from class: chzc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            arrayMap.put("ID", (String) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    c = chzeVar.c(arrayMap);
                } else {
                    c = chzeVar.c(chzeVar.l);
                }
                fcbqVar.copyOnWrite();
                fcbr fcbrVar6 = (fcbr) fcbqVar.instance;
                c.getClass();
                fcbrVar6.c = 7;
                fcbrVar6.d = c;
                fcbqVar.copyOnWrite();
                fcbr fcbrVar7 = (fcbr) fcbqVar.instance;
                fceb fcebVar = (fceb) fceaVar.build();
                fcebVar.getClass();
                fcbrVar7.m = fcebVar;
                fcbrVar7.b |= 16;
                fcbqVar.copyOnWrite();
                fcbr fcbrVar8 = (fcbr) fcbqVar.instance;
                fcee fceeVar = (fcee) fcedVar.build();
                fceeVar.getClass();
                fcbrVar8.o = fceeVar;
                fcbrVar8.b |= 128;
                eyee eyeeVar = chzeVar.n;
                if (eyeeVar != null) {
                    fcbqVar.copyOnWrite();
                    fcbr fcbrVar9 = (fcbr) fcbqVar.instance;
                    fcbrVar9.b |= 32;
                    fcbrVar9.n = eyeeVar;
                }
                return fcbqVar;
            }
        }, this.v);
    }

    public final String c(Map map) {
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 484, "TachyonRegisterDataBuilder.java")).q("Starting droidguard registration");
        String a2 = dgat.a(this.b, "tachyon_registration", map);
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 487, "TachyonRegisterDataBuilder.java")).q("Finished droidguard registration");
        if (a2 == null) {
            ensk i = enruVar.i();
            i.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/net/handler/TachyonRegisterDataBuilder", "buildDroidguardResult", 489, "TachyonRegisterDataBuilder.java")).q("droidGuardResult is null. Registration without droidGuardResult will fail");
        }
        return a2;
    }

    final void e(aoku aokuVar) {
        elfl e = elfo.e((fced) fcee.b.createBuilder());
        for (final cibh cibhVar : this.t) {
            e = e.i(new eroh() { // from class: chyz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cibh.this.a((fced) obj);
                }
            }, this.d);
        }
        this.j = e;
    }

    final void f(final aoku aokuVar) {
        elfl e = elfo.e((fcea) fceb.a.createBuilder());
        for (final cibg cibgVar : this.u) {
            e = e.i(new eroh() { // from class: chyy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cibg.this.a((fcea) obj, aokuVar);
                }
            }, this.d);
        }
        this.i = e;
    }

    final void g(final aoku aokuVar, final int i) {
        fcbq fcbqVar = this.c;
        fcks fcksVar = fcks.a;
        fcbqVar.copyOnWrite();
        fcbr fcbrVar = (fcbr) fcbqVar.instance;
        fcbr fcbrVar2 = fcbr.a;
        fcksVar.getClass();
        fcbrVar.l = fcksVar;
        fcbrVar.b |= 8;
        elfl e = elfo.e(this.c);
        for (final cibn cibnVar : this.s) {
            e = e.i(new eroh() { // from class: chyx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final fcbq fcbqVar2 = (fcbq) ((fcbq) obj).mo371clone();
                    cibn cibnVar2 = cibnVar;
                    chze chzeVar = chze.this;
                    return cibnVar2.a(chzeVar.c, aokuVar, i).h(new emwl() { // from class: chzb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fcbq fcbqVar3 = fcbq.this;
                            fcbq fcbqVar4 = (fcbq) obj2;
                            fcks fcksVar2 = ((fcbr) fcbqVar3.instance).l;
                            if (fcksVar2 == null) {
                                fcksVar2 = fcks.a;
                            }
                            eygi eygiVar = fcksVar2.b;
                            fcks fcksVar3 = ((fcbr) fcbqVar4.instance).l;
                            if (fcksVar3 == null) {
                                fcksVar3 = fcks.a;
                            }
                            boolean d = chze.d(eygiVar, fcksVar3.b, fcks.class.getName());
                            fceb fcebVar = ((fcbr) fcbqVar3.instance).m;
                            if (fcebVar == null) {
                                fcebVar = fceb.a;
                            }
                            eygr eygrVar = fcebVar.b;
                            fceb fcebVar2 = ((fcbr) fcbqVar4.instance).m;
                            if (fcebVar2 == null) {
                                fcebVar2 = fceb.a;
                            }
                            boolean d2 = d | chze.d(eygrVar, fcebVar2.b, fceb.class.getName());
                            fcee fceeVar = ((fcbr) fcbqVar3.instance).o;
                            if (fceeVar == null) {
                                fceeVar = fcee.b;
                            }
                            eygi eygiVar2 = fceeVar.c;
                            fcee fceeVar2 = ((fcbr) fcbqVar4.instance).o;
                            if (fceeVar2 == null) {
                                fceeVar2 = fcee.b;
                            }
                            if (!chze.d(eygiVar2, fceeVar2.c, fcee.class.getName()) && !d2) {
                                return fcbqVar4;
                            }
                            throw new IllegalStateException("Decorator removed metadata.");
                        }
                    }, chzeVar.d);
                }
            }, this.d);
        }
        this.h = e;
    }

    final void h() {
        this.m = "RCS";
    }

    final void i() {
        elfl e;
        boolean booleanValue;
        if (this.r.isPresent()) {
            final chkp chkpVar = (chkp) this.r.get();
            if (chkpVar.f != null) {
                booleanValue = chkpVar.f.booleanValue();
            } else {
                chkpVar.f = Boolean.valueOf(chkpVar.c.i(chkpVar.b, 12200000) == 0);
                booleanValue = chkpVar.f.booleanValue();
            }
            if (booleanValue) {
                e = elfl.g(kfg.a(new kfd() { // from class: chko
                    @Override // defpackage.kfd
                    public final Object a(final kfb kfbVar) {
                        final chkp chkpVar2 = chkp.this;
                        chkpVar2.e.c("Bugle.Constellation.IIDToken.Requested");
                        GetIidTokenRequest getIidTokenRequest = new GetIidTokenRequest(466216207879L);
                        dfun dfunVar = new dfun();
                        dfunVar.a = new dfzq(getIidTokenRequest);
                        dfunVar.b = new Feature[]{dfzt.e};
                        dfunVar.c = 11903;
                        dhre i = chkpVar2.d.i(dfunVar.a());
                        i.t(new dhqv() { // from class: chkm
                            @Override // defpackage.dhqv
                            public final void d(Exception exc) {
                                csjb a2 = chkp.a.a();
                                a2.I("C11N token request failed. Returning empty optional.");
                                a2.s(exc);
                                chkp.this.e.c("Bugle.Constellation.IIDToken.Request.Failed");
                                kfbVar.b(Optional.empty());
                            }
                        });
                        i.a(new dhqy() { // from class: chkn
                            @Override // defpackage.dhqy
                            public final void e(Object obj) {
                                String str = ((GetIidTokenResponse) obj).a;
                                csjb a2 = chkp.a.a();
                                a2.I("C11N token request succeeded.");
                                a2.A("token", str);
                                a2.r();
                                chkp.this.e.c("Bugle.Constellation.IIDToken.Request.Succeeded");
                                kfbVar.b(Optional.ofNullable(str));
                            }
                        });
                        return "Requesting IIDToken from Constellation API.";
                    }
                }));
            } else {
                chkp.a.r("Google Play Service is not available, C11N IIDToken request not sent.");
                chkpVar.e.c("Bugle.Constellation.IIDToken.Request.Skipped.API.Unavailable");
                e = elfo.e(Optional.empty());
            }
        } else {
            e = elfo.e(Optional.empty());
        }
        this.f = e;
    }

    final void j() {
        cfvu cfvuVar = this.q;
        if (cfvuVar == null) {
            this.e = erqt.h(new NullPointerException("firebaseInstanceIDManager is null"));
        } else {
            this.e = cfvuVar.a();
        }
    }

    final void k(long j) {
        synchronized (this.y) {
            this.w = j;
        }
    }

    final void l() {
        synchronized (this.y) {
            this.x = true;
        }
    }

    final void m(Callable callable) {
        try {
            this.g = (elfl) callable.call();
        } catch (Exception e) {
            throw new IllegalStateException("failed to get key pair", e);
        }
    }
}
