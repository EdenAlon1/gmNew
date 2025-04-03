package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehtc extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final ehtb n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final ehsz t;

    public ehtc(TextInputLayout textInputLayout, yt ytVar) {
        super(textInputLayout.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new ehsy(this);
        ehsz ehszVar = new ehsz(this);
        this.t = ehszVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton t = t(this, from, R.id.text_input_error_icon);
        this.b = t;
        CheckableImageButton t2 = t(frameLayout, from, R.id.text_input_end_icon);
        this.d = t2;
        this.n = new ehtb(this, ytVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = ehto.a;
        if (ytVar.q(38)) {
            this.c = ehmq.d(getContext(), ytVar, 38);
        }
        if (ytVar.q(39)) {
            this.m = ehjg.c(ytVar.c(39, -1), null);
        }
        if (ytVar.q(37)) {
            m(ytVar.h(37));
        }
        t.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        t.setImportantForAccessibility(2);
        t.setClickable(false);
        t.c = false;
        t.a(false);
        t.setFocusable(false);
        if (!ytVar.q(54)) {
            if (ytVar.q(32)) {
                this.f = ehmq.d(getContext(), ytVar, 32);
            }
            if (ytVar.q(33)) {
                this.g = ehjg.c(ytVar.c(33, -1), null);
            }
        }
        if (ytVar.q(30)) {
            k(ytVar.c(30, 0));
            if (ytVar.q(27)) {
                j(ytVar.m(27));
            }
            i(ytVar.p(26, true));
        } else if (ytVar.q(54)) {
            if (ytVar.q(55)) {
                this.f = ehmq.d(getContext(), ytVar, 55);
            }
            if (ytVar.q(56)) {
                this.g = ehjg.c(ytVar.c(56, -1), null);
            }
            k(ytVar.p(54, false) ? 1 : 0);
            j(ytVar.m(52));
        }
        int b = ytVar.b(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (b < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (b != this.p) {
            this.p = b;
            ehte.d(t2, b);
            ehte.d(t, b);
        }
        if (ytVar.q(31)) {
            ImageView.ScaleType a = ehte.a(ytVar.c(31, -1));
            t2.setScaleType(a);
            t.setScaleType(a);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ytVar.f(73, 0));
        if (ytVar.q(74)) {
            appCompatTextView.setTextColor(ytVar.g(74));
        }
        CharSequence m = ytVar.m(72);
        this.h = true != TextUtils.isEmpty(m) ? m : null;
        appCompatTextView.setText(m);
        v();
        frameLayout.addView(t2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(t);
        textInputLayout.n.add(ehszVar);
        if (textInputLayout.c != null) {
            ehszVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ehta(this));
    }

    private final CheckableImageButton t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ehmq.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void u() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || s()) ? 8 : 0);
        boolean z = (this.h == null || this.q) ? 8 : false;
        if (!r() && !s() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void v() {
        int visibility = this.i.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        u();
        this.i.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (r() || s()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final ehtd c() {
        ehtd ehskVar;
        ehtb ehtbVar = this.n;
        SparseArray sparseArray = ehtbVar.a;
        int i = this.e;
        ehtd ehtdVar = (ehtd) sparseArray.get(i);
        if (ehtdVar != null) {
            return ehtdVar;
        }
        if (i == -1) {
            ehskVar = new ehsk(ehtbVar.b);
        } else if (i == 0) {
            ehskVar = new ehtl(ehtbVar.b);
        } else if (i == 1) {
            ehskVar = new ehtn(ehtbVar.b, ehtbVar.d);
        } else if (i == 2) {
            ehskVar = new ehsj(ehtbVar.b);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a.h(i, "Invalid end icon mode: "));
            }
            ehskVar = new ehsw(ehtbVar.b);
        }
        ehtbVar.a.append(i, ehskVar);
        return ehskVar;
    }

    public final void d() {
        if (this.s == null || this.r == null || !isAttachedToWindow()) {
            return;
        }
        this.r.addTouchExplorationStateChangeListener(this.s);
    }

    public final void e(boolean z) {
        this.q = z;
        v();
    }

    public final void f() {
        ehte.c(this.a, this.d, this.f);
    }

    final void g(boolean z) {
        boolean isActivated;
        boolean z2;
        ehtd c = c();
        boolean z3 = false;
        boolean z4 = true;
        if (c.s() && (z2 = this.d.a) != c.t()) {
            this.d.setChecked(!z2);
            z3 = true;
        }
        if (!c.q() || (isActivated = this.d.isActivated()) == c.r()) {
            z4 = z3;
        } else {
            this.d.setActivated(!isActivated);
        }
        if (z || z4) {
            f();
        }
    }

    public final void h() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void i(boolean z) {
        this.d.a(z);
    }

    final void j(CharSequence charSequence) {
        if (this.d.getContentDescription() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    final void k(int i) {
        if (this.e == i) {
            return;
        }
        ehtd c = c();
        h();
        this.s = null;
        c.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ehtw) it.next()).a();
        }
        l(i != 0);
        ehtd c2 = c();
        int i2 = this.n.c;
        if (i2 == 0) {
            i2 = c2.b();
        }
        Drawable a = i2 != 0 ? ku.a(getContext(), i2) : null;
        this.d.setImageDrawable(a);
        if (a != null) {
            ehte.b(this.a, this.d, this.f, this.g);
            f();
        }
        int a2 = c2.a();
        j(a2 != 0 ? getResources().getText(a2) : null);
        i(c2.s());
        int i3 = this.a.m;
        if (!c2.o(i3)) {
            throw new IllegalStateException(a.r(i, i3, "The current box background mode ", " is not supported by the end icon mode "));
        }
        c2.i();
        this.s = c2.A();
        d();
        ehte.e(this.d, c2.c());
        EditText editText = this.j;
        if (editText != null) {
            c2.g(editText);
            n(c2);
        }
        ehte.b(this.a, this.d, this.f, this.g);
        g(true);
    }

    public final void l(boolean z) {
        if (r() != z) {
            this.d.setVisibility(true != z ? 8 : 0);
            u();
            p();
            this.a.D();
        }
    }

    final void m(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        o();
        ehte.b(this.a, this.b, this.c, this.m);
    }

    public final void n(ehtd ehtdVar) {
        EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (ehtdVar.d() != null) {
            editText.setOnFocusChangeListener(ehtdVar.d());
        }
        if (ehtdVar.e() != null) {
            this.d.setOnFocusChangeListener(ehtdVar.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.b
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
            ehth r3 = r0.d
            boolean r3 = r3.g
            if (r3 == 0) goto L1a
            boolean r0 = r0.C()
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            com.google.android.material.internal.CheckableImageButton r3 = r4.b
            if (r1 == r0) goto L21
            r2 = 8
        L21:
            r3.setVisibility(r2)
            r4.u()
            r4.p()
            boolean r0 = r4.q()
            if (r0 != 0) goto L35
            com.google.android.material.textfield.TextInputLayout r0 = r4.a
            r0.D()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehtc.o():void");
    }

    public final void p() {
        if (this.a.c == null) {
            return;
        }
        int i = 0;
        if (!r() && !s()) {
            i = this.a.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.c.getPaddingTop(), i, this.a.c.getPaddingBottom());
    }

    public final boolean q() {
        return this.e != 0;
    }

    public final boolean r() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean s() {
        return this.b.getVisibility() == 0;
    }
}
