package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import defpackage.ekkz;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpm extends wqo implements ekhu, fbas, ekhq, ekkk, elar {
    private wqj a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public wpm() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return wqj.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            wqj H = H();
            layoutInflater.getClass();
            ekzz f = eleg.f("Conversation2Fragment::onCreateView");
            try {
                ComposeView composeView = new ComposeView(H.b.A(), null, 0, 6, null);
                Optional optional = H.m;
                final ffji ffjiVar = new ffji() { // from class: wpn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dacq dacqVar = (dacq) obj;
                        dacqVar.getClass();
                        dacqVar.a();
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: wpo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                composeView.setFitsSystemWindows(true);
                composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: wpp
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        view.getClass();
                        windowInsets.getClass();
                        return windowInsets;
                    }
                });
                composeView.a(new hpw(1096399568, true, new wqd(H)));
                ((aley) H.n.b()).a(composeView, 184228);
                if (((asmv) H.u.b()).a()) {
                    f = eleg.f("logScreenFirstVisitEvents");
                    try {
                        alqj alqjVar = (alqj) H.t.b();
                        Instant f2 = ((cqoh) H.w.b()).f();
                        f2.getClass();
                        axnw.h(alqjVar.a(3, f2));
                        ffig.a(f, null);
                    } finally {
                    }
                } else {
                    f = eleg.f("logFirstTimeConversationOpenEvent");
                    try {
                        alql alqlVar = (alql) H.v.b();
                        Instant f3 = ((cqoh) H.w.b()).f();
                        f3.getClass();
                        axnw.h(alqlVar.a(3, f3));
                        ffig.a(f, null);
                    } finally {
                    }
                }
                ffig.a(f, null);
                ekyf.q();
                return composeView;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wqj H() {
        wqj wqjVar = this.a;
        if (wqjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return wqjVar;
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
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.wqo, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            kwg.a(H().b.fe().getWindow(), true);
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

    @Override // defpackage.ea
    public final void al(boolean z) {
        abai abaiVar = (abai) fflm.b(H().r);
        if (abaiVar != null) {
            abaiVar.a = z;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            bh();
            wqj H = H();
            ((carb) H.g.b()).e(bdgq.a);
            ((ahnp) H.j.b()).a();
            ((abam) H.f.b()).f();
            if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((Optional) H.a().g.b()).isPresent()) {
                ajge ajgeVar = (ajge) ((Optional) H.a().g.b()).get();
                if (ajgeVar.b.getAndSet(0) > 0) {
                    ((ajfs) ajgeVar.a.b()).b();
                }
            }
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
        ConversationViewModel a;
        elav b = this.c.b();
        try {
            bi();
            wqj H = H();
            ekzz f = eleg.f("Conversation2Fragment::onResume");
            try {
                ConversationId conversationId = H.a().a;
                if (!((auof) H.z.b()).a() && !((askf) H.A.b()).a()) {
                    if (conversationId instanceof BugleConversationId) {
                        ((carb) H.g.b()).e(((BugleConversationId) conversationId).a);
                    } else if (((asvn) H.x.b()).a() && (conversationId instanceof EmergencySosConversationId)) {
                        ((carb) H.g.b()).e(((EmergencySosConversationId) conversationId).a);
                    }
                    a = H.a();
                    if (((attl) a.k.b()).a() && (a.a instanceof EmergencyConversationId)) {
                        ((amrr) a.j.b()).I();
                    }
                    ffig.a(f, null);
                    b.close();
                }
                ((carb) H.g.b()).e(amic.a(conversationId));
                a = H.a();
                if (((attl) a.k.b()).a()) {
                    ((amrr) a.j.b()).I();
                }
                ffig.a(f, null);
                b.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.wqo
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
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

    @Override // defpackage.wqo, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof wpm)) {
                        throw new IllegalStateException(a.J(eaVar, wqj.class));
                    }
                    wpm wpmVar = (wpm) eaVar;
                    fbbf fbbfVar = ((akgo) aX).az;
                    akfv akfvVar = ((akgo) aX).d;
                    akfy akfyVar = ((akgo) aX).c;
                    akis akisVar = ((akgo) aX).a;
                    fbbf fbbfVar2 = akfvVar.N;
                    fbbf fbbfVar3 = akfvVar.O;
                    fbbf fbbfVar4 = akfyVar.o;
                    fbbf fbbfVar5 = akisVar.a.sY;
                    fbbf fbbfVar6 = ((akgo) aX).cz;
                    fbbf fbbfVar7 = akfyVar.p;
                    fbbf fbbfVar8 = akfvVar.I;
                    fbbf fbbfVar9 = akfvVar.x;
                    fbbf fbbfVar10 = akfvVar.Q;
                    Optional empty = Optional.empty();
                    fbbf fbbfVar11 = akisVar.b.jB;
                    akis akisVar2 = ((akgo) aX).a;
                    fbbf fbbfVar12 = akisVar2.b.jr;
                    Optional empty2 = Optional.empty();
                    fbbf fbbfVar13 = akisVar2.b.jC;
                    Optional of = Optional.of((abai) ((akgo) aX).a.b.jD.b());
                    akfv akfvVar2 = ((akgo) aX).d;
                    akis akisVar3 = ((akgo) aX).a;
                    fbbf fbbfVar14 = akfvVar2.s;
                    akko akkoVar = akisVar3.b;
                    fbbf fbbfVar15 = akkoVar.jI;
                    fbbf fbbfVar16 = akkoVar.jJ;
                    fbbf fbbfVar17 = akkoVar.jH;
                    fbbf fbbfVar18 = akisVar3.cz;
                    akkp akkpVar = akisVar3.a;
                    this.a = new wqj(wpmVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, empty, fbbfVar11, fbbfVar12, empty2, fbbfVar13, of, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, akkpVar.Q, akfvVar2.k, akkoVar.jK, akkpVar.ld, akkoVar.jL, akkoVar.jM);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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
            wqj H = H();
            ekzz f = eleg.f("Conversation2Fragment::onCreate");
            try {
                ((abam) H.f.b()).d();
                boolean z = false;
                kwg.a(H.b.fe().getWindow(), false);
                abai abaiVar = (abai) fflm.b(H.r);
                if (abaiVar != null) {
                    abaiVar.a = ctid.e(H.b.fe(), ((tam) H.s.b()).a);
                }
                if (((Optional) H.l.b()).isEmpty()) {
                    aiha aihaVar = (aiha) H.d.b();
                    aihaVar.a();
                    Bundle bundle2 = H.b.m;
                    boolean z2 = bundle2 != null ? bundle2.getBoolean("can_navigate_back") : true;
                    Bundle bundle3 = H.b.m;
                    boolean z3 = bundle3 != null ? bundle3.getBoolean("is_bubble_activity") : false;
                    aijc aijcVar = aijc.a;
                    if (z2 && !z3) {
                        z = true;
                    }
                    aihaVar.b(aijcVar, z);
                }
                ((cwor) H.e.b()).a();
                f = eleg.f("Conversation2Fragment::initializeExpressiveStickers");
                try {
                    if (((Boolean) cful.f.e()).booleanValue()) {
                        ((dccz) H.o.b()).b();
                    }
                    ffig.a(f, null);
                    Optional optional = H.p;
                    final ffji ffjiVar = new ffji() { // from class: wpq
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            cqop cqopVar = (cqop) obj;
                            cqopVar.getClass();
                            cqopVar.a();
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: wpr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ffji.this.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ffig.a(f, null);
                    ekyf.q();
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

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
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
    public final void l() {
        this.c.k();
        try {
            bk();
            wqj H = H();
            ekzz f = eleg.f("Conversation2Fragment::onStart");
            try {
                ahpi ahpiVar = H.D;
                String b = H.a().a.b();
                b.getClass();
                ahpiVar.a(new ahpf(b));
                ffig.a(f, null);
                ekyf.q();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            wqj H = H();
            H.D.a(new ahpg());
            ConversationViewModel a = H.a();
            boolean isChangingConfigurations = H.b.fe().isChangingConfigurations();
            for (abcr abcrVar : (Set) a.h.b()) {
                if (!isChangingConfigurations) {
                    axol.k(abcrVar.c, null, new abcq(abcrVar, null), 3);
                }
            }
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

    @Override // defpackage.wqo, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
