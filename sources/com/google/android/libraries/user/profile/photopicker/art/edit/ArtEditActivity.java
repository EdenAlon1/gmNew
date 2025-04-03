package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;
import com.google.android.libraries.user.profile.photopicker.art.edit.ColorPickerView;
import com.google.android.libraries.user.profile.photopicker.art.edit.ColorSwatchView;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import defpackage.cg;
import defpackage.dvwz;
import defpackage.dvxb;
import defpackage.dvxc;
import defpackage.dvxh;
import defpackage.dvxi;
import defpackage.dvxy;
import defpackage.dvyc;
import defpackage.dwca;
import defpackage.dwck;
import defpackage.efwh;
import defpackage.efwi;
import defpackage.efwk;
import defpackage.efwn;
import defpackage.efwr;
import defpackage.efwy;
import defpackage.efxc;
import defpackage.efxf;
import defpackage.egab;
import defpackage.egaj;
import defpackage.egcn;
import defpackage.egcw;
import defpackage.egev;
import defpackage.egex;
import defpackage.egfi;
import defpackage.eggb;
import defpackage.eghh;
import defpackage.egjw;
import defpackage.egjy;
import defpackage.egrb;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.engi;
import defpackage.engw;
import defpackage.enqu;
import defpackage.erqt;
import defpackage.ewjg;
import defpackage.ewjs;
import defpackage.ewjt;
import defpackage.faze;
import defpackage.fazf;
import defpackage.fdrj;
import defpackage.fdrm;
import defpackage.im;
import defpackage.kpp;
import defpackage.ku;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.llh;
import defpackage.lmw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ArtEditActivity extends efwy implements fazf {
    public dvxc A;
    public dwck B;
    public efxf C;
    public MaterialButton D;
    public MaterialButton E;
    public MaterialButton F;
    public EditableArtView G;
    public LinearProgressIndicator H;
    public FullscreenErrorView I;
    public ViewAnimator J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public View.OnClickListener N;
    public HorizontalScrollView O;
    public View P;
    private ConstraintLayout R;
    private ConstraintLayout S;
    private LinearLayout T;
    private BottomSheetBehavior U;
    private BottomSheetBehavior V;
    private BottomSheetBehavior W;
    private TabLayout X;
    private ImageView Y;
    private ImageView Z;
    public lmw n;
    public egrb o;
    public efwk p;
    public dvyc q;
    public dvxy r;
    public dvxi s;
    public dvxb t;
    public egjw u;
    public egaj v;
    public efxc w;
    public faze x;
    public String y;
    public egcw z;

    public final int B(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_size);
        double d = getResources().getDisplayMetrics().widthPixels;
        double d2 = i + 0.5d;
        return ((double) dimensionPixelSize) * d2 <= d ? dimensionPixelSize : (int) (d / d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(final egfi egfiVar, final int i, final int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_skin_tone_swatches_container);
        ((MaterialTextView) findViewById(R.id.art_editor_skin_tone_layer_name)).setText(egfiVar.f());
        String[] strArr = {getString(R.string.op3_art_skin_tone_dark), getString(R.string.op3_art_skin_tone_medium_dark), getString(R.string.op3_art_skin_tone_medium), getString(R.string.op3_art_skin_tone_medium_light), getString(R.string.op3_art_skin_tone_light), getString(R.string.op3_art_skin_tone_original)};
        engw e = egfiVar.e();
        int size = e.size();
        final int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            final eggb eggbVar = (eggb) e.get(i4);
            View inflate = LayoutInflater.from(this).inflate(R.layout.photo_picker_art_color_swatch, (ViewGroup) linearLayout, false);
            final ColorSwatchView colorSwatchView = (ColorSwatchView) inflate.findViewById(R.id.art_editor_color_swatch);
            colorSwatchView.a(eggbVar.a(), eggbVar.c() / 100.0f, eggbVar.b() / 100.0f);
            colorSwatchView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            colorSwatchView.setBackground(getDrawable(R.drawable.selector_circle_shape));
            colorSwatchView.setContentDescription(strArr[eggbVar.d()]);
            this.r.b(colorSwatchView, this.q.a(140427));
            colorSwatchView.setOnClickListener(new View.OnClickListener() { // from class: efvx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArtEditActivity artEditActivity = ArtEditActivity.this;
                    artEditActivity.s.a(dvxh.e(), colorSwatchView);
                    int i5 = i;
                    artEditActivity.O(i5, i3, (ColorSwatchView) view);
                    artEditActivity.G.q(i5, eggbVar.e());
                }
            });
            arrayList.add(inflate);
            i4++;
            i3++;
        }
        I(arrayList, linearLayout);
        if (this.w.b(i) != -1) {
            int b = this.w.b(i);
            O(i, b, (ColorSwatchView) linearLayout.getChildAt(b).findViewById(R.id.art_editor_color_swatch));
        }
        final View findViewById = this.T.findViewById(R.id.art_editor_skin_tone_cancel_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: efvy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.s.a(dvxh.e(), findViewById);
                artEditActivity.w.c();
                efxc efxcVar = artEditActivity.w;
                int i5 = efxcVar.e;
                int i6 = i;
                efxcVar.f(i6, i5);
                artEditActivity.G.q(i6, ((eggb) egfiVar.e().get(artEditActivity.w.e)).e());
                artEditActivity.Q();
            }
        });
        final View findViewById2 = this.T.findViewById(R.id.art_editor_skin_tone_done_button);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: efvz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.s.a(dvxh.e(), findViewById2);
                artEditActivity.w.c();
                engw e2 = egfiVar.e();
                efxc efxcVar = artEditActivity.w;
                int i5 = i;
                eggb eggbVar2 = (eggb) e2.get(efxcVar.b(i5));
                artEditActivity.Z(i2, eggbVar2.a(), eggbVar2.c() / 100.0f, eggbVar2.b() / 100.0f);
                efxc efxcVar2 = artEditActivity.w;
                efxcVar2.i = efxcVar2.i || efxcVar2.e != efxcVar2.b(i5);
                efxc efxcVar3 = artEditActivity.w;
                efxcVar3.h = efxcVar3.h || efxcVar3.i;
                artEditActivity.Q();
            }
        });
    }

    public final void D(engi engiVar, Map map) {
        this.w.i = false;
        enqu listIterator = engiVar.listIterator();
        int i = 0;
        int i2 = 0;
        while (listIterator.hasNext()) {
            egfi egfiVar = (egfi) listIterator.next();
            Integer num = (Integer) map.get(egfiVar.g());
            int intValue = num != null ? num.intValue() : 0;
            float f = intValue;
            this.G.n(i, f);
            if (egfiVar.i()) {
                if (!egfiVar.e().isEmpty()) {
                    efxc efxcVar = this.w;
                    efxcVar.e = 0;
                    efxcVar.f(i, 0);
                    this.G.q(i, egfiVar.d());
                }
                this.w.e(egfiVar.g(), f);
                Y(i2, egfiVar, intValue);
                i2++;
            }
            i++;
        }
    }

    public final void E() {
        ImageView imageView = this.Z;
        if (imageView != null) {
            this.w.d = -1;
            imageView.setSelected(false);
            this.Z = null;
        }
    }

    public final void F() {
        ImageView imageView = this.Y;
        if (imageView != null) {
            this.w.c = -1;
            imageView.setSelected(false);
            this.Y = null;
        }
    }

    public final void G() {
        this.D.setEnabled(false);
        this.E.setEnabled(false);
        this.F.setEnabled(false);
    }

    public final void H() {
        this.D.setEnabled(true);
        this.E.setEnabled(true);
        this.F.setEnabled(true);
    }

    public final void I(List list, LinearLayout linearLayout) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_color_swatch_width);
        int i = getResources().getDisplayMetrics().widthPixels;
        float a = i / kpp.a(getResources(), R.dimen.photo_picker_edit_color_swatch_screen_columns);
        if (list.size() * dimensionPixelSize > i) {
            dimensionPixelSize = Math.max((int) a, dimensionPixelSize);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, -2);
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next(), layoutParams);
        }
    }

    public final void J() {
        this.H.setVisibility(8);
        this.U.D(5);
        this.G.setVisibility(8);
        this.I.setVisibility(8);
    }

    public final void K() {
        View findViewById = findViewById(R.id.photo_picker_toolbar);
        this.V.D(5);
        this.S.setVisibility(8);
        this.U.D(3);
        this.R.setVisibility(0);
        findViewById.setVisibility(0);
        this.G.p(findViewById.getLayoutParams().height);
    }

    public final void L() {
        aa();
        this.H.setVisibility(0);
        this.U.D(5);
        this.G.setVisibility(8);
        efxf efxfVar = this.C;
        emxc b = efxfVar.k.b();
        if (b.g()) {
            if (((eghh) b.c()).b() - 1 != 0) {
                egex egexVar = efxfVar.h;
                Uri c = ((eghh) b.c()).c();
                egexVar.e.c();
                egexVar.a(engw.r(c), new emwl() { // from class: eger
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Bitmap bitmap = (Bitmap) ((List) obj).get(0);
                        eggr eggrVar = new eggr();
                        eggrVar.e(0L);
                        eggrVar.h("");
                        eggrVar.b("");
                        eggrVar.f("");
                        int i = engw.d;
                        eggrVar.c(enou.a);
                        eggp eggpVar = new eggp();
                        eggpVar.g("");
                        eggpVar.j("");
                        eggpVar.c(false);
                        eggpVar.d("");
                        eggpVar.e(0);
                        eggpVar.h(0);
                        eggpVar.f(0);
                        eggpVar.b(bitmap);
                        eggpVar.i(enou.a);
                        eggrVar.a = enhk.l("", eggpVar.a());
                        eggrVar.g(enou.a);
                        eggrVar.d(enou.a);
                        return eggrVar.a();
                    }
                });
                return;
            }
            egex egexVar2 = efxfVar.h;
            long a = ((eghh) b.c()).a();
            egexVar2.e.c();
            egcn egcnVar = egexVar2.a;
            ewjs ewjsVar = (ewjs) ewjt.a.createBuilder();
            ewjg ewjgVar = egexVar2.c;
            ewjsVar.copyOnWrite();
            ewjt ewjtVar = (ewjt) ewjsVar.instance;
            ewjgVar.getClass();
            ewjtVar.c = ewjgVar;
            ewjtVar.b |= 1;
            ewjsVar.copyOnWrite();
            ewjt ewjtVar2 = (ewjt) ewjsVar.instance;
            ewjtVar2.b |= 2;
            ewjtVar2.d = a;
            erqt.r(egcnVar.c((ewjt) ewjsVar.build()), new egev(egexVar2), egexVar2.b);
        }
    }

    public final void M(int i, ImageView imageView) {
        this.w.d = i;
        imageView.setSelected(true);
        this.Z = imageView;
    }

    public final void N(int i, ImageView imageView) {
        this.w.c = i;
        imageView.setSelected(true);
        this.Y = imageView;
    }

    public final void O(int i, int i2, ColorSwatchView colorSwatchView) {
        if (this.w.b(i) != -1) {
            ((LinearLayout) findViewById(R.id.photo_picker_skin_tone_swatches_container)).getChildAt(this.w.b(i)).findViewById(R.id.art_editor_color_swatch).setSelected(false);
        }
        this.w.f(i, i2);
        colorSwatchView.setSelected(true);
    }

    public final void Q() {
        View findViewById = findViewById(R.id.photo_picker_toolbar);
        this.G.p(findViewById.getLayoutParams().height);
        this.U.D(3);
        this.R.setVisibility(0);
        this.V.D(5);
        this.S.setVisibility(8);
        this.W.D(5);
        this.T.setVisibility(8);
        findViewById.setVisibility(0);
        this.G.p(findViewById.getLayoutParams().height);
    }

    public final void V() {
        View findViewById = findViewById(R.id.photo_picker_toolbar);
        this.U.D(5);
        this.R.setVisibility(8);
        this.V.D(3);
        this.S.setVisibility(0);
        this.W.D(5);
        this.T.setVisibility(8);
        findViewById.setVisibility(8);
        this.G.p(getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_view_inset_crop_area_top));
    }

    public final void W() {
        this.U.D(5);
        this.R.setVisibility(8);
        this.V.D(5);
        this.S.setVisibility(8);
        this.W.D(3);
        this.T.setVisibility(0);
        findViewById(R.id.photo_picker_toolbar).setVisibility(8);
        this.G.p(getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_view_inset_crop_area_top));
    }

    public final void X(final egfi egfiVar, final int i, final int i2) {
        final ColorPickerView colorPickerView = (ColorPickerView) this.S.findViewById(R.id.art_editor_color_picker);
        colorPickerView.e = new efwn() { // from class: efvq
            @Override // defpackage.efwn
            public final void a(float f, Integer num) {
            }
        };
        float a = egfiVar.a();
        emxf.f(a >= 0.0f && a <= 360.0f, "hue must be between 0 and 360 inclusive. actual: %s", Float.valueOf(a));
        if (a != colorPickerView.d) {
            colorPickerView.d = a;
            colorPickerView.b[0] = a;
            colorPickerView.d();
            colorPickerView.b(null);
        }
        float c = egfiVar.c() / 100.0f;
        emxf.f(c >= 0.0f && c <= 1.0f, "saturation must be between 0.0 and 1.0 inclusive. actual: %s", Float.valueOf(c));
        float[] fArr = colorPickerView.b;
        if (c != fArr[1]) {
            fArr[1] = c;
            colorPickerView.e(colorPickerView.getWidth(), colorPickerView.getHeight());
            colorPickerView.d();
        }
        float b = egfiVar.b() / 100.0f;
        emxf.f(b >= 0.0f && b <= 1.0f, "lightness must be between 0.0 and 1.0 inclusive. actual: %s", Float.valueOf(b));
        float[] fArr2 = colorPickerView.b;
        if (b != fArr2[2]) {
            fArr2[2] = b;
            colorPickerView.e(colorPickerView.getWidth(), colorPickerView.getHeight());
            colorPickerView.d();
        }
        float f = this.w.a;
        emxf.f(f >= 0.0f && f <= 360.0f, "hue must be between 0 and 360 inclusive. actual: %s", Float.valueOf(f));
        float f2 = (colorPickerView.d + f) % 360.0f;
        float[] fArr3 = colorPickerView.b;
        if (f2 != fArr3[0]) {
            fArr3[0] = f2;
            colorPickerView.d();
            colorPickerView.b(null);
        }
        this.G.n(i, this.w.a);
        colorPickerView.c();
        colorPickerView.e = new efwn() { // from class: efvr
            @Override // defpackage.efwn
            public final void a(float f3, Integer num) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                if (num != null) {
                    ColorPickerView colorPickerView2 = colorPickerView;
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        artEditActivity.s.a(dvxh.e(), colorPickerView2);
                    } else if (intValue == 8) {
                        artEditActivity.s.a(new dvxf(22).a(), colorPickerView2);
                    }
                }
                int i3 = i;
                efxc efxcVar = artEditActivity.w;
                efxcVar.a = f3;
                efxcVar.h = true;
                artEditActivity.G.n(i3, f3);
                artEditActivity.F();
                artEditActivity.E();
            }
        };
        ((MaterialTextView) this.S.findViewById(R.id.art_editor_layer_name)).setText(egfiVar.f());
        final View findViewById = this.S.findViewById(R.id.art_editor_color_picker_cancel_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: efvs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.s.a(dvxh.e(), findViewById);
                egfi egfiVar2 = egfiVar;
                artEditActivity.G.n(i, artEditActivity.w.a(egfiVar2.g()));
                efxc efxcVar = artEditActivity.w;
                efxcVar.a = efxcVar.a(egfiVar2.g());
                artEditActivity.w.c();
                artEditActivity.K();
            }
        });
        final View findViewById2 = this.S.findViewById(R.id.art_editor_color_picker_done_button);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: efvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.s.a(dvxh.e(), findViewById2);
                ColorPickerView colorPickerView2 = colorPickerView;
                int a2 = (int) colorPickerView2.a();
                int i3 = i2;
                egfi egfiVar2 = egfiVar;
                artEditActivity.Y(i3, egfiVar2, a2);
                efxc efxcVar = artEditActivity.w;
                boolean z = true;
                if (!efxcVar.i && efxcVar.a(egfiVar2.g()) == colorPickerView2.a()) {
                    z = false;
                }
                efxcVar.i = z;
                artEditActivity.w.e(egfiVar2.g(), colorPickerView2.a());
                artEditActivity.w.c();
                artEditActivity.K();
            }
        });
    }

    public final void Y(int i, egfi egfiVar, int i2) {
        Z(i, (egfiVar.a() + i2) % 360, egfiVar.c() / 100.0f, egfiVar.b() / 100.0f);
    }

    public final void Z(int i, float f, float f2, float f3) {
        ((ColorSwatchView) this.K.getChildAt(i).findViewById(R.id.art_editor_color_swatch)).a(f, f2, f3);
    }

    public final void aa() {
        MenuItem findItem;
        if (!fdrj.f() || (findItem = ((Toolbar) findViewById(R.id.photo_picker_toolbar)).h().findItem(R.id.photo_picker_undo_all_menu_item)) == null) {
            return;
        }
        findItem.setEnabled(this.C.a().a() != null);
    }

    @Override // defpackage.fazf
    public final faze ab() {
        return this.x;
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        if (this.V.x == 3) {
            findViewById(R.id.art_editor_color_picker_done_button).performClick();
            return;
        }
        if (!fdrj.a.get().e() || !this.w.h) {
            this.u.f(2);
            super.onBackPressed();
        } else {
            cg cgVar = new cg(a());
            cgVar.u(new efwr(), "EditDiscardDialogFragment");
            cgVar.c();
        }
    }

    @Override // defpackage.efwy, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        egab.a(this);
        super.onCreate(bundle);
        if (!this.o.a() || !this.p.b().g()) {
            this.u.a();
            this.u.f(4);
            finish();
            return;
        }
        eghh eghhVar = (eghh) this.p.b().c();
        if (eghhVar.b() == 1) {
            egjw egjwVar = this.u;
            egjwVar.a = 30;
            egjwVar.b = 31;
            egjwVar.c = 32;
        }
        this.u.a();
        setContentView(R.layout.photo_picker_art_edit_activity_with_frames);
        dvxy dvxyVar = this.r;
        dvwz a = this.q.a(89757);
        a.g(this.A);
        a.g(dwca.b());
        a.f(this.t);
        dvxyVar.f(this, a);
        if (fdrm.o()) {
            this.r.b(findViewById(R.id.photo_picker_edit_page), this.q.a(89741));
        }
        this.M = (LinearLayout) findViewById(R.id.photo_picker_edit_frames_container);
        this.O = (HorizontalScrollView) findViewById(R.id.photo_picker_edit_presets_scroll_view);
        this.P = findViewById(R.id.photo_picker_edit_presets_section);
        this.D = (MaterialButton) findViewById(R.id.photo_picker_accept_button);
        if (fdrm.q()) {
            this.D.setText(getIntent().getIntExtra("photo_accept_button_string", R.string.op3_edit_save));
        }
        this.X = (TabLayout) findViewById(R.id.photo_picker_edit_menu_tabs);
        this.J = (ViewAnimator) findViewById(R.id.photo_picker_edit_controls_container);
        this.K = (LinearLayout) findViewById(R.id.photo_picker_color_swatches_container);
        this.L = (LinearLayout) findViewById(R.id.photo_picker_edit_presets_container);
        this.G = (EditableArtView) findViewById(R.id.photo_picker_photo_edit_view);
        this.H = (LinearProgressIndicator) findViewById(R.id.photo_picker_loading_view);
        this.I = (FullscreenErrorView) findViewById(R.id.photo_picker_error_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.photo_picker_edit_bottom_sheet);
        this.R = constraintLayout;
        this.U = BottomSheetBehavior.v(constraintLayout);
        this.X.getBackground().setAlpha(51);
        this.r.b(this.X.d(0).i, this.q.a(131621));
        this.r.b(this.X.d(1).i, this.q.a(131622));
        this.r.b(this.X.d(2).i, this.q.a(131623));
        this.r.b(this.G, this.q.a(97816));
        BottomSheetBehavior bottomSheetBehavior = this.U;
        bottomSheetBehavior.w = false;
        bottomSheetBehavior.B(true);
        this.U.D(5);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.photo_picker_color_picker);
        this.S = constraintLayout2;
        BottomSheetBehavior v = BottomSheetBehavior.v(constraintLayout2);
        this.V = v;
        v.w = false;
        v.B(true);
        this.V.D(5);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_edit_skin_tones_container);
        this.T = linearLayout;
        linearLayout.addView(getLayoutInflater().inflate(R.layout.photo_picker_art_skin_tones_container, (ViewGroup) this.T, false));
        BottomSheetBehavior v2 = BottomSheetBehavior.v(this.T);
        this.W = v2;
        v2.w = false;
        v2.B(true);
        this.W.D(5);
        View findViewById = this.T.findViewById(R.id.art_editor_skin_tone_done_button);
        this.r.b(this.T.findViewById(R.id.art_editor_skin_tone_cancel_button), this.q.a(140425));
        this.r.b(findViewById, this.q.a(140426));
        ColorPickerView colorPickerView = (ColorPickerView) this.S.findViewById(R.id.art_editor_color_picker);
        kvo.z(colorPickerView);
        View findViewById2 = this.S.findViewById(R.id.art_editor_color_picker_done_button);
        View findViewById3 = this.S.findViewById(R.id.art_editor_color_picker_cancel_button);
        this.r.b(colorPickerView, this.q.a(131636));
        this.r.b(findViewById3, this.q.a(131634));
        this.r.b(findViewById2, this.q.a(131635));
        this.C = (efxf) this.n.a(efxf.class);
        this.r.b(this.D, this.q.a(89765));
        this.D.setOnClickListener(new View.OnClickListener() { // from class: efwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.u.e();
                final efxf efxfVar = artEditActivity.C;
                EditableArtView editableArtView = artEditActivity.G;
                float c = editableArtView.c();
                float d = editableArtView.d();
                int i = -editableArtView.c.left;
                int i2 = -editableArtView.c.top;
                float b = editableArtView.b();
                int min = (int) Math.min(d / b, c / b);
                final Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix = new Matrix(editableArtView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate(i, i2);
                }
                float a2 = editableArtView.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix.postScale(f, f);
                }
                canvas.concat(matrix);
                editableArtView.j(canvas);
                if (efxfVar.j.compareAndSet(false, true)) {
                    emyg emygVar = efxfVar.g;
                    emygVar.e();
                    emygVar.f();
                    llg llgVar = efxfVar.i;
                    egkj egkjVar = new egkj();
                    egkjVar.a = 2;
                    llgVar.j(egkjVar.a());
                    erqt.r(erqt.m(new Callable() { // from class: efxd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            efxf efxfVar2 = efxf.this;
                            egad egadVar = efxfVar2.e;
                            efzz efzzVar = efxfVar2.c;
                            Bitmap bitmap = createBitmap;
                            Uri a3 = egadVar.a("edited_photo.png");
                            efzzVar.b(bitmap, a3);
                            return a3;
                        }
                    }, efxfVar.d), new efxe(efxfVar), efxfVar.d);
                }
                artEditActivity.s.a(dvxh.e(), artEditActivity.D);
            }
        });
        this.E = (MaterialButton) findViewById(R.id.photo_picker_edit_rotate_left_button);
        this.F = (MaterialButton) findViewById(R.id.photo_picker_edit_rotate_right_button);
        this.r.b(this.E, this.q.a(89764));
        this.r.b(this.F, this.q.a(131626));
        this.E.setOnClickListener(new View.OnClickListener() { // from class: efvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.G.m(-90.0f);
                artEditActivity.E();
                artEditActivity.F();
                artEditActivity.w.h = true;
                artEditActivity.s.a(dvxh.e(), artEditActivity.E);
            }
        });
        this.F.setOnClickListener(new View.OnClickListener() { // from class: efvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.G.m(90.0f);
                artEditActivity.E();
                artEditActivity.F();
                artEditActivity.w.h = true;
                artEditActivity.s.a(dvxh.e(), artEditActivity.F);
            }
        });
        this.E.c(ku.a(this.J.getContext(), R.drawable.quantum_gm_ic_rotate_90_degrees_ccw_vd_theme_24));
        this.F.c(ku.a(this.J.getContext(), R.drawable.quantum_gm_ic_rotate_90_degrees_cw_vd_theme_24));
        L();
        this.I.b(new View.OnClickListener() { // from class: efwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity.this.L();
            }
        });
        if (eghhVar.b() == 1) {
            TabLayout tabLayout = this.X;
            tabLayout.m(tabLayout.d(this.w.b));
            this.J.setDisplayedChild(this.w.b);
            EditableArtView editableArtView = this.G;
            boolean z = this.w.b == 2;
            editableArtView.i = z;
            editableArtView.k(z);
            this.G.y = new efwh(this);
            this.X.f(new efwi(this));
        } else {
            this.X.setVisibility(8);
            this.E.setVisibility(0);
            this.F.setVisibility(0);
        }
        emxf.a(this.p.b().g());
        Toolbar toolbar = (Toolbar) findViewById(R.id.photo_picker_toolbar);
        n(toolbar);
        im k = k();
        k.getClass();
        k.setDisplayHomeAsUpEnabled(true);
        k.setHomeActionContentDescription(R.string.abc_action_bar_up_description);
        if (((eghh) this.p.b().c()).b() == 1) {
            k.setTitle((CharSequence) this.p.a().e(""));
            setTitle((CharSequence) this.p.a().e(""));
        } else {
            k.setTitle(R.string.op3_edit_crop_and_rotate);
            setTitle(R.string.op3_edit_crop_and_rotate);
        }
        dwck dwckVar = new dwck(this.r.b(toolbar, this.q.a(92715)));
        this.B = dwckVar;
        dwckVar.c(89729).a(Integer.valueOf(R.id.photo_picker_navigation_button));
        if (fdrm.q()) {
            this.B.a(Integer.valueOf(R.id.photo_picker_undo_all_menu_item), this.q.a(131627));
            if (fdrj.e()) {
                this.B.a(Integer.valueOf(R.id.photo_picker_more_info_menu_item), this.q.a(132452));
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(89747));
            } else {
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(132452));
            }
            this.B.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.q.a(89742));
        }
        toolbar.t(new View.OnClickListener() { // from class: efwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                artEditActivity.s.b(dvxh.e(), artEditActivity.B.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                artEditActivity.onBackPressed();
            }
        });
        this.C.a().f(this, new llh() { // from class: efvl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.llh
            public final void a(Object obj) {
                int i;
                final egfk egfkVar = (egfk) obj;
                boolean g = egfkVar.c().g();
                final ArtEditActivity artEditActivity = ArtEditActivity.this;
                if (g) {
                    if (!fdrm.x()) {
                        artEditActivity.G.h();
                        artEditActivity.J();
                        artEditActivity.G();
                        artEditActivity.I.g();
                        artEditActivity.I.setVisibility(0);
                        return;
                    }
                    Object c = egfkVar.c().c();
                    artEditActivity.G.h();
                    artEditActivity.J();
                    artEditActivity.G();
                    artEditActivity.I.c((egdp) c);
                    artEditActivity.I.setVisibility(0);
                    return;
                }
                EditableArtView editableArtView2 = artEditActivity.G;
                engw g2 = enfc.d(egfkVar.g().values()).f(new emwl() { // from class: efwb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return ((egfi) obj2).d();
                    }
                }).g();
                g2.getClass();
                boolean z2 = false;
                for (int i2 = 0; i2 < g2.size(); i2++) {
                    Bitmap bitmap = (Bitmap) g2.get(i2);
                    bitmap.getClass();
                    if (editableArtView2.a.size() <= i2) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(editableArtView2.getResources(), bitmap);
                        bitmapDrawable.setCallback(editableArtView2);
                        editableArtView2.a.add(bitmapDrawable);
                    } else {
                        Drawable drawable = (Drawable) editableArtView2.a.get(i2);
                        if (!(drawable instanceof BitmapDrawable) || bitmap != ((BitmapDrawable) drawable).getBitmap()) {
                            drawable.setCallback(null);
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(editableArtView2.getResources(), bitmap);
                            bitmapDrawable2.setCallback(editableArtView2);
                            editableArtView2.a.set(i2, bitmapDrawable2);
                            z2 |= (drawable.getIntrinsicWidth() == bitmap.getWidth() && drawable.getIntrinsicHeight() == bitmap.getHeight()) ? false : true;
                            editableArtView2.m = 0.0f;
                        }
                    }
                }
                editableArtView2.i(z2);
                editableArtView2.requestLayout();
                editableArtView2.invalidate();
                int dimensionPixelSize = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_size);
                int dimensionPixelSize2 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
                int dimensionPixelSize3 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_margin_end);
                int dimensionPixelSize4 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_section_bottom_margin);
                boolean isEmpty = egfkVar.e().isEmpty();
                if (!isEmpty) {
                    dimensionPixelSize = artEditActivity.B(egfkVar.f().size());
                }
                artEditActivity.L.removeAllViews();
                engw f = egfkVar.f();
                int size = f.size();
                int i3 = 0;
                final int i4 = 0;
                while (i3 < size) {
                    egfl egflVar = (egfl) f.get(i3);
                    ImageView imageView = new ImageView(artEditActivity);
                    egaj egajVar = artEditActivity.v;
                    Uri parse = Uri.parse(egflVar.c());
                    egal egalVar = new egal();
                    egalVar.e();
                    egajVar.f(parse, egalVar, imageView);
                    imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    imageView.setBackground(artEditActivity.getDrawable(R.drawable.rounded_border_shape));
                    String string = i4 == 0 ? artEditActivity.getString(R.string.op3_filter_original_description) : Integer.toString(i4);
                    imageView.setContentDescription(artEditActivity.getString(R.string.op3_filter_description) + " " + string);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                    layoutParams.setMargins(0, 0, 0, dimensionPixelSize4);
                    layoutParams.setMarginEnd((isEmpty && i4 == egfkVar.f().size() + (-1)) ? 0 : dimensionPixelSize3);
                    final HashMap hashMap = new HashMap();
                    engw b = egflVar.b();
                    int size2 = b.size();
                    int i5 = dimensionPixelSize;
                    int i6 = 0;
                    while (i6 < size2) {
                        eghf eghfVar = (eghf) b.get(i6);
                        hashMap.put(eghfVar.b(), Integer.valueOf(eghfVar.a()));
                        i6++;
                        dimensionPixelSize2 = dimensionPixelSize2;
                    }
                    int i7 = dimensionPixelSize2;
                    artEditActivity.r.b(imageView, artEditActivity.q.a(131615));
                    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: efwd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArtEditActivity artEditActivity2 = ArtEditActivity.this;
                            artEditActivity2.F();
                            artEditActivity2.E();
                            artEditActivity2.G.l();
                            EditableArtView editableArtView3 = artEditActivity2.G;
                            editableArtView3.i = false;
                            editableArtView3.k(false);
                            artEditActivity2.D(egfkVar.g().values(), hashMap);
                            artEditActivity2.N(i4, (ImageView) view);
                            artEditActivity2.w.h = true;
                        }
                    };
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: efwe
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ArtEditActivity.this.s.a(dvxh.e(), view);
                            onClickListener.onClick(view);
                        }
                    });
                    if (i4 == 0) {
                        artEditActivity.N = onClickListener;
                    }
                    artEditActivity.L.addView(imageView, layoutParams);
                    i3++;
                    i4++;
                    dimensionPixelSize = i5;
                    dimensionPixelSize2 = i7;
                }
                int i8 = artEditActivity.w.c;
                if (i8 != -1) {
                    artEditActivity.N(i8, (ImageView) artEditActivity.L.getChildAt(i8));
                }
                int dimensionPixelSize5 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_padding);
                int dimensionPixelSize6 = artEditActivity.getResources().getDimensionPixelSize(R.dimen.photo_picker_edit_preset_image_margin_end);
                int B = artEditActivity.B(egfkVar.f().size());
                if (egfkVar.e().isEmpty()) {
                    artEditActivity.findViewById(R.id.photo_picker_edit_frames_label).setVisibility(8);
                    artEditActivity.M.setVisibility(8);
                } else {
                    artEditActivity.M.removeAllViews();
                    engw e = egfkVar.e();
                    int size3 = e.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size3) {
                        final ewjn ewjnVar = (ewjn) e.get(i9);
                        ImageView imageView2 = new ImageView(artEditActivity);
                        egaj egajVar2 = artEditActivity.v;
                        Uri parse2 = Uri.parse(ewjnVar.b);
                        egal egalVar2 = new egal();
                        egalVar2.e();
                        egajVar2.f(parse2, egalVar2, imageView2);
                        imageView2.setPadding(dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
                        imageView2.setBackground(artEditActivity.getDrawable(R.drawable.rounded_border_shape));
                        int i11 = i10 + 1;
                        imageView2.setContentDescription(artEditActivity.getString(R.string.op3_frame_description) + " " + i11);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(B, B);
                        layoutParams2.setMarginEnd(i10 != egfkVar.e().size() + (-1) ? dimensionPixelSize6 : 0);
                        final HashMap hashMap2 = new HashMap();
                        for (ewkn ewknVar : ewjnVar.d) {
                            hashMap2.put(ewknVar.b, Integer.valueOf(ewknVar.c));
                            dimensionPixelSize5 = dimensionPixelSize5;
                        }
                        artEditActivity.r.b(imageView2, artEditActivity.q.a(139139));
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: efvo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ArtEditActivity artEditActivity2 = ArtEditActivity.this;
                                artEditActivity2.F();
                                artEditActivity2.E();
                                artEditActivity2.s.a(dvxh.e(), view);
                                ewjn ewjnVar2 = ewjnVar;
                                EditableArtView editableArtView3 = artEditActivity2.G;
                                ewmd ewmdVar = ewjnVar2.c;
                                if (ewmdVar == null) {
                                    ewmdVar = ewmd.a;
                                }
                                Map map = hashMap2;
                                egfk egfkVar2 = egfkVar;
                                editableArtView3.b.postRotate(-editableArtView3.s.k, editableArtView3.c.centerX(), editableArtView3.c.centerY());
                                editableArtView3.s.k = 0.0f;
                                editableArtView3.g(ewmdVar);
                                artEditActivity2.M(artEditActivity2.M.indexOfChild(view), (ImageView) view);
                                artEditActivity2.D(egfkVar2.g().values(), map);
                                efxc efxcVar = artEditActivity2.w;
                                efxcVar.h = true;
                                efxcVar.j = true;
                                EditableArtView editableArtView4 = artEditActivity2.G;
                                editableArtView4.i = true;
                                editableArtView4.k(true);
                            }
                        });
                        artEditActivity.M.addView(imageView2, layoutParams2);
                        i9++;
                        i10 = i11;
                        dimensionPixelSize5 = dimensionPixelSize5;
                    }
                    int i12 = artEditActivity.w.d;
                    if (i12 != -1) {
                        artEditActivity.M(i12, (ImageView) artEditActivity.M.getChildAt(i12));
                        EditableArtView editableArtView3 = artEditActivity.G;
                        i = 1;
                        boolean z3 = artEditActivity.w.b != 1;
                        editableArtView3.i = z3;
                        editableArtView3.k(z3);
                    } else {
                        i = 1;
                    }
                    if (artEditActivity.getResources().getConfiguration().getLayoutDirection() == i) {
                        artEditActivity.O.post(new Runnable() { // from class: efvp
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArtEditActivity artEditActivity2 = ArtEditActivity.this;
                                artEditActivity2.O.scrollTo(artEditActivity2.P.getWidth(), 0);
                            }
                        });
                    }
                }
                ArrayList arrayList = new ArrayList();
                enqu listIterator = egfkVar.g().values().listIterator();
                final int i13 = 0;
                final int i14 = 0;
                while (listIterator.hasNext()) {
                    final egfi egfiVar = (egfi) listIterator.next();
                    if (egfiVar.i()) {
                        View inflate = LayoutInflater.from(artEditActivity).inflate(R.layout.photo_picker_art_color_swatch, (ViewGroup) artEditActivity.K, false);
                        final ColorSwatchView colorSwatchView = (ColorSwatchView) inflate.findViewById(R.id.art_editor_color_swatch);
                        colorSwatchView.a((egfiVar.a() + artEditActivity.w.a(egfiVar.g())) % 360.0f, egfiVar.c() / 100.0f, egfiVar.b() / 100.0f);
                        colorSwatchView.setContentDescription(egfiVar.f());
                        artEditActivity.G.n(i14, artEditActivity.w.a(egfiVar.g()));
                        artEditActivity.r.b(colorSwatchView, artEditActivity.q.a(131639));
                        ((MaterialTextView) inflate.findViewById(R.id.art_editor_layer_name)).setText(egfiVar.f());
                        if (egfiVar.e().isEmpty()) {
                            final int i15 = i14;
                            final int i16 = i13;
                            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: efvv
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArtEditActivity artEditActivity2 = ArtEditActivity.this;
                                    artEditActivity2.s.a(dvxh.e(), colorSwatchView);
                                    egfi egfiVar2 = egfiVar;
                                    efxc efxcVar = artEditActivity2.w;
                                    efxcVar.a = efxcVar.a(egfiVar2.g());
                                    int i17 = i15;
                                    efxc efxcVar2 = artEditActivity2.w;
                                    int i18 = i16;
                                    efxcVar2.d(i18, i17);
                                    artEditActivity2.X(egfiVar2, i17, i18);
                                    artEditActivity2.V();
                                }
                            };
                            i13 = i16;
                            i14 = i15;
                            colorSwatchView.setOnClickListener(onClickListener2);
                        } else {
                            if (artEditActivity.w.b(i14) != -1) {
                                artEditActivity.G.q(i14, ((eggb) egfiVar.e().get(artEditActivity.w.b(i14))).e());
                                colorSwatchView.a(r3.a(), r3.c() / 100.0f, r3.b() / 100.0f);
                            }
                            colorSwatchView.setOnClickListener(new View.OnClickListener() { // from class: efvk
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArtEditActivity artEditActivity2 = ArtEditActivity.this;
                                    artEditActivity2.s.a(dvxh.e(), colorSwatchView);
                                    int i17 = i14;
                                    efxc efxcVar = artEditActivity2.w;
                                    int i18 = i13;
                                    efxcVar.d(i18, i17);
                                    efxc efxcVar2 = artEditActivity2.w;
                                    efxcVar2.e = efxcVar2.b(i17);
                                    artEditActivity2.C(egfiVar, i17, i18);
                                    artEditActivity2.W();
                                }
                            });
                        }
                        arrayList.add(inflate);
                        i13++;
                    }
                    i14++;
                }
                artEditActivity.I(arrayList, artEditActivity.K);
                artEditActivity.H.setVisibility(8);
                artEditActivity.I.setVisibility(8);
                artEditActivity.G.setVisibility(0);
                if (artEditActivity.G.getAlpha() == 0.0f) {
                    artEditActivity.G.animate().alpha(1.0f).setInterpolator(new ljm()).start();
                }
                artEditActivity.H();
                if (artEditActivity.w.f == -1) {
                    artEditActivity.Q();
                } else {
                    egfi egfiVar2 = (egfi) enjk.h(egfkVar.g().values(), artEditActivity.w.g);
                    if (egfiVar2.e().isEmpty()) {
                        egfi egfiVar3 = (egfi) enjk.h(egfkVar.g().values(), artEditActivity.w.g);
                        efxc efxcVar = artEditActivity.w;
                        artEditActivity.X(egfiVar3, efxcVar.g, efxcVar.f);
                        artEditActivity.w.h = true;
                        artEditActivity.V();
                    } else {
                        efxc efxcVar2 = artEditActivity.w;
                        artEditActivity.C(egfiVar2, efxcVar2.g, efxcVar2.f);
                        artEditActivity.W();
                    }
                }
                artEditActivity.aa();
                im k2 = artEditActivity.k();
                k2.getClass();
                k2.setTitle(egfkVar.i());
                artEditActivity.C.i.f(artEditActivity, new llh() { // from class: efwc
                    @Override // defpackage.llh
                    public final void a(Object obj2) {
                        if (((egkq) obj2).c() != 2) {
                            ArtEditActivity.this.H();
                        }
                    }
                });
            }
        });
        this.C.i.f(this, new llh() { // from class: efvm
            @Override // defpackage.llh
            public final void a(Object obj) {
                egkq egkqVar = (egkq) obj;
                int c = egkqVar.c() - 1;
                ArtEditActivity artEditActivity = ArtEditActivity.this;
                if (c == 1) {
                    artEditActivity.G();
                    return;
                }
                if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    artEditActivity.u.d((exfw) egkqVar.a().c());
                    artEditActivity.H();
                    return;
                }
                artEditActivity.u.d((exfw) egkqVar.a().c());
                int i = true != artEditActivity.w.i ? 2 : 3;
                Object c2 = egkqVar.b().c();
                emxc b = artEditActivity.p.b();
                boolean z2 = artEditActivity.w.j;
                Intent data = new Intent().setData((Uri) c2);
                if (b.g() && ((eghh) b.c()).b() == 1) {
                    data.putExtra("IMAGE_ID", ((eghh) b.c()).a());
                }
                artEditActivity.setResult(-1, data.putExtra("COLOR_CUSTOMIZATION_TYPE", i - 1).putExtra("WAS_FRAME_SELECTED", z2));
                artEditActivity.u.f(1);
                artEditActivity.finish();
            }
        });
        if (fdrm.i()) {
            kvd.k(findViewById(R.id.photo_picker_edit_page), new kud() { // from class: efvn
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.bottomMargin = f.e;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            });
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_art_edit_menu, menu);
        if (!fdrm.q()) {
            this.B.a(Integer.valueOf(R.id.photo_picker_undo_all_menu_item), this.q.a(131627));
            if (fdrj.e()) {
                this.B.a(Integer.valueOf(R.id.photo_picker_more_info_menu_item), this.q.a(132452));
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(89747));
            } else {
                this.B.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.q.a(132452));
                menu.findItem(R.id.photo_picker_more_info_menu_item).setVisible(false);
            }
            this.B.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.q.a(89742));
        } else if (!fdrj.e()) {
            menu.findItem(R.id.photo_picker_more_info_menu_item).setVisible(false);
        }
        aa();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.photo_picker_undo_all_menu_item) {
            this.s.b(dvxh.e(), this.B.b(Integer.valueOf(R.id.photo_picker_undo_all_menu_item)));
            if (!fdrj.f() || this.C.a().a() != null) {
                this.G.l();
                this.N.onClick(this.L.getChildAt(0));
                this.w.h = false;
                if (fdrj.g()) {
                    EditableArtView editableArtView = this.G;
                    boolean z = this.w.b == 2;
                    editableArtView.i = z;
                    editableArtView.k(z);
                }
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.photo_picker_help_menu_item) {
            this.s.b(dvxh.e(), this.B.b(Integer.valueOf(R.id.photo_picker_help_menu_item)));
            if (fdrj.e()) {
                this.z.b(this.y);
            } else {
                cg cgVar = new cg(a());
                cgVar.u(new egjy(), "EditInfoDialogFragmentTag");
                cgVar.c();
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.photo_picker_send_feedback_menu_item) {
            this.s.b(dvxh.e(), this.B.b(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item)));
            this.z.a();
            return true;
        }
        if (menuItem.getItemId() != R.id.photo_picker_more_info_menu_item || !fdrj.e()) {
            return false;
        }
        this.s.b(dvxh.e(), this.B.b(Integer.valueOf(R.id.photo_picker_more_info_menu_item)));
        cg cgVar2 = new cg(a());
        cgVar2.u(new egjy(), "EditInfoDialogFragmentTag");
        cgVar2.c();
        return true;
    }
}
