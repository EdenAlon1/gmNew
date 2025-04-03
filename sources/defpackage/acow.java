package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebFragment;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acow {
    public static final cskc a = cskc.g("Bugle", "DittoWebFragment");
    public static final entd b = entd.c("Bugle");
    public static final AtomicReference c = new AtomicReference(Optional.empty());
    static final AtomicReference d = new AtomicReference(new Consumer() { // from class: acot
        @Override // java.util.function.Consumer
        /* renamed from: accept */
        public final void o(Object obj) {
            cskc cskcVar = acow.a;
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
    });
    public ctbx B;
    final ejwd C;
    public Uri D;
    public String E;
    final adf H;
    public acyu I;
    final acyd J;
    public final adg K;
    final WebStorage L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbr Q;
    private final ejwd R;
    public final DittoWebFragment e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final fazb s;
    public final ffbr t;
    public final ffbr u;
    public final Optional v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public AlertDialog z;
    public boolean A = true;
    public final ejlr F = new ejlr<Void, eyjv<esnn>>() { // from class: acow.1
        private final void d() {
            acow.a.p("Exit app since Ditto doesn't handle the NavigateBack.");
            acow acowVar = acow.this;
            if (acowVar.e == null) {
                acow.a.r("DittoWebFragment is null.");
            } else {
                acowVar.a().finish();
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            eyjv eyjvVar = (eyjv) obj2;
            if (eyjvVar == null) {
                d();
                return;
            }
            esnn esnnVar = (esnn) eyjvVar.a(esnn.a, eyfc.a());
            if ((esnnVar.b == 208 ? (esmz) esnnVar.c : esmz.a).b) {
                d();
            } else {
                acow.a.p("NavigateBack is handled by Ditto.");
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof acth)) {
                d();
                return;
            }
            csjb b2 = acow.a.b();
            b2.I("Error reading NavigationDidNotOccur from NavigateBackResponsePayload");
            b2.s(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final adf G = new acox(this);

    public acow(DittoWebFragment dittoWebFragment, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, fazb fazbVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, fazb fazbVar2, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23) {
        acoy acoyVar = new acoy(this);
        this.H = acoyVar;
        this.e = dittoWebFragment;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.M = ffbrVar3;
        this.N = ffbrVar4;
        this.O = ffbrVar5;
        this.h = ffbrVar6;
        this.s = fazbVar;
        this.t = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
        this.k = ffbrVar10;
        this.l = ffbrVar11;
        this.m = ffbrVar12;
        this.n = ffbrVar13;
        this.o = ffbrVar14;
        this.p = ffbrVar16;
        this.q = ffbrVar17;
        this.r = ffbrVar18;
        this.u = ffbrVar15;
        acyd acydVar = new acyd(dittoWebFragment.fe().h);
        this.J = acydVar;
        this.w = ffbrVar19;
        this.P = ffbrVar20;
        this.Q = ffbrVar21;
        this.x = ffbrVar22;
        this.y = ffbrVar23;
        dittoWebFragment.a.c(acydVar);
        this.K = dittoWebFragment.O(new sfv(), acoyVar);
        this.C = new acpa(this);
        this.R = new acpb();
        this.L = WebStorage.getInstance();
        ffbr ffbrVar24 = new ffbr() { // from class: acok
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                acow acowVar = acow.this;
                acyu acyuVar = acowVar.I;
                acyuVar.getClass();
                return new acpd(acyuVar, emxe.b(acowVar.a().getIntent().getStringExtra("conversation_id_for_launch")));
            }
        };
        acqd acqdVar = (acqd) fazbVar2.b();
        acrx acrxVar = (acrx) acqdVar.a.b();
        acjc acjcVar = (acjc) acqdVar.b.b();
        acjcVar.getClass();
        aclb aclbVar = (aclb) acqdVar.c.b();
        aclbVar.getClass();
        errl errlVar = (errl) acqdVar.d.b();
        errlVar.getClass();
        this.v = Optional.of(new acqc(acrxVar, acjcVar, aclbVar, errlVar, ffbrVar24));
    }

    public static final void f() {
        ((Optional) c.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: acos
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                acow.a.p("Cleaning up persisted WebView");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final eg a() {
        DittoWebFragment dittoWebFragment = this.e;
        dittoWebFragment.getClass();
        eg G = dittoWebFragment.G();
        G.getClass();
        return G;
    }

    public final void b(acyu acyuVar) {
        if (!pga.a("FORCE_DARK") || !pga.a("FORCE_DARK_STRATEGY")) {
            a.p("WebView does not support dark mode");
            return;
        }
        int i = this.e.B().getConfiguration().uiMode & 48;
        if (i == 0 || i == 16) {
            a.p("Enabling WebView Light mode");
            aczb.a(acyuVar, 0);
        } else {
            if (i != 32) {
                throw new IllegalStateException("Invalid UiMode state");
            }
            a.p("Enabling WebView Dark mode");
            aczb.a(acyuVar, 2);
        }
        WebSettings settings = ((WebView) acyuVar.b().orElseThrow(new acza())).getSettings();
        if (!pga.g.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pev.a(settings).b();
    }

    public final void c(final Intent intent) {
        a.p("Handle forwarded draft intent.");
        ((ejwl) this.k.b()).b(new ejuy((ejvb) this.P.b(), new eros() { // from class: acoj
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c2;
                acsu acsuVar = (acsu) acow.this.w.b();
                c2 = axol.c(acsuVar.e, ffhe.a, ffsm.a, new acst(acsuVar, intent, null));
                return new erph(c2);
            }
        }, "draft_message_js_bridge_request_key"), this.R);
    }

    public final void d() {
        if (this.A) {
            final acqc acqcVar = (acqc) this.v.get();
            if (acqcVar.e.compareAndSet(true, false)) {
                acqcVar.b.d().e(Exception.class, new emwl() { // from class: acps
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        acqc.a.s("Could not connect to foreground JsBridge. Pausing.", (Exception) obj);
                        acqc.this.b();
                        return false;
                    }
                }, acqcVar.d).k(axnw.b(), acqcVar.d);
                acqcVar.a(new erog() { // from class: acpt
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final acqc acqcVar2 = acqc.this;
                        return acqcVar2.c.a().h(new emwl() { // from class: acpu
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, acqcVar2.d).f(Exception.class, new eroh() { // from class: acpv
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                acqc.a.s("Could not pause background handler. Attempting to tear it down.", (Exception) obj);
                                return acqc.this.c.c();
                            }
                        }, acqcVar2.d).e(Exception.class, new emwl() { // from class: acpw
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                acqc.a.o("Could not tear down background handler.", (Exception) obj);
                                return null;
                            }
                        }, acqcVar2.d);
                    }
                }).k(axnw.b(), acqcVar.d);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e(ViewGroup viewGroup, String str) {
        PackageInfo currentWebViewPackage;
        boolean z;
        int i;
        Context z2 = this.e.z();
        Uri uri = pew.a;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            currentWebViewPackage = null;
            try {
                String str2 = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
                if (str2 != null) {
                    currentWebViewPackage = z2.getPackageManager().getPackageInfo(str2, 0);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (currentWebViewPackage != null) {
            akzt akztVar = (akzt) this.l.b();
            String str3 = currentWebViewPackage.packageName;
            int i2 = 5;
            switch (str3.hashCode()) {
                case -1221330953:
                    if (str3.equals("com.chrome.beta")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case -1148214049:
                    if (str3.equals("com.chrome.canary")) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case -170008307:
                    if (str3.equals("com.android.webview")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 140457170:
                    if (str3.equals("com.google.android.webview")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 196627919:
                    if (str3.equals("com.google.android.apps.chrome")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 256457446:
                    if (str3.equals("com.android.chrome")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1900266798:
                    if (str3.equals("com.chrome.dev")) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                case true:
                    i2 = 2;
                    break;
                case true:
                case true:
                    i2 = 3;
                    break;
                case true:
                    i2 = 4;
                    break;
                case true:
                    break;
                case true:
                    i2 = 6;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            akztVar.e("Bugle.Satellite.WebView.Package", i2);
            if (currentWebViewPackage.versionName.indexOf(46) != -1) {
                try {
                    i = Integer.parseInt(currentWebViewPackage.versionName.substring(0, currentWebViewPackage.versionName.indexOf(46)));
                } catch (NumberFormatException e) {
                    csjb e2 = a.e();
                    e2.I("Could not parse WebView version");
                    e2.A("versionName", currentWebViewPackage.versionName);
                    e2.s(e);
                    i = currentWebViewPackage.baseRevisionCode;
                }
            } else {
                i = currentWebViewPackage.baseRevisionCode;
            }
            ((akzt) this.l.b()).e("Bugle.Satellite.WebView.MajorVersion", i);
            csjb c2 = a.c();
            c2.I("Using WebView package");
            c2.A("Package Name", currentWebViewPackage.packageName);
            c2.A("Version Name", currentWebViewPackage.versionName);
            c2.y("Major Version", i);
            c2.r();
        }
        Optional optional = (Optional) c.getAndSet(Optional.empty());
        if (this.I != null && !emxe.c(str)) {
            a.m("loading ditto view");
            actj a2 = ((actk) this.s.b()).a();
            acua acuaVar = acua.FOREGROUND;
            esni esniVar = (esni) esnk.a.createBuilder();
            esoa esoaVar = (esoa) esob.a.createBuilder();
            esoaVar.copyOnWrite();
            esob esobVar = (esob) esoaVar.instance;
            str.getClass();
            esobVar.b = str;
            esniVar.copyOnWrite();
            esnk esnkVar = (esnk) esniVar.instance;
            esob esobVar2 = (esob) esoaVar.build();
            esobVar2.getClass();
            esnkVar.c = esobVar2;
            esnkVar.b = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            a2.d(acuaVar, (esnk) esniVar.build());
            return;
        }
        if (viewGroup != null && optional.isPresent()) {
            a.p("Rehydrating view from a persisted WebView");
            acpe acpeVar = (acpe) optional.get();
            ((CoordinatorLayout) viewGroup.findViewById(R.id.ditto_web_fragment_container)).addView(acpeVar.a());
            afg$$ExternalSyntheticApiModelOutline0.m104m(d.get()).o(acpeVar.a());
            this.I = acpeVar.b();
            this.A = false;
            return;
        }
        if (viewGroup != null) {
            a.m("creating ditto view");
            WebView webView = (WebView) ((ViewStub) viewGroup.findViewById(R.id.ditto_web_view_layout_stub)).inflate().findViewById(R.id.ditto_web_view);
            afg$$ExternalSyntheticApiModelOutline0.m104m(d.get()).o(webView);
            acyj a3 = ((acyk) this.M.b()).a("Bugle.Satellite.Foreground.LoadDuration");
            a3.e();
            this.B = a3.f.a(new ctbf() { // from class: acou
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    acow.a.p("Stopping BG service in response to Ditto being unauthenticated");
                    acqc acqcVar = (acqc) acow.this.v.get();
                    acqcVar.c.c().e(Exception.class, new emwl() { // from class: acpx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            acqc.a.o("Could not tear down background handler.", (Exception) obj2);
                            return null;
                        }
                    }, acqcVar.d).k(axnw.b(), acqcVar.d);
                    return elfo.e(null);
                }
            }, "Subscribe to Ditto Needs Authentication Events", "Stop BG service on unpair", "Unsubscribe from Ditto Needs Authentication Events");
            final acpo acpoVar = (acpo) this.j.b();
            acpoVar.i = a3.e.a(new ctbf() { // from class: acpi
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    final acpo acpoVar2 = acpo.this;
                    if (!acpoVar2.g.get()) {
                        acpo.a.p("Starting FailToLoadTimer in response to DittoLoadFinish");
                        return elfo.f(new Runnable() { // from class: acph
                            @Override // java.lang.Runnable
                            public final void run() {
                                acpo.this.d();
                            }
                        }, acpoVar2.e);
                    }
                    acpo.a.p("In response to DittoLoadFinish: Skip starting FailToLoadTimer since already received ReportSettledRequest.");
                    ((akzt) acpoVar2.d.b()).c("Bugle.Satellite.ReportSettledRequestReceived.BeforePageLoadFinished.Counts");
                    return elfo.e(null);
                }
            }, "Subscribe to Ditto Load Finish Events", "Start failToLoadTimer", "Unsubscribe from Ditto Load Finish Events");
            acpoVar.h = a3.a("Reset isReportSettledRequestReceived", new ctbf() { // from class: acpj
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    acpo.a.p("Reset isReportSettledRequestReceived in response to DittoLoadStart");
                    final acpo acpoVar2 = acpo.this;
                    return elfo.f(new Runnable() { // from class: acpm
                        @Override // java.lang.Runnable
                        public final void run() {
                            acpo.this.g.set(false);
                        }
                    }, acpoVar2.e);
                }
            });
            acpoVar.j = acpoVar.b.b.a(new ctbf() { // from class: acpk
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    acpo.a.p("Stopping FailToLoadTimer in response to ReportSettledRequest");
                    acpo acpoVar2 = acpo.this;
                    acpoVar2.a();
                    acpoVar2.g.set(true);
                    return ((aclb) acpoVar2.c.b()).j(false);
                }
            }, "Subscribe to Received ReportSettledRequest Events", "Stop failToLoadTimer", "Unsubscribe from Received ReportSettledRequest Events");
            acyu a4 = ((acyv) this.N.b()).a(webView, a3, this.J);
            this.I = a4;
            WebSettings webSettings = (WebSettings) a4.c().orElseThrow(new Supplier() { // from class: acov
                @Override // java.util.function.Supplier
                public final Object get() {
                    cskc cskcVar = acow.a;
                    return new IllegalStateException("Could not get WebSettings from ditto WebView");
                }
            });
            webSettings.setJavaScriptEnabled(true);
            webSettings.setDomStorageEnabled(true);
            String valueOf = String.valueOf((String) this.I.c().map(new Function() { // from class: acoq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((WebSettings) obj).getUserAgentString() + " " + new emww(" ").b((Iterable) acow.this.r.b());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseThrow(new Supplier() { // from class: acor
                @Override // java.util.function.Supplier
                public final Object get() {
                    cskc cskcVar = acow.a;
                    return new IllegalStateException("Could not set UserAgent");
                }
            }));
            boolean b2 = ((acpf) this.Q.b()).b();
            String concat = valueOf.concat(" Gaia_Pairing_Enabled");
            if (b2) {
                concat = concat.concat(" Bugle_DittoSatellite_WiFi_Only");
            }
            webSettings.setUserAgentString(concat);
            b(this.I);
            this.I.f();
        }
    }
}
