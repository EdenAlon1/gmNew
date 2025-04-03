package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhp extends vik implements ekhu, fbas, ekhq, ekkk, elar {
    private vij ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public vhp() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return vij.class;
    }

    @Override // defpackage.efam, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final vij H = H();
            layoutInflater.getClass();
            dsfg dsfgVar = null;
            View inflate = layoutInflater.inflate(R.layout.custom_reaction_selection_bottom_sheet_dialog_fragment, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.emoji_reaction_hugo_anchor);
            findViewById.getClass();
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            final dqls dqlsVar = new dqls(H.o, H.n);
            H.p = H.c.a(null, H.b.I(), new ffix() { // from class: vht
                @Override // defpackage.ffix
                public final Object invoke() {
                    return dqls.this;
                }
            }, new dsxk(new vii(H), viewGroup2, new Consumer() { // from class: vhs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    View findViewById2;
                    int intValue = ((Integer) obj).intValue();
                    View view = vij.this.b.Q;
                    if (view == null || (findViewById2 = view.findViewById(R.id.emoji_reaction_hugo_anchor)) == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = intValue;
                    findViewById2.setLayoutParams(layoutParams);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, 0, false, true, true, false, false, false, false, 130210));
            dqsv dqsvVar = (dqsv) H.k.a();
            Optional optional = H.j;
            final ffji ffjiVar = new ffji() { // from class: vhu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str = ((cmrl) obj).d;
                    str.getClass();
                    return new dqnr(str);
                }
            };
            drxd a = drxd.a((drxd) H.l.a(), ffew.c(new ffcf(dszr.b, dqsv.a(dqsvVar, (dqof) optional.map(new Function() { // from class: vhv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null), Integer.valueOf(R.drawable.selected_reaction_item_background), vij.a))), Integer.valueOf(R.dimen.custom_reaction_dialog_fragment_hugo_search_bar_top_inset), Integer.valueOf(R.dimen.custom_reaction_dialog_fragment_hugo_search_bar_bottom_margin));
            dsfg dsfgVar2 = H.p;
            if (dsfgVar2 == null) {
                ffkj.c("hugoManager");
            } else {
                dsfgVar = dsfgVar2;
            }
            dsfgVar.o(dszr.d, a);
            H.m.d();
            ((ddwu) H.f.b()).a(inflate, new Runnable() { // from class: vhw
                @Override // java.lang.Runnable
                public final void run() {
                    vij.this.m.c();
                }
            }, "CustomReactionSelectionDialogFragmentPeer#Opening");
            inflate.getClass();
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.ai;
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

    @Override // defpackage.efam, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.aj.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
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

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.aj.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.ekhu
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final vij H() {
        vij vijVar = this.ag;
        if (vijVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vijVar;
    }

    @Override // defpackage.vik
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ah == null) {
            this.ah = new ekkn(this, super.z());
        }
        return this.ah;
    }

    @Override // defpackage.efam, defpackage.ea
    public final void ae(Bundle bundle) {
        this.aj.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.efam, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.aj.f();
        try {
            super.af(i, i2, intent);
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

    @Override // defpackage.vik, defpackage.efam, defpackage.ea
    public final void ag(Activity activity) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ai() {
        elav b = this.aj.b();
        try {
            super.ai();
            dsfg dsfgVar = H().p;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.f();
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

    @Override // defpackage.efam, defpackage.ea
    public final void am() {
        this.aj.k();
        try {
            super.am();
            dsfg dsfgVar = H().p;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.f();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ao() {
        elav b = this.aj.b();
        try {
            super.ao();
            vij H = H();
            H.b.N().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            dsfg dsfgVar = H.p;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.d();
            dsfg dsfgVar2 = H.p;
            if (dsfgVar2 == null) {
                ffkj.c("hugoManager");
                dsfgVar2 = null;
            }
            dszr dszrVar = dszr.b;
            dszrVar.getClass();
            dsff.a(dsfgVar2, ffdx.b(dszrVar), null);
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

    @Override // defpackage.efam, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
        try {
            super.ap(view, bundle);
            vij H = H();
            view.getClass();
            if (bundle != null) {
                dsfg dsfgVar = H.p;
                if (dsfgVar == null) {
                    ffkj.c("hugoManager");
                    dsfgVar = null;
                }
                dsfgVar.i(bundle);
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

    @Override // defpackage.elar
    public final elds bb() {
        return this.aj.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.aj.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.aj.b = eldsVar;
    }

    @Override // defpackage.vik, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof vhp)) {
                        throw new IllegalStateException(a.J(eaVar, vij.class));
                    }
                    dsfh dsfhVar = (dsfh) ((akgt) aX).s.b();
                    fbbf fbbfVar = ((akgt) aX).a.ix;
                    dsma dsmaVar = (dsma) ((akgt) aX).c.bx.b();
                    akis akisVar = ((akgt) aX).a;
                    akko akkoVar = akisVar.b;
                    fbbf fbbfVar2 = akkoVar.oK;
                    fbbf fbbfVar3 = akisVar.aJ;
                    fbbf fbbfVar4 = akkoVar.ih;
                    dqki dqkiVar = (dqki) akkoVar.hE.b();
                    dqnk dqnkVar = (dqnk) ((akgt) aX).t.b();
                    Optional of = Optional.of(((akgt) aX).a.hI);
                    Optional of2 = Optional.of(((akgt) aX).u);
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    vhr vhrVar = (vhr) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", vhr.a, eyfcVar);
                    vhrVar.getClass();
                    this.ag = new vij((vhp) eaVar, dsfhVar, fbbfVar, dsmaVar, fbbfVar2, fbbfVar3, fbbfVar4, dqkiVar, dqnkVar, of, of2, vhrVar);
                    this.Z.c(new ekkg(this.aj, this.ai));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.aj;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.vik, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.aj.k();
        try {
            LayoutInflater gI = super.gI(bundle);
            LayoutInflater cloneInContext = gI.cloneInContext(new ekkn(this, gI));
            ekyf.q();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
            H().b.q(1, R.style.ThemeOverlay_Bugle_BottomSheetDialog_NoBackgroundTint);
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

    @Override // defpackage.ehbo, defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        super.hf(bundle);
        vij H = H();
        vhp vhpVar = H.b;
        return new vih(H, vhpVar.A(), vhpVar.b);
    }

    @Override // defpackage.ehbo, defpackage.dn
    public final void hw() {
        elav k = ekyf.k();
        try {
            super.hw();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void i() {
        elav b = this.aj.b();
        try {
            super.i();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void j() {
        elav a = this.aj.a();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
        try {
            super.k(bundle);
            dsfg dsfgVar = H().p;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            dsfgVar.j(bundle);
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void l() {
        Window window;
        this.aj.k();
        try {
            super.l();
            vij H = H();
            Dialog dialog = H.b.d;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setFlags(2, 2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = kpp.a(H.b.B(), R.dimen.custom_reaction_selection_background_dim_amount);
                window.setAttributes(attributes);
            }
            elle.c(this);
            if (this.c) {
                elle.b(this);
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void m() {
        this.aj.k();
        try {
            super.m();
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

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.aj.g().close();
    }

    @Override // defpackage.efam, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dsfg dsfgVar = H().p;
        if (dsfgVar == null) {
            ffkj.c("hugoManager");
            dsfgVar = null;
        }
        dsfgVar.g();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.aj.i();
        try {
            super.onDismiss(dialogInterface);
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vik, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
