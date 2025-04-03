package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nva extends FrameLayout {
    private static final float[] J;
    public final Drawable A;
    public final String B;
    public final String C;
    public lro D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public int H;
    public boolean I;
    private final Resources K;
    private final nun L;
    private final RecyclerView M;
    private final TextView N;
    private final TextView O;
    private final ImageView P;
    private final TextView Q;
    private final nwj R;
    private final lrs S;
    private final Runnable T;
    private final Drawable U;
    private final Drawable V;
    private final Drawable W;
    public final nvx a;
    private final Drawable aa;
    private final float ab;
    private final float ac;
    private final String ad;
    private final String ae;
    private final Drawable af;
    private final Drawable ag;
    private final String ah;
    private final String ai;
    private boolean aj;
    private final int ak;
    private long[] al;
    private boolean[] am;
    private final long[] an;
    private final boolean[] ao;
    private long ap;
    private final nub aq;
    public final CopyOnWriteArrayList b;
    public final nus c;
    public final nup d;
    public final nuv e;
    public final num f;
    public final PopupWindow g;
    public final int h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final View l;
    public final View m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final View s;
    public final View t;
    public final View u;
    public final TextView v;
    public final StringBuilder w;
    public final Formatter x;
    public final lrt y;
    public final Drawable z;

    static {
        lqx.b("media3.ui");
        J = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public nva(Context context) {
        super(context, null, 0);
        this.F = true;
        this.H = 5000;
        this.ak = BasePaymentResult.ERROR_REQUEST_FAILED;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        nun nunVar = new nun(this);
        this.L = nunVar;
        this.b = new CopyOnWriteArrayList();
        this.S = new lrs();
        this.y = new lrt();
        StringBuilder sb = new StringBuilder();
        this.w = sb;
        this.x = new Formatter(sb, Locale.getDefault());
        this.al = new long[0];
        this.am = new boolean[0];
        this.an = new long[0];
        this.ao = new boolean[0];
        this.T = new Runnable() { // from class: nui
            @Override // java.lang.Runnable
            public final void run() {
                nva.this.i();
            }
        };
        this.Q = (TextView) findViewById(R.id.exo_duration);
        this.v = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.p = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(nunVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.q = imageView2;
        s(imageView2, new View.OnClickListener() { // from class: nuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nva nvaVar = nva.this;
                boolean z = nvaVar.E;
                boolean z2 = !z;
                if (z == z2) {
                    return;
                }
                nvaVar.E = z2;
                nvaVar.e(nvaVar.q, z2);
                nvaVar.e(nvaVar.r, z2);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.r = imageView3;
        s(imageView3, new View.OnClickListener() { // from class: nuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nva nvaVar = nva.this;
                boolean z = nvaVar.E;
                boolean z2 = !z;
                if (z == z2) {
                    return;
                }
                nvaVar.E = z2;
                nvaVar.e(nvaVar.q, z2);
                nvaVar.e(nvaVar.r, z2);
            }
        });
        View findViewById = findViewById(R.id.exo_settings);
        this.s = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(nunVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.t = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(nunVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.u = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(nunVar);
        }
        nwj nwjVar = (nwj) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (nwjVar != null) {
            this.R = nwjVar;
        } else if (findViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, null, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.R = defaultTimeBar;
        } else {
            this.R = null;
        }
        nwj nwjVar2 = this.R;
        if (nwjVar2 != null) {
            nwjVar2.b(nunVar);
        }
        Resources resources = context.getResources();
        this.K = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(nunVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.i = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(lvf.A(context, resources, R.drawable.exo_styled_controls_previous));
            imageView5.setOnClickListener(nunVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.j = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(lvf.A(context, resources, R.drawable.exo_styled_controls_next));
            imageView6.setOnClickListener(nunVar);
        }
        Typeface b = kpp.b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(lvf.A(context, resources, R.drawable.exo_styled_controls_simple_rewind));
            this.m = imageView7;
            this.O = null;
        } else if (textView != null) {
            textView.setTypeface(b);
            this.O = textView;
            this.m = textView;
        } else {
            this.O = null;
            this.m = null;
        }
        View view = this.m;
        if (view != null) {
            view.setOnClickListener(nunVar);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(lvf.A(context, resources, R.drawable.exo_styled_controls_simple_fastforward));
            this.l = imageView8;
            this.N = null;
        } else if (textView2 != null) {
            textView2.setTypeface(b);
            this.N = textView2;
            this.l = textView2;
        } else {
            this.N = null;
            this.l = null;
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setOnClickListener(nunVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.n = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(nunVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.o = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(nunVar);
        }
        this.ab = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.ac = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.P = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(lvf.A(context, resources, R.drawable.exo_styled_controls_vr));
            t(false, imageView11);
        }
        nvx nvxVar = new nvx(this);
        this.a = nvxVar;
        nvxVar.v = true;
        nus nusVar = new nus(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{lvf.A(context, resources, R.drawable.exo_styled_controls_speed), lvf.A(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.c = nusVar;
        this.h = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.M = recyclerView;
        recyclerView.am(nusVar);
        getContext();
        recyclerView.ap(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.g = popupWindow;
        popupWindow.setOnDismissListener(nunVar);
        this.I = true;
        this.aq = new nub(getResources());
        this.z = lvf.A(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.A = lvf.A(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.B = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.C = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.e = new nuv(this);
        this.f = new num(this);
        this.d = new nup(this, resources.getStringArray(R.array.exo_controls_playback_speeds), J);
        this.U = lvf.A(context, resources, R.drawable.exo_styled_controls_play);
        this.V = lvf.A(context, resources, R.drawable.exo_styled_controls_pause);
        this.af = lvf.A(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.ag = lvf.A(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        lvf.A(context, resources, R.drawable.exo_styled_controls_repeat_off);
        lvf.A(context, resources, R.drawable.exo_styled_controls_repeat_one);
        lvf.A(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.W = lvf.A(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.aa = lvf.A(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.ah = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.ai = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        resources.getString(R.string.exo_controls_repeat_off_description);
        resources.getString(R.string.exo_controls_repeat_one_description);
        resources.getString(R.string.exo_controls_repeat_all_description);
        this.ad = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.ae = resources.getString(R.string.exo_controls_shuffle_off_description);
        nvxVar.j((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        nvxVar.j(this.l, true);
        nvxVar.j(this.m, true);
        nvxVar.j(imageView5, true);
        nvxVar.j(imageView6, true);
        nvxVar.j(imageView10, false);
        nvxVar.j(imageView, false);
        nvxVar.j(imageView11, false);
        nvxVar.j(imageView9, false);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nuk
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                nva nvaVar = nva.this;
                if (nvaVar.g.isShowing()) {
                    nvaVar.k();
                    nvaVar.g.update(view3, (nvaVar.getWidth() - nvaVar.g.getWidth()) - nvaVar.h, (-nvaVar.g.getHeight()) - nvaVar.h, -1, -1);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final engw r(lsb lsbVar, int i) {
        int i2;
        String b;
        String str;
        engr engrVar = new engr();
        int i3 = 0;
        while (true) {
            engw engwVar = lsbVar.b;
            if (i3 >= engwVar.size()) {
                return engrVar.g();
            }
            lsa lsaVar = (lsa) engwVar.get(i3);
            if (lsaVar.a() == i) {
                for (int i4 = 0; i4 < lsaVar.a; i4++) {
                    if (lsaVar.d(i4)) {
                        lqc b2 = lsaVar.b(i4);
                        if ((b2.e & 2) == 0) {
                            nub nubVar = this.aq;
                            int b3 = lre.b(b2.o);
                            if (b3 == -1) {
                                String str2 = b2.k;
                                String str3 = null;
                                if (str2 != null) {
                                    String[] ai = lvf.ai(str2);
                                    int length = ai.length;
                                    int i5 = 0;
                                    i2 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            str = null;
                                            break;
                                        }
                                        str = lre.d(ai[i5]);
                                        if (str != null && lre.l(str)) {
                                            break;
                                        }
                                        i5++;
                                    }
                                } else {
                                    str = null;
                                    i2 = 0;
                                }
                                if (str == null) {
                                    String str4 = b2.k;
                                    if (str4 != null) {
                                        String[] ai2 = lvf.ai(str4);
                                        int length2 = ai2.length;
                                        int i6 = i2;
                                        while (true) {
                                            if (i6 >= length2) {
                                                break;
                                            }
                                            String d = lre.d(ai2[i6]);
                                            if (d != null && lre.i(d)) {
                                                str3 = d;
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                    if (str3 == null) {
                                        if (b2.v == -1 && b2.w == -1) {
                                            if (b2.E == -1 && b2.F == -1) {
                                                b3 = -1;
                                            }
                                        }
                                    }
                                    b3 = 1;
                                }
                                b3 = 2;
                            } else {
                                i2 = 0;
                            }
                            String str5 = "";
                            if (b3 == 2) {
                                String c = nubVar.c(b2);
                                int i7 = b2.v;
                                int i8 = b2.w;
                                if (i7 != -1 && i8 != -1) {
                                    Resources resources = nubVar.a;
                                    Integer valueOf = Integer.valueOf(i7);
                                    Integer valueOf2 = Integer.valueOf(i8);
                                    Object[] objArr = new Object[2];
                                    objArr[i2] = valueOf;
                                    objArr[1] = valueOf2;
                                    str5 = resources.getString(R.string.exo_track_resolution, objArr);
                                }
                                b = nubVar.d(c, str5, nubVar.a(b2));
                            } else if (b3 == 1) {
                                String b4 = nubVar.b(b2);
                                int i9 = b2.E;
                                if (i9 != -1 && i9 > 0) {
                                    str5 = i9 != 1 ? i9 != 2 ? (i9 == 6 || i9 == 7) ? nubVar.a.getString(R.string.exo_track_surround_5_point_1) : i9 != 8 ? nubVar.a.getString(R.string.exo_track_surround) : nubVar.a.getString(R.string.exo_track_surround_7_point_1) : nubVar.a.getString(R.string.exo_track_stereo) : nubVar.a.getString(R.string.exo_track_mono);
                                }
                                b = nubVar.d(b4, str5, nubVar.a(b2));
                            } else {
                                b = nubVar.b(b2);
                            }
                            if (b.length() == 0) {
                                String str6 = b2.d;
                                if (str6 == null || str6.trim().isEmpty()) {
                                    b = nubVar.a.getString(R.string.exo_track_unknown);
                                } else {
                                    Resources resources2 = nubVar.a;
                                    Object[] objArr2 = new Object[1];
                                    objArr2[i2] = str6;
                                    b = resources2.getString(R.string.exo_track_unknown_name, objArr2);
                                }
                            }
                            engrVar.h(new nuw(lsbVar, i3, i4, b));
                        }
                    }
                }
            }
            i3++;
        }
    }

    private static void s(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private final void t(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.ab : this.ac);
    }

    private final void u() {
        nus nusVar = this.c;
        boolean z = true;
        if (!nusVar.F(1) && !nusVar.F(0)) {
            z = false;
        }
        t(z, this.s);
    }

    public final void a(vk vkVar, View view) {
        this.M.am(vkVar);
        k();
        this.I = false;
        this.g.dismiss();
        this.I = true;
        int width = getWidth() - this.g.getWidth();
        int i = -this.g.getHeight();
        PopupWindow popupWindow = this.g;
        int i2 = this.h;
        popupWindow.showAsDropDown(view, width - i2, i - i2);
    }

    public final void b() {
        nvx nvxVar = this.a;
        int i = nvxVar.s;
        if (i == 3 || i == 2) {
            return;
        }
        nvxVar.h();
        if (!nvxVar.v) {
            nvxVar.e();
        } else if (nvxVar.s == 1) {
            nvxVar.f();
        } else {
            nvxVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (((defpackage.mgl) r5).k == android.os.Looper.getMainLooper()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.lro r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            defpackage.lti.c(r0)
            if (r5 == 0) goto L1f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1 = r5
            mgl r1 = (defpackage.mgl) r1
            android.os.Looper r1 = r1.k
            if (r1 != r0) goto L20
        L1f:
            r2 = r3
        L20:
            defpackage.lti.a(r2)
            lro r0 = r4.D
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L2f
            nun r1 = r4.L
            r0.R(r1)
        L2f:
            r4.D = r5
            if (r5 == 0) goto L38
            nun r0 = r4.L
            r5.N(r0)
        L38:
            r4.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nva.c(lro):void");
    }

    final void d() {
        g();
        f();
        j();
        l();
        n();
        h();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.af);
            imageView.setContentDescription(this.ah);
        } else {
            imageView.setImageDrawable(this.ag);
            imageView.setContentDescription(this.ai);
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (q() && this.aj) {
            lro lroVar = this.D;
            if (lroVar != null) {
                z2 = lroVar.n(5);
                z3 = lroVar.n(7);
                z4 = lroVar.n(11);
                z5 = lroVar.n(12);
                z = lroVar.n(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (z4) {
                lro lroVar2 = this.D;
                long C = lroVar2 != null ? lroVar2.C() : 5000L;
                TextView textView = this.O;
                int i = (int) (C / 1000);
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                View view = this.m;
                if (view != null) {
                    view.setContentDescription(this.K.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            if (z5) {
                lro lroVar3 = this.D;
                long D = lroVar3 != null ? lroVar3.D() : 15000L;
                TextView textView2 = this.N;
                int i2 = (int) (D / 1000);
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                View view2 = this.l;
                if (view2 != null) {
                    view2.setContentDescription(this.K.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            t(z3, this.i);
            t(z4, this.m);
            t(z5, this.l);
            t(z, this.j);
            nwj nwjVar = this.R;
            if (nwjVar != null) {
                nwjVar.setEnabled(z2);
            }
        }
    }

    public final void g() {
        if (q() && this.aj && this.k != null) {
            boolean ad = lvf.ad(this.D, this.F);
            Drawable drawable = ad ? this.U : this.V;
            boolean z = true;
            int i = true != ad ? R.string.exo_controls_pause_description : R.string.exo_controls_play_description;
            this.k.setImageDrawable(drawable);
            this.k.setContentDescription(this.K.getString(i));
            lro lroVar = this.D;
            if (lroVar == null || !lroVar.n(1) || (lroVar.n(17) && lroVar.I().q())) {
                z = false;
            }
            t(z, this.k);
        }
    }

    public final void h() {
        lro lroVar = this.D;
        if (lroVar == null) {
            return;
        }
        nup nupVar = this.d;
        float f = lroVar.G().b;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = nupVar.d;
            int length = fArr.length;
            if (i >= 7) {
                nupVar.e = i2;
                nus nusVar = this.c;
                nup nupVar2 = this.d;
                nusVar.m(0, nupVar2.a[nupVar2.e]);
                u();
                return;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                f2 = abs;
            }
            if (abs < f2) {
                i2 = i;
            }
            i++;
        }
    }

    public final void i() {
        long j;
        if (q() && this.aj) {
            lro lroVar = this.D;
            long j2 = 0;
            if (lroVar == null || !lroVar.n(16)) {
                j = 0;
            } else {
                j2 = this.ap + lroVar.y();
                j = this.ap + lroVar.x();
            }
            TextView textView = this.v;
            if (textView != null && !this.G) {
                textView.setText(lvf.J(this.w, this.x, j2));
            }
            nwj nwjVar = this.R;
            if (nwjVar != null) {
                nwjVar.g(j2);
                this.R.e(j);
            }
            removeCallbacks(this.T);
            int u = lroVar == null ? 1 : lroVar.u();
            if (lroVar == null || !lroVar.r()) {
                if (u == 4 || u == 1) {
                    return;
                }
                postDelayed(this.T, 1000L);
                return;
            }
            nwj nwjVar2 = this.R;
            long min = Math.min(nwjVar2 != null ? nwjVar2.a() : 1000L, 1000 - (j2 % 1000));
            float f = lroVar.G().b;
            postDelayed(this.T, lvf.q(f > 0.0f ? (long) (min / f) : 1000L, this.ak, 1000L));
        }
    }

    public final void j() {
        ImageView imageView;
        if (q() && this.aj && (imageView = this.n) != null) {
            t(false, imageView);
        }
    }

    public final void k() {
        this.M.measure(0, 0);
        int i = this.h;
        this.g.setWidth(Math.min(this.M.getMeasuredWidth(), getWidth() - (i + i)));
        int i2 = this.h;
        this.g.setHeight(Math.min(getHeight() - (i2 + i2), this.M.getMeasuredHeight()));
    }

    public final void l() {
        ImageView imageView;
        if (q() && this.aj && (imageView = this.o) != null) {
            lro lroVar = this.D;
            if (!this.a.m(imageView)) {
                t(false, this.o);
                return;
            }
            if (lroVar == null || !lroVar.n(14)) {
                t(false, this.o);
                this.o.setImageDrawable(this.aa);
                this.o.setContentDescription(this.ae);
            } else {
                t(true, this.o);
                this.o.setImageDrawable(lroVar.Z() ? this.W : this.aa);
                this.o.setContentDescription(lroVar.Z() ? this.ad : this.ae);
            }
        }
    }

    public final void m() {
        lrt lrtVar;
        lro lroVar = this.D;
        if (lroVar == null) {
            return;
        }
        long j = 0;
        this.ap = 0L;
        lru I = lroVar.n(17) ? lroVar.I() : lru.a;
        if (!I.q()) {
            int aI = lroVar.aI();
            int i = aI;
            while (true) {
                if (i > aI) {
                    break;
                }
                if (i == aI) {
                    this.ap = lvf.z(j);
                }
                I.p(i, this.y);
                lrt lrtVar2 = this.y;
                if (lrtVar2.m == -9223372036854775807L) {
                    lti.c(true);
                    break;
                }
                int i2 = lrtVar2.n;
                while (true) {
                    lrtVar = this.y;
                    if (i2 <= lrtVar.o) {
                        I.n(i2, this.S);
                        this.S.j();
                        this.S.m();
                        i2++;
                    }
                }
                j += lrtVar.m;
                i++;
            }
        } else if (lroVar.n(16)) {
            long c = lroVar.c();
            if (c != -9223372036854775807L) {
                j = lvf.u(c);
            }
        }
        TextView textView = this.Q;
        long z = lvf.z(j);
        if (textView != null) {
            textView.setText(lvf.J(this.w, this.x, z));
        }
        nwj nwjVar = this.R;
        if (nwjVar != null) {
            nwjVar.f(z);
            int length = this.an.length;
            long[] jArr = this.al;
            if (jArr.length < 0) {
                this.al = Arrays.copyOf(jArr, 0);
                this.am = Arrays.copyOf(this.am, 0);
            }
            System.arraycopy(this.an, 0, this.al, 0, 0);
            System.arraycopy(this.ao, 0, this.am, 0, 0);
            this.R.d(this.al, this.am, 0);
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        this.e.I();
        this.f.I();
        lro lroVar = this.D;
        if (lroVar != null && lroVar.n(30) && this.D.n(29)) {
            lsb K = this.D.K();
            num numVar = this.f;
            engw r = r(K, 1);
            numVar.d = r;
            lro lroVar2 = numVar.a.D;
            lti.f(lroVar2);
            lrz J2 = lroVar2.J();
            if (!r.isEmpty()) {
                if (numVar.G(J2)) {
                    int i = 0;
                    while (true) {
                        if (i >= ((enou) r).c) {
                            break;
                        }
                        nuw nuwVar = (nuw) r.get(i);
                        if (nuwVar.a()) {
                            numVar.a.c.m(1, nuwVar.c);
                            break;
                        }
                        i++;
                    }
                } else {
                    nva nvaVar = numVar.a;
                    nvaVar.c.m(1, nvaVar.getResources().getString(R.string.exo_track_selection_auto));
                }
            } else {
                nva nvaVar2 = numVar.a;
                nvaVar2.c.m(1, nvaVar2.getResources().getString(R.string.exo_track_selection_none));
            }
            if (this.a.m(this.p)) {
                this.e.G(r(K, 3));
            } else {
                nuv nuvVar = this.e;
                int i2 = engw.d;
                nuvVar.G(enou.a);
            }
        }
        t(this.e.a() > 0, this.p);
        u();
    }

    public final boolean o(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        lro lroVar = this.D;
        if (lroVar == null) {
            return false;
        }
        int i = 89;
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
            if (lroVar.u() == 4 || !lroVar.n(12)) {
                return true;
            }
            lroVar.g();
            return true;
        }
        if (keyCode != 89) {
            i = keyCode;
        } else if (lroVar.n(11)) {
            lroVar.f();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (i == 79 || i == 85) {
            lvf.al(lroVar, this.F);
            return true;
        }
        if (i == 87) {
            if (!lroVar.n(9)) {
                return true;
            }
            lroVar.j();
            return true;
        }
        if (i == 88) {
            if (!lroVar.n(7)) {
                return true;
            }
            lroVar.k();
            return true;
        }
        if (i == 126) {
            lvf.ap(lroVar);
            return true;
        }
        if (i != 127) {
            return true;
        }
        lvf.ao(lroVar);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nvx nvxVar = this.a;
        nvxVar.a.addOnLayoutChangeListener(nvxVar.q);
        this.aj = true;
        if (p()) {
            this.a.i();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nvx nvxVar = this.a;
        nvxVar.a.removeOnLayoutChangeListener(nvxVar.q);
        this.aj = false;
        removeCallbacks(this.T);
        this.a.h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final boolean p() {
        nvx nvxVar = this.a;
        return nvxVar.s == 0 && nvxVar.a.q();
    }

    public final boolean q() {
        return getVisibility() == 0;
    }
}
