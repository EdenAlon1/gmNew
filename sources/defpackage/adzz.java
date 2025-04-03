package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import defpackage.ekkz;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzz extends aeer implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    public final lkv a = new lkv(this);
    private final ells ag = new ells();
    private boolean ah;
    private aedh d;
    private Context e;

    @Deprecated
    public adzz() {
        efbd.c();
    }

    static adzz a(eisx eisxVar) {
        adzz adzzVar = new adzz();
        fbae.e(adzzVar);
        ekky.b(adzzVar, eisxVar);
        return adzzVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return aedh.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            aedh H = H();
            ekzz f = eleg.f("HomeFragment#onCreateView");
            try {
                ekzz f2 = eleg.f("setupRootView");
                try {
                    ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.home_fragment, viewGroup, false);
                    viewGroup2.setId(R.id.home_fragment);
                    viewGroup2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: aebs
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            View findViewById;
                            view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                            View findViewById2 = !adhu.a() ? view.findViewById(R.id.action_bar_overflow) : null;
                            if (findViewById2 != null && (findViewById = view.findViewById(R.id.gk_tooltip_hack)) != null) {
                                findViewById2.getLocationOnScreen(new int[2]);
                                float[] fArr = {r3[0] + (findViewById2.getWidth() / 2), r3[1] + ((findViewById2.getHeight() * 3) / 5)};
                                findViewById.setX(fArr[0]);
                                findViewById.setY(fArr[1]);
                            }
                            return windowInsets;
                        }
                    });
                    View findViewById = H.b.fe().findViewById(android.R.id.content);
                    H.aH = new aecw(H, elds.b(), new aedg(H));
                    findViewById.getViewTreeObserver().addOnPreDrawListener(H.aH);
                    f2.close();
                    f.close();
                    if (viewGroup2 == null) {
                        aedp.a(this, H());
                    }
                    ekyf.q();
                    return viewGroup2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.c.j();
        try {
            bn(menuItem);
            boolean G = H().G(menuItem);
            j.close();
            return G;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            aedh H = H();
            if (csgj.a() && (i == 719461746 || i == 719461747 || i == 719461748 || i == 719461749 || i == 719461750 || i == 719461751)) {
                ((Optional) ((fbbb) H.at).a).ifPresent(new Consumer() { // from class: aebi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((tde) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (i == 1 && i2 == -1) {
                if (((aube) H.bv.b()).a()) {
                    ensk h = aedh.a.h();
                    h.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActivityResult", 3662, "HomeFragmentPeer.java")).q("successfully set as default sms");
                } else {
                    aeaa.a.p("successfully set as default sms");
                }
                ((ctvs) H.bk.b()).c();
                H.v();
                H.ac.i();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aeer, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        H().H(menuInflater);
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroy", 3471, "HomeFragmentPeer.java")).q("HomeFragment onDestroy called");
            H.j().m();
            H.aU.f();
            aeac aeacVar = H.aM;
            if (aeacVar != null) {
                aeacVar.b();
            }
            ((cojr) H.n.b()).c();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        ajie ajieVar;
        this.c.k();
        try {
            bh();
            aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onPause", 3118, "HomeFragmentPeer.java")).q("HomeFragment onPause called");
            aemg aemgVar = (aemg) H.x.b();
            aler alerVar = aemgVar.m;
            if (alerVar != null) {
                alerVar.a();
                aemgVar.m = null;
            }
            H.aX = false;
            ((bcrh) H.aU.a()).d(false);
            if (H.aK.b() && (ajieVar = H.aW) != null) {
                ajieVar.g(H.b.fe());
                ajid ajidVar = H.av;
                H.b.fe();
                ajhy ajhyVar = ajidVar.k;
                if (ajhyVar != null) {
                    ajhyVar.g();
                }
            }
            ((dvvb) H.g.b()).b();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onResume", 2614, "HomeFragmentPeer.java")).q("HomeFragment onResume called");
            ekzz f = eleg.f("HomeFragment#onResume");
            try {
                ((aemg) H.x.b()).a(aemg.b);
                H.s.i(4);
                H.aX = true;
                ekzz f2 = eleg.f("setDefaultSmsValueAndUpdateUi");
                try {
                    H.v();
                    f2.close();
                    ekzz f3 = eleg.f("setScrolledToNewestConversationIfNeeded");
                    try {
                        H.x();
                        f3.close();
                        f2 = eleg.f("registerGrowthKitCallbacks");
                        try {
                            ((dvvb) H.g.b()).a(((adsg) H.M.b()).a(H.b.fe(), H.av));
                            f2.close();
                            final aemg aemgVar = (aemg) H.x.b();
                            final epcz epczVar = (epcz) ((epcy) epcz.a.createBuilder()).build();
                            aemgVar.m = ((aleq) aemgVar.j.b()).b(173374, Duration.ofMinutes(10L));
                            elfo.f(new Runnable() { // from class: aemf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aemg aemgVar2 = aemg.this;
                                    if (!((altk) aemgVar2.g.b()).am()) {
                                        aemg.e.m("Clearcut loggings are disabled.");
                                        return;
                                    }
                                    epcz epczVar2 = epczVar;
                                    epco epcoVar = (epco) epcp.a.createBuilder();
                                    epcoVar.copyOnWrite();
                                    epcp epcpVar = (epcp) epcoVar.instance;
                                    epczVar2.getClass();
                                    epcpVar.c = epczVar2;
                                    epcpVar.b |= 1;
                                    long epochMilli = aemgVar2.l.f().toEpochMilli();
                                    epcoVar.copyOnWrite();
                                    epcp epcpVar2 = (epcp) epcoVar.instance;
                                    epcpVar2.b |= 2;
                                    epcpVar2.d = epochMilli;
                                    epcp epcpVar3 = (epcp) epcoVar.build();
                                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar = eolt.HOME_SCREEN;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar = (eolv) eoluVar.instance;
                                    eolvVar.j = eoltVar.dk;
                                    eolvVar.b |= 1;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar2 = (eolv) eoluVar.instance;
                                    epcpVar3.getClass();
                                    eolvVar2.aq = epcpVar3;
                                    eolvVar2.d |= 512;
                                    ((akxl) aemgVar2.h.b()).j(eoluVar);
                                }
                            }, aemgVar.f);
                            H.s.c.compareAndSet(false, true);
                            f.close();
                            b.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        f2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x04c1 A[Catch: all -> 0x0903, TryCatch #21 {all -> 0x0903, blocks: (B:106:0x04a9, B:108:0x04c1, B:111:0x04d1, B:115:0x04dc, B:230:0x04e0, B:232:0x04e8, B:233:0x04ec, B:235:0x0511, B:236:0x0519, B:238:0x051d), top: B:105:0x04a9, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05c2 A[Catch: all -> 0x08ed, TRY_LEAVE, TryCatch #8 {all -> 0x08ed, blocks: (B:121:0x0572, B:123:0x05c2, B:126:0x05f9, B:127:0x061f, B:128:0x061a, B:129:0x0632, B:131:0x06ed, B:132:0x06fe), top: B:120:0x0572, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06ed A[Catch: all -> 0x08ed, TryCatch #8 {all -> 0x08ed, blocks: (B:121:0x0572, B:123:0x05c2, B:126:0x05f9, B:127:0x061f, B:128:0x061a, B:129:0x0632, B:131:0x06ed, B:132:0x06fe), top: B:120:0x0572, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0737 A[Catch: all -> 0x08e2, LOOP:0: B:136:0x0731->B:138:0x0737, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x08e2, blocks: (B:135:0x0717, B:136:0x0731, B:138:0x0737), top: B:134:0x0717, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0768 A[Catch: all -> 0x098d, TryCatch #29 {all -> 0x098d, blocks: (B:98:0x0471, B:101:0x047f, B:104:0x04a0, B:116:0x0530, B:119:0x056b, B:133:0x070e, B:140:0x0745, B:143:0x0756, B:144:0x0761, B:145:0x0815, B:148:0x08b4, B:161:0x08d0, B:160:0x08cd, B:162:0x0768, B:164:0x0776, B:166:0x078a, B:167:0x0792, B:173:0x07dd, B:177:0x0812, B:187:0x08d9, B:186:0x08d6, B:197:0x08de, B:198:0x08e1, B:209:0x08ec, B:208:0x08e9, B:219:0x08f7, B:218:0x08f4, B:229:0x0902, B:228:0x08ff, B:247:0x090d, B:246:0x090a, B:257:0x0918, B:256:0x0915, B:267:0x0923, B:266:0x0920, B:70:0x098c, B:69:0x0989, B:135:0x0717, B:136:0x0731, B:138:0x0737, B:204:0x08e4, B:189:0x07e8, B:176:0x07f1, B:121:0x0572, B:123:0x05c2, B:126:0x05f9, B:127:0x061f, B:128:0x061a, B:129:0x0632, B:131:0x06ed, B:132:0x06fe, B:214:0x08ef, B:118:0x0539, B:224:0x08fa, B:106:0x04a9, B:108:0x04c1, B:111:0x04d1, B:115:0x04dc, B:230:0x04e0, B:232:0x04e8, B:233:0x04ec, B:235:0x0511, B:236:0x0519, B:238:0x051d, B:147:0x0849, B:65:0x0984, B:242:0x0905, B:156:0x08c8, B:103:0x0488, B:252:0x0910, B:182:0x08d1, B:100:0x047a, B:169:0x07b6, B:171:0x07c4, B:190:0x07d1, B:194:0x08dc, B:262:0x091b), top: B:4:0x0056, inners: #1, #5, #7, #8, #12, #14, #18, #21, #23, #24, #26, #28, #31, #34, #36, #38, #40, #44, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e0 A[Catch: all -> 0x0903, TryCatch #21 {all -> 0x0903, blocks: (B:106:0x04a9, B:108:0x04c1, B:111:0x04d1, B:115:0x04dc, B:230:0x04e0, B:232:0x04e8, B:233:0x04ec, B:235:0x0511, B:236:0x0519, B:238:0x051d), top: B:105:0x04a9, outer: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03e8 A[Catch: all -> 0x092f, TryCatch #10 {all -> 0x092f, blocks: (B:81:0x02c3, B:83:0x033b, B:84:0x0340, B:86:0x0346, B:87:0x034b, B:89:0x0351, B:90:0x0356, B:291:0x03e8, B:293:0x03fc), top: B:74:0x025a }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020e A[Catch: all -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x0193, blocks: (B:312:0x0183, B:314:0x0189, B:48:0x020e, B:51:0x0239, B:61:0x0247, B:60:0x0244, B:50:0x0214, B:56:0x023f), top: B:311:0x0183, inners: #17, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025c A[Catch: all -> 0x0931, TRY_LEAVE, TryCatch #11 {all -> 0x0931, blocks: (B:73:0x024e, B:76:0x025c), top: B:72:0x024e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x042c A[Catch: all -> 0x097c, TryCatch #16 {all -> 0x097c, blocks: (B:44:0x094c, B:43:0x0949, B:91:0x0416, B:93:0x042c, B:94:0x0434, B:97:0x046e, B:277:0x092e, B:276:0x092b, B:289:0x093f, B:288:0x093c, B:310:0x0959, B:309:0x0956, B:327:0x096c, B:326:0x0969, B:359:0x097b, B:358:0x0978, B:96:0x0466, B:322:0x0964, B:272:0x0926, B:9:0x006d, B:354:0x0973, B:284:0x0937, B:38:0x0944, B:26:0x01a1, B:305:0x0951), top: B:8:0x006d, inners: #2, #4, #6, #9, #13, #15, #25, #30, #35 }] */
    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(android.view.View r34, android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 2471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adzz.ap(android.view.View, android.os.Bundle):void");
    }

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aedh H() {
        aedh aedhVar = this.d;
        if (aedhVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aedhVar;
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.aeer, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof adzz)) {
                        throw new IllegalStateException(a.J(eaVar, aedh.class));
                    }
                    adzz adzzVar = (adzz) eaVar;
                    Activity activity = (Activity) ((akgo) aX).d.i.b();
                    fbbf fbbfVar = ((akgo) aX).cy;
                    fbbf fbbfVar2 = ((akgo) aX).cC;
                    fbbf fbbfVar3 = ((akgo) aX).cD;
                    Optional of = Optional.of(((akgo) aX).d.G());
                    fbbf fbbfVar4 = ((akgo) aX).cE;
                    fbbf fbbfVar5 = ((akgo) aX).cF;
                    fbbf fbbfVar6 = ((akgo) aX).cG;
                    akfv akfvVar = ((akgo) aX).d;
                    fbbf fbbfVar7 = akfvVar.K;
                    fbbf fbbfVar8 = akfvVar.L;
                    fbbf fbbfVar9 = ((akgo) aX).b.oT;
                    fbbf fbbfVar10 = ((akgo) aX).cI;
                    akis akisVar = ((akgo) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar11 = akkpVar.sY;
                    fbbf fbbfVar12 = akisVar.gy;
                    fbbf fbbfVar13 = akkpVar.fo;
                    fbbf fbbfVar14 = akkpVar.fJ;
                    ctvb ctvbVar = (ctvb) akkpVar.u.b();
                    akis akisVar2 = ((akgo) aX).a;
                    fbbf fbbfVar15 = akisVar2.b.ck;
                    fbbf fbbfVar16 = ((akgo) aX).cN;
                    fbbf fbbfVar17 = ((akgo) aX).cO;
                    fbbf fbbfVar18 = ((akgo) aX).cR;
                    fbbf fbbfVar19 = ((akgo) aX).cS;
                    fbbf fbbfVar20 = ((akgo) aX).cT;
                    fbbf fbbfVar21 = akisVar2.a.fP;
                    cqoh cqohVar = (cqoh) akisVar2.cz.b();
                    fazb a = fbaz.a(((akgo) aX).d.X);
                    fazb a2 = fbaz.a(((akgo) aX).cU);
                    aeiu aeiuVar = (aeiu) ((akgo) aX).da.b();
                    aeiw aeiwVar = new aeiw();
                    fazb a3 = fbaz.a(((akgo) aX).bB);
                    fazb a4 = fbaz.a(((akgo) aX).dh);
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    ejxn ejxnVar = (ejxn) ((akgo) aX).n.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    aegg j = ((aegh) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).j();
                    j.getClass();
                    akkp akkpVar2 = ((akgo) aX).a.a;
                    fbbf fbbfVar22 = akkpVar2.Dy;
                    fbbf fbbfVar23 = ((akgo) aX).di;
                    aegj L = akkpVar2.L();
                    fbbf fbbfVar24 = ((akgo) aX).dj;
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    akhy akhyVar = ((akgo) aX).b;
                    fbbf fbbfVar25 = akhyVar.an;
                    fazb a5 = fbaz.a(akhyVar.oO);
                    akis akisVar3 = ((akgo) aX).a;
                    akkp akkpVar3 = akisVar3.a;
                    fbbf fbbfVar26 = akkpVar3.Px;
                    fbbf fbbfVar27 = ((akgo) aX).dn;
                    fbbf fbbfVar28 = akkpVar3.f;
                    akko akkoVar = akisVar3.b;
                    fbbf fbbfVar29 = akkoVar.iY;
                    fbbf fbbfVar30 = ((akgo) aX).b.ob;
                    fbbf fbbfVar31 = ((akgo) aX).dt;
                    fbbf fbbfVar32 = akkoVar.id;
                    fbbf fbbfVar33 = ((akgo) aX).cd;
                    fbbf fbbfVar34 = ((akgo) aX).dv;
                    fbbf fbbfVar35 = akisVar3.cX;
                    ajid ajidVar = (ajid) ((akgo) aX).cW.b();
                    fbbf fbbfVar36 = ((akgo) aX).a.a.nk;
                    Optional.of((ddle) ((akgo) aX).bj.b());
                    fbbf fbbfVar37 = ((akgo) aX).a.a.iK;
                    fbbf fbbfVar38 = ((akgo) aX).dy;
                    fbbf fbbfVar39 = ((akgo) aX).dA;
                    fazb a6 = fbaz.a(((akgo) aX).dB);
                    ajif ajifVar = new ajif(((akgo) aX).b.ap);
                    akhy akhyVar2 = ((akgo) aX).b;
                    fbbf fbbfVar40 = akhyVar2.gR;
                    akis akisVar4 = ((akgo) aX).a;
                    fbbf fbbfVar41 = akisVar4.nX;
                    fbbf fbbfVar42 = akhyVar2.hD;
                    axkm axkmVar = (axkm) akisVar4.a.ck.b();
                    akis akisVar5 = ((akgo) aX).a;
                    akko akkoVar2 = akisVar5.b;
                    fbbf fbbfVar43 = akkoVar2.jH;
                    fbbf fbbfVar44 = akkoVar2.jJ;
                    fbbf fbbfVar45 = akkoVar2.jI;
                    fbbf fbbfVar46 = akisVar5.cp;
                    Optional of2 = Optional.of(new aejy((errm) akkoVar2.a.a.m.b(), (cqoh) akkoVar2.a.cz.b()));
                    fbbf fbbfVar47 = ((akgo) aX).dD;
                    fbbf fbbfVar48 = ((akgo) aX).dE;
                    ddwz ddwzVar = new ddwz((errl) ((akgo) aX).a.p.b(), ((akgo) aX).a.a.cf);
                    fbbf fbbfVar49 = ((akgo) aX).a.b.hZ;
                    fazb a7 = fbaz.a(((akgo) aX).d.W);
                    fazb a8 = fbaz.a(((akgo) aX).bC);
                    fazb a9 = fbaz.a(((akgo) aX).bD);
                    ecmt ecmtVar = (ecmt) ((akgo) aX).a.fK.b();
                    ecrj ecrjVar = (ecrj) ((akgo) aX).a.cN.b();
                    fbbf fbbfVar50 = ((akgo) aX).a.b.kc;
                    fbbf fbbfVar51 = ((akgo) aX).dF;
                    Optional optional = (Optional) ((akgo) aX).ds.b();
                    aeek aeekVar = new aeek(((akgo) aX).a.a.u, (elbx) ((akgo) aX).b.ap.b(), new asos() { // from class: arua
                    }, ((akgo) aX).dG, ((akgo) aX).dH, ((akgo) aX).a.b.jB, fbaz.a(((akgo) aX).dJ), ((akgo) aX).a.cq);
                    ((ddwo) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).ak().getClass();
                    aepb aepbVar = new aepb(fbaz.a(((akgo) aX).dB), (ffsk) ((akgo) aX).a.a.p.b());
                    fbbf fbbfVar52 = ((akgo) aX).b.oV;
                    fbbf fbbfVar53 = ((akgo) aX).dK;
                    fbbf fbbfVar54 = ((akgo) aX).t;
                    fbbf fbbfVar55 = ((akgo) aX).aW;
                    akis akisVar6 = ((akgo) aX).a;
                    fbbf fbbfVar56 = akisVar6.a.Z;
                    fbbf fbbfVar57 = ((akgo) aX).dL;
                    fbbf fbbfVar58 = ((akgo) aX).dM;
                    fbbf fbbfVar59 = akisVar6.b.it;
                    aemc l = ((aemh) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).l();
                    l.getClass();
                    fbbf fbbfVar60 = ((akgo) aX).dN;
                    fbbf fbbfVar61 = ((akgo) aX).dO;
                    fbbf fbbfVar62 = ((akgo) aX).dP;
                    fbbf fbbfVar63 = ((akgo) aX).a.b.ak;
                    fbbf fbbfVar64 = ((akgo) aX).b.ao;
                    tam tamVar = (tam) ((akgo) aX).d.s.b();
                    alse alseVar = (alse) ((akgo) aX).a.he.b();
                    fbbf fbbfVar65 = ((akgo) aX).dQ;
                    fbbf fbbfVar66 = ((akgo) aX).dS;
                    fbbf fbbfVar67 = ((akgo) aX).dT;
                    fbbf fbbfVar68 = ((akgo) aX).dU;
                    fazb a10 = fbaz.a(((akgo) aX).dV);
                    akko akkoVar3 = ((akgo) aX).a.b;
                    final fbbf fbbfVar69 = akkoVar3.a.a.s;
                    asgp asgpVar = new asgp() { // from class: argh
                        @Override // defpackage.asgp
                        public final boolean a() {
                            return ((ersq) ffbr.this.b()).a("bugle.enable_open_beta10p_a_a_test");
                        }
                    };
                    asgq asgqVar = new asgq() { // from class: argj
                        @Override // defpackage.asgq
                        public final boolean a() {
                            return ((ersq) ffbr.this.b()).a("bugle.enable_open_beta50p_a_a_test");
                        }
                    };
                    asgs asgsVar = new asgs() { // from class: argn
                        @Override // defpackage.asgs
                        public final boolean a() {
                            return ((ersq) ffbr.this.b()).a("bugle.enable_prod10p_a_a_test");
                        }
                    };
                    asgr asgrVar = new asgr() { // from class: argl
                        @Override // defpackage.asgr
                        public final boolean a() {
                            return ((ersq) ffbr.this.b()).a("bugle.enable_prod1p_a_a_test");
                        }
                    };
                    fbbf fbbfVar70 = ((akgo) aX).aO;
                    fbbf fbbfVar71 = akkoVar3.av;
                    akfv akfvVar2 = ((akgo) aX).d;
                    fbbf fbbfVar72 = akfvVar2.Q;
                    fbbf fbbfVar73 = ((akgo) aX).dp;
                    fbbf fbbfVar74 = akfvVar2.ae;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) akkoVar3.kp.b();
                    fbbf fbbfVar75 = ((akgo) aX).dZ;
                    akis akisVar7 = ((akgo) aX).a;
                    akko akkoVar4 = akisVar7.b;
                    fbbf fbbfVar76 = akkoVar4.im;
                    fbbf fbbfVar77 = akkoVar4.jB;
                    fbbf fbbfVar78 = ((akgo) aX).eh;
                    fbbf fbbfVar79 = ((akgo) aX).ei;
                    fbbf fbbfVar80 = ((akgo) aX).ej;
                    fbbf fbbfVar81 = ((akgo) aX).em;
                    fbbf fbbfVar82 = akisVar7.dQ;
                    fbbf fbbfVar83 = ((akgo) aX).en;
                    fbbf fbbfVar84 = akkoVar4.jC;
                    akkp akkpVar4 = akisVar7.a;
                    fbbf fbbfVar85 = akkpVar4.ld;
                    fbbf fbbfVar86 = akkoVar4.ip;
                    fbbf fbbfVar87 = akkpVar4.hj;
                    fazb a11 = fbaz.a(((akgo) aX).dJ);
                    fazb a12 = fbaz.a(((akgo) aX).ep);
                    fbbf fbbfVar88 = ((akgo) aX).a.b.jV;
                    fazb a13 = fbaz.a(((akgo) aX).eq);
                    fazb a14 = fbaz.a(((akgo) aX).er);
                    fbbf fbbfVar89 = ((akgo) aX).d.ah;
                    fbbf fbbfVar90 = ((akgo) aX).es;
                    akis akisVar8 = ((akgo) aX).a;
                    akko akkoVar5 = akisVar8.b;
                    fbbf fbbfVar91 = akkoVar5.kG;
                    fbbf fbbfVar92 = akisVar8.aZ;
                    fbbf fbbfVar93 = akkoVar5.kH;
                    fbbf fbbfVar94 = akisVar8.cq;
                    fbbf fbbfVar95 = akkoVar5.kI;
                    fbbf fbbfVar96 = ((akgo) aX).et;
                    fbbf fbbfVar97 = akkoVar5.kJ;
                    akkp akkpVar5 = akisVar8.a;
                    this.d = new aedh(eisxVar, adzzVar, activity, fbbfVar, fbbfVar2, fbbfVar3, of, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, ctvbVar, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, cqohVar, a, a2, aeiuVar, aeiwVar, a3, a4, ejwlVar, ejxnVar, ejlqVar, j, fbbfVar22, fbbfVar23, L, fbbfVar24, elbxVar, fbbfVar25, a5, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, ajidVar, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, a6, ajifVar, fbbfVar40, fbbfVar41, fbbfVar42, axkmVar, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, of2, fbbfVar47, fbbfVar48, ddwzVar, fbbfVar49, a7, a8, a9, ecmtVar, ecrjVar, fbbfVar50, fbbfVar51, optional, aeekVar, aepbVar, fbbfVar52, fbbfVar53, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, l, fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, fbbfVar64, tamVar, alseVar, fbbfVar65, fbbfVar66, fbbfVar67, fbbfVar68, a10, asgpVar, asgqVar, asgsVar, asgrVar, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, atomicBoolean, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, fbbfVar87, a11, a12, fbbfVar88, a13, a14, fbbfVar89, fbbfVar90, fbbfVar91, fbbfVar92, fbbfVar93, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, akkpVar5.Ln, akkoVar5.kf, ((akgo) aX).eu, akkoVar5.kK, akkoVar5.kL, akkpVar5.f8if);
                    this.Z.c(new ekkg(this.c, this.a));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            if (G() != null) {
                aedh aedhVar = this.d;
                eg G = G();
                ensk h = aedh.a.h();
                h.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onAttach", 979, "HomeFragmentPeer.java")).q("HomeFragment onAttach called");
                ekzz f = eleg.f("HomeFragment#onAttach");
                try {
                    Bundle bundle = aedhVar.b.m;
                    if (bundle != null) {
                        int i = bundle.getInt("conversation_list_mode", cgix.HOME.d);
                        aedhVar.aK = i != 1 ? i != 2 ? cgix.HOME : cgix.SPAM_FOLDER : cgix.ARCHIVED;
                    } else {
                        aedhVar.aK = cgix.HOME;
                    }
                    bcpt bcptVar = aedhVar.aU;
                    bcri bcriVar = (bcri) aedhVar.e.b();
                    aedh h2 = aedhVar.h();
                    cgix cgixVar = aedhVar.aK;
                    ffbr ffbrVar = bcriVar.a;
                    ffbr ffbrVar2 = bcriVar.b;
                    azwc azwcVar = (azwc) bcriVar.c.b();
                    azwcVar.getClass();
                    G.getClass();
                    cgixVar.getClass();
                    bcptVar.c(new bcrh(ffbrVar, ffbrVar2, azwcVar, G, h2, cgixVar, Optional.of(false), Optional.empty()));
                    f.close();
                } finally {
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            final aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1003, "HomeFragmentPeer.java")).q("HomeFragment onCreate called");
            ekzz f = eleg.f("HomeFragment#onCreate");
            try {
                H.s.i(2);
                ekzz f2 = eleg.f("HomeFragment#prewarmGlide");
                try {
                    final adzt adztVar = (adzt) H.bo.b();
                    adztVar.a.submit(eldl.l(new Runnable() { // from class: adzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekzz f3 = eleg.f("GlideInitManager#doInitWork");
                            try {
                                ekmz ekmzVar = (ekmz) adzt.this.b.b();
                                ekmzVar.h().g(Integer.valueOf(R.drawable.ic_check_circle));
                                f3.close();
                            } catch (Throwable th) {
                                try {
                                    f3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }));
                    f2.close();
                    ekzz f3 = eleg.f("HomeFragment#restoreSavedInstance");
                    if (bundle != null) {
                        try {
                            H.aL = bundle.getBoolean("returningFromWelcomeActivity");
                            if (((Boolean) ((cfup) csgj.p.get()).e()).booleanValue() && ((Optional) ((fbbb) H.as).a).isPresent() && bundle.getInt("storageCardState", Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                                adij adijVar = (adij) ((Optional) ((fbbb) H.as).a).get();
                                bundle.getInt("storageCardState");
                                bundle.getLong("storageCardCapacityInBytes");
                                bundle.getLong("storageCardUsageInBytes");
                                adijVar.i();
                            }
                        } finally {
                        }
                    }
                    f3.close();
                    ekzz f4 = eleg.f("welcomeFlowLaunchCheck");
                    try {
                        if (H.aK.b()) {
                            ((Optional) H.aa.b()).ifPresentOrElse(new Consumer() { // from class: aeaq
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    final aedh aedhVar = aedh.this;
                                    ((dejr) obj).a(new Callable() { // from class: aeai
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ensk h2 = aedh.a.h();
                                            h2.Y(ente.a, "HomeFragmentFlogger");
                                            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1043, "HomeFragmentPeer.java")).q("oobe won't launch");
                                            aedh.this.C.b();
                                            return null;
                                        }
                                    });
                                    ensk e = aedh.a.e();
                                    e.Y(ente.a, "HomeFragmentFlogger");
                                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1047, "HomeFragmentPeer.java")).q("WelcomeFlowV1EntryPoint registered");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, new Runnable() { // from class: aear
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ensk h2 = aedh.a.h();
                                    h2.Y(ente.a, "HomeFragmentFlogger");
                                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1050, "HomeFragmentPeer.java")).q("WelcomeFlowV1EntryPoint not registered, oobe won't launch");
                                    aedh.this.C.b();
                                }
                            });
                        } else {
                            ensk h2 = aedh.a.h();
                            h2.Y(ente.a, "HomeFragmentFlogger");
                            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1055, "HomeFragmentPeer.java")).q("oobe won't launch");
                            H.C.b();
                        }
                        f4.close();
                        ekzz f5 = eleg.f("HomeFragment#setTransitions");
                        try {
                            f5.close();
                            ekzz f6 = eleg.f("HomeFragment#registerFutureMixins");
                            try {
                                ekzz f7 = eleg.f("HomeFragment#blockParticipants");
                                try {
                                    H.B.k(H.ax);
                                    f7.close();
                                    ekzz f8 = eleg.f("HomeFragment#reportGroupCallback");
                                    try {
                                        H.B.k(H.ay);
                                        f8.close();
                                        ekzz f9 = eleg.f("HomeFragment#archiveConversationsCallback");
                                        try {
                                            H.B.k(H.az);
                                            f9.close();
                                            ekzz f10 = eleg.f("HomeFragment#gaiaPromoCallback");
                                            try {
                                                H.B.k(H.aB);
                                                f10.close();
                                                ekzz f11 = eleg.f("HomeFragment#devicePairingMixins");
                                                try {
                                                    if (((Optional) H.H.b()).isPresent()) {
                                                        ((dbtj) ((Optional) H.H.b()).get()).c();
                                                    }
                                                    f11.close();
                                                    ekzz f12 = eleg.f("HomeFragment#launchOctarineCallback");
                                                    try {
                                                        if (adhu.a()) {
                                                            H.B.k(H.aA);
                                                        }
                                                        f12.close();
                                                        ekzz f13 = eleg.f("HomeFragment#autoAttachmentControllerCallback");
                                                        try {
                                                            H.B.k(((arcs) H.ae.b()).d);
                                                            f13.close();
                                                            ekzz f14 = eleg.f("HomeFragment#bnrEntryPointCallback");
                                                            try {
                                                                if (((Optional) ((fbbb) H.at).a).isPresent()) {
                                                                    ((tde) ((Optional) ((fbbb) H.at).a).get()).a();
                                                                }
                                                                f14.close();
                                                                ekzz f15 = eleg.f("HomeFragment#fiEntryPointCallback");
                                                                try {
                                                                    if (((Optional) ((fbbb) H.au).a).isPresent()) {
                                                                        ((tiv) ((Optional) ((fbbb) H.au).a).get()).b();
                                                                    }
                                                                    f15.close();
                                                                    ekzz f16 = eleg.f("HomeFragment#accountMenuCardsCallback");
                                                                    try {
                                                                        if (((Optional) ((fbbb) H.as).a).isPresent()) {
                                                                            ((adij) ((Optional) ((fbbb) H.as).a).get()).d();
                                                                        }
                                                                        f16.close();
                                                                        ekzz f17 = eleg.f("HomeFragment#homeMenuExtensionCallback");
                                                                        try {
                                                                            H.ab.ifPresent(new Consumer() { // from class: aeas
                                                                                @Override // java.util.function.Consumer
                                                                                /* renamed from: accept */
                                                                                public final void o(Object obj) {
                                                                                    engw engwVar = ((aemk) obj).a;
                                                                                    int size = engwVar.size();
                                                                                    for (int i = 0; i < size; i++) {
                                                                                        ((aemi) engwVar.get(i)).d(aedh.this.b);
                                                                                    }
                                                                                }

                                                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                                                }
                                                                            });
                                                                            f17.close();
                                                                            ekzz f18 = eleg.f("HomeFragment#dittoWebActivityResultCallback");
                                                                            try {
                                                                                if (H.bc.c(bundle)) {
                                                                                    H.aI = H.b.O(new ael(), new adf() { // from class: aeat
                                                                                        @Override // defpackage.adf
                                                                                        public final void a(Object obj) {
                                                                                            if (((ade) obj).a == -1) {
                                                                                                if (!((aube) aedh.this.bv.b()).a()) {
                                                                                                    aeaa.a.m("Switch to DittoWebActivity finish");
                                                                                                    return;
                                                                                                }
                                                                                                ensk e = aedh.a.e();
                                                                                                e.Y(ente.a, "HomeFragmentFlogger");
                                                                                                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1128, "HomeFragmentPeer.java")).q("Switch to DittoWebActivity finish");
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                                f18.close();
                                                                                ekzz f19 = eleg.f("HomeFragment#superSortCallback");
                                                                                try {
                                                                                    ((Optional) H.R.b()).ifPresent(new Consumer() { // from class: aeau
                                                                                        @Override // java.util.function.Consumer
                                                                                        /* renamed from: accept */
                                                                                        public final void o(Object obj) {
                                                                                            Iterator it = ((Set) ((ahgq) obj).a.b()).iterator();
                                                                                            while (it.hasNext()) {
                                                                                                aedh aedhVar = aedh.this;
                                                                                                aedhVar.B.k((ejlr) it.next());
                                                                                            }
                                                                                        }

                                                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                                                        }
                                                                                    });
                                                                                    f19.close();
                                                                                    ekzz f20 = eleg.f("HomeFragment#blockAndReortSpamCallback");
                                                                                    try {
                                                                                        ((taa) H.J.b()).c(new Supplier() { // from class: aeav
                                                                                            @Override // java.util.function.Supplier
                                                                                            public final Object get() {
                                                                                                return aedh.this.l();
                                                                                            }
                                                                                        });
                                                                                        f20.close();
                                                                                        ekzz f21 = eleg.f("HomeFragment#autoSignInTooltipCallback");
                                                                                        try {
                                                                                            if (((Optional) H.aq.b()).isPresent()) {
                                                                                                ((adkg) ((Optional) H.aq.b()).get()).b();
                                                                                            }
                                                                                            f21.close();
                                                                                            ekzz f22 = eleg.f("HomeFragment#launchConversationCallback");
                                                                                            try {
                                                                                                ((Optional) H.aE.b()).ifPresent(new Consumer() { // from class: aeaw
                                                                                                    @Override // java.util.function.Consumer
                                                                                                    /* renamed from: accept */
                                                                                                    public final void o(Object obj) {
                                                                                                        ((ajei) obj).d(aedh.this.aM);
                                                                                                    }

                                                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                                                    }
                                                                                                });
                                                                                                f22.close();
                                                                                                f6.close();
                                                                                                H.Q.ifPresent(new Consumer() { // from class: aeax
                                                                                                    @Override // java.util.function.Consumer
                                                                                                    /* renamed from: accept */
                                                                                                    public final void o(Object obj) {
                                                                                                        aedh aedhVar = aedh.this;
                                                                                                        aejy aejyVar = (aejy) obj;
                                                                                                        aejyVar.a = (aehw) aedhVar.p.b();
                                                                                                        aedhVar.b.a.c(aejyVar);
                                                                                                    }

                                                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                                                    }
                                                                                                });
                                                                                                H.b.a.c(H.T);
                                                                                                H.b.a.c(H.ac);
                                                                                                f3 = eleg.f("HomeFragment#registerLocalSubscriptionMixins");
                                                                                                try {
                                                                                                    ekzz f23 = eleg.f("HomeFragment#conversationSwipeLocalMixin");
                                                                                                    try {
                                                                                                        eg G = H.b.G();
                                                                                                        G.getClass();
                                                                                                        H.ba = (aenx) new lmw(G).a(aenx.class);
                                                                                                        final aenw aenwVar = (aenw) H.y.b();
                                                                                                        aenwVar.e.g(R.id.swipe_action_settings, new cxif((cxig) aenwVar.d.b()), new ejxk() { // from class: aenv
                                                                                                            @Override // defpackage.ejxk
                                                                                                            public final /* synthetic */ void a(Throwable th) {
                                                                                                                ejxj.a(th);
                                                                                                            }

                                                                                                            @Override // defpackage.ejxk
                                                                                                            public final void b(Object obj) {
                                                                                                                cxhw cxhwVar = (cxhw) ((Optional) obj).orElse(null);
                                                                                                                if (cxhwVar == null) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                aenw aenwVar2 = aenw.this;
                                                                                                                aenwVar2.h = cxhwVar;
                                                                                                                Map map = (Map) aenwVar2.c.b();
                                                                                                                cxhv b = cxhv.b(aenwVar2.h.c);
                                                                                                                if (b == null) {
                                                                                                                    b = cxhv.ARCHIVE;
                                                                                                                }
                                                                                                                aeoe aeoeVar = (aeoe) map.get(b);
                                                                                                                if (aeoeVar != null) {
                                                                                                                    aeoeVar.a().a();
                                                                                                                }
                                                                                                                Map map2 = (Map) aenwVar2.c.b();
                                                                                                                cxhv b2 = cxhv.b(aenwVar2.h.d);
                                                                                                                if (b2 == null) {
                                                                                                                    b2 = cxhv.ARCHIVE;
                                                                                                                }
                                                                                                                aeoe aeoeVar2 = (aeoe) map2.get(b2);
                                                                                                                if (aeoeVar2 != null) {
                                                                                                                    aeoeVar2.a().a();
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        f23.close();
                                                                                                        ekzz f24 = eleg.f("HomeFragment#gaiaAuthCheckLocalMixin");
                                                                                                        try {
                                                                                                            H.A.g(R.id.gaia_auth_check_local_subscription, new cgez((cgfd) H.am.b()), new aeck(H));
                                                                                                            f24.close();
                                                                                                            f15 = eleg.f("HomeFragment#accountMenuEntryPointLocalMixin");
                                                                                                            try {
                                                                                                                if (((Optional) ((fbbb) H.as).a).isPresent()) {
                                                                                                                    ((adij) ((Optional) ((fbbb) H.as).a).get()).g();
                                                                                                                }
                                                                                                                f15.close();
                                                                                                                f9 = eleg.f("HomeFragment#screenDetectionLocalMixin");
                                                                                                                try {
                                                                                                                    ((cojr) H.n.b()).b(H.A, H.b.A());
                                                                                                                    f9.close();
                                                                                                                    f3.close();
                                                                                                                    H.ac.j.c(bundle);
                                                                                                                    if (H.aK.b()) {
                                                                                                                        aepb aepbVar = H.bD;
                                                                                                                        adzz adzzVar = H.b;
                                                                                                                        if (!H.C()) {
                                                                                                                            ekzz f25 = eleg.f("HomeToolbarPresenterimpl#preLoadProductSansFont");
                                                                                                                            try {
                                                                                                                                axol.k(aepbVar.b, null, new aepa(aepbVar, adzzVar, null), 3);
                                                                                                                                ffig.a(f25, null);
                                                                                                                            } finally {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    f.close();
                                                                                                                    ekyf.q();
                                                                                                                } finally {
                                                                                                                }
                                                                                                            } finally {
                                                                                                            }
                                                                                                        } finally {
                                                                                                            try {
                                                                                                                f24.close();
                                                                                                            } catch (Throwable th) {
                                                                                                                th.addSuppressed(th);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        try {
                                                                                                            f23.close();
                                                                                                        } catch (Throwable th2) {
                                                                                                            th.addSuppressed(th2);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                }
                                                                                            } finally {
                                                                                                try {
                                                                                                    f22.close();
                                                                                                } catch (Throwable th3) {
                                                                                                    th.addSuppressed(th3);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            try {
                                                                                                f21.close();
                                                                                            } catch (Throwable th4) {
                                                                                                th.addSuppressed(th4);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        try {
                                                                                            f20.close();
                                                                                        } catch (Throwable th5) {
                                                                                            th.addSuppressed(th5);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    try {
                                                                                        f19.close();
                                                                                    } catch (Throwable th6) {
                                                                                        th.addSuppressed(th6);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                try {
                                                                                    f18.close();
                                                                                } catch (Throwable th7) {
                                                                                    th.addSuppressed(th7);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            try {
                                                                                f17.close();
                                                                            } catch (Throwable th8) {
                                                                                th.addSuppressed(th8);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        try {
                                                                            f16.close();
                                                                        } catch (Throwable th9) {
                                                                            th.addSuppressed(th9);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        f15.close();
                                                                    } catch (Throwable th10) {
                                                                        th.addSuppressed(th10);
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    f14.close();
                                                                } catch (Throwable th11) {
                                                                    th.addSuppressed(th11);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                f13.close();
                                                            } catch (Throwable th12) {
                                                                th.addSuppressed(th12);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            f12.close();
                                                        } catch (Throwable th13) {
                                                            th.addSuppressed(th13);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        f11.close();
                                                    } catch (Throwable th14) {
                                                        th.addSuppressed(th14);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    f10.close();
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                }
                                            }
                                        } finally {
                                            try {
                                                f9.close();
                                            } catch (Throwable th16) {
                                                th.addSuppressed(th16);
                                            }
                                        }
                                    } finally {
                                        try {
                                            f8.close();
                                        } catch (Throwable th17) {
                                            th.addSuppressed(th17);
                                        }
                                    }
                                } finally {
                                    try {
                                        f7.close();
                                    } catch (Throwable th18) {
                                        th.addSuppressed(th18);
                                    }
                                }
                            } finally {
                                try {
                                    f6.close();
                                } catch (Throwable th19) {
                                    th.addSuppressed(th19);
                                }
                            }
                        } finally {
                            try {
                                f5.close();
                            } catch (Throwable th20) {
                                th.addSuppressed(th20);
                            }
                        }
                    } finally {
                        try {
                            f4.close();
                        } catch (Throwable th21) {
                            th.addSuppressed(th21);
                        }
                    }
                } finally {
                    try {
                        f2.close();
                    } catch (Throwable th22) {
                        th.addSuppressed(th22);
                    }
                }
            } finally {
            }
        } catch (Throwable th23) {
            try {
                ekyf.q();
            } catch (Throwable th24) {
                th23.addSuppressed(th24);
            }
            throw th23;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void i() {
        boolean z;
        egzo egzoVar;
        elav b = this.c.b();
        try {
            bf();
            aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroyView", 3436, "HomeFragmentPeer.java")).q("HomeFragment onDestroyView called");
            AppBarLayout appBarLayout = H.bD.c;
            if (appBarLayout != null && (egzoVar = H.aQ) != null) {
                appBarLayout.l(egzoVar);
                H.aQ = null;
            }
            if (!H.aJ) {
                aedh.b(H.b).getViewTreeObserver().removeOnPreDrawListener(H.aG);
                H.aG = new ViewTreeObserver.OnPreDrawListener() { // from class: aebq
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return true;
                    }
                };
                H.b.fe().findViewById(android.R.id.content).getViewTreeObserver().removeOnPreDrawListener(H.aH);
            }
            if (H.aK.b()) {
                H.j().t(H.aO.R());
                if (H.ac.g() != null) {
                    aeix j = H.j();
                    aeek aeekVar = H.ac;
                    if (aeekVar.j.b()) {
                        z = ((Boolean) ((aedw) aeekVar.c.b()).a.c()).booleanValue();
                    } else {
                        ExtendedFloatingActionButton extendedFloatingActionButton = aeekVar.g;
                        z = extendedFloatingActionButton != null ? extendedFloatingActionButton.r : false;
                    }
                    j.r(Boolean.valueOf(z));
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            aedh H = H();
            bundle.putBoolean("returningFromWelcomeActivity", H.aL);
            if (H.aO != null) {
                H.i().M(H.aO.N(), bundle);
            }
            H.bc.a(bundle);
            H.ab.ifPresent(new Consumer() { // from class: aebr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    engw engwVar = ((aemk) obj).a;
                    int size = engwVar.size();
                    for (int i = 0; i < size; i++) {
                        ((aemi) engwVar.get(i)).e();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cfup) csgj.p.get()).e()).booleanValue() && ((Optional) ((fbbb) H.as).a).isPresent() && ((adij) ((Optional) ((fbbb) H.as).a).get()).c().isPresent()) {
                bundle.putInt("storageCardState", ((ebfl) ((adij) ((Optional) ((fbbb) H.as).a).get()).c().get()).ordinal());
                bundle.putLong("storageCardCapacityInBytes", ((adij) ((Optional) ((fbbb) H.as).a).get()).a());
                bundle.putLong("storageCardUsageInBytes", ((adij) ((Optional) ((fbbb) H.as).a).get()).b());
            }
            H.ac.j.a(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            aedh H = H();
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onStop", 3428, "HomeFragmentPeer.java")).q("HomeFragment onStop called");
            aedh.b(H.b).clearFocus();
            H.j().t(H.aO.R());
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aedh H = H();
        if (H.aP.h() && H.aP.a() == 0 && H.b.z() != null) {
            H.A((ListEmptyView) H.aP.b());
        }
        if (configuration != null) {
            adzz adzzVar = H.b;
            int i = configuration.orientation;
            if (aedh.c(adzzVar) == null || aedh.c(H.b).getVisibility() != 0 || aedh.g(H.b) == null) {
                return;
            }
            boolean z = i == 2 || H.b.fe().isInMultiWindowMode();
            if (z != (aedh.g(H.b).getVisibility() == 8)) {
                aedh.g(H.b).setVisibility(true == z ? 8 : 0);
            }
        }
    }

    @Override // defpackage.aeer
    protected final /* bridge */ /* synthetic */ ekky p() {
        return new ekkt(this, false);
    }

    @Override // defpackage.aeer, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
