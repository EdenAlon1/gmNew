package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmi extends ea {
    public dwnh a;
    private ColorStateList aA;
    private ColorStateList aB;
    private ColorStateList aC;
    private int aD;
    private int aE;
    private ColorStateList aF;
    private int aG;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private float aN;
    private int aO;
    private int aP;
    private int aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private int aU;
    private dwnf aV;
    private dwmj aW;
    private int aX;
    private boolean aY;
    dwma ag;
    public dwna ah;
    private int am;
    private int an;
    private CharSequence ao;
    private int ap;
    private int aq;
    private ColorStateList ar;
    private int as;
    private CharSequence at;
    private int au;
    private int av;
    private ColorStateList aw;
    private int ax;
    private CharSequence ay;
    private int az;
    public String b;
    public boolean c;
    public long d;
    CharSequence e;
    private int aH = 0;
    private int aI = 0;
    public int ai = 0;
    public final Runnable aj = new Runnable() { // from class: dwmf
        @Override // java.lang.Runnable
        public final void run() {
            dwmi.this.e(5);
        }
    };
    public boolean ak = false;
    public boolean al = false;

    public final View a() {
        eg G;
        int i = this.an;
        if (i == -1 || (G = G()) == null) {
            return null;
        }
        return G.findViewById(i);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        boolean z = bundle != null;
        this.ak = z;
        if (z && this.ai == 0) {
            f();
            return;
        }
        int i = this.aX;
        dwna dwnaVar = new dwna(i == 0 ? z() : new ContextThemeWrapper(z(), i), this.aW);
        this.ah = dwnaVar;
        boolean z2 = this.aR;
        dwnaVar.z = z2;
        dwnd dwndVar = dwnaVar.r;
        dwndVar.e = z2;
        dwnaVar.A = this.aS;
        dwnaVar.B = this.aT;
        dwndVar.f = this.aU;
        int i2 = this.aG;
        if (i2 != 0) {
            dwnaVar.e.c(i2);
        }
        int i3 = this.aH;
        if (i3 != 0) {
            int i4 = this.aI;
            if (i4 != 0) {
                this.ah.j(i3, i4);
            } else {
                dwna dwnaVar2 = this.ah;
                dwnaVar2.j(i3, kps.h(i3, dwnaVar2.getContext().getResources().getInteger(dwnaVar2.H == dwmj.Legacy ? R.integer.libraries_material_featurehighlight_pulse_base_alpha : R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha)));
            }
        }
        int i5 = this.aJ;
        if (i5 != 0) {
            this.ah.e.d(i5);
        }
        int i6 = this.aK;
        if (i6 != 0) {
            this.ah.i = i6;
        }
        if (this.aL != 0) {
            Resources B = B();
            int i7 = this.aL;
            Resources.Theme theme = G().getTheme();
            WeakHashMap weakHashMap = kpp.a;
            Drawable drawable = B.getDrawable(i7, theme);
            if (drawable != null) {
                if (this.aM != 0) {
                    drawable.mutate();
                    drawable.setTint(this.aM);
                }
                dwna dwnaVar3 = this.ah;
                dwnaVar3.l = drawable;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.setCallback(dwnaVar3);
            }
        }
        dwna dwnaVar4 = this.ah;
        float f = this.aN;
        float f2 = dwnaVar4.m;
        dwnaVar4.m = f;
        if (dwnaVar4.C && f2 != f) {
            dwnaVar4.requestLayout();
        }
        dwna dwnaVar5 = this.ah;
        boolean z3 = this.aY;
        dwnaVar5.n = z3;
        if (dwnaVar5.h != null) {
            if (z3) {
                dwnaVar5.l();
            } else {
                ImageView imageView = dwnaVar5.p;
                if (imageView != null) {
                    dwnaVar5.removeView(imageView);
                    dwnaVar5.p = null;
                }
            }
        }
        if (this.ap != 0) {
            this.ah.g.w(B().getDimension(this.ap) / B().getDisplayMetrics().density);
        }
        int i8 = this.aq;
        if (i8 != 0) {
            this.ah.g.u(i8);
        }
        ColorStateList colorStateList = this.ar;
        if (colorStateList != null) {
            this.ah.g.v(colorStateList);
        }
        this.ah.g.t(this.as);
        if (this.au != 0) {
            this.ah.g.k(B().getDimension(this.au) / B().getDisplayMetrics().density);
        }
        int i9 = this.av;
        if (i9 != 0) {
            this.ah.g.i(i9);
        }
        ColorStateList colorStateList2 = this.aw;
        if (colorStateList2 != null) {
            this.ah.g.j(colorStateList2);
        }
        this.ah.g.h(this.ax);
        int i10 = this.az;
        if (i10 != 0) {
            this.ah.g.r(i10);
        }
        ColorStateList colorStateList3 = this.aA;
        if (colorStateList3 != null) {
            this.ah.g.s(colorStateList3);
        }
        ColorStateList colorStateList4 = this.aB;
        if (colorStateList4 != null) {
            this.ah.g.o(colorStateList4);
        }
        ColorStateList colorStateList5 = this.aC;
        if (colorStateList5 != null) {
            this.ah.g.p(colorStateList5);
        }
        this.ah.g.q(this.aD);
        this.ah.g.m(this.aE);
        ColorStateList colorStateList6 = this.aF;
        if (colorStateList6 != null) {
            this.ah.g.n(colorStateList6);
        }
        if (this.aO != 0 && this.aP != 0) {
            int dimensionPixelOffset = B().getDimensionPixelOffset(this.aO);
            int dimensionPixelOffset2 = B().getDimensionPixelOffset(this.aP);
            dwne dwneVar = this.ah.e;
            dwneVar.f = dimensionPixelOffset;
            dwneVar.e = dimensionPixelOffset2;
        }
        if (this.aQ != 0) {
            this.ah.e.a = B().getDimensionPixelOffset(this.aQ);
        }
        int i11 = this.am;
        if (i11 != 0) {
            dwna dwnaVar6 = this.ah;
            dwnaVar6.F = i11;
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            dwnaVar6.E = paint;
            if (dwnaVar6.q()) {
                dwnaVar6.i();
            }
        }
        this.ah.g.x(this.ao, this.at, this.ay);
        this.ah.setContentDescription(this.e);
        dwna dwnaVar7 = this.ah;
        dwnaVar7.f.g = this.aV;
        if (!dwnaVar7.t && !dwnaVar7.z && dwnaVar7.C) {
            dwnaVar7.n(dwnaVar7.a());
        }
        this.ah.setTag(R.id.featurehighlight_view_tag_fragment, this);
        ((ViewGroup) G().findViewById(android.R.id.content)).addView(this.ah);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        lkr lkrVar = this.E;
        if (lkrVar instanceof dwma) {
            this.ag = (dwma) lkrVar;
        } else if (activity instanceof dwma) {
            this.ag = (dwma) activity;
        }
    }

    @Override // defpackage.ea
    public final void ai() {
        dwna dwnaVar = this.ah;
        if (dwnaVar != null) {
            dwnaVar.setTag(R.id.featurehighlight_view_tag_fragment, null);
            ((ViewGroup) G().findViewById(android.R.id.content)).removeView(this.ah);
            this.ah = null;
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.ah.removeCallbacks(this.aj);
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        dwna dwnaVar = this.ah;
        if (dwnaVar != null) {
            long j = this.d;
            if (j > 0) {
                dwnaVar.postDelayed(this.aj, j);
            }
            if (this.al) {
                return;
            }
            dwna dwnaVar2 = this.ah;
            Runnable runnable = new Runnable() { // from class: dwmc
                @Override // java.lang.Runnable
                public final void run() {
                    final dwmi dwmiVar = dwmi.this;
                    dwna dwnaVar3 = dwmiVar.ah;
                    if (dwnaVar3 != null) {
                        dwnaVar3.bringToFront();
                        if (dwmiVar.al) {
                            return;
                        }
                        dwmiVar.al = true;
                        dwlz b = dwmiVar.b();
                        if (b != null) {
                            ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onAttached", 50, "FeatureHighlightController.java")).q("FeatureHighlight attached");
                        }
                        eg G = dwmiVar.G();
                        View a = G == null ? null : dwmiVar.a.a(G, dwmiVar.a());
                        if (a == null) {
                            if (b != null) {
                                ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onViewNotFound", 109, "FeatureHighlightController.java")).q("FeatureHighlight view not found");
                                dvqt dvqtVar = dvqt.FAILED_VIEW_NOT_FOUND;
                                dvsn dvsnVar = ((dvsm) b).b;
                                dvsnVar.e.b(dvsnVar.b, dvqtVar);
                            }
                            dwmiVar.f();
                            return;
                        }
                        dwmiVar.ah.k = dwmiVar.a();
                        dwmiVar.ah.h(new dwmh(dwmiVar));
                        if (dwmiVar.ai == 1) {
                            if (dwmiVar.ak) {
                                dwna dwnaVar4 = dwmiVar.ah;
                                dwnaVar4.k(a);
                                dwnaVar4.addOnLayoutChangeListener(new dwms(dwnaVar4));
                                dwnaVar4.requestLayout();
                                return;
                            }
                            dwna dwnaVar5 = dwmiVar.ah;
                            Runnable runnable2 = new Runnable() { // from class: dwme
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dwlz b2 = dwmi.this.b();
                                    if (b2 != null) {
                                        ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onShow", 72, "FeatureHighlightController.java")).q("FeatureHighlight shown");
                                        dvqt dvqtVar2 = dvqt.SUCCESS;
                                        dvsn dvsnVar2 = ((dvsm) b2).b;
                                        dvsnVar2.e.b(dvsnVar2.b, dvqtVar2);
                                    }
                                }
                            };
                            dwnaVar5.k(a);
                            dwnaVar5.addOnLayoutChangeListener(new dwmr(dwnaVar5, runnable2));
                            dwnaVar5.requestLayout();
                        }
                    }
                }
            };
            int[] iArr = kvo.a;
            dwnaVar2.postOnAnimation(runnable);
        }
    }

    public final dwlz b() {
        dwma dwmaVar = this.ag;
        if (dwmaVar != null) {
            return dwmaVar.b();
        }
        return null;
    }

    final void e(int i) {
        if (this.ai != 1 || this.ah == null) {
            return;
        }
        dwlz b = b();
        if (b != null) {
            ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDismiss", 90, "FeatureHighlightController.java")).q("FeatureHighlight dismissed");
            dvsm dvsmVar = (dvsm) b;
            dvsn dvsnVar = dvsmVar.b;
            evvt evvtVar = evvt.DISMISSED;
            evzd evzdVar = dvsnVar.b.c().f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            evzr evzrVar = evzdVar.c == 3 ? (evzr) evzdVar.d : evzr.a;
            if (i == 3) {
                evxi evxiVar = evzrVar.p;
                if (evxiVar == null) {
                    evxiVar = evxi.a;
                }
                evxg b2 = evxg.b(evxiVar.e);
                if (b2 == null) {
                    b2 = evxg.ACTION_UNKNOWN;
                }
                if (b2 == evxg.ACTION_ACKNOWLEDGE) {
                    evvtVar = evvt.ACKNOWLEDGE_RESPONSE;
                }
            }
            dvsn dvsnVar2 = dvsmVar.b;
            dvsnVar2.e.a(dvsnVar2.b, evvtVar);
            dvsmVar.a = true;
        }
        p();
        this.ah.g(new Runnable() { // from class: dwmd
            @Override // java.lang.Runnable
            public final void run() {
                dwmi.this.f();
            }
        });
    }

    public final void f() {
        fr frVar;
        if (G() == null || G().isFinishing() || !aF() || this.s || (frVar = this.B) == null) {
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.n(this);
        cgVar.k();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            return;
        }
        bundle2.setClassLoader(dwmi.class.getClassLoader());
        this.a = (dwnh) bundle2.getParcelable("fh_view_finder");
        this.am = bundle2.getInt("fh_target_view_tint_color");
        this.an = bundle2.getInt("fh_confining_view_id");
        this.ao = bundle2.getCharSequence("fh_header_text");
        this.ap = bundle2.getInt("fh_header_text_size_res");
        this.aq = bundle2.getInt("fh_header_text_appearance");
        this.ar = (ColorStateList) bundle2.getParcelable("fh_header_text_color");
        this.as = bundle2.getInt("fh_header_text_alignment");
        this.at = bundle2.getCharSequence("fh_body_text");
        this.au = bundle2.getInt("fh_body_text_size_res");
        this.av = bundle2.getInt("fh_body_text_appearance");
        this.aw = (ColorStateList) bundle2.getParcelable("fh_body_text_color");
        this.ax = bundle2.getInt("fh_body_text_alignment");
        this.ay = bundle2.getCharSequence("fh_dismiss_action_text");
        this.az = bundle2.getInt("fh_dismiss_action_text_appearance");
        this.aA = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_text_color");
        this.aB = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_ripple_color");
        this.aC = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_stroke_color");
        this.aD = bundle2.getInt("fh_dismiss_action_text_alignment");
        this.aE = bundle2.getInt("fh_dismiss_action_button_alignment");
        this.aF = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_button_background_color");
        this.aG = bundle2.getInt("fh_outer_color");
        this.aH = bundle2.getInt("fh_pulse_inner_color");
        this.aI = bundle2.getInt("fh_pulse_outer_color");
        this.aJ = bundle2.getInt("fh_scrim_color");
        this.aK = bundle2.getInt("fh_target_text_color");
        this.aL = bundle2.getInt("fh_target_drawable");
        this.aM = bundle2.getInt("fh_target_drawable_color");
        this.aN = bundle2.getFloat("fh_target_scale");
        this.aY = bundle2.getBoolean("fh_target_shadow_enabled");
        bundle2.getString("fh_callback_id");
        this.b = bundle2.getString("fh_task_tag");
        this.aO = bundle2.getInt("fh_vertical_offset_res");
        this.aP = bundle2.getInt("fh_horizontal_offset_res");
        this.aQ = bundle2.getInt("fh_center_threshold_res");
        this.c = bundle2.getBoolean("fh_task_complete_on_tap");
        this.d = bundle2.getLong("fh_duration");
        this.aR = bundle2.getBoolean("fh_pin_to_closest_vertical_edge");
        this.aS = bundle2.getBoolean("fh_swipe_to_dismiss_enabled");
        this.aT = bundle2.getBoolean("fh_tap_to_dismiss_enabled");
        this.aU = bundle2.getInt("fh_text_vertical_gravity_hint");
        this.e = bundle2.getCharSequence("fh_content_description");
        this.aV = (dwnf) bundle2.getSerializable("fh_pulse_animation_type");
        this.aW = (dwmj) bundle2.getSerializable("fh_feature_highlight_style");
        this.aX = bundle2.getInt("fh_theme_overlay");
        if (bundle != null) {
            int i = bundle.getInt("showState");
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("Unrecognised show state.");
            }
            this.ai = i;
        }
    }

    @Override // defpackage.ea
    public final void j() {
        super.j();
        dwlz b = b();
        if (b != null) {
            ((ensz) dvsn.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDetached", 55, "FeatureHighlightController.java")).q("FeatureHighlight detached");
            dvsm dvsmVar = (dvsm) b;
            if (!dvsmVar.a) {
                dvsn dvsnVar = dvsmVar.b;
                if (!dvsnVar.c.d) {
                    dvsnVar.e.a(dvsnVar.b, evvt.DISMISSED);
                    dvsmVar.a = true;
                }
            }
            dvsp dvspVar = dvsmVar.b.c;
            if (dvspVar != null) {
                dvspVar.a();
            }
        }
        this.ag = null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putInt("showState", this.ai);
    }

    public final void p() {
        this.ai = 0;
    }
}
