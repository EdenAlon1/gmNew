package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxn {
    private final ellq A;
    public final Context a;
    public final advi b;
    public final adtx c;
    public final adws d;
    public final ejwl e;
    public final aduq f;
    public advh g;
    public AutoCompleteTextView h;
    public TextInputLayout i;
    public LinearLayout j;
    public final ctud m;
    public final ffbr n;
    public final aduc o;
    public final ffbr p;
    public final ffbr q;
    public final adul s;
    public final ffbr t;
    public final ffbr u;
    public AdvancedFeedbackActivity x;
    private final adtc z;
    public final List k = new ArrayList();
    public final entd l = entd.c("Bugle");
    public eoio r = eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_UNKNOWN;
    public Optional v = Optional.empty();
    public int w = 0;
    public final ejwd y = new ejwd<Optional<Bitmap>>() { // from class: adxn.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            ((ensz) ((ensz) ((ensz) adxn.this.l.j()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$1", "onError", (char) 132, "AdvancedFeedbackFragmentPeer.java")).q("Failed to fetch screenshot");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            adxn.this.v = (Optional) obj;
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };

    public adxn(Context context, adtc adtcVar, adws adwsVar, advi adviVar, adtx adtxVar, ellq ellqVar, adul adulVar, ejwl ejwlVar, aduq aduqVar, ctud ctudVar, ffbr ffbrVar, aduc aducVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = context;
        this.z = adtcVar;
        this.d = adwsVar;
        this.b = adviVar;
        this.c = adtxVar;
        this.A = ellqVar;
        this.s = adulVar;
        this.e = ejwlVar;
        this.f = aduqVar;
        this.m = ctudVar;
        this.n = ffbrVar;
        this.o = aducVar;
        this.p = ffbrVar2;
        this.q = ffbrVar3;
        this.t = ffbrVar4;
        this.u = ffbrVar5;
    }

    public final Intent a() {
        eg G;
        adws adwsVar = this.d;
        if (adwsVar == null || (G = adwsVar.G()) == null) {
            return null;
        }
        return G.getIntent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        ArrayList arrayList;
        final adsx adsxVar = new adsx();
        adul adulVar = this.s;
        if (adulVar == null) {
            throw new NullPointerException("Null consentData");
        }
        adsxVar.d = adulVar;
        Stream map = Collection.EL.stream(this.k).filter(new Predicate() { // from class: adxg
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.g().isPresent() && advancedFeedbackDataView.h();
            }
        }).map(new Function() { // from class: adxj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [adtw, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AdvancedFeedbackDataView) obj).g().get().e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        final engw engwVar = (engw) map.collect(endq.a);
        ((adtv) this.t.b()).a(4, Optional.of(this.r), Optional.of(this.g.b()), Optional.of(engwVar), Optional.of(this.s.a));
        this.v.ifPresent(new Consumer() { // from class: adxk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((adsx) adta.this).e = (Bitmap) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection.EL.stream(this.k).filter(new Predicate() { // from class: adxl
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.g().isPresent() && advancedFeedbackDataView.h();
            }
        }).forEach(new Consumer() { // from class: adxm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Object obj2 = ((AdvancedFeedbackDataView) obj).g().get();
                adsx adsxVar2 = (adsx) adta.this;
                if (adsxVar2.a == null) {
                    int i2 = engw.d;
                    adsxVar2.a = new engr();
                }
                adsxVar2.a.h(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        int i2 = this.w;
        ephv b = ephv.b(i2);
        String name = (i2 == 0 || b == null) ? this.g.b().name() : b.name();
        if (adsxVar.f == null) {
            adsxVar.f = new enhd();
        }
        adsxVar.f.k("IssueTypeName", name);
        String f = f();
        if (f != null) {
            adsxVar.h = Optional.of(f);
            ((ensz) ((ensz) this.l.h()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "launchFeedback", 414, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. Advanced feedback complete, launching normal feedback: %s", f);
        }
        if (e()) {
            ea g = this.x.H().a.a().g(R.id.message_selector_fragment);
            if (g instanceof adya) {
                adyc H = ((adya) g).H();
                arrayList = new ArrayList();
                for (adyj adyjVar : H.f) {
                    final adur adurVar = new adur();
                    adurVar.c(adyjVar.e);
                    adurVar.d(adyjVar.f);
                    Collection.EL.stream(adyjVar.d).filter(new Predicate() { // from class: adye
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
                            return ((adyq) obj).a();
                        }
                    }).forEach(new Consumer() { // from class: adyf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            aduw.this.e(((adyq) obj).f);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Optional of = Optional.of(adurVar.a());
                    of.isPresent();
                    arrayList.add(of.get());
                }
            } else {
                arrayList = new ArrayList();
            }
            adug adugVar = (adug) ((AdvancedFeedbackDataView) ((engw) Collection.EL.stream(this.k).filter(new Predicate() { // from class: adwu
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
                    AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                    return advancedFeedbackDataView.g().isPresent() && advancedFeedbackDataView.h() && (advancedFeedbackDataView.g().get() instanceof adug);
                }
            }).collect(endq.a)).get(0)).g().get();
            engw engwVar2 = (engw) Collection.EL.stream(arrayList).map(new Function() { // from class: adwv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aduy) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
            final ArrayList arrayList2 = new ArrayList();
            Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: adww
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Stream stream = Collection.EL.stream(((aduy) obj).c());
                    final List list = arrayList2;
                    stream.forEach(new Consumer() { // from class: adxd
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            list.add(((adux) obj2).c());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            adugVar.j = engwVar2;
            adugVar.i = arrayList2;
        }
        adtc adtcVar = this.z;
        engr engrVar = adsxVar.a;
        if (engrVar != null) {
            adsxVar.b = engrVar.g();
        } else if (adsxVar.b == null) {
            adsxVar.b = enou.a;
        }
        if (adsxVar.c == null) {
            adsxVar.c = enou.a;
        }
        enhd enhdVar = adsxVar.f;
        if (enhdVar != null) {
            adsxVar.g = enhdVar.c();
        } else if (adsxVar.g == null) {
            adsxVar.g = enoz.a;
        }
        adul adulVar2 = adsxVar.d;
        if (adulVar2 == null) {
            throw new IllegalStateException("Missing required properties: consentData");
        }
        dhre a = adtcVar.a(new adsy(adsxVar.b, adsxVar.c, adulVar2, adsxVar.e, adsxVar.g, adsxVar.h));
        final Runnable l = eldl.l(new Runnable() { // from class: adwx
            @Override // java.lang.Runnable
            public final void run() {
                adxn adxnVar = adxn.this;
                ((adtv) adxnVar.t.b()).a(5, Optional.of(adxnVar.r), Optional.of(adxnVar.g.b()), Optional.of(engwVar), Optional.of(adxnVar.s.a));
            }
        });
        final Runnable l2 = eldl.l(new Runnable() { // from class: adwy
            @Override // java.lang.Runnable
            public final void run() {
                adxn adxnVar = adxn.this;
                ((adtv) adxnVar.t.b()).a(6, Optional.of(adxnVar.r), Optional.of(adxnVar.g.b()), Optional.of(engwVar), Optional.of(adxnVar.s.a));
            }
        });
        a.a(new dhqy() { // from class: adxh
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                l.run();
            }
        });
        a.t(new dhqv() { // from class: adxi
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                l2.run();
            }
        });
        AdvancedFeedbackActivity advancedFeedbackActivity = this.x;
        if (advancedFeedbackActivity != null) {
            advancedFeedbackActivity.finish();
        }
    }

    final void c(advh advhVar) {
        this.i.j(null);
        this.g = advhVar;
        for (AdvancedFeedbackDataView advancedFeedbackDataView : this.k) {
            engw a = advhVar.a();
            int size = a.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < size) {
                    Class<?> cls = ((adtw) a.get(i)).getClass();
                    i++;
                    if (cls == advancedFeedbackDataView.j.getClass()) {
                        z = true;
                        break;
                    }
                }
            }
            advancedFeedbackDataView.g.setChecked(z);
        }
    }

    final void d() {
        im k = this.x.k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
            k.setDisplayShowCustomEnabled(true);
            k.setDisplayShowTitleEnabled(false);
            k.setCustomView(R.layout.advanced_feedback_toolbar);
            this.A.a((Button) k.getCustomView().findViewById(R.id.advanced_feedback_fragment_next_button), new View.OnClickListener() { // from class: adwz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    adxn adxnVar = adxn.this;
                    if (adxnVar.g == null) {
                        adxnVar.i.j(" ");
                        return;
                    }
                    if (((Boolean) adwg.b.e()).booleanValue()) {
                        Stream filter = Collection.EL.stream(adxnVar.k).filter(new Predicate() { // from class: adxf
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
                                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                                return advancedFeedbackDataView.g().isPresent() && advancedFeedbackDataView.h() && (advancedFeedbackDataView.g().get() instanceof aduc);
                            }
                        });
                        int i = engw.d;
                        if (!((engw) filter.collect(endq.a)).isEmpty() && !adxnVar.m.j() && adxnVar.x.H().d == 1) {
                            if (adxnVar.m.j()) {
                                return;
                            }
                            ((ensz) adxnVar.l.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "requestLocationPermissionAndLaunchFeedback", 585, "AdvancedFeedbackFragmentPeer.java")).q("Request location permission");
                            ((ctuk) adxnVar.n.b()).f(new adxo(adxnVar));
                            return;
                        }
                    }
                    if (((Boolean) adwg.c.e()).booleanValue() && adxnVar.e() && adxnVar.x.H().d == 1) {
                        ellj.f(new adxr(), adxnVar.d);
                    } else {
                        adxnVar.b();
                    }
                }
            });
        }
        Toolbar eZ = this.x.eZ();
        if (eZ != null) {
            eZ.t(new View.OnClickListener() { // from class: adxa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    adxn adxnVar = adxn.this;
                    ((adtv) adxnVar.t.b()).a(3, Optional.of(adxnVar.r), Optional.empty(), Optional.empty(), Optional.empty());
                    adxnVar.x.gE().d();
                }
            });
        }
    }

    final boolean e() {
        Stream filter = Collection.EL.stream(this.k).filter(new Predicate() { // from class: adxc
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
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) obj;
                return advancedFeedbackDataView.g().isPresent() && advancedFeedbackDataView.h() && (advancedFeedbackDataView.g().get() instanceof adug);
            }
        });
        int i = engw.d;
        return !((engw) filter.collect(endq.a)).isEmpty();
    }

    public final String f() {
        Intent a = a();
        if (a == null) {
            return null;
        }
        return a.getStringExtra("advanced_feedback_throwable_string_key");
    }
}
