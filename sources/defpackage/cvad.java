package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.security.KeyPair;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvad {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsRegistrationHelper");
    public final cvbr b;
    public final chkk c;
    public final cvdc d;
    public final csqh e;
    public final cuye f;
    public final ctwb g;
    public final cuyi h;
    public final ffbr i;
    public final Context j;
    public final errl k;
    public final akzt l;
    public final cqoh m;
    public final ffbr n;
    public volatile elfl o = elfo.e(false);
    private final errl p;

    public cvad(cvbr cvbrVar, csqh csqhVar, cuye cuyeVar, ctwb ctwbVar, chkk chkkVar, cvdc cvdcVar, cuyi cuyiVar, ffbr ffbrVar, cqoh cqohVar, Context context, errl errlVar, errl errlVar2, akzt akztVar, ffbr ffbrVar2) {
        this.b = cvbrVar;
        this.e = csqhVar;
        this.f = cuyeVar;
        this.g = ctwbVar;
        this.c = chkkVar;
        this.d = cvdcVar;
        this.h = cuyiVar;
        this.i = ffbrVar;
        this.m = cqohVar;
        this.j = context;
        this.k = errlVar;
        this.p = errlVar2;
        this.l = akztVar;
        this.n = ffbrVar2;
    }

    public static String d(PhoneNumberInfo phoneNumberInfo) {
        return phoneNumberInfo.d.getString("id_token");
    }

    public final elfl a(final String str, final cvan cvanVar, final String str2) {
        if (cvanVar.d.H() && cvanVar.e.isEmpty()) {
            a.p("No Vsms RCS or C11N token stored after all");
            return elfo.e(false);
        }
        csjb c = a.c();
        c.I("Generating KeyPair for vsms registration");
        c.x("msisdn", str, 2);
        c.r();
        return elfo.g(new Callable() { // from class: cvcy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cvdc.d();
            }
        }, this.d.d).i(new eroh() { // from class: cuzm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final KeyPair keyPair = (KeyPair) obj;
                etej etejVar = (etej) etek.a.createBuilder();
                eyee x = eyee.x(keyPair.getPublic().getEncoded());
                etejVar.copyOnWrite();
                etek etekVar = (etek) etejVar.instance;
                eygr eygrVar = etekVar.f;
                if (!eygrVar.c()) {
                    etekVar.f = eyfy.mutableCopy(eygrVar);
                }
                cvan cvanVar2 = cvanVar;
                etekVar.f.add(x);
                if (!cvanVar2.d.H()) {
                    cvad.a.p("Creating register request with RCS token...");
                    eyee eyeeVar = cvanVar2.d;
                    etejVar.copyOnWrite();
                    etek etekVar2 = (etek) etejVar.instance;
                    eyeeVar.getClass();
                    etekVar2.d = eyeeVar;
                }
                if (!cvanVar2.e.isEmpty()) {
                    cvad.a.p("Creating register request with C11N token...");
                    String str3 = cvanVar2.e;
                    etejVar.copyOnWrite();
                    etek etekVar3 = (etek) etejVar.instance;
                    str3.getClass();
                    etekVar3.e = str3;
                }
                final String str4 = str;
                final cvad cvadVar = cvad.this;
                final etek etekVar4 = (etek) etejVar.build();
                final aoku n = ((aolr) cvadVar.n.b()).n(str4);
                etekVar4.getClass();
                etej etejVar2 = (etej) etekVar4.toBuilder();
                etfd a2 = chkk.a();
                etejVar2.copyOnWrite();
                etek etekVar5 = (etek) etejVar2.instance;
                a2.getClass();
                etekVar5.c = a2;
                etekVar5.b |= 1;
                etek etekVar6 = (etek) etejVar2.build();
                eteh etehVar = (eteh) cvadVar.c.a.a().j(((Long) chkl.a.e()).longValue(), TimeUnit.MILLISECONDS);
                fdxk fdxkVar = etehVar.a;
                febs febsVar = etei.c;
                if (febsVar == null) {
                    synchronized (etei.class) {
                        febsVar = etei.c;
                        if (febsVar == null) {
                            febp a3 = febs.a();
                            a3.c = febr.UNARY;
                            a3.d = febs.c("google.communications.verifiedsms.v1.MessageVerificationService", "Register");
                            a3.b();
                            etek etekVar7 = etek.a;
                            eyfc eyfcVar = ffag.a;
                            a3.a = new ffae(etekVar7);
                            a3.b = new ffae(etem.a);
                            febsVar = a3.a();
                            etei.c = febsVar;
                        }
                    }
                }
                final String str5 = str2;
                return elfl.g(elfl.g(ffat.a(fdxkVar.a(febsVar, etehVar.b), etekVar6))).f(Throwable.class, new eroh() { // from class: cuzh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final Throwable th = (Throwable) obj2;
                        cvad.a.s("Key pair registration on server failed", th);
                        cvad cvadVar2 = cvad.this;
                        return cvadVar2.e(etekVar4, 4, th).i(new eroh() { // from class: cuzv
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return elfo.d(th);
                            }
                        }, cvadVar2.k);
                    }
                }, cvadVar.k).i(new eroh() { // from class: cuzi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        etem etemVar = (etem) obj2;
                        etemVar.getClass();
                        csjb c2 = cvad.a.c();
                        c2.I("Successful vsms registration. Saving key pairs.");
                        c2.x("msisdn", str4, 2);
                        c2.r();
                        engf engfVar = cvbr.a;
                        int i = etemVar.b;
                        eten etenVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : eten.C11N_RCS : eten.C11N : eten.RCS : eten.REGISTRATION_TYPE_UNSPECIFIED;
                        if (etenVar == null) {
                            etenVar = eten.UNRECOGNIZED;
                        }
                        final cvad cvadVar2 = cvad.this;
                        final etek etekVar8 = etekVar4;
                        final KeyPair keyPair2 = keyPair;
                        final aoku aokuVar = n;
                        final cvam cvamVar = (cvam) engfVar.getOrDefault(etenVar, cvam.UNKNOWN_TYPE);
                        csjb c3 = cvcg.a.c();
                        c3.I("Encrypting VSMS key pair...");
                        c3.r();
                        final cvdc cvdcVar = cvadVar2.d;
                        final cvcg cvcgVar = cvdcVar.c;
                        return cvcgVar.c().h(new emwl() { // from class: cvbw
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return cvcg.this.a(keyPair2, (etql) obj3);
                            }
                        }, cvcgVar.c).f(Exception.class, new cvbx(cvcgVar), cvcgVar.d).i(new eroh() { // from class: cvcu
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                final cvbt cvbtVar = (cvbt) obj3;
                                cfva cfvaVar = aoqm.a;
                                final String p = aokuVar.p(((Boolean) new emyl() { // from class: aopa
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return Boolean.valueOf(ersy.a("bugle.enable_mi_in_verified_sms_key_service", "bugle"));
                                    }
                                }.get()).booleanValue());
                                p.getClass();
                                boolean booleanValue = ((Boolean) cvbr.c.e()).booleanValue();
                                final cvam cvamVar2 = cvamVar;
                                final cvbr cvbrVar = cvdc.this.b;
                                return booleanValue ? cvbrVar.h(new Function() { // from class: cvbd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return cvbr.this.a((cvas) obj4, p, cvbtVar, cvamVar2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).i(new eroh() { // from class: cvbi
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        return cvbr.this.d();
                                    }
                                }, cvbrVar.h).h(new emwl() { // from class: cvbj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj4) {
                                        engf engfVar2 = cvbr.a;
                                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(((cvas) obj4).e);
                                        String str6 = p;
                                        if (((cvan) Map.EL.getOrDefault(unmodifiableMap, str6, cvan.a)).b.contains(cvbtVar)) {
                                            return null;
                                        }
                                        throw new IllegalStateException("Keypair was not saved for: " + str6.hashCode());
                                    }
                                }, cvbrVar.h) : cvbrVar.h(new Function() { // from class: cvbk
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return cvbr.this.a((cvas) obj4, p, cvbtVar, cvamVar2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }
                        }, cvdcVar.d).f(Throwable.class, new eroh() { // from class: cuzr
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                final Throwable th = (Throwable) obj3;
                                cvad.a.s("Key pair registration on client failed", th);
                                cvad cvadVar3 = cvad.this;
                                return cvadVar3.e(etekVar8, 5, th).i(new eroh() { // from class: cuzc
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        return elfo.d(th);
                                    }
                                }, cvadVar3.k);
                            }
                        }, cvadVar2.k);
                    }
                }, cvadVar.k).i(new eroh() { // from class: cuzj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Void r7 = (Void) obj2;
                        String str6 = str5;
                        if (str6 == null) {
                            return elfo.e(r7);
                        }
                        final etek etekVar8 = etekVar4;
                        String str7 = str4;
                        final cvad cvadVar2 = cvad.this;
                        csjb c2 = cvad.a.c();
                        c2.I("Mapping given IMSI to phone number");
                        c2.M("imsi", str6);
                        c2.x("msisdn", str7, 2);
                        c2.r();
                        return cvadVar2.b.b(str6, str7).f(Throwable.class, new eroh() { // from class: cuzw
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                final Throwable th = (Throwable) obj3;
                                cvad.a.s("Key pair registration on client failed", th);
                                cvad cvadVar3 = cvad.this;
                                return cvadVar3.e(etekVar8, 6, th).i(new eroh() { // from class: cvaa
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        return elfo.d(th);
                                    }
                                }, cvadVar3.k);
                            }
                        }, cvadVar2.k);
                    }
                }, cvadVar.k).h(new emwl() { // from class: cuzk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return true;
                    }
                }, cvadVar.k).f(Throwable.class, new eroh() { // from class: cuzl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Throwable th = (Throwable) obj2;
                        cvad.a.s("Vsms registration failed", th);
                        return elfo.d(th);
                    }
                }, cvadVar.k);
            }
        }, this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl b(cvas cvasVar, String str, String str2) {
        str.getClass();
        eyhm eyhmVar = cvasVar.d;
        boolean equals = TextUtils.equals(eyhmVar.containsKey(str) ? (String) eyhmVar.get(str) : "", str2);
        cvan cvanVar = cvan.a;
        eyhm eyhmVar2 = cvasVar.e;
        if (eyhmVar2.containsKey(str2)) {
            cvanVar = (cvan) eyhmVar2.get(str2);
        }
        cskc cskcVar = a;
        cskcVar.p("Checking if vsms key registration is necessary");
        if (equals && !cvanVar.b.isEmpty()) {
            cskcVar.p("Not registering, keys already present");
            return elfo.e(false);
        }
        if (cvanVar.b.isEmpty() || equals) {
            return a(str2, cvanVar, str);
        }
        cskcVar.p("Associating new imsi with existing keys for same msisdn");
        return this.b.b(str, str2).h(new emwl() { // from class: cuzd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, this.k);
    }

    public final elfl c(final String str, final String str2, String str3) {
        if (!this.f.d()) {
            a.p("Verified SMS is disabled or not supported, not storing RCS token.");
            return elfo.e(null);
        }
        if (!this.o.isDone()) {
            a.p("Received a registration request for RCS but something else is already running.");
            return this.o;
        }
        try {
            final eyee x = eyee.x(Base64.decode(str3, 8));
            elfl i = elfo.g(new Callable() { // from class: cuyy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cvad.this.l.c("Bugle.VerifiedSms.Registration.RcsTokenReceived.Counts");
                    return null;
                }
            }, this.p).i(new eroh() { // from class: cuyz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cvbr.b.p("Storing vsms rcs token");
                    final cvbr cvbrVar = cvad.this.b;
                    final String str4 = str;
                    final String str5 = str2;
                    final eyee eyeeVar = x;
                    return cvbrVar.h(new Function() { // from class: cvax
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cvas cvasVar = (cvas) obj2;
                            cvao cvaoVar = (cvao) cvasVar.toBuilder();
                            String str6 = str5;
                            cvan a2 = cvaoVar.a(str6, cvan.a);
                            csjb c = cvbr.b.c();
                            c.I("Adding new RCS token for msisdn");
                            c.x("msisdn", str6, 2);
                            String str7 = str4;
                            c.M("imsi", str7);
                            c.B("new entry", cvan.a.equals(a2));
                            c.r();
                            cval cvalVar = (cval) a2.toBuilder();
                            cvalVar.copyOnWrite();
                            ((cvan) cvalVar.instance).d = eyeeVar;
                            cvan cvanVar = (cvan) cvalVar.build();
                            cvbr.b.p("Associating msisdn with updated registration data");
                            cvaoVar.d(str6, cvanVar);
                            boolean b = cvaoVar.b(str7);
                            csjb c2 = cvbr.b.c();
                            c2.I("Associating IMSI with msisdn");
                            c2.B("new association", !b);
                            c2.r();
                            cvaoVar.c(str7, str6);
                            if (cvasVar.h) {
                                cvah cvahVar = ((cvas) cvaoVar.instance).j;
                                if (cvahVar == null) {
                                    cvahVar = cvah.a;
                                }
                                cvaf cvafVar = (cvaf) cvahVar.toBuilder();
                                cvafVar.copyOnWrite();
                                ((cvah) cvafVar.instance).d = cvah.emptyProtobufList();
                                cvah cvahVar2 = cvasVar.j;
                                if (cvahVar2 == null) {
                                    cvahVar2 = cvah.a;
                                }
                                Collection i2 = cvbr.i(cvahVar2.d, eykm.d(cvbr.this.e.f().toEpochMilli()));
                                cvafVar.copyOnWrite();
                                cvah cvahVar3 = (cvah) cvafVar.instance;
                                eygr eygrVar = cvahVar3.d;
                                if (!eygrVar.c()) {
                                    cvahVar3.d = eyfy.mutableCopy(eygrVar);
                                }
                                eydl.addAll(i2, cvahVar3.d);
                                cvaoVar.copyOnWrite();
                                cvas cvasVar2 = (cvas) cvaoVar.instance;
                                cvah cvahVar4 = (cvah) cvafVar.build();
                                cvahVar4.getClass();
                                cvasVar2.j = cvahVar4;
                                cvasVar2.b |= 2;
                            }
                            return cvaoVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.k).i(new eroh() { // from class: cuza
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cvad.this.b.d();
                }
            }, this.k).i(new eroh() { // from class: cuzb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cvad.this.b((cvas) obj, str, str2);
                }
            }, this.k);
            this.o = i;
            return i;
        } catch (IllegalArgumentException e) {
            a.s("Cannot decode RCS token.", e);
            return elfo.d(e);
        }
    }

    public final elfl e(final etek etekVar, final int i, final Throwable th) {
        return !((Boolean) cuye.c.e()).booleanValue() ? elfo.e(null) : this.b.e().i(new eroh() { // from class: cuzx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (Boolean.FALSE.equals((Boolean) obj)) {
                    return elfo.e(null);
                }
                final Throwable th2 = th;
                final int i2 = i;
                final etek etekVar2 = etekVar;
                cvad cvadVar = cvad.this;
                cvad.a.r("Sending diagnostic report for the failed registration");
                final cuyu cuyuVar = (cuyu) cvadVar.i.b();
                final elfl c = cuyuVar.c.c();
                cvdc cvdcVar = cuyuVar.c;
                cvdcVar.getClass();
                final elfl i3 = c.i(new cuyl(cvdcVar), cuyuVar.h);
                final elfl b = cuyuVar.c.b();
                return elfo.k(c, i3, b).a(new Callable() { // from class: cuym
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eteo eteoVar = (eteo) etez.a.createBuilder();
                        String str = cvdd.a(cuyu.this.g).a;
                        eteoVar.copyOnWrite();
                        etez etezVar = (etez) eteoVar.instance;
                        str.getClass();
                        etezVar.l = str;
                        String num = Integer.toString(Build.VERSION.SDK_INT);
                        eteoVar.copyOnWrite();
                        etez etezVar2 = (etez) eteoVar.instance;
                        num.getClass();
                        etezVar2.m = num;
                        eteoVar.copyOnWrite();
                        etez etezVar3 = (etez) eteoVar.instance;
                        int i4 = i2;
                        etezVar3.q = etey.a(i4);
                        Throwable th3 = th2;
                        String str2 = th3.getClass().getName() + ": " + th3.getMessage();
                        eteoVar.copyOnWrite();
                        ((etez) eteoVar.instance).s = str2;
                        if (th3.getCause() != null) {
                            String str3 = th3.getCause().getClass().getName() + ": " + th3.getCause().getMessage();
                            eteoVar.copyOnWrite();
                            ((etez) eteoVar.instance).t = str3;
                        }
                        etek etekVar3 = etekVar2;
                        if (etekVar3.f.size() > 0) {
                            eyee eyeeVar = (eyee) etekVar3.f.get(0);
                            eteoVar.copyOnWrite();
                            etez etezVar4 = (etez) eteoVar.instance;
                            eyeeVar.getClass();
                            etezVar4.r = eyeeVar;
                        }
                        cuyu.b(eteoVar, c, b, i3, i4);
                        return (etez) eteoVar.build();
                    }
                }, cuyuVar.i).i(new cuyn(cuyuVar.d), cuyuVar.h).f(Throwable.class, new eroh() { // from class: cuyo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cuyu.b.s("Error while creating/saving diagnostic report.", (Throwable) obj2);
                        return elfo.e(null);
                    }
                }, cuyuVar.i).h(new emwl() { // from class: cuyp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enhk enhkVar = cuyu.a;
                        return null;
                    }
                }, cuyuVar.i);
            }
        }, this.k);
    }
}
