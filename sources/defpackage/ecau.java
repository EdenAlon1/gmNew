package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecau extends kc implements eboc {
    public static final Property ag = new ecai(Float.class);
    public static final Property ah = new ecaj(Integer.class);
    public ebzz ai;
    public boolean aj;
    public SparseArray ak;
    public ecax al;
    public ExpandableDialogView am;
    public ecap an;
    public ebma ap;
    private boolean aq;
    private ecat ar;
    public final ebod ao = new ebod(this);
    private final abo as = new ecaf(this);

    private static void aX(ViewGroup viewGroup, ecaq ecaqVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(ecaqVar.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // defpackage.ea
    public final View M(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.ao.c(new Runnable() { // from class: ecab
            @Override // java.lang.Runnable
            public final void run() {
                final ecau ecauVar = ecau.this;
                emxf.m(ecauVar.an != null, "configuration can't be null after initialization.");
                Context f = ((ebzl) ecauVar.an).e.f(layoutInflater.getContext());
                Bundle bundle2 = ecauVar.m;
                if (bundle2 != null && bundle2.getBoolean("accountMenuFlavorsStyle", false)) {
                    f = new ContextThemeWrapper(f, R.style.OneGoogle_AccountMenuFlavors);
                }
                Bundle bundle3 = ecauVar.m;
                if (bundle3 != null && bundle3.getBoolean("dialogCenteredStyle", false)) {
                    f = new ContextThemeWrapper(f, R.style.OneGoogle_DialogCentered);
                }
                FrameLayout frameLayout2 = frameLayout;
                View inflate = LayoutInflater.from(f).inflate(R.layout.og_dialog, viewGroup, false);
                frameLayout2.addView(inflate);
                ExpandableDialogView expandableDialogView = (ExpandableDialogView) inflate.findViewById(R.id.og_dialog_view);
                expandableDialogView.getClass();
                ecauVar.am = expandableDialogView;
                ((ebzl) ecauVar.an).a.a(frameLayout2);
                ExpandableDialogView expandableDialogView2 = ecauVar.am;
                expandableDialogView2.l = 1;
                expandableDialogView2.b(((ebzl) ecauVar.an).d);
                Dialog dialog = ecauVar.d;
                Window window = dialog != null ? dialog.getWindow() : null;
                ExpandableDialogView expandableDialogView3 = ecauVar.am;
                expandableDialogView3.k = window;
                expandableDialogView3.j = new Runnable() { // from class: ecae
                    @Override // java.lang.Runnable
                    public final void run() {
                        ecau.this.aV();
                    }
                };
                ecax ecaxVar = ecauVar.al;
                if (ecaxVar != null) {
                    ecauVar.aT(ecaxVar, expandableDialogView3);
                } else {
                    Bundle bundle4 = bundle;
                    ecauVar.ak = bundle4 != null ? bundle4.getSparseParcelableArray("viewHierarchyState") : null;
                }
            }
        });
        return frameLayout;
    }

    public final void aT(ecax ecaxVar, View view) {
        efbd.c();
        this.aq = true;
        ebzm ebzmVar = (ebzm) ecaxVar;
        aX((ViewGroup) view.findViewById(R.id.og_container_footer), ebzmVar.c);
        aX((ViewGroup) view.findViewById(R.id.og_header_container), ebzmVar.a);
        aX((ViewGroup) view.findViewById(R.id.og_container_content_view), ebzmVar.b);
        kvo.r(view.findViewById(R.id.og_header_close_button), view.getResources().getString(ebzmVar.d));
        view.setVisibility(0);
        ecat ecatVar = this.ar;
        if (ecatVar != null) {
            ecatVar.a(view);
        }
    }

    public final void aU() {
        if (aF()) {
            if (aJ()) {
                super.dismissAllowingStateLoss();
            } else {
                super.hw();
            }
            ecap ecapVar = this.an;
            if (ecapVar != null) {
                ((ebzl) ecapVar).b.a();
            }
        }
    }

    public final void aV() {
        ExpandableDialogView expandableDialogView;
        View view;
        ecap ecapVar = this.an;
        if (ecapVar != null && (expandableDialogView = this.am) != null && (view = expandableDialogView.h) != null) {
            ((ebzl) ecapVar).d.f(new dvxf(5), view);
        }
        hw();
    }

    public final void aW(ecat ecatVar) {
        ExpandableDialogView expandableDialogView;
        this.ar = ecatVar;
        if (!this.aq || ecatVar == null || (expandableDialogView = this.am) == null) {
            return;
        }
        ecatVar.a(expandableDialogView);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        this.ap = null;
        this.al = null;
        this.an = null;
        this.ar = null;
    }

    @Override // defpackage.ea
    public final void ap(final View view, final Bundle bundle) {
        ebpb.a(view);
        this.ao.c(new Runnable() { // from class: ecac
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                View findViewById = view2.findViewById(R.id.og_header_close_button);
                final ecau ecauVar = ecau.this;
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: ecaa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ecau ecauVar2 = ecau.this;
                        ecap ecapVar = ecauVar2.an;
                        if (ecapVar != null) {
                            ((ebzl) ecapVar).d.f(new dvxf(5), view3);
                        }
                        ecauVar2.hw();
                    }
                });
                ecauVar.ai = new ebzz(ecauVar.am, ebzz.a, view2.findViewById(R.id.og_container_scroll_view));
                ecauVar.ai.b();
                if (bundle == null) {
                    ExpandableDialogView expandableDialogView = ecauVar.am;
                    expandableDialogView.getClass();
                    expandableDialogView.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) ecau.ag, 0.0f, 1.0f);
                    ofFloat.setDuration(83L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.8f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.8f, 1.0f));
                    ofPropertyValuesHolder.setDuration(200L);
                    ofPropertyValuesHolder.setInterpolator(new ljn());
                    expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new ecag(expandableDialogView));
                    Dialog dialog = ecauVar.d;
                    if (dialog != null && dialog.getWindow() != null) {
                        int color = ecauVar.A().getColor(R.color.google_scrim);
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(ecauVar.d.getWindow().getDecorView(), (Property<View, V>) ecau.ah, new egyx(), Integer.valueOf(kps.h(color, 0)), Integer.valueOf(color));
                        ofObject.setInterpolator(new LinearInterpolator());
                        ofObject.setDuration(200L);
                        ofObject.start();
                    }
                    ofFloat.start();
                    ofPropertyValuesHolder.start();
                }
            }
        });
    }

    @Override // defpackage.eboc
    public final boolean b() {
        return this.an != null;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        q(2, R.style.OneGoogle_Dialog);
    }

    @Override // defpackage.kc, defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Dialog hf = super.hf(bundle);
        ((abg) hf).b.b(this, this.as);
        return hf;
    }

    @Override // defpackage.dn
    public final void hw() {
        Dialog dialog = this.d;
        if (dialog == null || dialog.getWindow() == null) {
            aU();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.getWindow().getDecorView(), (Property<View, Float>) ag, 1.0f, 0.0f);
        ofFloat.setDuration(83L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new ecah(this));
        ofFloat.start();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void i() {
        super.i();
        ebzz ebzzVar = this.ai;
        if (ebzzVar != null) {
            ebzzVar.d.getViewTreeObserver().removeOnScrollChangedListener(ebzzVar.b);
            ebot.a(ebzzVar.d, ebzzVar.c);
            this.ai = null;
        }
        ecap ecapVar = this.an;
        if (ecapVar != null) {
            ((ebzl) ecapVar).c.a();
        }
        this.am = null;
        this.aq = false;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        if (this.am != null) {
            SparseArray sparseArray = new SparseArray();
            this.ak = sparseArray;
            this.am.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.ak);
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() {
        super.l();
        this.aj = true;
        ebma ebmaVar = this.ap;
        if (ebmaVar != null) {
            ebmaVar.a();
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void m() {
        super.m();
        this.aj = false;
        ebma ebmaVar = this.ap;
        if (ebmaVar != null) {
            ebmaVar.b();
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.am;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }
}
