package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ekkz;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tex extends tir implements ekhu, fbas, ekhq, ekkk, elar {
    private tfh a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public tex() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return tfh.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final tfh H = H();
            View inflate = layoutInflater.inflate(R.layout.fi_account_confirmation_fragment_layout, viewGroup, false);
            inflate.setSystemUiVisibility(1792);
            final ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.scroll_view);
            final ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.bottom_sheet_container);
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tfd
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ScrollView scrollView2 = scrollView;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    if (scrollView2.canScrollVertically(1)) {
                        constraintLayout2.setElevation(tfh.this.b.B().getDimension(R.dimen.fi_bottom_sheet_elevation));
                    } else {
                        constraintLayout2.setElevation(0.0f);
                    }
                }
            });
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: tfe
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    tfh tfhVar = tfh.this;
                    ValueAnimator valueAnimator = tfhVar.A;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tfhVar.A.cancel();
                    }
                    float dimension = scrollView.canScrollVertically(1) ? tfhVar.b.B().getDimension(R.dimen.fi_bottom_sheet_elevation) : 0.0f;
                    final ConstraintLayout constraintLayout2 = constraintLayout;
                    tfhVar.A = ValueAnimator.ofFloat(constraintLayout2.getElevation(), dimension);
                    tfhVar.A.setDuration(150L);
                    tfhVar.A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tfa
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            ConstraintLayout.this.setElevation(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        }
                    });
                    tfhVar.A.start();
                }
            });
            H.w = (ProgressBar) inflate.findViewById(R.id.sync_data_spinner);
            H.x = (Button) inflate.findViewById(R.id.ok_button);
            H.x.setOnClickListener(new elay(H.e, "FiAccountConfirmationFragment:syncDataClick", new View.OnClickListener() { // from class: tfb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tfh tfhVar = tfh.this;
                    tfhVar.x.setEnabled(false);
                    tfhVar.y.setEnabled(false);
                    final tgw tgwVar = tfhVar.g;
                    crty crtyVar = tgwVar.a;
                    eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                    eyfgVar.a("box_devices");
                    tfhVar.d.i(new ejlp(crtyVar.k((eyfh) eyfgVar.build()).i(new eroh() { // from class: tgv
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final engw a = cscq.a((esvv) obj);
                            if (a.isEmpty()) {
                                return elfo.e(false);
                            }
                            tgw tgwVar2 = tgw.this;
                            return tgwVar2.b.n().h(new emwl() { // from class: tgu
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    if (((Optional) obj2).isEmpty()) {
                                        return true;
                                    }
                                    return Boolean.valueOf(!engw.this.contains(r3.get()));
                                }
                            }, tgwVar2.c);
                        }
                    }, tgwVar.d)), new ejlm(null), tfhVar.u);
                }
            }));
            H.y = (Button) inflate.findViewById(R.id.cancel_button);
            H.k.a(H.y, new View.OnClickListener() { // from class: tfc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tfh tfhVar = tfh.this;
                    Intent a = tcn.a(tfhVar.b.z());
                    int a2 = eped.a(tfhVar.n.c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    a.putExtra("entry_point", a2 - 1);
                    tfhVar.b.aD(a);
                    ellj.f(new tig(), tfhVar.b);
                }
            });
            H.z = (ImageView) inflate.findViewById(R.id.account_avatar);
            TextView textView = (TextView) inflate.findViewById(R.id.learn_more_text);
            if (textView != null) {
                textView.setText(ddyi.c(H.b.z(), H.i, H.j, R.string.fi_account_login_learn_more, null, csgj.h));
                egyl.b(textView);
                egyl.c(textView);
                textView.setVisibility(0);
            }
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tfh H() {
        tfh tfhVar = this.a;
        if (tfhVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tfhVar;
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

    @Override // defpackage.tir, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.tir
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

    @Override // defpackage.tir, defpackage.ekkd, defpackage.ea
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
                    akis akisVar = ((akgo) aX).a;
                    Bundle a = ((akgo) aX).a();
                    eyfc eyfcVar = (eyfc) akisVar.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    tfj tfjVar = (tfj) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", tfj.a, eyfcVar);
                    tfjVar.getClass();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof tex)) {
                        throw new IllegalStateException(a.J(eaVar, tfh.class));
                    }
                    tex texVar = (tex) eaVar;
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    crty crtyVar = (crty) ((akgo) aX).b.m.b();
                    axkm axkmVar = (axkm) ((akgo) aX).a.a.ck.b();
                    akhy akhyVar = ((akgo) aX).b;
                    crty crtyVar2 = (crty) akhyVar.m.b();
                    csdh fe = akhyVar.fe();
                    ffsk ffskVar = (ffsk) akhyVar.a.a.p.b();
                    ffsk ffskVar2 = (ffsk) akhyVar.a.a.aq.b();
                    axld axldVar = (axld) akhyVar.I.b();
                    ffskVar2.getClass();
                    axldVar.getClass();
                    axmb axmbVar = new axmb(crtyVar2, fe, ffskVar, (axld) akhyVar.I.b(), (axkm) akhyVar.a.a.ck.b(), (crtz) akhyVar.H.b(), (chje) akhyVar.o.b(), (ctvb) akhyVar.a.a.u.b(), (aolr) akhyVar.a.a.Z.b());
                    akis akisVar2 = ((akgo) aX).a;
                    tgw tgwVar = new tgw(crtyVar, axkmVar, axmbVar, akisVar2.a.FU, (errl) akisVar2.t.b(), (errl) ((akgo) aX).a.p.b());
                    eixo eixoVar = (eixo) ((akgo) aX).a.a.as.b();
                    fbbf fbbfVar = ((akgo) aX).a.a.Px;
                    fbbf fbbfVar2 = ((akgo) aX).b.ob;
                    ellq ellqVar = (ellq) ((akgo) aX).d.e.b();
                    fbbf fbbfVar3 = ((akgo) aX).b.an;
                    akis akisVar3 = ((akgo) aX).a;
                    fbbf fbbfVar4 = akisVar3.b.ho;
                    fbbf fbbfVar5 = ((akgo) aX).h;
                    crue crueVar = (crue) akisVar3.a.Gk.b();
                    akzt akztVar = (akzt) ((akgo) aX).a.a.f.b();
                    this.a = new tfh(tfjVar, texVar, eisxVar, ejlqVar, elbxVar, ejwlVar, tgwVar, eixoVar, fbbfVar, fbbfVar2, ellqVar, fbbfVar3, fbbfVar4, fbbfVar5, crueVar, akztVar);
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
            tfh H = H();
            H.d.k(H.u);
            H.d.k(H.s);
            H.d.k(H.q);
            H.f.b(H.h.a(H.c), H.v);
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

    @Override // defpackage.tir, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
