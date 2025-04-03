package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioManager;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.compose.ui.platform.ComposeView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import com.google.android.material.snackbar.Snackbar;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxvv implements TextView.OnEditorActionListener, TextWatcher, CompoundButton.OnCheckedChangeListener, bcvm, czha, cylv, ugj {
    public static final cskc a = cskc.g("Bugle", "ComposeMessageView");
    public Optional A;

    @Deprecated
    public bcpw C;
    public Boolean I;
    public final ffbr L;
    public final ffbr M;
    public final ffbr N;
    public final ffbr O;
    public final ffbr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public final ffbr Y;
    public final ffbr Z;
    private final ffbr aA;
    private final ffbr aB;
    private final ffbr aC;
    private final ffbr aD;
    private final ffbr aE;
    private final ffbr aF;
    private final ffbr aG;
    private final ffbr aH;
    private final ffbr aI;
    private final ffbr aJ;
    private final ffbr aK;
    private final ffbr aL;
    private final azbq aM;
    private final View.OnLayoutChangeListener aN;
    public final ffbr aa;
    public final ffbr ab;
    public final ffbr ac;
    public final ffbr ad;
    public final ffbr ae;
    public final ffbr af;
    public final fazb ag;
    public final ffbr ah;
    public final ffbr ai;
    public final ffbr aj;
    public final ffbr ak;
    public final ffbr al;
    public final ffbr am;
    public final ComposeMessageView an;
    public final ffbr ao;
    public final ffbr ap;
    public final ffbr ar;
    public cynb as;
    private final ffbr av;
    public CheckBox b;
    public TextView c;
    public LinearLayout d;
    public AttachmentsContainer e;
    public cxxs f;
    public cxsr g;

    @Deprecated
    ConstraintLayout h;
    public ViewGroup i;
    public cylx j;
    public final Context k;
    public cxsy l;
    public PlainTextEditText m;
    public PlainTextEditText n;
    public EditText o;
    public TextView q;
    public TextView r;
    public View s;
    public AsyncImageView t;
    public View u;
    public ImageButton v;
    public crly w;
    public bcxr y;
    public bdtd z;
    private long au = 0;
    public Optional p = Optional.empty();
    private Optional aw = Optional.empty();
    private Optional ax = Optional.empty();
    public boolean B = false;
    private boolean ay = false;
    private boolean az = true;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public Optional H = Optional.empty();
    public boolean J = true;
    public eisx K = null;
    public Optional aq = Optional.empty();
    public final Runnable at = new cxvu(this);
    public final bcpt x = new bcpt();

    public cxvv(ComposeMessageView composeMessageView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, Context context, ffbr ffbrVar28, fazb fazbVar, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, azbq azbqVar, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43) {
        this.an = composeMessageView;
        this.aA = ffbrVar;
        this.aB = ffbrVar2;
        this.L = ffbrVar3;
        this.M = ffbrVar4;
        this.aC = ffbrVar5;
        this.N = ffbrVar6;
        this.O = ffbrVar7;
        this.P = ffbrVar8;
        this.Q = ffbrVar9;
        this.R = ffbrVar10;
        this.aD = ffbrVar11;
        this.S = ffbrVar12;
        this.T = ffbrVar13;
        this.U = ffbrVar14;
        this.V = ffbrVar15;
        this.W = ffbrVar16;
        this.X = ffbrVar17;
        this.Y = ffbrVar18;
        this.Z = ffbrVar19;
        this.aa = ffbrVar20;
        this.aE = ffbrVar21;
        this.ab = ffbrVar22;
        this.aF = ffbrVar23;
        this.ac = ffbrVar24;
        this.ad = ffbrVar25;
        this.aG = ffbrVar26;
        this.af = ffbrVar27;
        this.k = context;
        this.aH = ffbrVar28;
        this.ag = fazbVar;
        this.ah = ffbrVar29;
        this.av = ffbrVar30;
        this.aI = ffbrVar31;
        this.ai = ffbrVar32;
        this.aJ = ffbrVar33;
        this.aj = ffbrVar34;
        this.ak = ffbrVar35;
        this.al = ffbrVar36;
        this.aK = ffbrVar37;
        this.aL = ffbrVar38;
        this.ae = ffbrVar39;
        this.aM = azbqVar;
        this.ao = ffbrVar40;
        this.ap = ffbrVar41;
        this.am = ffbrVar42;
        this.ar = ffbrVar43;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: cxtd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, final int i2, int i3, int i4, int i5, final int i6, int i7, int i8) {
                final cxvv cxvvVar = cxvv.this;
                cxvvVar.an.post(new Runnable() { // from class: cxur
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxvv cxvvVar2 = cxvv.this;
                        if (cxvvVar2.x.g()) {
                            int i9 = i6;
                            int i10 = i2;
                            if (i10 <= 0 && i9 > 0) {
                                cxvv.a.q("Hiding attachment container and subject view.");
                                cxvvVar2.e.H().f();
                                if (cxvvVar2.n.hasFocus()) {
                                    cxvvVar2.A();
                                    return;
                                } else {
                                    cxvvVar2.y();
                                    return;
                                }
                            }
                            if (i9 > cxvvVar2.e() || i10 <= cxvvVar2.e()) {
                                return;
                            }
                            if (cxvvVar2.ac()) {
                                cxvv.a.q("Showing subject view.");
                                cxvvVar2.O(false);
                            }
                            if (cxvvVar2.x.g() && bcyp.a((bcvr) cxvvVar2.x.a())) {
                                cxvv.a.q("Showing attachment container.");
                                cxvvVar2.e.H().j();
                            }
                        }
                    }
                });
            }
        };
        this.aN = onLayoutChangeListener;
        composeMessageView.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    private final cwpv al() {
        Context context = this.k;
        if (context instanceof cwpv) {
            return (cwpv) context;
        }
        return null;
    }

    private final void am() {
        long j = this.au;
        if (j == 0) {
            j = fdlk.b();
            this.au = j;
        }
        efbd.d(this.at, j);
    }

    private final boolean an() {
        return this.s.getVisibility() == 0 && !this.B;
    }

    public final void A() {
        y();
        this.m.requestFocus();
    }

    public final void B(Drawable drawable) {
        if (drawable != null) {
            this.t.setBackground(drawable);
        }
    }

    public final void C(boolean z) {
        if (z == this.ay) {
            return;
        }
        this.ay = z;
        if (z) {
            S();
        } else {
            this.l.a(null);
        }
    }

    public final void D() {
        R();
        U();
    }

    final void E() {
        cylx cylxVar = this.j;
        if (cylxVar != null) {
            cylxVar.T(new Consumer() { // from class: cxve
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = cxvv.a;
                    ((ugg) obj).r(ugo.IME, true, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: cxvf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    if (czgjVar != null) {
                        cxvv cxvvVar = cxvv.this;
                        czgjVar.A(1);
                        cxvvVar.S();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    final void F() {
        ekzz f = eleg.f("ComposeMessageViewPeerDelegate#playSentSound");
        try {
            if (((ctyx) this.M.b()).q(this.k.getString(R.string.send_sound_pref_key), this.k.getResources().getBoolean(R.bool.send_sound_pref_default)) && (this.av.b() == null || ((AudioManager) this.av.b()).getRingerMode() != 0)) {
                ((ctdb) this.aB.b()).a(this.k);
            }
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

    @Override // defpackage.czha
    public final void G(boolean z) {
        throw null;
    }

    final void H() {
        CheckBox checkBox;
        int b;
        Drawable drawable;
        if (this.c == null || (checkBox = this.b) == null) {
            return;
        }
        if (checkBox.isChecked()) {
            b = ehdr.b(this.c, R.attr.colorActiveComposeIcon);
            drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_grey600_24);
        } else {
            b = ehdr.b(this.c, R.attr.colorInactiveComposeIcon);
            drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_outline_blank_grey600_24);
        }
        this.c.setTextColor(b);
        this.b.setButtonDrawable(ctap.j(this.k, drawable, b));
    }

    public final void I() {
        crly crlyVar = this.w;
        if (crlyVar != null) {
            crlyVar.d(new Consumer() { // from class: cxvd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = cxvv.a;
                    ((ComposeView) obj).setVisibility(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Deprecated
    final void J() {
        this.m.requestFocus();
    }

    public final void K() {
        ((Optional) this.aG.b()).ifPresent(new Consumer() { // from class: cxvg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cyne) obj).a(cxvv.this.m, R.dimen.conversation_compose2o_send_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.aG.b()).ifPresent(new Consumer() { // from class: cxvo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cyne) obj).a(cxvv.this.n, R.dimen.conversation_compose2o_subject_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void L(int i) {
        LayerDrawable layerDrawable = (LayerDrawable) this.i.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColor(i);
        layerDrawable.getDrawable(0).setAlpha(0);
    }

    @Override // defpackage.czha
    public final void M(int i) {
        throw null;
    }

    final void N(boolean z) {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    final void O(boolean z) {
        LinearLayout linearLayout;
        if (this.u.getVisibility() == 0 || !W()) {
            return;
        }
        this.u.setVisibility(0);
        if (i().y() && (linearLayout = this.d) != null && linearLayout.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        if (z && this.n.requestFocus() && crnx.j(this.k)) {
            this.an.getHandler().postDelayed(new cxvt(this), 500L);
        }
    }

    public final void P(SelfIdentityId selfIdentityId, int i) {
        ((bcvr) this.x.a()).T(selfIdentityId, i);
    }

    @Deprecated
    public final void Q(String str) {
        if (ag()) {
            return;
        }
        a.r(str.concat(": couldn't convert draft: keeping as prior type"));
    }

    public final void R() {
        T(null);
    }

    @Override // defpackage.czha
    public final void S() {
        cylx cylxVar = this.j;
        if (cylxVar != null) {
            cylxVar.T(new Consumer() { // from class: cxvk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cxvv.this.l.a(((ugg) obj).c());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: cxvl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ugo ugoVar;
                    czgj czgjVar = (czgj) obj;
                    if (czgjVar == null) {
                        return;
                    }
                    cxvv cxvvVar = cxvv.this;
                    if (((dede) cxvvVar.ad.b()).b) {
                        ugoVar = ugo.IME;
                    } else {
                        czfx czfxVar = czgjVar.h;
                        ugoVar = (czfxVar != null && czfxVar.q && czfxVar.c) ? ugo.CAMERA_GALLERY : czgjVar.z() ? ugo.EMOTIVE : czgjVar.g() ? ugo.C2O : null;
                    }
                    cxvvVar.l.a(ugoVar);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    final void T(Integer num) {
        int e;
        if (this.F) {
            return;
        }
        if (num != null && num.intValue() > 0) {
            this.ax = Optional.of(num);
            csjb a2 = a.a();
            a2.I("Compose");
            a2.A("numberOfParticipantsExcludeSelf", num);
            a2.r();
        }
        bcvr bcvrVar = (bcvr) this.x.a();
        if (bcvrVar.h) {
            try {
                if (((bzqa) this.aj.b()).i()) {
                    boolean equals = eoks.CONVERSATION_TYPE_GROUP_RCS.equals(bcvrVar.y());
                    e = ((ckds) this.aC.b()).e(equals);
                    if (bcvrVar.j) {
                        if (equals && this.ax.isPresent()) {
                            bzqa bzqaVar = (bzqa) this.aj.b();
                            ((Integer) this.ax.get()).intValue();
                            e = bzqaVar.u(e);
                        } else {
                            e = ((bzqa) this.aj.b()).a(e);
                        }
                    }
                } else {
                    e = ((ckds) this.aC.b()).e(!this.j.bh());
                    if (bcvrVar.j) {
                        e = ((bzqa) this.aj.b()).a(e);
                    }
                }
                this.m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(e)});
            } catch (ehxg e2) {
                a.s("exception getting max RCS text length", e2);
            }
        } else if (!this.F) {
            cpbn i = i();
            this.m.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i.f())});
            this.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i.e())});
            if (i.y()) {
                this.v.setContentDescription(this.k.getString(R.string.delete_subject_and_reset_message_priority_content_description));
            } else {
                this.v.setContentDescription(this.k.getString(R.string.delete_subject_content_description));
            }
        }
        this.aq = DesugarArrays.stream(this.m.getFilters()).filter(new Predicate() { // from class: cxui
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cskc cskcVar = cxvv.a;
                return ((InputFilter) obj) instanceof InputFilter.LengthFilter;
            }
        }).map(new Function() { // from class: cxuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = cxvv.a;
                return (InputFilter.LengthFilter) ((InputFilter) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: cxul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((InputFilter.LengthFilter) obj).getMax());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).min(Comparator.CC.naturalOrder());
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void U() {
        boolean z;
        String d;
        View.AccessibilityDelegate a2;
        View.AccessibilityDelegate accessibilityDelegate;
        String str;
        ekzz f = eleg.f("ComposeMessageViewPeer#updateVisualsOnDraftChanged");
        try {
            CharSequence l = l();
            bcvr bcvrVar = (bcvr) this.x.a();
            String c = bcvrVar.c();
            String d2 = bcvrVar.d();
            if (!TextUtils.equals(l, c)) {
                bcvrVar.S(l.toString());
            }
            CharSequence m = m();
            if (!TextUtils.equals(m, d2)) {
                bcvrVar.R(m.toString());
            }
            boolean Y = Y();
            if (Y != bcvrVar.n) {
                bcvrVar.n = Y;
            }
            if (ac()) {
                O(false);
            } else if (bcvrVar.h && this.u.getVisibility() == 0) {
                A();
            }
            int a3 = bcvrVar.x.a();
            int i = bcvrVar.x.a.get();
            if (!bcvrVar.ag() || (a3 <= 1 && i > 10)) {
                this.q.setVisibility(8);
                if (this.t.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
                    marginLayoutParams.topMargin = 0;
                    this.t.setLayoutParams(marginLayoutParams);
                }
            } else {
                Locale c2 = ctid.c(this.k);
                this.q.setText(a3 > 1 ? String.format(c2, "%d / %d", Integer.valueOf(i), Integer.valueOf(a3)) : String.format(c2, "%d", Integer.valueOf(i)));
                this.q.setVisibility(0);
                if (this.t.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
                    marginLayoutParams2.topMargin = this.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_margin_top);
                    this.t.setLayoutParams(marginLayoutParams2);
                }
            }
            boolean an = an();
            cxsy cxsyVar = this.l;
            int m2 = bcvrVar.m();
            boolean k = cxsyVar.b.k();
            boolean m3 = cxsyVar.b.m();
            String str2 = "";
            if (k || !m3) {
                cxvv cxvvVar = ((cxtc) cxsyVar.b).c;
                Drawable m4 = cxvvVar.aa() ? ((cxqh) cxvvVar.W.b()).m(cxvvVar.k, m2, true) : ((cxqh) cxvvVar.W.b()).m(cxvvVar.k, m2, false);
                m4.setAutoMirrored(true);
                Drawable background = cxvvVar.t.getBackground();
                AsyncImageView asyncImageView = cxvvVar.t;
                asyncImageView.d(null);
                asyncImageView.setImageDrawable(m4);
                cxvvVar.B(background);
                if (bcvr.p(m2) != 3) {
                    cxsyVar.b.j(true);
                    cxtb cxtbVar = cxsyVar.b;
                    cxsw cxswVar = cxsyVar.c;
                    ((cxtc) cxtbVar).c.r.setText((m2 == 10 || m2 == 11) ? cxswVar.d(R.string.sms_text) : m2 != 20 ? "" : cxswVar.d(R.string.mms_text));
                } else {
                    cxsyVar.b.j(false);
                }
                cxvv cxvvVar2 = ((cxtc) cxsyVar.b).c;
                TextView textView = cxvvVar2.r;
                int[][] iArr = {new int[]{-16842910}, StateSet.WILD_CARD};
                Context context = cxvvVar2.k;
                textView.setTextColor(new ColorStateList(iArr, new int[]{context.getColor(R.color.c2o_send_button_disabled_color_m2), cxqh.h(context)}));
                z = false;
                cxsyVar.b.i(false);
            } else {
                cxsyVar.b.j(false);
                cxvv cxvvVar3 = ((cxtc) cxsyVar.b).c;
                bcxq h = cxvvVar3.h();
                if (h != null) {
                    int dimensionPixelSize = cxvvVar3.an.getResources().getDimensionPixelSize(R.dimen.conversation_compose_sim_selector_size);
                    cbbi c3 = ((crpr) cxvvVar3.L.b()).c(h.c(), dimensionPixelSize, dimensionPixelSize, 0, true);
                    Drawable background2 = cxvvVar3.t.getBackground();
                    cxvvVar3.t.d(c3);
                    cxvvVar3.B(background2);
                }
                cxsyVar.b.i(true);
                z = false;
            }
            cxvv cxvvVar4 = ((cxtc) cxsyVar.b).c;
            if (cxvvVar4.E) {
                cxxs cxxsVar = cxvvVar4.f;
                cxxsVar.j = cxxsVar.a.H().m();
                cxvvVar4.f.b();
            }
            cxtb cxtbVar2 = cxsyVar.b;
            if (k || m3) {
                z = true;
            }
            cxvv cxvvVar5 = ((cxtc) cxtbVar2).c;
            cxvvVar5.t.setEnabled(z);
            cxvvVar5.r.setEnabled(z);
            cxsy cxsyVar2 = this.l;
            if (cxsyVar2.b.l()) {
                str = cxsyVar2.c.e(R.string.sim_selector_button_content_description_with_selection, emxe.b(cxsyVar2.b.g()));
                accessibilityDelegate = cxsyVar2.c.a();
            } else {
                int m5 = bcvrVar.m();
                cxsw cxswVar2 = cxsyVar2.c;
                if (m5 == 10) {
                    d = cxswVar2.d(R.string.send_button_sms_content_description);
                } else if (m5 != 20) {
                    bzyb bzybVar = cxswVar2.e;
                    d = cxswVar2.d(R.string.send_button_content_description);
                    if (m5 == 40 && bzwd.f()) {
                        d = bzybVar.a.getString(R.string.send_encrypted_button_content_description);
                    }
                } else {
                    d = cxswVar2.d(R.string.send_button_mms_content_description);
                }
                cxsw cxswVar3 = cxsyVar2.c;
                if (((Boolean) ((cfup) cxsw.a.get()).e()).booleanValue() && ((Boolean) cnvu.a.e()).booleanValue()) {
                    cxswVar3.d.isPresent();
                    a2 = cxswVar3.b();
                } else {
                    a2 = m5 == 30 ? cxswVar3.a() : cxswVar3.c();
                }
                String str3 = d;
                accessibilityDelegate = a2;
                str = str3;
            }
            ((cxtc) cxsyVar2.b).c.t.setContentDescription(str);
            ((cxtc) cxsyVar2.b).c.t.setAccessibilityDelegate(accessibilityDelegate);
            cxsy cxsyVar3 = this.l;
            if (!TextUtils.isEmpty(bcvrVar.l)) {
                cxsyVar3.b.h("");
            } else if (bcvrVar.s.isEmpty()) {
                String g = cxsyVar3.b.g();
                int m6 = bcvrVar.m();
                if (g == null) {
                    cxsw cxswVar4 = cxsyVar3.c;
                    boolean c4 = ddzd.c(cxswVar4.b);
                    if (m6 != 10) {
                        if (m6 == 11) {
                            str2 = c4 ? cxswVar4.d(R.string.compose_message_view_sms_mms_small_screen_hint_text) : cxswVar4.d(R.string.compose_message_view_sms_broadcast_hint_text);
                        } else if (m6 != 20) {
                            str2 = c4 ? cxswVar4.d(R.string.compose_message_view_small_screen_hint_text_v2) : cxswVar4.d(R.string.compose_message_view_hint_text_v2);
                        }
                    }
                    str2 = c4 ? cxswVar4.d(R.string.compose_message_view_sms_mms_small_screen_hint_text) : cxswVar4.d(R.string.compose_message_view_sms_mms_hint_text);
                } else {
                    cxsw cxswVar5 = cxsyVar3.c;
                    boolean c5 = ddzd.c(cxswVar5.b);
                    if (m6 == 10 || m6 == 11 || m6 == 20) {
                        str2 = c5 ? cxswVar5.d(R.string.compose_message_view_sms_mms_small_screen_hint_text) : cxswVar5.e(R.string.compose_message_view_hint_text_multi_sim_sms_mms, g);
                    } else if (m6 == 30 || m6 == 40) {
                        str2 = c5 ? cxswVar5.d(R.string.compose_message_view_small_screen_hint_text_v2) : cxswVar5.e(R.string.compose_message_view_hint_text_multi_sim_rcs_v2, g);
                    }
                }
                cxsyVar3.b.h(str2);
                if (m6 != 30 && m6 != 40) {
                    if (m6 != 10 && m6 != 20 && m6 != 11) {
                        cxsyVar3.g.b(new IllegalStateException("Draft message is of unknown type"));
                    }
                    if (cxsyVar3.h.isEmpty()) {
                        cxsyVar3.h = Optional.of(cxsyVar3.e.f());
                    }
                }
                if (cxsyVar3.h.isPresent() && !cxsyVar3.i) {
                    final cxxv cxxvVar = cxsyVar3.f;
                    final Duration between = Duration.between(cxsyVar3.h.get(), cxsyVar3.e.f());
                    elfo.f(new Runnable() { // from class: cxxu
                        @Override // java.lang.Runnable
                        public final void run() {
                            ezkg ezkgVar = (ezkg) ezkh.a.createBuilder();
                            eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
                            int nanos = (int) between.toNanos();
                            eyeuVar.copyOnWrite();
                            ((eyev) eyeuVar.instance).c = nanos;
                            ezkgVar.copyOnWrite();
                            ezkh ezkhVar = (ezkh) ezkgVar.instance;
                            eyev eyevVar = (eyev) eyeuVar.build();
                            eyevVar.getClass();
                            ezkhVar.c = eyevVar;
                            ezkhVar.b |= 1;
                            cxxv cxxvVar2 = cxxv.this;
                            eqyl a4 = ((avkk) cxxvVar2.b.b()).a();
                            ezkgVar.copyOnWrite();
                            ezkh ezkhVar2 = (ezkh) ezkgVar.instance;
                            ezkhVar2.d = a4.h;
                            ezkhVar2.b |= 2;
                            akxl akxlVar = (akxl) cxxvVar2.a.b();
                            eolu eoluVar = (eolu) eolv.a.createBuilder();
                            eolt eoltVar = eolt.COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT;
                            eoluVar.copyOnWrite();
                            eolv eolvVar = (eolv) eoluVar.instance;
                            eolvVar.j = eoltVar.dk;
                            eolvVar.b |= 1;
                            eoluVar.copyOnWrite();
                            eolv eolvVar2 = (eolv) eoluVar.instance;
                            ezkh ezkhVar3 = (ezkh) ezkgVar.build();
                            ezkhVar3.getClass();
                            eolvVar2.bc = ezkhVar3;
                            eolvVar2.e |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                            akxlVar.j(eoluVar);
                        }
                    }, cxxvVar.d).k(axnw.b(), cxxvVar.c);
                    cxsyVar3.i = true;
                }
            } else {
                cxsyVar3.b.h(cxsyVar3.c.d(R.string.compose_message_view_hint_text_with_attachment));
            }
            L(cxry.a(this.h, bcvrVar.m()));
            boolean an2 = an();
            if (an != an2 && ((Boolean) cnvu.a.e()).booleanValue()) {
                if (an2) {
                    ((adsd) this.af.b()).a(20);
                } else {
                    w();
                }
            }
            cylx cylxVar = this.j;
            if (cylxVar != null) {
                ((vvn) cylxVar).bo();
            }
            f.close();
        } finally {
        }
    }

    final void V() {
        bcxq h = h();
        if (h != null) {
            P(h.e(), h.b());
        }
    }

    final boolean W() {
        if (((bcvr) this.x.a()).h) {
            return false;
        }
        return !((ddzb) this.Z.b()).n() || e() < this.an.getTop();
    }

    @Override // defpackage.czha
    public final void X() {
        throw null;
    }

    final boolean Y() {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    final boolean Z() {
        return this.x.g() && bcyp.a((bcvr) this.x.a());
    }

    @Override // defpackage.ugj
    public final void a(ugo ugoVar) {
        this.l.a(null);
    }

    final boolean aa() {
        return ((Boolean) cnvu.a.e()).booleanValue() && k().isPresent();
    }

    final boolean ab() {
        return TextUtils.getTrimmedLength(m()) > 0;
    }

    final boolean ac() {
        if (!TextUtils.isEmpty(m()) || Y()) {
            return true;
        }
        return this.D && !((bcvr) this.x.a()).h;
    }

    public final boolean ad() {
        return ((Boolean) cful.p.e()).booleanValue() && ((Boolean) cful.ap.e()).booleanValue() && ((Optional) this.aJ.b()).isPresent();
    }

    public final boolean ae() {
        return this.p.isPresent();
    }

    final boolean af() {
        bcxr bcxrVar = this.y;
        return bcxrVar != null && bcxrVar.a.size() > 1;
    }

    @Deprecated
    public final boolean ag() {
        try {
            boolean z = false;
            if (((bcvr) this.x.a()).ae() && this.az) {
                z = true;
            }
            a.m(a.q(z, "isRcsSendingEnabled in compose view: "));
            return ((bcvr) this.x.a()).ai(z);
        } finally {
            R();
            U();
        }
    }

    @Deprecated
    public final boolean ah(bcvr bcvrVar) {
        bcqs bcqsVar = (bcqs) this.C.a();
        boolean z = this.az;
        if (bcqsVar.d.A() || bcqsVar.p()) {
            this.az = true;
            return !z;
        }
        ParticipantsTable.BindData a2 = bcqsVar.g.a();
        if (a2 != null && !bdqv.d(a2)) {
            boolean j = this.aM.a(((aolr) this.aL.b()).q(a2)).j();
            boolean f = ((aqgi) this.aF.b()).f(bcvrVar.z());
            this.az = bcvrVar.aj(j) && !f;
            csjb a3 = a.a();
            a3.B("isRcsDisabledForPreUpRecipient", f);
            a3.B("isRcsDraftSupported", this.az);
            a3.r();
            if (z != this.az) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final void ai(final boolean z, boolean z2, final int i) {
        ekzz f = eleg.f("ComposeMessageViewPeerDelegate::processOutgoingMessageInternal");
        try {
            final fjay a2 = cslr.a();
            if (i == 1) {
                ((cpev) this.al.b()).e(cpeu.SEND_BUTTON_ACCURATE, a2.b);
                ((cpev) this.al.b()).e(cpeu.NOTIFICATION, a2.b);
            }
            bcvr bcvrVar = (bcvr) this.x.a();
            if (!ad()) {
                bcvrVar.Q(this.H);
            }
            cskc cskcVar = a;
            cskcVar.p(a.G(bcvrVar.e, "UI initiated outgoing message processing in conversation "));
            if (bcvrVar.aa()) {
                cskcVar.r("Message can't be sent or scheduled: still checking draft");
            } else if (this.j.bj()) {
                final long epochMilli = ((cqoh) this.Q.b()).f().toEpochMilli();
                final long a3 = ((cqoh) this.Q.b()).a();
                if (i - 1 != 0) {
                    this.aw = k();
                } else {
                    ((altk) this.aD.b()).ah(bcvrVar.o());
                }
                x();
                V();
                String charSequence = l().toString();
                String charSequence2 = m().toString();
                boolean Y = Y();
                bcvrVar.S(charSequence);
                bcvrVar.R(charSequence2);
                bcvrVar.n = Y;
                ParticipantsTable.BindData a4 = ((bcqs) this.C.a()).g.a();
                aoku q = a4 == null ? null : ((aolr) this.aL.b()).q(a4);
                cfva cfvaVar = aoqm.a;
                bcvrVar.k = ((Boolean) new aopg().get()).booleanValue() ? ((Boolean) Optional.ofNullable(q).map(new Function() { // from class: cxtz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((aoku) obj).v());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue() : ((ctvb) this.aE.b()).H(((bcqs) this.C.a()).m());
                ((bbbr) this.aI.b()).c(a2, null, 36, Optional.of(fgjz.BUGLE_SENDING_INTERNAL_STATUS_VERIFYING_MESSAGE));
                bcvrVar.F(z, z2, this.j.a(), new bcvk() { // from class: cxuk
                    @Override // defpackage.bcvk
                    public final void a(bcvr bcvrVar2, bcvq bcvqVar) {
                        cxvv cxvvVar = cxvv.this;
                        cxvvVar.x.e(bcvrVar2);
                        boolean z3 = z;
                        switch (bcvqVar) {
                            case PASSED:
                                cxvvVar.aj(epochMilli, a3, i, a2);
                                break;
                            case HAS_PENDING_ATTACHMENTS:
                                ((ddzb) cxvvVar.Z.b()).k(R.string.cant_send_message_while_loading_attachments);
                                break;
                            case NO_SELF_PHONE_NUMBER_IN_GROUP_MMS:
                                cxvvVar.j.ap(true);
                                break;
                            case MESSAGE_OVER_LIMIT:
                                emxf.a(z3);
                                cxvvVar.j.aT(bcvrVar2, true, false);
                                break;
                            case VIDEO_ATTACHMENT_LIMIT_EXCEEDED:
                                emxf.a(z3);
                                cxvvVar.j.aT(bcvrVar2, true, true);
                                break;
                            case SIM_NOT_READY:
                                ((ddzb) cxvvVar.Z.b()).k(R.string.cant_send_message_without_active_subscription);
                                break;
                            case NEED_TO_CONFIRM_SMS_ENCODING:
                                cxvvVar.j.R();
                                break;
                            case RCS_DISABLED:
                                ((ddzb) cxvvVar.Z.b()).k(R.string.cant_send_rcs_message_when_rcs_disabled_v2);
                                break;
                            case MMS_WHEN_MASS_SMS:
                                ((ddzb) cxvvVar.Z.b()).k(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
                                break;
                            case SIM_CANT_SEND_MMS:
                                int b = ((ctwb) cxvvVar.R.b()).b();
                                int q2 = ((bcvr) cxvvVar.x.a()).q();
                                emxf.a(b != q2);
                                ddxs.b(cxvvVar.j.p(), ((ctwb) cxvvVar.R.b()).h(q2).r(), ((ctwb) cxvvVar.R.b()).h(b).r(), true);
                                break;
                            case MMS_DISABLED:
                                ((ddzb) cxvvVar.Z.b()).h(R.string.mms_failure_outgoing_disabled);
                                break;
                            case EXCEEDS_SMS_MESSAGE_LENGTH_TO_EMERGENCY_NUMBER:
                                cxvvVar.j.aU();
                                break;
                            case IS_REPLY_WITHOUT_RCS:
                                Snackbar q3 = Snackbar.q(cxvvVar.m, R.string.error_text_draft_is_reply_without_rcs_v2, 0);
                                q3.w(android.R.string.ok, new View.OnClickListener() { // from class: cxub
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        cskc cskcVar2 = cxvv.a;
                                    }
                                });
                                q3.i();
                                break;
                            case IS_REPLY_TO_MISSING_MESSAGE:
                                Snackbar q4 = Snackbar.q(cxvvVar.m, R.string.error_text_draft_is_reply_to_missing_message, 0);
                                q4.w(android.R.string.ok, new View.OnClickListener() { // from class: cxuc
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        cskc cskcVar2 = cxvv.a;
                                    }
                                });
                                q4.i();
                                break;
                            default:
                                csjb b2 = cxvv.a.b();
                                b2.A("Unhandled precondition", bcvqVar);
                                b2.r();
                                break;
                        }
                    }
                }, this.x);
                emxf.a(!charSequence.equals("assert-on-send"));
            } else {
                ((deaj) this.aH.b()).a();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Deprecated
    public final void aj(final long j, long j2, int i, fjay fjayVar) {
        fjay fjayVar2;
        if (fjayVar == null) {
            ffbr ffbrVar = this.al;
            fjayVar2 = cslr.a();
            ((cpev) ffbrVar.b()).e(cpeu.SEND_BUTTON_ACCURATE, fjayVar2.b);
            ((cpev) this.al.b()).e(cpeu.NOTIFICATION, fjayVar2.b);
        } else {
            fjayVar2 = fjayVar;
        }
        bcvr bcvrVar = (bcvr) this.x.a();
        this.e.H();
        int o = cxnk.o(bcvrVar);
        this.e.H();
        int p = cxnk.p(bcvrVar);
        this.j.T(new Consumer() { // from class: cxtx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ugg) obj).j();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, null);
        MessageCoreData v = bcvrVar.v(j);
        if (v.co()) {
            v.bW(fjayVar2);
            F();
            Optional map = bcvrVar.p.map(new Function() { // from class: cxty
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = cxvv.a;
                    return Long.valueOf(Duration.between((Instant) obj, Instant.ofEpochMilli(j)).toMillis());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (((Boolean) cjja.a.e()).booleanValue() && !v.aH().isEmpty()) {
                if (this.K == null) {
                    throw new IllegalStateException("Sign-in is required for Google Photos usage");
                }
                cjhq cjhqVar = (cjhq) cjia.a.createBuilder();
                cjhx cjhxVar = (cjhx) cjhy.a.createBuilder();
                int a2 = this.K.a();
                cjhxVar.copyOnWrite();
                cjhy cjhyVar = (cjhy) cjhxVar.instance;
                cjhyVar.b |= 1;
                cjhyVar.c = a2;
                cjhy cjhyVar2 = (cjhy) cjhxVar.build();
                cjhqVar.copyOnWrite();
                cjia cjiaVar = (cjia) cjhqVar.instance;
                cjhyVar2.getClass();
                cjiaVar.c = cjhyVar2;
                cjiaVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                ((MessageData) v).q = (cjia) cjhqVar.build();
            }
            if (i - 1 == 0) {
                altk altkVar = (altk) this.aD.b();
                bcvrVar.y();
                altkVar.aM();
                this.j.aw(v, j, j2, false, map, Optional.of(Boolean.valueOf(bcvrVar.q)));
            } else {
                if (!this.aw.isPresent() || !ae()) {
                    throw new IllegalStateException("Cannot schedule message with empty scheduled time.");
                }
                this.j.as(v, (Instant) this.aw.get());
                this.aw = Optional.empty();
                s();
            }
            I();
            A();
            if (!((ctyx) this.M.b()).q("save_original_media_toast_msg_showed", false)) {
                if (o + p > 0) {
                    String string = this.k.getResources().getString(R.string.app_name);
                    Resources resources = this.k.getResources();
                    if (o > 0 && p > 0) {
                        ((ddzb) this.Z.b()).l(resources.getString(R.string.original_media_saved_info, resources.getQuantityString(R.plurals.original_image_plural_info, o, Integer.valueOf(o)), resources.getQuantityString(R.plurals.original_video_plural_info, p, Integer.valueOf(p)), string));
                    } else if (o > 0) {
                        ((ddzb) this.Z.b()).l(resources.getQuantityString(R.plurals.original_images_only_saved_info, o, Integer.valueOf(o), string));
                    } else {
                        ((ddzb) this.Z.b()).l(resources.getQuantityString(R.plurals.original_videos_only_saved_info, p, Integer.valueOf(p), string));
                    }
                }
                ((ctyx) this.M.b()).h("save_original_media_toast_msg_showed", true);
            }
            if (ag()) {
                return;
            }
            a.r("cannot set draft RCS status");
        }
    }

    public final void ak(boolean z) {
        wdm B;
        cylx cylxVar = this.j;
        if (cylxVar == null || !af() || (B = cylxVar.B()) == null) {
            return;
        }
        wdz wdzVar = (wdz) B;
        if (wdzVar.g) {
            wdzVar.l.H().b(z);
        } else {
            wdzVar.k = z;
        }
        int i = wdzVar.o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            wdzVar.b(true);
        } else if (i2 == 2 || i2 == 3) {
            wdzVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0305, code lost:
    
        if (r0 == 1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d7 A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #3 {all -> 0x0345, blocks: (B:58:0x0282, B:61:0x0294, B:63:0x0299, B:66:0x02ab, B:68:0x02b0, B:71:0x02d2, B:73:0x02d7, B:76:0x02eb, B:78:0x02f0, B:81:0x0302, B:96:0x0312, B:95:0x030f, B:106:0x031d, B:105:0x031a, B:120:0x02d0, B:119:0x02cd, B:130:0x0328, B:129:0x0325, B:141:0x0344, B:140:0x0341, B:136:0x033c, B:75:0x02dd, B:125:0x0320, B:108:0x02be, B:80:0x02f6, B:101:0x0315, B:60:0x0288, B:115:0x02c8, B:90:0x030a, B:65:0x029f), top: B:57:0x0282, inners: #0, #1, #2, #4, #5, #6, #7, #9, #10, #11 }] */
    @Override // defpackage.bcvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.bcvr r17, int r18) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxvv.b(bcvr, int):void");
    }

    public final int e() {
        int i = 0;
        if (this.x.g() && bcyp.a((bcvr) this.x.a())) {
            i = this.e.H().e;
        }
        return ac() ? i + this.u.getMeasuredHeight() : i;
    }

    public final SelfIdentityId f() {
        return ((bcvr) this.x.a()).t();
    }

    @Override // defpackage.bcvm
    public final void fs() {
        ((vvn) this.j).aG.k(R.string.attachment_load_failed_dialog_message);
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
        this.x.e(bcvrVar);
        this.j.aT(bcvrVar, false, false);
    }

    final bcpw g() {
        return new bcpw(this.x);
    }

    @Override // defpackage.ugj
    public final void gk(ugo ugoVar) {
        this.l.a(ugoVar);
    }

    final bcxq h() {
        SelfIdentityId t = ((bcvr) this.x.a()).t();
        if (ad()) {
            bcxr bcxrVar = this.y;
            if (bcxrVar != null) {
                return bcxrVar.a(t);
            }
            return null;
        }
        bcpw bcpwVar = this.C;
        if (bcpwVar == null) {
            return null;
        }
        bcpwVar.a();
        return ((bcqs) this.C.a()).e(t);
    }

    public final cpbn i() {
        bcpt bcptVar = this.x;
        int i = -1;
        if (bcptVar != null && bcptVar.g()) {
            i = ((bcvr) this.x.a()).q();
        }
        return ((cpbs) this.P.b()).a(i);
    }

    public final cxtc j() {
        return this.an.H();
    }

    public final Optional k() {
        return this.p.flatMap(new Function() { // from class: cxvh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aktd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    final CharSequence l() {
        return this.m.getText();
    }

    final CharSequence m() {
        return this.n.getText();
    }

    public final void n(bcvr bcvrVar) {
        this.x.c(bcvrVar);
        bcvrVar.D(j());
    }

    @Override // defpackage.cylv
    public final View o(int i) {
        throw null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        cwpv al = al();
        if (al != null && al.isDestroyed()) {
            a.q("got onTextChanged after onDestroy");
        } else {
            H();
            U();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        ai(true, true, true != aa() ? 1 : 2);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cxrx cxrxVar;
        bcpt bcptVar = this.x;
        cwpv al = al();
        if (bcptVar.g()) {
            if (al != null && al.isDestroyed()) {
                a.q("got onTextChanged after onDestroy");
                return;
            }
            efbd.f(this.at);
            if (charSequence.length() > 0 && i2 != i3) {
                cylx cylxVar = this.j;
                ensk g = vvn.a.g();
                g.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) g;
                vvn vvnVar = (vvn) cylxVar;
                enrrVar.Y(csux.p, vvnVar.M);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5098, "ConversationFragmentPeer.java")).q("ConversationFragment: User started typing.");
                if (vvnVar.cO == 0) {
                    vvnVar.cO = fdlk.a();
                }
                vvnVar.aD(1);
                long epochMilli = vvnVar.aj.f().toEpochMilli();
                if (epochMilli - vvnVar.cN >= vvnVar.cO) {
                    ensk g2 = vvn.a.g();
                    g2.Y(ente.a, "Bugle");
                    enrr enrrVar2 = (enrr) g2;
                    enrrVar2.Y(csux.p, vvnVar.M);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5108, "ConversationFragmentPeer.java")).q("ConversationFragment: Attempting to send a typing indicator.");
                    vvnVar.az(1, Instant.ofEpochMilli(epochMilli));
                    vvnVar.cN = epochMilli;
                } else {
                    ensk g3 = vvn.a.g();
                    g3.Y(ente.a, "Bugle");
                    enrr enrrVar3 = (enrr) g3;
                    enrrVar3.Y(csux.p, vvnVar.M);
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5116, "ConversationFragmentPeer.java")).J("ConversationFragment: Not sending typing indicator because max frequency is %d the typing time is %d & the last sent indicator was at %d", Long.valueOf(vvnVar.cO), Long.valueOf(epochMilli), Long.valueOf(vvnVar.cN));
                }
                if (vvnVar.bf() && !vvnVar.ci) {
                    vvnVar.ci = true;
                    ((sft) vvnVar.bF.b()).a(2);
                }
                this.G = false;
                am();
            }
            if (charSequence.length() > 0 || i2 != i3) {
                U();
            }
            if (charSequence.length() > 0) {
                cxsr cxsrVar = this.g;
                PlainTextEditText v = cxsrVar.c.H().v();
                if (v.getWidth() != 0 && (cxrxVar = cxsrVar.h) != null && ((cxsn) cxrxVar).d.getVisibility() == 0 && v.getPaint().measureText(v.getText(), 0, v.getText().length()) >= v.getWidth() * ((Float) cxsr.a.e()).floatValue() && cxsrVar.o) {
                    cxsrVar.l.l(R.id.compress_info_image_view, cxsrVar.d.getVisibility());
                    TransitionManager.beginDelayedTransition(cxsrVar.a(), cxsrVar.m);
                    cxsrVar.l.b(cxsrVar.a());
                }
                if (ctjd.c() && ((ctyz) this.aA.b()).k()) {
                    cxsr cxsrVar2 = this.g;
                    if (cxsrVar2.e != null && cxsrVar2.b.isPresent()) {
                        Object tag = cxsrVar2.e.getTag(R.id.magic_compose_entrypoint_drawable_tag);
                        if (tag == null || ((Integer) tag).intValue() != R.drawable.gs_pen_spark_vd_theme_24) {
                            cxsrVar2.e.setTag(R.id.magic_compose_entrypoint_drawable_tag, Integer.valueOf(R.drawable.gs_pen_spark_vd_theme_24));
                            cxsrVar2.b(cxsrVar2.e, R.drawable.gs_pen_spark_vd_theme_24, R.string.magic_rewrite_label);
                        }
                    }
                }
                if (this.m.getMaxLines() == 1) {
                    this.m.setMaxLines(this.an.getResources().getInteger(R.integer.compose_message_view_max_lines));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(l())) {
                if (ctjd.c() && ((ctyz) this.aA.b()).k()) {
                    cylx cylxVar2 = this.j;
                    if (cylxVar2 != null) {
                        cylxVar2.T(new Consumer() { // from class: cxvq
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ugg uggVar = (ugg) obj;
                                cskc cskcVar = cxvv.a;
                                if (uggVar.c() == ugo.MAGIC_COMPOSE) {
                                    uggVar.r(ugo.IME, true, false);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: cxvr
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                cskc cskcVar = cxvv.a;
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    if (((Boolean) ctjd.bg.e()).booleanValue() || !((asuf) this.ar.b()).a()) {
                        cxsr cxsrVar3 = this.g;
                        if (cxsrVar3.e != null && cxsrVar3.b.isPresent()) {
                            Object tag2 = cxsrVar3.e.getTag(R.id.magic_compose_entrypoint_drawable_tag);
                            if (tag2 == null || ((Integer) tag2).intValue() != R.drawable.messages_spark_outlined) {
                                cxsrVar3.e.setTag(R.id.magic_compose_entrypoint_drawable_tag, Integer.valueOf(R.drawable.messages_spark_outlined));
                                cxsrVar3.b(cxsrVar3.e, R.drawable.messages_spark_outlined, R.string.suggested_text_label);
                            }
                        }
                    }
                }
                if (i2 > i3 && i3 == 0) {
                    if (this.G) {
                        this.G = false;
                    } else {
                        am();
                    }
                }
                this.g.c();
                this.m.setMaxLines(1);
            }
        }
    }

    @Override // defpackage.czha
    public final View p() {
        throw null;
    }

    @Override // defpackage.czha
    public final View q() {
        throw null;
    }

    final void r(cylx cylxVar) {
        this.j = cylxVar;
        cxnk H = this.e.H();
        H.g = cylxVar;
        H.o = ((csuk) H.w.b()).a(-1, cylxVar.fu());
    }

    final void s() {
        t(new Consumer() { // from class: cxus
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((aktd) obj).b();
                cxvv.this.U();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void t(Consumer consumer) {
        if (!ae()) {
            throw new IllegalStateException("Cannot execute function with a missing ScheduledSendDraftViewController. Is a module missing?");
        }
        consumer.o((aktd) this.p.get());
    }

    @Override // defpackage.czha
    public final MessagePartCoreData u(MessagePartCoreData messagePartCoreData) {
        throw null;
    }

    public final void v() {
        cxsr cxsrVar = this.g;
        if (!((Boolean) ctjd.aX.e()).booleanValue()) {
            cxsrVar.d(false);
        }
        if (cxsrVar.e != null) {
            cxsrVar.k.l(R.id.magic_button, 8);
            if (cxsrVar.e.getVisibility() == 0) {
                cxsrVar.e.setVisibility(8);
            }
        }
    }

    public final void w() {
        this.p.ifPresent(new Consumer() { // from class: cxux
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((aktd) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void x() {
        wdm B;
        ekzz f = eleg.f("ComposeMessageViewPeerDelegate::hideSimPicker");
        try {
            cylx cylxVar = this.j;
            if (cylxVar != null && af() && (B = cylxVar.B()) != null) {
                B.a();
            }
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

    public final void y() {
        this.u.setVisibility(8);
    }

    @Override // defpackage.czha
    public final void z(boolean z) {
        throw null;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
