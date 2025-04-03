package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwme implements cwln, cskg {
    public static final cskc a = cskc.g("Bugle", "TextClassifierLibManagerImpl");
    public static final csjp b = new csjp(3600000);
    static final cfva c = cfvl.i(cfvl.b, "disable_logging_tc_lib_latency", true);
    public final Context d;
    public final errl e;
    public final errl f;
    public final albq g;
    public final ffbr h;
    private final cgmf i;
    private final errl j;
    private final emyl k;
    private final Object l = new Object();
    private elfl m;

    public cwme(cgmf cgmfVar, Context context, errl errlVar, errl errlVar2, errl errlVar3, final efbm efbmVar, albq albqVar, ffbr ffbrVar) {
        this.i = cgmfVar;
        this.d = context;
        this.j = errlVar;
        this.e = errlVar2;
        this.f = errlVar3;
        this.g = albqVar;
        this.k = emys.a(new emyl() { // from class: cwlr
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = cwme.a;
                return efbm.this;
            }
        });
        this.h = ffbrVar;
    }

    @Override // defpackage.cwln
    public final elfl a() {
        final elfl g;
        synchronized (this.l) {
            if (this.m == null) {
                ekzz f = eleg.f("TextClassifierLibManagerImpl createTextClassifierLibAsync");
                try {
                    cgmf cgmfVar = this.i;
                    final efbm efbmVar = (efbm) this.k.get();
                    final elfl h = ((Boolean) ctjd.V.e()).booleanValue() ? cgmfVar.h("text_classifier").h(new emwl() { // from class: cwls
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            cskc cskcVar = cwme.a;
                            boolean isPresent = optional.isPresent();
                            efbm efbmVar2 = efbm.this;
                            if (isPresent) {
                                try {
                                    return ewyr.b(ewyf.a.a("tc_model", (dwns) optional.get(), efbmVar2));
                                } catch (ewyg | IOException e) {
                                    cwme.a.s("Failed to open the TextClassifier core model", e);
                                }
                            }
                            return new ewyr(null);
                        }
                    }, this.j) : elfo.e(new ewyr(null));
                    cgmf cgmfVar2 = this.i;
                    final efbm efbmVar2 = (efbm) this.k.get();
                    final elfl h2 = ((Boolean) ctjd.W.e()).booleanValue() ? cgmfVar2.h("text_classifier_actions").h(new emwl() { // from class: cwlo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            cskc cskcVar = cwme.a;
                            boolean isPresent = optional.isPresent();
                            efbm efbmVar3 = efbm.this;
                            if (isPresent) {
                                try {
                                    return ewyr.b(ewyf.a.a("tc_actions_model", (dwns) optional.get(), efbmVar3));
                                } catch (ewyg | IOException e) {
                                    cwme.a.s("Failed to open the TextClassifier actions model", e);
                                }
                            }
                            return new ewyr(null);
                        }
                    }, this.j) : elfo.e(new ewyr(null));
                    cgmf cgmfVar3 = this.i;
                    final efbm efbmVar3 = (efbm) this.k.get();
                    final elfl e = (!((Boolean) ctjd.X.e()).booleanValue() || TextUtils.isEmpty((CharSequence) ctjd.M.e())) ? elfo.e(new ewyr(null)) : cgmfVar3.h((String) ctjd.M.e()).h(new emwl() { // from class: cwlp
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code restructure failed: missing block: B:80:0x00db, code lost:
                        
                            if (r6.equals("entities_names") != false) goto L57;
                         */
                        @Override // defpackage.emwl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object apply(java.lang.Object r17) {
                            /*
                                Method dump skipped, instructions count: 450
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cwlp.apply(java.lang.Object):java.lang.Object");
                        }
                    }, this.j);
                    elfl a2 = elfo.k(h, h2, e).a(new Callable() { // from class: cwlq
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Optional empty;
                            ewvu ewvuVar;
                            Context context;
                            ewvw ewvwVar;
                            ewyr ewyrVar;
                            ewyr ewyrVar2;
                            ewyr ewyrVar3;
                            ewyr ewyrVar4;
                            ewyr ewyrVar5;
                            ewyr ewyrVar6;
                            ewyr ewyrVar7;
                            ewyr ewyrVar8;
                            ewxw ewxwVar;
                            engw engwVar;
                            engw engwVar2;
                            ewyr ewyrVar9;
                            ewyr ewyrVar10 = (ewyr) erqt.q(h);
                            ewyr ewyrVar11 = (ewyr) erqt.q(h2);
                            ewyr ewyrVar12 = (ewyr) erqt.q(e);
                            final cwme cwmeVar = cwme.this;
                            try {
                                if (((Boolean) ctim.d.e()).booleanValue()) {
                                    ewvt ewvtVar = new ewvt();
                                    ewvtVar.b(false);
                                    ewvtVar.a(false);
                                    ewvtVar.e = (byte) (ewvtVar.e | 4);
                                    ewvtVar.c(false);
                                    ewvtVar.e = (byte) (ewvtVar.e | 112);
                                    int i = engw.d;
                                    engw engwVar3 = enou.a;
                                    if (engwVar3 == null) {
                                        throw new NullPointerException("Null shortcutContactNames");
                                    }
                                    ewvtVar.d = engwVar3;
                                    ewvtVar.f = new ewyr(null);
                                    ewvtVar.b(true);
                                    ewvtVar.a(true);
                                    ewvtVar.c(true);
                                    if (ewvtVar.e == Byte.MAX_VALUE && (engwVar2 = ewvtVar.d) != null && (ewyrVar9 = ewvtVar.f) != null) {
                                        ewvuVar = new ewvu(ewvtVar.a, ewvtVar.b, ewvtVar.c, engwVar2, ewyrVar9);
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    if ((ewvtVar.e & 1) == 0) {
                                        sb.append(" annotateName");
                                    }
                                    if ((ewvtVar.e & 2) == 0) {
                                        sb.append(" annotateGivenName");
                                    }
                                    if ((ewvtVar.e & 4) == 0) {
                                        sb.append(" annotateFamilyName");
                                    }
                                    if ((ewvtVar.e & 8) == 0) {
                                        sb.append(" annotateNickname");
                                    }
                                    if ((ewvtVar.e & 16) == 0) {
                                        sb.append(" enableChangeMonitoring");
                                    }
                                    if ((ewvtVar.e & 32) == 0) {
                                        sb.append(" enableDeclension");
                                    }
                                    if ((ewvtVar.e & 64) == 0) {
                                        sb.append(" enableShortcutContacts");
                                    }
                                    if (ewvtVar.d == null) {
                                        sb.append(" shortcutContactNames");
                                    }
                                    if (ewvtVar.f == null) {
                                        sb.append(" lightweightTokensProvider");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                ewvuVar = null;
                                context = cwmeVar.d;
                                ewvwVar = new ewvw();
                                ewvwVar.c(new ewyr(null));
                                ewvwVar.h = new ewyr(null);
                                ewvwVar.b(new ewyr(null));
                                ewvwVar.e(new ewyr(null));
                                ewvwVar.k = new ewyr(null);
                                ewvwVar.n = new ewyr(null);
                                ewvwVar.l = new ewyr(null);
                                ewvwVar.m = new ewyr(null);
                                ewvwVar.d(false);
                                ewvwVar.f = (byte) (ewvwVar.f | 6);
                                ewvwVar.c = ewxw.a;
                                int i2 = engw.d;
                                ewvwVar.a(enou.a);
                                ewvwVar.e = new ewvy();
                                ewvwVar.c(ewyrVar10);
                                ewvwVar.b(ewyrVar11);
                                ewvwVar.a(((Boolean) ctjd.W.e()).booleanValue() ? engw.r(Locale.ENGLISH) : enou.a);
                                ewvwVar.e(ewyrVar12);
                                ewvwVar.b = ewvuVar;
                                ewvwVar.d(true);
                            } catch (Throwable th) {
                                cwme.a.s("TextClassifierLib creation failed", th);
                                axnw.h(((cfyt) cwmeVar.h.b()).b(th));
                                empty = Optional.empty();
                            }
                            if (ewvwVar.f == 7 && (ewyrVar = ewvwVar.g) != null && (ewyrVar2 = ewvwVar.h) != null && (ewyrVar3 = ewvwVar.i) != null && (ewyrVar4 = ewvwVar.j) != null && (ewyrVar5 = ewvwVar.k) != null && (ewyrVar6 = ewvwVar.l) != null && (ewyrVar7 = ewvwVar.m) != null && (ewyrVar8 = ewvwVar.n) != null && (ewxwVar = ewvwVar.c) != null && (engwVar = ewvwVar.d) != null) {
                                exaa exaaVar = ewvwVar.e;
                                if (exaaVar != null) {
                                    ewvx ewvxVar = new ewvx(ewyrVar, ewyrVar2, ewyrVar3, ewyrVar4, ewyrVar5, ewyrVar6, ewyrVar7, ewyrVar8, ewvwVar.a, ewvwVar.b, ewxwVar, engwVar, exaaVar);
                                    engw engwVar4 = TextClassifierLibImpl.a;
                                    empty = Optional.of(new TextClassifierLibImpl(context, ewvxVar, new ewyi(context)));
                                    empty.ifPresent(new Consumer() { // from class: cwlw
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj) {
                                            final TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                            boolean booleanValue = ((Boolean) cwme.c.e()).booleanValue();
                                            cwme cwmeVar2 = cwme.this;
                                            final akzw c2 = !booleanValue ? cwmeVar2.g.c("Bugle.TCLib.Async.Initialization.Latency", UUID.randomUUID().toString()) : null;
                                            errl errlVar = cwmeVar2.f;
                                            elfr.l(elfl.g(textClassifierLibImpl.c).e(Throwable.class, new emwl() { // from class: cwlt
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj2) {
                                                    Throwable th2 = (Throwable) obj2;
                                                    cskc cskcVar = cwme.a;
                                                    if (th2 instanceof CancellationException) {
                                                        csjb a3 = cwme.a.a();
                                                        a3.I("TextClassifierLib initialization was canceled during measurement.");
                                                        a3.s(th2);
                                                    } else {
                                                        csjb e2 = cwme.a.e();
                                                        e2.K(cwme.b, "TCLibFallback");
                                                        e2.I("TextClassifierLib initialization failed during measurement.");
                                                        e2.s(th2);
                                                    }
                                                    return TextClassifierLibImpl.this;
                                                }
                                            }, errlVar), axnw.c(new Consumer() { // from class: cwlu
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj2) {
                                                    cskc cskcVar = cwme.a;
                                                    akzw akzwVar = akzw.this;
                                                    if (akzwVar == null || ((Boolean) cwme.c.e()).booleanValue()) {
                                                        return;
                                                    }
                                                    akzwVar.c();
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            }), errlVar);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return empty.map(new Function() { // from class: cwlx
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            TextClassifierLibImpl textClassifierLibImpl = (TextClassifierLibImpl) obj;
                                            cskc cskcVar = cwme.a;
                                            return textClassifierLibImpl;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            if (ewvwVar.g == null) {
                                sb2.append(" coreModelProvider");
                            }
                            if (ewvwVar.h == null) {
                                sb2.append(" langIdModelProvider");
                            }
                            if (ewvwVar.i == null) {
                                sb2.append(" actionsSuggestionsModelProvider");
                            }
                            if (ewvwVar.j == null) {
                                sb2.append(" webrefModelProvider");
                            }
                            if (ewvwVar.k == null) {
                                sb2.append(" personNameModelProvider");
                            }
                            if (ewvwVar.l == null) {
                                sb2.append(" alternateContactModelProvider");
                            }
                            if (ewvwVar.m == null) {
                                sb2.append(" neuralMatchingEncoderProvider");
                            }
                            if (ewvwVar.n == null) {
                                sb2.append(" deepCluModelProvider");
                            }
                            if ((ewvwVar.f & 1) == 0) {
                                sb2.append(" enableFallback");
                            }
                            if ((ewvwVar.f & 2) == 0) {
                                sb2.append(" enableInstalledApps");
                            }
                            if ((ewvwVar.f & 4) == 0) {
                                sb2.append(" enableTranslationInClassifier");
                            }
                            if (ewvwVar.c == null) {
                                sb2.append(" eventLogger");
                            }
                            if (ewvwVar.d == null) {
                                sb2.append(" actionsSuggestionsLocales");
                            }
                            if (ewvwVar.e == null) {
                                sb2.append(" intentGenerationOptions");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                    }, this.e);
                    f.b(a2);
                    f.close();
                    this.m = a2;
                } finally {
                }
            }
            g = elfl.g(erqt.j(this.m));
        }
        elfl f2 = g.i(new eroh() { // from class: cwlz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return elfo.e(Optional.empty());
                }
                return elfl.g(erqt.j(((TextClassifierLib) optional.get()).e())).h(new emwl() { // from class: cwly
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Optional.of((TextClassifierLib) obj2);
                    }
                }, cwme.this.f);
            }
        }, erpp.a).f(Throwable.class, new eroh() { // from class: cwma
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                cskc cskcVar = cwme.a;
                if (th instanceof CancellationException) {
                    csjb a3 = cwme.a.a();
                    a3.I("Cancelled TextClassifierLib future.");
                    a3.s(th);
                } else {
                    csjb e2 = cwme.a.e();
                    e2.K(cwme.b, "TCLibFallback");
                    e2.I("Failed to initialize TextClassifierLib. Falling back to system TextClassifier.");
                    e2.s(th);
                }
                return elfl.this;
            }
        }, erpp.a);
        if (((Boolean) c.e()).booleanValue()) {
            return f2;
        }
        final akzw c2 = this.g.c("Bugle.TCLib.Async.Get.Latency", UUID.randomUUID().toString());
        return f2.h(new emwl() { // from class: cwmb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = cwme.a;
                akzw.this.c();
                return optional;
            }
        }, this.f);
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        elfl elflVar;
        if (i >= 40) {
            a.r(a.h(i, "Reclaiming memory at level: "));
            synchronized (this.l) {
                elflVar = this.m;
                this.m = null;
            }
            if (elflVar != null) {
                elflVar.i(new eroh() { // from class: cwlv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        cskc cskcVar = cwme.a;
                        return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: cwmc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((TextClassifierLib) obj2).d();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElseGet(new Supplier() { // from class: cwmd
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                cskc cskcVar2 = cwme.a;
                                return elfo.e(null);
                            }
                        });
                    }
                }, this.f).k(axnw.b(), this.j);
            }
        }
    }
}
