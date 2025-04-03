package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxl implements ciin {
    public final ctwb a;
    public final ctvb b;
    public final csxu c;
    private final errl d;
    private final chzf e;
    private final chhg f;
    private String g = "";
    private long h = 0;

    public chxl(errl errlVar, chzf chzfVar, chhg chhgVar, ctwb ctwbVar, ctvb ctvbVar, csxu csxuVar) {
        this.d = errlVar;
        this.e = chzfVar;
        this.f = chhgVar;
        this.a = ctwbVar;
        this.b = ctvbVar;
        this.c = csxuVar;
    }

    public static fcbm m(String str) {
        fcbl fcblVar = (fcbl) fcbm.a.createBuilder();
        String upperCase = str.toUpperCase(Locale.US);
        fcblVar.copyOnWrite();
        fcbm fcbmVar = (fcbm) fcblVar.instance;
        upperCase.getClass();
        fcbmVar.c = upperCase;
        fcblVar.copyOnWrite();
        ((fcbm) fcblVar.instance).b = 2;
        return (fcbm) fcblVar.build();
    }

    public static final ListenableFuture n(chrv chrvVar, fcbn fcbnVar) {
        fbqa a = chrvVar.b().a();
        fdxk fdxkVar = a.a;
        febs febsVar = fbqb.b;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.b;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterAnonymous");
                    a2.b();
                    fcbn fcbnVar2 = fcbn.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(fcbnVar2);
                    a2.b = new ffae(fcbp.a);
                    febsVar = a2.a();
                    fbqb.b = febsVar;
                }
            }
        }
        return ffat.a(fdxkVar.a(febsVar, a.b), fcbnVar);
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.h;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return ciil.b;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(final fcfo fcfoVar) {
        this.g = fcfoVar.c;
        chze a = this.e.a();
        a.j();
        final chhg chhgVar = this.f;
        chhgVar.getClass();
        a.m(new Callable() { // from class: chxj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Callable callable = new Callable() { // from class: chhb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fivy.a();
                    }
                };
                final chhg chhgVar2 = chhg.this;
                return elfo.g(callable, chhgVar2.c).i(new eroh() { // from class: chhc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final fiwb fiwbVar = (fiwb) obj;
                        chmx chmxVar = (chmx) chhg.this.b.b();
                        final byte[] a2 = fiwbVar.a.a();
                        final byte[] bArr = fiwbVar.b.a;
                        return chmxVar.a.j(new emwl() { // from class: chmm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                chlo chloVar = (chlo) ((chlp) obj2).toBuilder();
                                eyee x = eyee.x(a2);
                                chloVar.copyOnWrite();
                                ((chlp) chloVar.instance).e = x;
                                eyee x2 = eyee.x(bArr);
                                chloVar.copyOnWrite();
                                ((chlp) chloVar.instance).f = x2;
                                return (chlp) chloVar.build();
                            }
                        }).h(new emwl() { // from class: chmn
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        }, erpp.a).h(new emwl() { // from class: chha
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return Optional.of(fiwb.this);
                            }
                        }, erpp.a);
                    }
                }, chhgVar2.c);
            }
        });
        return elfr.j(a.b(), new emwl() { // from class: chxk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcbm m;
                String p;
                fcbk fcbkVar = (fcbk) fcbn.a.createBuilder();
                fcbkVar.copyOnWrite();
                fcbn fcbnVar = (fcbn) fcbkVar.instance;
                fcfo fcfoVar2 = fcfoVar;
                fcfoVar2.getClass();
                fcbnVar.c = fcfoVar2;
                fcbnVar.b |= 1;
                fcbkVar.copyOnWrite();
                ((fcbn) fcbkVar.instance).d = "Bugle";
                fcbkVar.copyOnWrite();
                fcbn fcbnVar2 = (fcbn) fcbkVar.instance;
                fcbr fcbrVar = (fcbr) ((fcbq) obj).build();
                fcbrVar.getClass();
                fcbnVar2.e = fcbrVar;
                fcbnVar2.b |= 2;
                chxl chxlVar = chxl.this;
                ctwi j = chxlVar.a.j();
                if (chxlVar.b.F() || (p = j.p()) == null) {
                    String e = chxlVar.c.e("device_country", "unknown");
                    if (e.length() == 2) {
                        m = chxl.m(e);
                    } else {
                        String t = j.t(Locale.US);
                        m = !TextUtils.isEmpty(t) ? chxl.m(t) : null;
                    }
                } else {
                    m = chxl.m(p);
                }
                if (m != null) {
                    fcbkVar.copyOnWrite();
                    fcbn fcbnVar3 = (fcbn) fcbkVar.instance;
                    fcbnVar3.f = m;
                    fcbnVar3.b |= 4;
                }
                return (fcbn) fcbkVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return n(chrvVar, (fcbn) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcbp fcbpVar = (fcbp) eyhsVar;
        if (fcbpVar != null) {
            fcfq fcfqVar = fcbpVar.c;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.h = j;
        return erqt.i(fcbpVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RegisterAnonymousRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.g;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
