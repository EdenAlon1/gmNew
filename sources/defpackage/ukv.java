package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import defpackage.unu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukv implements uge {
    public static final ffbz a = ffca.a(new ffix() { // from class: ukh
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = ukv.a;
            return dszr.values();
        }
    });
    public static final ffbz b = ffca.a(new ffix() { // from class: uki
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = ukv.a;
            return ugo.values();
        }
    });
    public static final ffbz c = ffca.a(new ffix() { // from class: ukj
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = ukv.a;
            return fffi.d(ugo.MAGIC_COMPOSE, ugo.VOICE);
        }
    });
    private final ulu A;
    private final dqlu B;
    private final adsd C;
    private final ffbr D;
    private final ffbr E;
    private final dqme F;
    private final unv G;
    private final ffbz H;
    private final ffbz I;
    private final ffbz J;
    private final ffbz K;
    private dsfg L;
    private dqmw M;
    private ugg N;
    private List O;
    public final ea d;
    public final ujs e;
    public final ulf f;
    public final umh g;
    public final uly h;
    public final cteg i;
    public final Optional j;
    public final ugb k;
    public final Supplier l;
    public final uop m;
    public dqls n;
    public boolean o;
    public ugo p;
    private final dsfh q;
    private final dqmx r;
    private final uja s;
    private final uio t;
    private final uit u;
    private final uje v;
    private final ujj w;
    private final ulk x;
    private final ulp y;
    private final uoq z;

    public ukv(ea eaVar, dsfh dsfhVar, dqmx dqmxVar, uja ujaVar, uio uioVar, uit uitVar, uje ujeVar, ujj ujjVar, ujs ujsVar, ulf ulfVar, umh umhVar, ulk ulkVar, ulp ulpVar, uly ulyVar, uoq uoqVar, ulu uluVar, unw unwVar, dqlu dqluVar, adsd adsdVar, cteg ctegVar, @asov ffbr ffbrVar, @asox ffbr ffbrVar2, dqme dqmeVar, Optional optional, ugb ugbVar, ConversationIdType conversationIdType, Supplier supplier) {
        this.d = eaVar;
        this.q = dsfhVar;
        this.r = dqmxVar;
        this.s = ujaVar;
        this.t = uioVar;
        this.u = uitVar;
        this.v = ujeVar;
        this.w = ujjVar;
        this.e = ujsVar;
        this.f = ulfVar;
        this.g = umhVar;
        this.x = ulkVar;
        this.y = ulpVar;
        this.h = ulyVar;
        this.z = uoqVar;
        this.A = uluVar;
        this.B = dqluVar;
        this.C = adsdVar;
        this.i = ctegVar;
        this.D = ffbrVar;
        this.E = ffbrVar2;
        this.F = dqmeVar;
        this.j = optional;
        this.k = ugbVar;
        this.l = supplier;
        ffix ffixVar = new ffix() { // from class: ukp
            @Override // defpackage.ffix
            public final Object invoke() {
                dqls dqlsVar = ukv.this.n;
                if (dqlsVar != null) {
                    return dqlsVar;
                }
                ffkj.c("draftController");
                return null;
            }
        };
        ugg a2 = ugh.a(eaVar);
        Supplier supplier2 = new Supplier() { // from class: ukq
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj;
                obj = ukv.this.l.get();
                return ((ugl) obj).e();
            }
        };
        umy umyVar = (umy) unwVar.a.b();
        umyVar.getClass();
        ung ungVar = (ung) unwVar.b.b();
        ungVar.getClass();
        unm unmVar = (unm) unwVar.c.b();
        unmVar.getClass();
        ((unn) unwVar.d.b()).getClass();
        xgw xgwVar = (xgw) unwVar.e.b();
        xgwVar.getClass();
        this.G = new unv(umyVar, ungVar, unmVar, xgwVar, ffixVar, a2, supplier2);
        ugg a3 = ugh.a(eaVar);
        arby arbyVar = (arby) uoqVar.a.b();
        arbyVar.getClass();
        ffsk ffskVar = (ffsk) uoqVar.b.b();
        ffskVar.getClass();
        ejmh ejmhVar = (ejmh) uoqVar.c.b();
        ejmhVar.getClass();
        cqoh cqohVar = (cqoh) uoqVar.d.b();
        cqohVar.getClass();
        bcwz bcwzVar = (bcwz) uoqVar.e.b();
        bcwzVar.getClass();
        arca arcaVar = (arca) uoqVar.f.b();
        arcaVar.getClass();
        ddzb ddzbVar = (ddzb) uoqVar.g.b();
        ddzbVar.getClass();
        aldm aldmVar = (aldm) uoqVar.h.b();
        aldmVar.getClass();
        aldr aldrVar = (aldr) uoqVar.i.b();
        aldrVar.getClass();
        this.m = new uop(arbyVar, ffskVar, ejmhVar, cqohVar, bcwzVar, arcaVar, ddzbVar, aldmVar, aldrVar, a3, supplier);
        this.H = ffca.a(new ffix() { // from class: ukr
            @Override // defpackage.ffix
            public final Object invoke() {
                if (!((Boolean) uky.a.e()).booleanValue()) {
                    return null;
                }
                ukv ukvVar = ukv.this;
                ujs ujsVar2 = ukvVar.e;
                uco ucoVar = (uco) ujsVar2.a.b();
                ucoVar.getClass();
                uot uotVar = (uot) ujsVar2.b.b();
                uotVar.getClass();
                return new ujr(ucoVar, uotVar, ukvVar.l);
            }
        });
        this.I = ffca.a(new ffix() { // from class: ujw
            @Override // defpackage.ffix
            public final Object invoke() {
                if (!((Boolean) uky.b.e()).booleanValue()) {
                    return null;
                }
                ukv ukvVar = ukv.this;
                uly ulyVar2 = ukvVar.h;
                uco ucoVar = (uco) ulyVar2.a.b();
                ucoVar.getClass();
                uot uotVar = (uot) ulyVar2.b.b();
                uotVar.getClass();
                return new ulx(ucoVar, uotVar, ukvVar.l);
            }
        });
        this.J = ffca.a(new ffix() { // from class: ujx
            @Override // defpackage.ffix
            public final Object invoke() {
                if (!((Boolean) uky.g.e()).booleanValue()) {
                    return null;
                }
                ukv ukvVar = ukv.this;
                ulf ulfVar2 = ukvVar.f;
                Activity activity = (Activity) ulfVar2.a.b();
                uco ucoVar = (uco) ulfVar2.b.b();
                ucoVar.getClass();
                adgn adgnVar = (adgn) ulfVar2.c.b();
                adgnVar.getClass();
                alcb alcbVar = (alcb) ulfVar2.d.b();
                alcbVar.getClass();
                adgn adgnVar2 = (adgn) ulfVar2.e.b();
                adgnVar2.getClass();
                return new ule(activity, ucoVar, adgnVar, alcbVar, adgnVar2, ukvVar.l);
            }
        });
        this.K = ffca.a(new ffix() { // from class: ujy
            @Override // defpackage.ffix
            public final Object invoke() {
                if (!((Boolean) uky.g.e()).booleanValue()) {
                    return null;
                }
                ukv ukvVar = ukv.this;
                umh umhVar2 = ukvVar.g;
                ea eaVar2 = (ea) ((fbbb) umhVar2.a).a;
                Context context = (Context) umhVar2.b.b();
                context.getClass();
                uco ucoVar = (uco) umhVar2.c.b();
                ucoVar.getClass();
                adgn adgnVar = (adgn) umhVar2.d.b();
                adgnVar.getClass();
                adgn adgnVar2 = (adgn) umhVar2.e.b();
                adgnVar2.getClass();
                alcb alcbVar = (alcb) umhVar2.f.b();
                alcbVar.getClass();
                adgn adgnVar3 = (adgn) umhVar2.g.b();
                adgnVar3.getClass();
                return new umg(eaVar2, context, ucoVar, adgnVar, adgnVar2, alcbVar, adgnVar3, ukvVar.l);
            }
        });
    }

    public static /* synthetic */ Object m(ukv ukvVar, ffji ffjiVar) {
        return ukvVar.j(false, ffjiVar);
    }

    @Override // defpackage.uge
    public final /* synthetic */ ea a() {
        return null;
    }

    @Override // defpackage.uge
    public final void b() {
        m(this, new ffji() { // from class: ujz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                dsfgVar.getClass();
                dsfgVar.e();
                ukv ukvVar = ukv.this;
                ukvVar.o = false;
                ukvVar.p = null;
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.uge
    public final void c(Bundle bundle) {
        ugo ugoVar;
        dsfg i = i();
        this.o = true;
        Integer num = null;
        dszr dszrVar = null;
        if (uky.a() <= 1) {
            ugoVar = ugo.EMOTIVE;
        } else {
            Integer valueOf = Integer.valueOf(bundle.getInt("input_type", -1));
            int intValue = valueOf.intValue();
            if (intValue < 0 || intValue >= uks.c().length) {
                valueOf = null;
            }
            if (valueOf != null) {
                ugoVar = uks.c()[valueOf.intValue()];
            } else {
                ugoVar = null;
            }
        }
        if (ugoVar == null) {
            throw new IllegalStateException("No input type provided to Hugo input");
        }
        int ordinal = ugoVar.ordinal();
        if (ordinal == 1) {
            if (((Boolean) ((cfup) uky.m.get()).e()).booleanValue()) {
                this.C.a(29);
            }
            if (bundle.getBoolean("open_location_chooser")) {
                num = Integer.valueOf(R.string.location_shortcut_title);
            } else {
                Integer valueOf2 = Integer.valueOf(bundle.getInt("auto_launch_shortcut", -1));
                if (valueOf2.intValue() >= 0) {
                    num = valueOf2;
                }
            }
            if (num != null) {
                i.l(num.intValue());
            } else {
                i.k(dszr.e);
            }
        } else if (ordinal == 2) {
            i.k(dszr.a);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                i.k(dszr.g);
            } else {
                if (ordinal != 5) {
                    Objects.toString(ugoVar);
                    throw new IllegalStateException("Unsupported input type ".concat(ugoVar.toString()));
                }
                i.k(dszr.h);
            }
        } else if (((Boolean) uky.c.e()).booleanValue()) {
            List a2 = uks.a();
            Integer valueOf3 = Integer.valueOf(bundle.getInt("initial_screen", -1));
            if (valueOf3.intValue() < 0) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                dszrVar = ((dszr[]) a.a())[valueOf3.intValue()];
            }
            i.n(a2, dszrVar, uks.b(bundle));
        } else {
            dsff.a(i, uks.a(), uks.b(bundle));
        }
        this.p = ugoVar;
    }

    @Override // defpackage.uge
    public final void d(ugg uggVar) {
        this.N = uggVar;
    }

    @Override // defpackage.uge
    public final void e(ugl uglVar) {
        h();
    }

    @Override // defpackage.uge
    public final boolean f() {
        return m(this, new ffji() { // from class: ukg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                ffbz ffbzVar = ukv.a;
                dsfgVar.getClass();
                return dsfgVar.c();
            }
        }) == dsxi.b;
    }

    public final uic g(MessagePartCoreData messagePartCoreData) {
        List list = this.O;
        Object obj = null;
        if (list == null) {
            ffkj.c("onDraftRemovalListeners");
            list = null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((uic) next).i(messagePartCoreData)) {
                obj = next;
                break;
            }
        }
        return (uic) obj;
    }

    public final dqls h() {
        Object obj;
        if (this.n == null) {
            dqmx dqmxVar = this.r;
            obj = this.l.get();
            EditText d = ((ugl) obj).d();
            d.getClass();
            this.M = dqmxVar.a(d);
            dqme dqmeVar = this.F;
            new dqlu();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            if (((Boolean) uky.e.e()).booleanValue()) {
                if (((Boolean) cful.o.e()).booleanValue()) {
                    uio uioVar = this.t;
                    Supplier supplier = this.l;
                    alcb alcbVar = (alcb) uioVar.a.b();
                    alcbVar.getClass();
                    uco ucoVar = (uco) uioVar.b.b();
                    ucoVar.getClass();
                    uin uinVar = new uin(alcbVar, ucoVar, supplier);
                    int i = fflc.a;
                    dqmd.b(new ffkb(ufr.class), uinVar, linkedHashMap);
                } else {
                    uit uitVar = this.u;
                    Supplier supplier2 = this.l;
                    alcb alcbVar2 = (alcb) uitVar.a.b();
                    alcbVar2.getClass();
                    uot uotVar = (uot) uitVar.b.b();
                    uotVar.getClass();
                    uis uisVar = new uis(alcbVar2, uotVar, supplier2);
                    int i2 = fflc.a;
                    dqmd.b(new ffkb(VCardContentItem.class), uisVar, linkedHashMap);
                }
                if (((Boolean) cful.o.e()).booleanValue()) {
                    uje ujeVar = this.v;
                    Supplier supplier3 = this.l;
                    alcb alcbVar3 = (alcb) ujeVar.a.b();
                    alcbVar3.getClass();
                    uco ucoVar2 = (uco) ujeVar.b.b();
                    ucoVar2.getClass();
                    dqmd.b(new ffkb(ufi.class), new ujd(alcbVar3, ucoVar2, supplier3), linkedHashMap);
                } else {
                    ujj ujjVar = this.w;
                    Supplier supplier4 = this.l;
                    alcb alcbVar4 = (alcb) ujjVar.a.b();
                    alcbVar4.getClass();
                    uot uotVar2 = (uot) ujjVar.b.b();
                    uotVar2.getClass();
                    dqmd.b(new ffkb(FileContentItem.class), new uji(alcbVar4, uotVar2, supplier4), linkedHashMap);
                }
                if (((Boolean) cful.o.e()).booleanValue()) {
                    ulk ulkVar = this.x;
                    Supplier supplier5 = this.l;
                    alcb alcbVar5 = (alcb) ulkVar.a.b();
                    alcbVar5.getClass();
                    uco ucoVar3 = (uco) ulkVar.b.b();
                    ucoVar3.getClass();
                    dqmd.b(new ffkb(ufo.class), new ulj(alcbVar5, ucoVar3, supplier5), linkedHashMap);
                } else {
                    ulp ulpVar = this.y;
                    Supplier supplier6 = this.l;
                    alcb alcbVar6 = (alcb) ulpVar.a.b();
                    alcbVar6.getClass();
                    uot uotVar3 = (uot) ulpVar.b.b();
                    uotVar3.getClass();
                    dqmd.b(new ffkb(LocationContentItem.class), new ulo(alcbVar6, uotVar3, supplier6), linkedHashMap);
                }
            }
            ujr ujrVar = (ujr) this.H.a();
            if (ujrVar != null) {
                int i3 = fflc.a;
                dqmd.b(new ffkb(drcr.class), ujrVar, linkedHashMap);
                arrayList.add(ujrVar);
            }
            ulx ulxVar = (ulx) this.I.a();
            if (ulxVar != null) {
                int i4 = fflc.a;
                dqmd.b(new ffkb(dsci.class), ulxVar, linkedHashMap);
                arrayList.add(ulxVar);
            }
            ule uleVar = (ule) this.J.a();
            if (uleVar != null) {
                int i5 = fflc.a;
                dqmd.b(new ffkb(drni.class), uleVar, linkedHashMap);
                arrayList.add(uleVar);
            }
            umg umgVar = (umg) this.K.a();
            if (umgVar != null) {
                int i6 = fflc.a;
                dqmd.b(new ffkb(drnl.class), umgVar, linkedHashMap);
                arrayList.add(umgVar);
            }
            this.O = arrayList;
            dqlu dqluVar = this.B;
            dqmw dqmwVar = this.M;
            if (dqmwVar == null) {
                ffkj.c("draftTextController");
                dqmwVar = null;
            }
            this.n = new dqls(dqmwVar, dqmd.a(dqluVar, linkedHashMap, dqmeVar));
            final unv unvVar = this.G;
            unvVar.getClass();
            ellj.c(this.d, unu.class, new ellh() { // from class: ukk
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    yrz yrzVar;
                    unu unuVar = (unu) ellfVar;
                    unuVar.getClass();
                    boolean z = unuVar instanceof unu.a;
                    unv unvVar2 = unv.this;
                    if (z) {
                        unvVar2.b.a.r(ugo.CAMERA_GALLERY, true, false);
                    } else if (unuVar instanceof unu.b) {
                        umx umxVar = unvVar2.c;
                        umxVar.a.c(((unu.b) unuVar).a);
                    } else if (unuVar instanceof unu.c) {
                        unf unfVar = unvVar2.d;
                        unfVar.b.c(((unu.c) unuVar).a);
                    } else if (unuVar instanceof unu.d) {
                        unh unhVar = unvVar2.f;
                        dszr dszrVar = ((unu.d) unuVar).a;
                        ugo ugoVar = ugo.EMOTIVE;
                        Bundle bundle = new Bundle();
                        if (dszrVar != dszr.c && dszrVar != dszr.f) {
                            Objects.toString(dszrVar);
                            throw new IllegalArgumentException("Unsupported screen category ".concat(dszrVar.toString()));
                        }
                        ugg uggVar = unhVar.a;
                        bundle.putInt("initial_screen", dszrVar.ordinal());
                        uggVar.s(ugoVar, true, false, bundle);
                    } else if (unuVar instanceof unu.e) {
                        unl unlVar = unvVar2.e;
                        unlVar.a.c(((unu.e) unuVar).a);
                    } else {
                        if (!(unuVar instanceof unu.f)) {
                            throw new ffcd();
                        }
                        ellj.g(new aktv(), ((unu.f) unuVar).a);
                    }
                    xgw xgwVar = unvVar2.a;
                    if (z) {
                        yrzVar = yrs.a;
                    } else if (unuVar instanceof unu.b) {
                        yrzVar = yrq.a;
                    } else if (unuVar instanceof unu.c) {
                        yrzVar = yrr.a;
                    } else if (unuVar instanceof unu.d) {
                        unu.d dVar = (unu.d) unuVar;
                        int ordinal = dVar.a.ordinal();
                        if (ordinal == 2) {
                            yrzVar = yrt.a;
                        } else {
                            if (ordinal != 5) {
                                dszr dszrVar2 = dVar.a;
                                Objects.toString(dszrVar2);
                                throw new IllegalStateException("GifStickers with category ".concat(dszrVar2.toString()));
                            }
                            yrzVar = yry.a;
                        }
                    } else if (unuVar instanceof unu.e) {
                        yrzVar = yru.a;
                    } else {
                        if (!(unuVar instanceof unu.f)) {
                            throw new ffcd();
                        }
                        yrzVar = yrw.a;
                    }
                    xgwVar.c(yrzVar);
                    return elli.a;
                }
            });
        }
        dqmw dqmwVar2 = this.M;
        if (dqmwVar2 == null) {
            ffkj.c("draftTextController");
            dqmwVar2 = null;
        }
        dqmwVar2.j(this.s);
        dqls dqlsVar = this.n;
        if (dqlsVar != null) {
            return dqlsVar;
        }
        ffkj.c("draftController");
        return null;
    }

    public final dsfg i() {
        ukv ukvVar;
        if (this.L == null) {
            ViewGroup viewGroup = this.k.d;
            viewGroup.getClass();
            dsfh dsfhVar = this.q;
            ulu uluVar = this.A;
            fr I = this.d.I();
            ffix ffixVar = new ffix() { // from class: ukl
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ukv.this.h();
                }
            };
            ukt uktVar = new ukt(this);
            Consumer consumer = new Consumer() { // from class: ukm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    int intValue = ((Integer) obj).intValue();
                    ukv ukvVar2 = ukv.this;
                    if (ukvVar2.o) {
                        ugb ugbVar = ukvVar2.k;
                        ugbVar.e(ugbVar.d, intValue);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            int dimensionPixelSize = this.d.B().getDimensionPixelSize(R.dimen.compose_elevation_on_scroll);
            Object b2 = this.D.b();
            b2.getClass();
            boolean booleanValue = ((Boolean) b2).booleanValue();
            Object b3 = this.E.b();
            b3.getClass();
            dsfv a2 = dsfhVar.a(uluVar, I, ffixVar, new dsxk(uktVar, viewGroup, consumer, dimensionPixelSize, booleanValue, true, ((Boolean) b3).booleanValue(), false, false, false, false, 130048));
            ukvVar = this;
            ukvVar.L = a2;
        } else {
            ukvVar = this;
        }
        dsfg dsfgVar = ukvVar.L;
        if (dsfgVar != null) {
            return dsfgVar;
        }
        ffkj.c("hugoManager");
        return null;
    }

    public final Object j(boolean z, ffji ffjiVar) {
        dsfg dsfgVar;
        if (z) {
            dsfgVar = i();
        } else {
            dsfgVar = this.L;
            if (dsfgVar == null) {
                dsfgVar = null;
            }
        }
        if (dsfgVar != null) {
            return ffjiVar.invoke(dsfgVar);
        }
        return null;
    }

    public final void k() {
        m(this, new ffji() { // from class: ukf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                ffbz ffbzVar = ukv.a;
                dsfgVar.getClass();
                dsfgVar.f();
                return ffcu.a;
            }
        });
        dqmw dqmwVar = this.M;
        if (dqmwVar == null) {
            ffkj.c("draftTextController");
            dqmwVar = null;
        }
        dqmwVar.m(this.s);
    }

    public final boolean l() {
        dsfg dsfgVar = this.L;
        return (dsfgVar == null || dsfgVar.c() == dsxi.d) ? false : true;
    }

    @Override // defpackage.cxra
    public final boolean q() {
        boolean e = ffkj.e(m(this, new ffji() { // from class: ujv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                ffbz ffbzVar = ukv.a;
                dsfgVar.getClass();
                return Boolean.valueOf(dsfgVar.p());
            }
        }), true);
        if (e && this.N != null && !l()) {
            ugg uggVar = this.N;
            if (uggVar == null) {
                ffkj.c("inputManager");
                uggVar = null;
            }
            uggVar.h(false);
        }
        return e;
    }

    @Override // defpackage.cxrb
    public final void v() {
        throw null;
    }
}
