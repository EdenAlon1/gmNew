package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.research.ink.libs.buttons.ColorSelectionButton;
import com.google.research.ink.libs.buttons.PenSelectionButton;
import defpackage.fbal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwf extends dcvt implements ekhu, fbas, ekhq, ekkk, elar {
    private dcwv a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public dcwf() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcwv.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final dcwv H = H();
            ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.media_editor_fragment, viewGroup, false);
            final eeqb b = H.c.b();
            H.d.o = H;
            H.h = new HashMap();
            H.h.put(eepw.b, (ImageButton) constraintLayout.findViewById(R.id.draw_button));
            H.h.put(eepw.c, (ImageButton) constraintLayout.findViewById(R.id.text_button));
            for (final Map.Entry entry : H.h.entrySet()) {
                ((ImageButton) entry.getValue()).setOnClickListener(new View.OnClickListener() { // from class: dcwo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        eeqb.this.b((eepw) entry.getKey());
                    }
                });
            }
            H.i = new HashMap();
            H.i.put(eepv.c, (PenSelectionButton) constraintLayout.findViewById(R.id.highlighter_line_type));
            H.i.put(eepv.a, (PenSelectionButton) constraintLayout.findViewById(R.id.pencil_line_type));
            H.i.put(eepv.b, (PenSelectionButton) constraintLayout.findViewById(R.id.calligraphy_line_type));
            for (final Map.Entry entry2 : H.i.entrySet()) {
                ((PenSelectionButton) entry2.getValue()).setOnClickListener(new View.OnClickListener() { // from class: dcwp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        eepv eepvVar = (eepv) entry2.getKey();
                        eepvVar.getClass();
                        eeqb eeqbVar = eeqb.this;
                        ExpressiveTextContext expressiveTextContext = eeqbVar.a;
                        if (expressiveTextContext.p()) {
                            eeqbVar.b.b(expressiveTextContext.b(eepvVar));
                        }
                    }
                });
            }
            H.k = (ColorSelectionButton) constraintLayout.findViewById(R.id.ink_color_white);
            H.j = new HashMap();
            TypedArray obtainTypedArray = H.a.B().obtainTypedArray(R.array.color_buttons);
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                final ColorSelectionButton colorSelectionButton = (ColorSelectionButton) constraintLayout.findViewById(obtainTypedArray.getResourceId(i, 0));
                H.j.put(Integer.valueOf(colorSelectionButton.b), colorSelectionButton);
                colorSelectionButton.setOnClickListener(new View.OnClickListener() { // from class: dcwq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        eeqb eeqbVar = b;
                        ColorSelectionButton colorSelectionButton2 = colorSelectionButton;
                        eepw eepwVar = dcwv.this.d.e;
                        if (eepwVar == eepw.b) {
                            int i2 = colorSelectionButton2.b;
                            ExpressiveTextContext expressiveTextContext = eeqbVar.a;
                            if (expressiveTextContext.p()) {
                                expressiveTextContext.f(i2);
                                eeqbVar.b.a(i2);
                                return;
                            }
                            return;
                        }
                        if (eepwVar == eepw.c) {
                            int i3 = colorSelectionButton2.b;
                            if (eeqbVar.a.p()) {
                                eeqbVar.b.f(i3);
                            }
                        }
                    }
                });
            }
            obtainTypedArray.recycle();
            H.l = (EditText) constraintLayout.findViewById(R.id.media_editor_edit_text);
            constraintLayout.findViewById(R.id.done_button).setOnClickListener(new View.OnClickListener() { // from class: dcwr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eeqb eeqbVar = b;
                    dcwv dcwvVar = dcwv.this;
                    eepy eepyVar = dcwvVar.d;
                    if (eepyVar.e == eepw.c) {
                        long j = eepyVar.n;
                        String trim = dcwvVar.l.getText().toString().trim();
                        int i2 = dcwvVar.d.h;
                        EditText editText = dcwvVar.l;
                        StaticLayout staticLayout = new StaticLayout(editText.getText().toString().trim(), editText.getPaint(), editText.getWidth(), Layout.Alignment.ALIGN_CENTER, editText.getLineSpacingMultiplier(), editText.getLineSpacingExtra(), editText.getIncludeFontPadding());
                        int max = Math.max(staticLayout.getWidth(), 1);
                        int max2 = Math.max(staticLayout.getHeight(), 1);
                        Bitmap createBitmap = Bitmap.createBitmap(max + max, max2 + max2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(2.0f, 2.0f);
                        staticLayout.draw(canvas);
                        trim.getClass();
                        createBitmap.getClass();
                        ExpressiveTextContext expressiveTextContext = eeqbVar.a;
                        if (expressiveTextContext.p()) {
                            expressiveTextContext.m(j, trim, i2, createBitmap);
                        }
                    }
                    eeqbVar.b(eepw.a);
                }
            });
            constraintLayout.findViewById(R.id.cancel_or_undo_button).setOnClickListener(new View.OnClickListener() { // from class: dcws
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eeqb eeqbVar = b;
                    eepy eepyVar = dcwv.this.d;
                    if (eepyVar.e != eepw.b || eepyVar.j <= 0) {
                        eeqbVar.b(eepw.a);
                        return;
                    }
                    ExpressiveTextContext expressiveTextContext = eeqbVar.a;
                    if (expressiveTextContext.p()) {
                        expressiveTextContext.j();
                    }
                }
            });
            LottieAnimationView lottieAnimationView = (LottieAnimationView) constraintLayout.findViewById(R.id.drag_to_delete_animation);
            lottieAnimationView.g("delete_icon_animation.json");
            dcvs dcvsVar = H.f;
            Context context = (Context) dcvsVar.a.b();
            context.getClass();
            cqoh cqohVar = (cqoh) dcvsVar.b.b();
            cqohVar.getClass();
            Vibrator vibrator = (Vibrator) dcvsVar.c.b();
            vibrator.getClass();
            lottieAnimationView.getClass();
            H.o = new dcvr(context, cqohVar, vibrator, lottieAnimationView, b);
            lottieAnimationView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dcwt
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    dcwv.this.o.e = new Rect(i2, i3, i4, i5);
                }
            });
            constraintLayout.findViewById(R.id.exit_button).setOnClickListener(new View.OnClickListener() { // from class: dcwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dcwv dcwvVar = dcwv.this;
                    if (dcwvVar.b()) {
                        dcwvVar.g();
                    } else {
                        ellj.g(new dcvv(false), view);
                    }
                }
            });
            H.m = (GLTextureView) constraintLayout.findViewById(R.id.textureview);
            H.m.setOpaque(false);
            GLTextureView gLTextureView = H.m;
            gLTextureView.a();
            gLTextureView.f = 2;
            GLTextureView gLTextureView2 = H.m;
            eeqe eeqeVar = new eeqe(gLTextureView2, 8, 0);
            gLTextureView2.a();
            gLTextureView2.e = eeqeVar;
            GLTextureView gLTextureView3 = H.m;
            gLTextureView3.g = true;
            gLTextureView3.b(true);
            GLTextureView gLTextureView4 = H.m;
            gLTextureView4.a();
            if (gLTextureView4.e == null) {
                gLTextureView4.e = new eeqk(gLTextureView4);
            }
            if (gLTextureView4.h == null) {
                gLTextureView4.h = new eeqf(gLTextureView4);
            }
            if (gLTextureView4.i == null) {
                gLTextureView4.i = new eeqg();
            }
            gLTextureView4.d = H.c;
            gLTextureView4.c = new eeqi(gLTextureView4.b);
            gLTextureView4.c.start();
            H.m.c.c(1);
            H.m.setOnTouchListener(new View.OnTouchListener() { // from class: dcwh
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return dcwv.this.j(view, motionEvent);
                }
            });
            if (((Boolean) dcut.h.e()).booleanValue()) {
                H.m.setOnHoverListener(new View.OnHoverListener() { // from class: dcwi
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        dcwv dcwvVar = dcwv.this;
                        if (dcwvVar.e.isTouchExplorationEnabled()) {
                            return dcwvVar.j(view, motionEvent);
                        }
                        return false;
                    }
                });
            }
            float f = constraintLayout.getContext().getResources().getDisplayMetrics().density;
            if (f >= 1.0f) {
                b.b.k = Float.valueOf(f);
                ExpressiveTextContext expressiveTextContext = b.a;
                if (expressiveTextContext.p()) {
                    expressiveTextContext.i(f);
                }
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) constraintLayout.findViewById(R.id.media_editor_toolbars);
            H.q.e(constraintLayout2);
            H.r.e(constraintLayout2);
            H.s.e(constraintLayout2);
            H.t.e(constraintLayout2);
            H.u.e(constraintLayout2);
            H.q.l(R.id.media_editor_action_bar, 0);
            H.q.l(R.id.drag_to_delete_animation, 0);
            H.r.l(R.id.drag_to_delete_animation, 0);
            H.s.l(R.id.media_editor_text_views, 0);
            H.s.l(R.id.media_editor_color_bar, 0);
            H.s.l(R.id.media_editor_tool_action_bar, 0);
            H.t.l(R.id.media_editor_brush_bar, 0);
            H.t.l(R.id.media_editor_tool_action_bar, 0);
            H.t.l(R.id.media_editor_color_bar, 0);
            H.v = new AutoTransition();
            H.v.setDuration(83L);
            ViewGroup viewGroup2 = (ViewGroup) constraintLayout.findViewById(R.id.media_editor_toolbars);
            View inflate = layoutInflater.inflate(R.layout.media_editor_action_bar_background, viewGroup2, false);
            viewGroup2.addView(inflate, 0);
            au auVar = (au) inflate.getLayoutParams();
            if (auVar != null) {
                auVar.n = R.id.screen_start_guideline;
                auVar.p = R.id.screen_end_guideline;
                auVar.h = R.id.screen_top_guideline;
                inflate.setLayoutParams(auVar);
                inflate.requestLayout();
            }
            H.p = H.b();
            ekyf.q();
            return constraintLayout;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
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

    @Override // defpackage.dcvt, defpackage.efaf, defpackage.ea
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
            dcwv H = H();
            H.f(false, "");
            H.m.b(false);
            H.n.a(true);
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
        this.c.k();
        try {
            bh();
            eeqi eeqiVar = H().m.c;
            synchronized (GLTextureView.a) {
                eeqiVar.b = true;
                GLTextureView.a.notifyAll();
                while (!eeqiVar.a && !eeqiVar.c) {
                    try {
                        GLTextureView.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
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
        elav b = this.c.b();
        try {
            bi();
            dcwv H = H();
            eeqi eeqiVar = H.m.c;
            synchronized (GLTextureView.a) {
                eeqiVar.b = false;
                eeqiVar.h = true;
                eeqiVar.i = false;
                GLTextureView.a.notifyAll();
                while (!eeqiVar.a && eeqiVar.c && !eeqiVar.i) {
                    try {
                        GLTextureView.a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            H.h();
            View view = H.a.Q;
            view.getClass();
            view.setSystemUiVisibility(1);
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

    @Override // defpackage.dcvt
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

    @Override // defpackage.ekhu
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dcwv H() {
        dcwv dcwvVar = this.a;
        if (dcwvVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcwvVar;
    }

    @Override // defpackage.dcvt, defpackage.ekkd, defpackage.ea
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
                    Context context2 = (Context) ((akgt) aX).a.q.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof dcwf)) {
                        throw new IllegalStateException(a.J(eaVar, dcwv.class));
                    }
                    dcwf dcwfVar = (dcwf) eaVar;
                    dcvw dcvwVar = (dcvw) ((akgt) aX).a.b.pH.b();
                    eept eeptVar = (eept) ((akgt) aX).a.b.pG.b();
                    eepy eepyVar = (eepy) ((akgt) aX).a.b.pF.b();
                    akis akisVar = ((akgt) aX).a;
                    this.a = new dcwv(context2, dcwfVar, dcvwVar, eeptVar, eepyVar, new dcvs(akisVar.q, akisVar.cz, akisVar.b.ll), (dbxg) ((akgt) aX).bD.b(), (dede) ((akgt) aX).a.b.iq.b());
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
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            final dcwv H = H();
            H.a.G().setRequestedOrientation(1);
            H.n = (dbti) new lmw(H.a.G()).a(dbti.class);
            H.n.a(false);
            H.g.b(new decz() { // from class: dcwm
                @Override // defpackage.decz
                public final void a(boolean z) {
                    dcwv.this.h();
                }
            });
            H.g.a(new decy() { // from class: dcwn
                @Override // defpackage.decy
                public final void b(int i) {
                    dcwv.this.h();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void i() {
        elav b = this.c.b();
        try {
            bf();
            dcwv H = H();
            H.c.c();
            H.d.o = null;
            View view = H.a.Q;
            view.getClass();
            view.setSystemUiVisibility(0);
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
            dcwv H = H();
            H.e(H.d);
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

    @Override // defpackage.dcvt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
