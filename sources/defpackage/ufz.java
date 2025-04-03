package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufz implements ugg, dsmn {
    public static final entd a = entd.c("BugleInputManager");
    public static final cfva b = cfvl.q(161156130);
    public final ffbr c;
    public final ffbr d;
    public boolean e;
    public ukv f;
    public ugb g;
    public ugl h;
    public ugo i;
    private final eisx j;
    private final ConversationIdType k;
    private final ea l;
    private final ffbr m;
    private final ffbr n;
    private final Map o;
    private final ffbr p;
    private gg q;
    private final List r = new ArrayList();
    private uge s;
    private final ffbr t;
    private final ffbr u;

    public ufz(String str, uft uftVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Map map, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, adgn adgnVar, eisx eisxVar, ffbr ffbrVar7) {
        this.k = bdgq.b(str);
        this.j = eisxVar;
        this.l = uftVar;
        this.m = ffbrVar;
        this.n = ffbrVar2;
        this.c = ffbrVar3;
        this.o = map;
        this.d = ffbrVar4;
        this.p = ffbrVar5;
        this.t = ffbrVar6;
        this.u = ffbrVar7;
    }

    private final void A(ugo ugoVar) {
        int size = this.r.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ugj) this.r.get(size)).gk(ugoVar);
            }
        }
    }

    private final void B(uge ugeVar, boolean z) {
        if (ugeVar != null) {
            ugeVar.b();
            ea a2 = ugeVar.a();
            if (a2 != null) {
                gg x = x();
                if (z) {
                    x.F(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
                }
                x.n(a2);
            }
        }
    }

    private final void C(boolean z) {
        ugm z2 = z();
        if (z2 != ugm.IME) {
            if (z2 != null) {
                ugb ugbVar = this.g;
                ugbVar.getClass();
                ugbVar.f();
            }
            B(y(), z);
        }
    }

    private final void D() {
        if (F()) {
            return;
        }
        E();
        B(this.s, false);
        if (this.e) {
            G(eldl.l(new Runnable() { // from class: ufy
                @Override // java.lang.Runnable
                public final void run() {
                    ((ensz) ((ensz) ufz.a.h()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "onKeyboardOpen", 771, "AccountInputManagerFragmentPeer.java")).q("Committing pending Fragment transaction after keyboard open.");
                }
            }));
        }
        ugb ugbVar = this.g;
        if (ugbVar != null) {
            ugbVar.d(ugbVar.h.d() ? uga.MATCHING_IME_TRANSIENT_HEIGHTS : uga.NONE);
            int a2 = ugbVar.f - ugbVar.h.a();
            uhb uhbVar = ugbVar.b;
            ugbVar.h.a();
            uhbVar.d(a2);
        }
    }

    private final void E() {
        if (F()) {
            return;
        }
        this.s = y();
        ugo ugoVar = this.i;
        ugo ugoVar2 = ugo.IME;
        if (ugoVar != ugoVar2) {
            this.i = ugoVar2;
            A(ugoVar2);
        }
    }

    private final boolean F() {
        uge y = y();
        return y != null && y.f();
    }

    private final void G(Runnable runnable) {
        elav k = ekyf.k();
        try {
            gg ggVar = this.q;
            if (ggVar != null) {
                ggVar.y(runnable);
                if (((Boolean) this.t.b()).booleanValue()) {
                    ggVar.c();
                } else {
                    ggVar.j();
                }
                this.q = null;
            } else {
                runnable.run();
            }
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final gg x() {
        if (this.q == null) {
            this.q = new cg(this.l.I());
        }
        return this.q;
    }

    private final uge y() {
        return b(false);
    }

    private final ugm z() {
        ugo ugoVar = this.i;
        if (ugoVar != null) {
            return ugn.a(ugoVar);
        }
        if (((ugd) this.c.b()).e()) {
            return ugm.IME;
        }
        return null;
    }

    public final ufz a() {
        return ((uft) this.l).H();
    }

    public final uge b(boolean z) {
        ugm z2 = z();
        if (z2 == ugm.HUGO) {
            if (!z) {
                ukv ukvVar = this.f;
                ukvVar.getClass();
                if (!ukvVar.l()) {
                    return null;
                }
            }
            return this.f;
        }
        if (z2 == null) {
            return null;
        }
        ea eaVar = this.l;
        lkr h = eaVar.I().h(z2.name());
        if (h != null) {
            return (uge) ((ekhu) h).H();
        }
        return null;
    }

    @Override // defpackage.ugg
    public final ugo c() {
        return this.i;
    }

    @Override // defpackage.ugg
    public final void d(ugj ugjVar) {
        if (!this.r.contains(ugjVar)) {
            this.r.add(ugjVar);
        }
        ugo ugoVar = this.i;
        if (ugoVar != null) {
            ugjVar.gk(ugoVar);
        }
    }

    public final void e(View view) {
        ugc ugcVar = (ugc) this.n.b();
        Activity activity = (Activity) ugcVar.a.b();
        ugd ugdVar = (ugd) ugcVar.b.b();
        ugdVar.getClass();
        uhd uhdVar = (uhd) ugcVar.c.b();
        uhb uhbVar = (uhb) ugcVar.d.b();
        view.getClass();
        this.g = new ugb(activity, ugdVar, uhdVar, uhbVar, view);
        ukw ukwVar = (ukw) this.m.b();
        ugb ugbVar = this.g;
        Supplier supplier = new Supplier() { // from class: ufx
            @Override // java.util.function.Supplier
            public final Object get() {
                ugl uglVar = ufz.this.h;
                uglVar.getClass();
                return uglVar;
            }
        };
        ea eaVar = (ea) ((fbbb) ukwVar.a).a;
        dsfh dsfhVar = (dsfh) ukwVar.b.b();
        dsfhVar.getClass();
        dqmx dqmxVar = (dqmx) ukwVar.c.b();
        dqmxVar.getClass();
        uja ujaVar = (uja) ukwVar.d.b();
        ujaVar.getClass();
        uio uioVar = (uio) ukwVar.e.b();
        uioVar.getClass();
        uit uitVar = (uit) ukwVar.f.b();
        uitVar.getClass();
        uje ujeVar = (uje) ukwVar.g.b();
        ujeVar.getClass();
        ujj ujjVar = (ujj) ukwVar.h.b();
        ujjVar.getClass();
        ujs ujsVar = (ujs) ukwVar.i.b();
        ujsVar.getClass();
        ulf ulfVar = (ulf) ukwVar.j.b();
        ulfVar.getClass();
        umh umhVar = (umh) ukwVar.k.b();
        umhVar.getClass();
        ulk ulkVar = (ulk) ukwVar.l.b();
        ulkVar.getClass();
        ulp ulpVar = (ulp) ukwVar.m.b();
        ulpVar.getClass();
        uly ulyVar = (uly) ukwVar.n.b();
        ulyVar.getClass();
        uoq uoqVar = (uoq) ukwVar.o.b();
        uoqVar.getClass();
        ulu uluVar = (ulu) ukwVar.p.b();
        uluVar.getClass();
        unw unwVar = (unw) ukwVar.q.b();
        unwVar.getClass();
        dqlu dqluVar = (dqlu) ukwVar.r.b();
        dqluVar.getClass();
        ConversationIdType conversationIdType = this.k;
        adsd adsdVar = (adsd) ukwVar.s.b();
        adsdVar.getClass();
        cteg ctegVar = (cteg) ukwVar.t.b();
        ctegVar.getClass();
        ffbr ffbrVar = ukwVar.u;
        ffbr ffbrVar2 = ukwVar.v;
        dqme dqmeVar = (dqme) ukwVar.w.b();
        dqmeVar.getClass();
        Optional optional = (Optional) ukwVar.x.b();
        optional.getClass();
        ugbVar.getClass();
        ukv ukvVar = new ukv(eaVar, dsfhVar, dqmxVar, ujaVar, uioVar, uitVar, ujeVar, ujjVar, ujsVar, ulfVar, umhVar, ulkVar, ulpVar, ulyVar, uoqVar, uluVar, unwVar, dqluVar, adsdVar, ctegVar, ffbrVar, ffbrVar2, dqmeVar, optional, ugbVar, conversationIdType, supplier);
        this.f = ukvVar;
        ukvVar.h();
        final dsfg i = ukvVar.i();
        i.d();
        if (((Boolean) ((cfup) uky.p.get()).e()).booleanValue()) {
            dszr dszrVar = dszr.g;
            fgdj fgdjVar = ukvVar.m.b;
            ffix ffixVar = new ffix() { // from class: ukc
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffbz ffbzVar = ukv.a;
                    Duration ofSeconds = Duration.ofSeconds(((Number) ardj.b.e()).intValue());
                    ofSeconds.getClass();
                    return ofSeconds;
                }
            };
            uop uopVar = ukvVar.m;
            uopVar.getClass();
            fgdj fgdjVar2 = uopVar.d;
            ffxx ffxxVar = uopVar.c;
            fgdj fgdjVar3 = uopVar.e;
            fgdj fgdjVar4 = uopVar.f;
            eygr eygrVar = ((ardl) ardj.h.e()).b;
            eygrVar.getClass();
            i.o(dszrVar, new dtiz(fgdjVar, ffixVar, uopVar, fgdjVar2, ffxxVar, fgdjVar3, fgdjVar4, new dtil(eygrVar, 13), ukvVar.i, true, 7168));
        }
        if (((Boolean) ctjd.aQ.e()).booleanValue()) {
            Optional optional2 = ukvVar.j;
            final ffji ffjiVar = new ffji() { // from class: ukd
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    dris drisVar = (dris) obj;
                    ffbz ffbzVar = ukv.a;
                    drisVar.getClass();
                    fgcm fgcmVar = drisVar.a;
                    dsfg.this.o(dszr.h, new drhe(fgcmVar, 2));
                    return ffcu.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: uke
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ffbz ffbzVar = ukv.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void f(ugo ugoVar) {
        int size = this.r.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ugj) this.r.get(size)).a(ugoVar);
            }
        }
    }

    public final void g(Bundle bundle, ugo ugoVar) {
        uge b2 = ugoVar == ugo.IME ? null : b(true);
        if (b2 != null) {
            o(b2);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            if (uky.a() > 1) {
                bundle2.putInt("input_type", ugoVar.ordinal());
            }
            b2.c(bundle2);
            dsmm dsmmVar = dsmm.a;
            int ordinal = ugoVar.ordinal();
            if (ordinal == 1) {
                ((alrv) this.p.b()).f(alrv.D);
            } else if (ordinal == 2) {
                ((alrv) this.p.b()).f(alrv.A);
            } else if (ordinal == 3) {
                ((alrv) this.p.b()).f(alrv.E);
            }
        }
        if (ugoVar != ugo.IME) {
            A(ugoVar);
        }
    }

    @Override // defpackage.ugg
    public final void h(boolean z) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "hideInput", 468, "AccountInputManagerFragmentPeer.java")).D("InputManager: Hide input (visible input: %s on %s)", this.i, z());
        if (z() != ugm.IME) {
            if (this.e) {
                final ugo ugoVar = this.i;
                C(z);
                this.i = null;
                G(new Runnable() { // from class: ufu
                    @Override // java.lang.Runnable
                    public final void run() {
                        ufz ufzVar = ufz.this;
                        ugb ugbVar = ufzVar.g;
                        ugbVar.getClass();
                        ugbVar.b();
                        ugo ugoVar2 = ugoVar;
                        if (ugoVar2 != null) {
                            ufzVar.f(ugoVar2);
                        }
                    }
                });
                return;
            }
            return;
        }
        ugd ugdVar = (ugd) this.c.b();
        View view = ugdVar.d;
        if (view == null) {
            view = ugdVar.a.getCurrentFocus();
        }
        if (view != null) {
            ugdVar.c(view);
            ugdVar.d = null;
        } else {
            ugdVar.b.i();
        }
        if (((Boolean) uky.o.e()).booleanValue()) {
            return;
        }
        ugb ugbVar = this.g;
        ugbVar.getClass();
        ugbVar.b();
    }

    @Override // defpackage.ugg
    public final void i(List list) {
        ukv ukvVar = this.f;
        if (ukvVar == null) {
            throw new IllegalStateException("Attempted to use HugoInput before it was initialized");
        }
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            uic g = ukvVar.g(messagePartCoreData);
            if (g != null) {
                axol.k(lks.a(ukvVar.d), null, new uku(ukvVar, g.h(), messagePartCoreData, null), 3);
            }
        }
    }

    @Override // defpackage.ugg
    public final void j() {
        ukv ukvVar = this.f;
        if (ukvVar == null) {
            throw new IllegalStateException("Attempted to use HugoInput before it was initialized");
        }
        ukv.m(ukvVar, new ffji() { // from class: ukn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                ffbz ffbzVar = ukv.a;
                dsfgVar.getClass();
                dsfgVar.h();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ugg
    public final void k(MessagePartCoreData messagePartCoreData) {
        ukv ukvVar = this.f;
        if (ukvVar == null) {
            throw new IllegalStateException("Attempted to use Hugo before it was initialized");
        }
        messagePartCoreData.getClass();
        uic g = ukvVar.g(messagePartCoreData);
        if (g != null) {
            ukvVar.h().b.d((doxs) g.h().invoke(messagePartCoreData));
        }
    }

    @Override // defpackage.dsmn
    public final void l(int i) {
        ugb ugbVar = this.g;
        if (ugbVar == null || ugbVar.g == null) {
            return;
        }
        int b2 = ugbVar.h.b();
        int ordinal = ugbVar.g.ordinal();
        if (ordinal == 0) {
            ugbVar.b.d(ugbVar.f - b2);
            return;
        }
        if (ordinal == 2) {
            if (!ugbVar.h.b.d().e || b2 <= 0) {
                return;
            }
            ugbVar.e(ugbVar.e, b2);
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return;
            }
            ugbVar.e(ugbVar.c, b2);
        } else if (ugbVar.h.b.d() == dsmm.a) {
            ugbVar.e(ugbVar.c, b2);
        }
    }

    @Override // defpackage.dsmn
    public final void m(dsmm dsmmVar) {
        ugb ugbVar;
        dsmm dsmmVar2 = dsmm.a;
        int ordinal = dsmmVar.ordinal();
        if (ordinal == 0) {
            D();
            return;
        }
        if (ordinal == 1) {
            E();
            return;
        }
        if (ordinal == 2) {
            if (this.i != ugo.IME || (ugbVar = this.g) == null) {
                return;
            }
            ugbVar.f();
            return;
        }
        if (ordinal != 3) {
            return;
        }
        ugo ugoVar = this.i;
        ugo ugoVar2 = ugo.IME;
        if (ugoVar != ugoVar2) {
            return;
        }
        this.i = null;
        f(ugoVar2);
        ugb ugbVar2 = this.g;
        if (ugbVar2 != null) {
            ugbVar2.b();
        }
    }

    @Override // defpackage.ugg
    public final void n(ugj ugjVar) {
        this.r.remove(ugjVar);
    }

    public final void o(uge ugeVar) {
        ugl uglVar = this.h;
        if (uglVar != null) {
            ugeVar.e(uglVar);
        } else if (ugeVar != this.f) {
            throw new IllegalStateException("Cannot show an input without an input sink!");
        }
        ugeVar.d(a());
    }

    @Override // defpackage.ugg
    public final void p(ugl uglVar) {
        this.h = uglVar;
        ukv ukvVar = this.f;
        if (ukvVar != null) {
            o(ukvVar);
        }
    }

    @Override // defpackage.cxra
    public final boolean q() {
        uge y = y();
        if (y == null) {
            return false;
        }
        if (y.q()) {
            return true;
        }
        h(false);
        return true;
    }

    @Override // defpackage.ugg
    public final void r(ugo ugoVar, boolean z, boolean z2) {
        s(ugoVar, z, z2, null);
    }

    @Override // defpackage.ugg
    public final void s(final ugo ugoVar, boolean z, boolean z2, final Bundle bundle) {
        ffcf ffcfVar;
        EditText d;
        final ugm a2 = ugn.a(ugoVar);
        if (this.e || a2 == ugm.HUGO) {
            final ugo ugoVar2 = this.i;
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "showInput", 333, "AccountInputManagerFragmentPeer.java")).J("InputManager: Show input %s (visible input: %s on %s)", ugoVar, ugoVar2, z());
            if (ugoVar2 != ugoVar) {
                boolean z3 = ugoVar2 == null && z;
                if (ugoVar != ugo.IME && a2 != z()) {
                    C(z3);
                }
                if (a2 == ugm.IME) {
                    ugl uglVar = this.h;
                    if (uglVar != null && (d = uglVar.d()) != null) {
                        if (((ugd) this.c.b()).e()) {
                            D();
                        } else if (!((ugd) this.c.b()).f(d)) {
                            ugb ugbVar = this.g;
                            ugbVar.getClass();
                            ugbVar.c(ugm.IME);
                        }
                        ugd ugdVar = (ugd) this.c.b();
                        ugdVar.d = d;
                        ugdVar.b.f(d, false);
                    }
                } else {
                    this.i = ugoVar;
                    ugb ugbVar2 = this.g;
                    ugbVar2.getClass();
                    ugbVar2.c(a2);
                    if (a2 != ugm.HUGO) {
                        String name = a2.name();
                        ea h = this.l.I().h(name);
                        if (h != null) {
                            x().q(h);
                        } else {
                            ugf ugfVar = (ugf) this.o.get(a2);
                            if (ugfVar == null) {
                                throw new IllegalArgumentException(a.F(a2, "Factory for input surface ", " is not found!"));
                            }
                            ea a3 = ugfVar.a(this.j);
                            gg x = x();
                            ugb ugbVar3 = this.g;
                            ugbVar3.getClass();
                            x.t(ugbVar3.e.getId(), a3, name);
                        }
                    }
                }
            }
            G(eldl.l(new Runnable() { // from class: ufv
                @Override // java.lang.Runnable
                public final void run() {
                    ufz ufzVar = ufz.this;
                    ugo ugoVar3 = ugoVar2;
                    ugo ugoVar4 = ugoVar;
                    if (ugoVar3 != null && ugoVar3 != ugoVar4) {
                        ufzVar.f(ugoVar3);
                    }
                    if (ufzVar.u(a2)) {
                        ufzVar.g(bundle, ugoVar4);
                    }
                }
            }));
            if (!u(a2)) {
                g(bundle, ugoVar);
            }
            if (z2) {
                xgw xgwVar = (xgw) this.u.b();
                ugoVar.getClass();
                ensk g = xgw.a.g();
                g.Y(ente.a, "BugleComposeRow2");
                ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onConv1InputSelected", 53, "ComposeRowNavigationListener.kt")).t("ComposeRowNavigationListener.onConv1InputSelected %s", ugoVar);
                int ordinal = ugoVar.ordinal();
                if (ordinal == 0) {
                    ffcfVar = null;
                } else if (ordinal == 1) {
                    ffcfVar = new ffcf(eptm.PLUS_BUTTON, epts.ALL);
                } else if (ordinal == 2) {
                    ffcfVar = new ffcf(eptm.CAMERA_GALLERY_BUTTON, epts.CAMERA_GALLERY);
                } else if (ordinal == 3) {
                    ffcfVar = new ffcf(eptm.DRAFT_END_EMOJI_BUTTON, epts.EMOTIVE);
                } else if (ordinal == 4) {
                    ffcfVar = new ffcf(eptm.UNKNOWN_OPENING_SOURCE, epts.VOICE);
                } else {
                    if (ordinal != 5) {
                        throw new ffcd();
                    }
                    ffcfVar = new ffcf(eptm.UNKNOWN_OPENING_SOURCE, epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY);
                }
                if (ffcfVar == null) {
                    return;
                }
                xgwVar.b.d((epts) ffcfVar.b, eptu.EXPANDED, (eptm) ffcfVar.a, epto.UNKNOWN_OPENING_STATE, null, null, null);
            }
        }
    }

    @Override // defpackage.ugg
    public final boolean t() {
        EditText d;
        ugl uglVar = this.h;
        return ((uglVar == null || (d = uglVar.d()) == null || !((ugd) this.c.b()).f(d)) && this.i == null) ? false : true;
    }

    public final boolean u(ugm ugmVar) {
        return (ugmVar == ugm.HUGO && ((Boolean) this.t.b()).booleanValue()) ? false : true;
    }

    @Override // defpackage.cxrb
    public final void v() {
        y();
    }

    @Override // defpackage.ugg
    public final void w() {
        y();
    }
}
