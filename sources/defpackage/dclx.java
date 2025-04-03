package defpackage;

import android.animation.TimeAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.transition.TransitionInflater;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.SwitchImageView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import defpackage.fbal;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclx extends dcpt implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    public final lkv a = new lkv(this);
    private final ells ag = new ells();
    private boolean ah;
    private dcnd d;
    private Context e;

    @Deprecated
    public dclx() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcnd.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final dcnd H = H();
            H.v = layoutInflater.inflate(R.layout.camera_fragment, viewGroup, false);
            H.w = (ConstraintLayout) H.v.findViewById(R.id.camera_fragment);
            H.x = (CameraTextureView) H.v.findViewById(R.id.camera_texture_view);
            H.x.i = new dcmr(H);
            H.A = (SwitchImageView) H.v.findViewById(R.id.back_close_button);
            H.y = H.v.findViewById(R.id.switch_camera);
            H.z = (CarouselRecyclerView) H.v.findViewById(R.id.mode_recycler);
            H.B = (SwitchImageView) H.v.findViewById(R.id.camera_flash_button);
            H.D = H.v.findViewById(R.id.shutter_button);
            H.E = (ImageView) H.v.findViewById(R.id.shutter_button_fill);
            H.F = (TextView) H.v.findViewById(R.id.recording_duration_display_text);
            H.C = (FrameLayout) H.v.findViewById(R.id.confirmation_container);
            H.G = H.v.findViewById(R.id.stop_recording_button);
            ImageView imageView = (ImageView) H.v.findViewById(R.id.shutter_button_ring);
            ImageView imageView2 = (ImageView) H.v.findViewById(R.id.video_progress_ring);
            RenderOverlay renderOverlay = (RenderOverlay) H.v.findViewById(R.id.focus_visual);
            H.s = new dcpp(new Consumer() { // from class: dcms
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Integer num = (Integer) obj;
                    int intValue = 360 - num.intValue();
                    ljm ljmVar = new ljm();
                    dcnd dcndVar = dcnd.this;
                    for (View view : dcndVar.M) {
                        view.setPivotX(view.getWidth() / 2);
                        view.setPivotY(view.getHeight() / 2);
                        view.animate().setInterpolator(ljmVar).rotation(intValue % 360);
                    }
                    dcndVar.H.a(num.intValue());
                    boolean z = dcndVar.P % 180 == 0;
                    Boolean bool = dcndVar.t;
                    if (bool == null || bool.booleanValue() != z) {
                        dcndVar.t = Boolean.valueOf(z);
                        dcndVar.o.a(z ? dcndVar.B : dcndVar.A, dcndVar.g.v());
                        SwitchImageView switchImageView = dcndVar.A;
                        int i = R.drawable.back_arrow_shadow;
                        switchImageView.e(z ? R.drawable.back_arrow_shadow : dcps.f(dcndVar.o.a));
                        SwitchImageView switchImageView2 = dcndVar.B;
                        if (z) {
                            i = dcps.f(dcndVar.o.a);
                        }
                        switchImageView2.e(i);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (H.T.G() != null) {
                Window window = H.T.G().getWindow();
                View decorView = window.getDecorView();
                window.setFlags(512, 512);
                decorView.setSystemUiVisibility(1025);
                TypedValue typedValue = new TypedValue();
                H.T.G().getTheme().resolveAttribute(R.attr.backgroundColor, typedValue, true);
                window.setNavigationBarColor(typedValue.data);
            }
            H.A.a(R.drawable.back_arrow_shadow, new View.OnClickListener() { // from class: dcmt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dcnd.this.e();
                }
            }, H.T.Y(R.string.action_back));
            H.B.b(R.drawable.back_arrow_shadow, new View.OnClickListener() { // from class: dcmu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dcnd.this.e();
                }
            }, H.T.Y(R.string.action_back));
            H.q = ColorStateList.valueOf(H.T.z().getColor(R.color.camera_shutter_photo_fill_tint));
            H.r = ColorStateList.valueOf(H.T.z().getColor(R.color.camera_shutter_video_fill_tint));
            imageView.setOutlineProvider(new ddza());
            imageView.setClipToOutline(true);
            new cxpy(H.D, H.i, H.z);
            H.y.setOnClickListener(new View.OnClickListener() { // from class: dcmv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final dcnd dcndVar = dcnd.this;
                    if (!dcndVar.u) {
                        dcndVar.y.animate().rotationBy(-180.0f).setInterpolator(new ljm()).withStartAction(new Runnable() { // from class: dcmp
                            @Override // java.lang.Runnable
                            public final void run() {
                                dcnd.this.u = true;
                            }
                        }).withEndAction(new Runnable() { // from class: dcmq
                            @Override // java.lang.Runnable
                            public final void run() {
                                dcnd.this.u = false;
                            }
                        });
                    }
                    dcndVar.g.q();
                    boolean v = dcndVar.g.v();
                    dcps dcpsVar = dcndVar.o;
                    dcpsVar.b = v;
                    dcpsVar.d();
                    dcndVar.y.setContentDescription(dcndVar.T.B().getString(v ? R.string.camera_back_switch_button : R.string.camera_front_switch_button));
                    crnx.g(dcndVar.T.B().getString(true != v ? R.string.camera_back : R.string.camera_front), dcndVar.y);
                }
            });
            H.S = new dcpn(H.T.B().getDimensionPixelSize(R.dimen.camera_video_progress_drawable_stroke_width));
            imageView2.setImageDrawable(H.S);
            H.I = new TimeAnimator();
            H.I.setTimeListener(new TimeAnimator.TimeListener() { // from class: dcmw
                @Override // android.animation.TimeAnimator.TimeListener
                public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                    dcnd dcndVar = dcnd.this;
                    float f = j / dcndVar.b;
                    dcndVar.S.setLevel((int) (10000.0f * f));
                    dcndVar.F.setText(csjh.a(dcndVar.T.z(), j));
                    if (f >= 1.0d) {
                        dcndVar.c();
                    }
                }
            });
            H.G.setOnClickListener(new View.OnClickListener() { // from class: dclz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dcnd dcndVar = dcnd.this;
                    if (dcndVar.i()) {
                        dcndVar.c();
                    }
                }
            });
            SwitchImageView switchImageView = H.B;
            dcoz dcozVar = H.g;
            dcozVar.getClass();
            dcma dcmaVar = new dcma(dcozVar);
            boolean v = dcozVar.v();
            dcps dcpsVar = new dcps(dcmaVar);
            dcpsVar.a(switchImageView, v);
            dcpsVar.c();
            H.o = dcpsVar;
            H.g.o(renderOverlay);
            H.g.m(false);
            dcqw dcqwVar = new dcqw(H.z, H.ad);
            dcqwVar.a.z(new dcrv(dcqwVar));
            dcqwVar.a.y(new dcrw(dcqwVar));
            H.n = dcqwVar;
            H.n.F(new dcqx(dcnb.PHOTO));
            H.n.F(new dcqx(dcnb.VIDEO));
            H.z.am(H.n);
            H.n.p();
            H.k(dcnb.PHOTO, 0);
            View view = H.v;
            if (view == null) {
                dcnh.a(this, H());
            }
            ekyf.q();
            return view;
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

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dcnd H() {
        dcnd dcndVar = this.d;
        if (dcndVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcndVar;
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
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.dcpt, defpackage.efaf, defpackage.ea
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
    public final void am() {
        this.c.k();
        try {
            bh();
            dcnd H = H();
            H.k.disable();
            if (H.i()) {
                H.c();
            }
            H.p = false;
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
            dcnd H = H();
            if (H.k == null) {
                H.k = new dcmz(H, H.T.z());
            }
            H.k.enable();
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
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            dcnh.a(this, H());
            bm(view, bundle);
            final dcnd H = H();
            view.post(new Runnable() { // from class: dcmn
                @Override // java.lang.Runnable
                public final void run() {
                    dcnd dcndVar = dcnd.this;
                    eg G = dcndVar.T.G();
                    View view2 = dcndVar.v;
                    dcndVar.H = new dcra(G, (ViewGroup) view2, (Guideline) view2.findViewById(R.id.screen_top_guideline), (Guideline) dcndVar.v.findViewById(R.id.screen_bottom_guideline), dcndVar.U.a);
                    dcrd dcrdVar = dcndVar.H;
                    dcrdVar.c = 0.5625f;
                    dcrdVar.c();
                    dcndVar.J = new aw();
                    dcndVar.J.e(dcndVar.w);
                    dcndVar.K = new aw();
                    dcndVar.K.e(dcndVar.w);
                    dcndVar.L = new aw();
                    dcndVar.Q = TransitionInflater.from(dcndVar.T.z()).inflateTransition(R.transition.camera_mode_filters_in);
                    dcndVar.R = TransitionInflater.from(dcndVar.T.z()).inflateTransition(R.transition.camera_mode_filters_out);
                    dcndVar.Q.addListener(dcndVar.h);
                    dcndVar.R.addListener(dcndVar.h);
                    aw awVar = dcndVar.K;
                    aw awVar2 = new aw();
                    awVar2.a.clear();
                    for (Integer num : awVar.a.keySet()) {
                        awVar2.a.put(num, ((av) awVar.a.get(num)).clone());
                    }
                    awVar2.l(R.id.mode_recycler, 4);
                    awVar2.l(R.id.switch_camera, 4);
                    awVar2.l(R.id.shutter_button_fill, 4);
                    awVar2.l(R.id.shutter_button_ring, 4);
                    awVar2.l(R.id.recording_duration_display_background, 0);
                    awVar2.l(R.id.recording_duration_display_text, 0);
                    awVar2.l(R.id.recording_duration_display_icon, 0);
                    awVar2.l(R.id.video_progress_container, 0);
                    dcndVar.L = awVar2;
                    dcndVar.K.i(R.id.shutter_button_video_dot, 1.0f);
                    dcndVar.K.j(R.id.shutter_button_video_dot, 1.0f);
                    dcndVar.M.add(dcndVar.y);
                    dcndVar.M.add(dcndVar.A);
                    dcndVar.M.add(dcndVar.B);
                    dcndVar.x.e();
                }
            });
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

    @Override // defpackage.dcpt
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
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

    @Override // defpackage.dcpt, defpackage.ekkd, defpackage.ea
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
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dclx)) {
                        throw new IllegalStateException(a.J(eaVar, dcnd.class));
                    }
                    dclx dclxVar = (dclx) eaVar;
                    errl errlVar = (errl) ((akgt) aX).a.t.b();
                    akis akisVar = ((akgt) aX).a;
                    alci alciVar = new alci(akisVar.a.dF, new alcs(), (Executor) akisVar.p.b());
                    akis akisVar2 = ((akgt) aX).a;
                    alcm alcmVar = new alcm(akisVar2.a.dF, new alcs(), (Executor) akisVar2.p.b());
                    akis akisVar3 = ((akgt) aX).a;
                    alcp alcpVar = new alcp(akisVar3.a.dF, new alcs(), (Executor) akisVar3.p.b());
                    alrv alrvVar = (alrv) ((akgt) aX).a.a.ej.b();
                    dcoz dcozVar = (dcoz) ((akgt) aX).a.b.pD.b();
                    akgb akgbVar = ((akgt) aX).c;
                    fbbf fbbfVar = akgbVar.g;
                    tam tamVar = (tam) akgbVar.m.b();
                    errl errlVar2 = (errl) ((akgt) aX).a.ps.b();
                    ddzb ddzbVar = (ddzb) ((akgt) aX).a.a.nk.b();
                    this.d = new dcnd(dclxVar, errlVar, alciVar, alcmVar, alcpVar, alrvVar, dcozVar, fbbfVar, tamVar, errlVar2, ddzbVar, ((akgt) aX).a.a.C);
                    this.Z.c(new ekkg(this.c, this.a));
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
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
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
    public final void i() {
        elav b = this.c.b();
        try {
            bf();
            dcnd H = H();
            H.g.o(null);
            dube dubeVar = H.x.g;
            if (dubeVar != null) {
                exku exkuVar = dubeVar.d;
                if (exkuVar != null) {
                    exkuVar.a(null);
                }
                dubi dubiVar = dubeVar.c;
                if (dubiVar != null) {
                    dubiVar.b();
                    dubeVar.c = null;
                }
                exmf exmfVar = dubeVar.b;
                if (exmfVar != null) {
                    exmfVar.d();
                }
                dubeVar.b = null;
                exku exkuVar2 = dubeVar.d;
                if (exkuVar2 != null) {
                    exkt exktVar = exkuVar2.a;
                    if (exktVar != null) {
                        exktVar.l();
                        try {
                            exkuVar2.a.join();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
                            throw new RuntimeException(e);
                        }
                    }
                    dubeVar.d = null;
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

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dcnd H = H();
        H.g.i();
        dcrd dcrdVar = H.H;
        if (dcrdVar != null) {
            dcrdVar.c();
        }
    }

    @Override // defpackage.dcpt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
