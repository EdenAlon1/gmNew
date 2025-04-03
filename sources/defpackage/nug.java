package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nug extends FrameLayout {
    private final Drawable A;
    private final String B;
    private final String C;
    private final String D;
    private final Drawable E;
    private final Drawable F;
    private final float G;
    private final float H;
    private final String I;
    private final String J;
    private boolean K;
    private final boolean L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private long S;
    private long[] T;
    private boolean[] U;
    private long[] V;
    private boolean[] W;
    public final CopyOnWriteArrayList a;
    private long aa;
    private long ab;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final StringBuilder k;
    public final Formatter l;
    public final lrt m;
    public lro n;
    public boolean o;
    public int p;
    public int q;
    private final nue r;
    private final View s;
    private final TextView t;
    private final nwj u;
    private final lrs v;
    private final Runnable w;
    private final Runnable x;
    private final Drawable y;
    private final Drawable z;

    static {
        lqx.b("media3.ui");
    }

    public nug(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.L = true;
        this.p = 5000;
        this.q = 0;
        this.M = BasePaymentResult.ERROR_REQUEST_FAILED;
        this.S = -9223372036854775807L;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = false;
        int i = R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, nwc.c, 0, 0);
            try {
                this.p = obtainStyledAttributes.getInt(19, this.p);
                i = obtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.q = obtainStyledAttributes.getInt(8, this.q);
                this.N = obtainStyledAttributes.getBoolean(17, this.N);
                this.O = obtainStyledAttributes.getBoolean(14, this.O);
                this.P = obtainStyledAttributes.getBoolean(16, this.P);
                this.Q = obtainStyledAttributes.getBoolean(15, this.Q);
                this.R = obtainStyledAttributes.getBoolean(18, this.R);
                this.M = lvf.d(obtainStyledAttributes.getInt(20, this.M), 16, 1000);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new CopyOnWriteArrayList();
        this.v = new lrs();
        this.m = new lrt();
        StringBuilder sb = new StringBuilder();
        this.k = sb;
        this.l = new Formatter(sb, Locale.getDefault());
        this.T = new long[0];
        this.U = new boolean[0];
        this.V = new long[0];
        this.W = new boolean[0];
        nue nueVar = new nue(this);
        this.r = nueVar;
        this.w = new Runnable() { // from class: nuc
            @Override // java.lang.Runnable
            public final void run() {
                nug.this.j();
            }
        };
        this.x = new Runnable() { // from class: nud
            @Override // java.lang.Runnable
            public final void run() {
                nug.this.b();
            }
        };
        LayoutInflater.from(context).inflate(i, this);
        setDescendantFocusability(262144);
        nwj nwjVar = (nwj) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (nwjVar != null) {
            this.u = nwjVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.u = defaultTimeBar;
        } else {
            this.u = null;
        }
        this.t = (TextView) findViewById(R.id.exo_duration);
        this.j = (TextView) findViewById(R.id.exo_position);
        nwj nwjVar2 = this.u;
        if (nwjVar2 != null) {
            nwjVar2.b(nueVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.d = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(nueVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(nueVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.b = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(nueVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.c = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(nueVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.g = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(nueVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(nueVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(nueVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.i = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(nueVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.s = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        p(false, false, findViewById8);
        Resources resources = context.getResources();
        this.G = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.H = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.y = lvf.A(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.z = lvf.A(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.A = lvf.A(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.E = lvf.A(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.F = lvf.A(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.B = resources.getString(R.string.exo_controls_repeat_off_description);
        this.C = resources.getString(R.string.exo_controls_repeat_one_description);
        this.D = resources.getString(R.string.exo_controls_repeat_all_description);
        this.I = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.J = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.ab = -9223372036854775807L;
    }

    private final void p(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.G : this.H);
        view.setVisibility(true != z ? 8 : 0);
    }

    public final void a(nuf nufVar) {
        lti.f(nufVar);
        this.a.add(nufVar);
    }

    public final void b() {
        if (o()) {
            setVisibility(8);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((nuf) it.next()).E(getVisibility());
            }
            removeCallbacks(this.w);
            removeCallbacks(this.x);
            this.S = -9223372036854775807L;
        }
    }

    public final void c() {
        removeCallbacks(this.x);
        if (this.p <= 0) {
            this.S = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.p;
        this.S = uptimeMillis + j;
        if (this.K) {
            postDelayed(this.x, j);
        }
    }

    public final void d() {
        if (lvf.ad(this.n, this.L)) {
            View view = this.d;
            if (view != null) {
                view.sendAccessibilityEvent(8);
                return;
            }
            return;
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return n(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.x);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        if (lvf.ad(this.n, this.L)) {
            View view = this.d;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    public final void f(lro lroVar) {
        lti.c(Looper.myLooper() == Looper.getMainLooper());
        lti.a(lroVar == null || lroVar.E() == Looper.getMainLooper());
        lro lroVar2 = this.n;
        if (lroVar2 == lroVar) {
            return;
        }
        if (lroVar2 != null) {
            lroVar2.R(this.r);
        }
        this.n = lroVar;
        if (lroVar != null) {
            lroVar.N(this.r);
        }
        g();
    }

    public final void g() {
        i();
        h();
        k();
        l();
        m();
    }

    public final void h() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (o() && this.K) {
            lro lroVar = this.n;
            if (lroVar != null) {
                z = lroVar.n(5);
                z3 = lroVar.n(7);
                z4 = lroVar.n(11);
                z5 = lroVar.n(12);
                z2 = lroVar.n(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            p(this.P, z3, this.b);
            p(this.N, z4, this.g);
            p(this.O, z5, this.f);
            p(this.Q, z2, this.c);
            nwj nwjVar = this.u;
            if (nwjVar != null) {
                nwjVar.setEnabled(z);
            }
        }
    }

    public final void i() {
        boolean z;
        boolean z2;
        if (o() && this.K) {
            boolean ad = lvf.ad(this.n, this.L);
            View view = this.d;
            if (view != null) {
                z = !ad && view.isFocused();
                z2 = !ad && this.d.isAccessibilityFocused();
                this.d.setVisibility(true != ad ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.e;
            if (view2 != null) {
                z |= ad && view2.isFocused();
                z2 |= ad && this.e.isAccessibilityFocused();
                this.e.setVisibility(true != ad ? 0 : 8);
            }
            if (z) {
                e();
            }
            if (z2) {
                d();
            }
        }
    }

    public final void j() {
        long j;
        long j2;
        if (o() && this.K) {
            lro lroVar = this.n;
            if (lroVar != null) {
                j = this.aa + lroVar.y();
                j2 = this.aa + lroVar.x();
            } else {
                j = 0;
                j2 = 0;
            }
            long j3 = this.ab;
            this.ab = j;
            TextView textView = this.j;
            if (textView != null && !this.o && j != j3) {
                textView.setText(lvf.J(this.k, this.l, j));
            }
            nwj nwjVar = this.u;
            if (nwjVar != null) {
                nwjVar.g(j);
                this.u.e(j2);
            }
            removeCallbacks(this.w);
            int u = lroVar == null ? 1 : lroVar.u();
            if (lroVar == null || !lroVar.r()) {
                if (u == 4 || u == 1) {
                    return;
                }
                postDelayed(this.w, 1000L);
                return;
            }
            nwj nwjVar2 = this.u;
            long min = Math.min(nwjVar2 != null ? nwjVar2.a() : 1000L, 1000 - (j % 1000));
            float f = lroVar.G().b;
            postDelayed(this.w, lvf.q(f > 0.0f ? (long) (min / f) : 1000L, this.M, 1000L));
        }
    }

    public final void k() {
        ImageView imageView;
        if (o() && this.K && (imageView = this.h) != null) {
            if (this.q == 0) {
                p(false, false, imageView);
                return;
            }
            lro lroVar = this.n;
            if (lroVar == null) {
                p(true, false, imageView);
                this.h.setImageDrawable(this.y);
                this.h.setContentDescription(this.B);
                return;
            }
            p(true, true, imageView);
            int w = lroVar.w();
            if (w == 0) {
                this.h.setImageDrawable(this.y);
                this.h.setContentDescription(this.B);
            } else if (w == 1) {
                this.h.setImageDrawable(this.z);
                this.h.setContentDescription(this.C);
            } else if (w == 2) {
                this.h.setImageDrawable(this.A);
                this.h.setContentDescription(this.D);
            }
            this.h.setVisibility(0);
        }
    }

    public final void l() {
        ImageView imageView;
        if (o() && this.K && (imageView = this.i) != null) {
            lro lroVar = this.n;
            if (!this.R) {
                p(false, false, imageView);
                return;
            }
            if (lroVar == null) {
                p(true, false, imageView);
                this.i.setImageDrawable(this.F);
                this.i.setContentDescription(this.J);
            } else {
                p(true, true, imageView);
                this.i.setImageDrawable(lroVar.Z() ? this.E : this.F);
                this.i.setContentDescription(lroVar.Z() ? this.I : this.J);
            }
        }
    }

    public final void m() {
        lrt lrtVar;
        lro lroVar = this.n;
        if (lroVar == null) {
            return;
        }
        long j = 0;
        this.aa = 0L;
        lru I = lroVar.I();
        if (!I.q()) {
            int aI = lroVar.aI();
            int i = aI;
            while (true) {
                if (i > aI) {
                    break;
                }
                if (i == aI) {
                    this.aa = lvf.z(j);
                }
                I.p(i, this.m);
                lrt lrtVar2 = this.m;
                if (lrtVar2.m == -9223372036854775807L) {
                    lti.c(true);
                    break;
                }
                int i2 = lrtVar2.n;
                while (true) {
                    lrtVar = this.m;
                    if (i2 <= lrtVar.o) {
                        I.n(i2, this.v);
                        this.v.j();
                        this.v.m();
                        i2++;
                    }
                }
                j += lrtVar.m;
                i++;
            }
        }
        TextView textView = this.t;
        long z = lvf.z(j);
        if (textView != null) {
            textView.setText(lvf.J(this.k, this.l, z));
        }
        nwj nwjVar = this.u;
        if (nwjVar != null) {
            nwjVar.f(z);
            int length = this.V.length;
            long[] jArr = this.T;
            if (jArr.length < 0) {
                this.T = Arrays.copyOf(jArr, 0);
                this.U = Arrays.copyOf(this.U, 0);
            }
            System.arraycopy(this.V, 0, this.T, 0, 0);
            System.arraycopy(this.W, 0, this.U, 0, 0);
            this.u.d(this.T, this.U, 0);
        }
        j();
    }

    public final boolean n(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        lro lroVar = this.n;
        if (lroVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87) {
            if (keyCode != 88) {
                return false;
            }
            keyCode = 88;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (lroVar.u() == 4) {
                return true;
            }
            lroVar.g();
            return true;
        }
        if (keyCode == 89) {
            lroVar.f();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            lvf.al(lroVar, this.L);
            return true;
        }
        if (keyCode == 87) {
            lroVar.j();
            return true;
        }
        if (keyCode == 88) {
            lroVar.k();
            return true;
        }
        if (keyCode == 126) {
            lvf.ap(lroVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        lvf.ao(lroVar);
        return true;
    }

    public final boolean o() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        long j = this.S;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.x, uptimeMillis);
            }
        } else if (o()) {
            c();
        }
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        removeCallbacks(this.w);
        removeCallbacks(this.x);
    }
}
