package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsw extends ehtd {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private final AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;

    public ehsw(ehtc ehtcVar) {
        super(ehtcVar);
        this.l = new View.OnClickListener() { // from class: ehsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehsw.this.m();
            }
        };
        this.m = new View.OnFocusChangeListener() { // from class: ehss
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ehsw ehswVar = ehsw.this;
                ehswVar.b = z;
                ehswVar.x();
                if (z) {
                    return;
                }
                ehswVar.k(false);
                ehswVar.c = false;
            }
        };
        this.n = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ehst
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                ehsw ehswVar = ehsw.this;
                AutoCompleteTextView autoCompleteTextView = ehswVar.a;
                if (autoCompleteTextView == null || ehsx.a(autoCompleteTextView)) {
                    return;
                }
                ehswVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = ehmp.a(ehtcVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = ehmp.a(ehtcVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = ehjz.a(ehtcVar.getContext(), R.attr.motionEasingLinearInterpolator, egyv.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehso
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ehsw.this.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @Override // defpackage.ehtd
    public final AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.ehtd
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.ehtd
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.ehtd
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.ehtd
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.ehtd
    public final void g(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: ehsp
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    ehsw ehswVar = ehsw.this;
                    if (ehswVar.p()) {
                        ehswVar.c = false;
                    }
                    ehswVar.m();
                    ehswVar.n();
                }
                return false;
            }
        });
        this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ehsq
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                ehsw ehswVar = ehsw.this;
                ehswVar.n();
                ehswVar.k(false);
            }
        });
        this.a.setThreshold(0);
        this.e.b.m(null);
        if (!ehsx.a(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        this.e.i(true);
    }

    @Override // defpackage.ehtd
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator z = z(this.i, 1.0f, 0.0f);
        this.r = z;
        z.addListener(new ehsv(this));
        this.q = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.ehtd
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.ehtd
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && ehsx.a(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new Runnable() { // from class: ehsu
            @Override // java.lang.Runnable
            public final void run() {
                ehsw ehswVar = ehsw.this;
                boolean isPopupShowing = ehswVar.a.isPopupShowing();
                ehswVar.k(isPopupShowing);
                ehswVar.c = isPopupShowing;
            }
        });
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        if (p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        k(!this.o);
        if (!this.o) {
            this.a.dismissDropDown();
        } else {
            this.a.requestFocus();
            this.a.showDropDown();
        }
    }

    public final void n() {
        this.c = true;
        this.p = SystemClock.uptimeMillis();
    }

    @Override // defpackage.ehtd
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.p;
        return uptimeMillis < 0 || uptimeMillis > 300;
    }

    @Override // defpackage.ehtd
    public final boolean q() {
        return true;
    }

    @Override // defpackage.ehtd
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.ehtd
    public final boolean s() {
        return true;
    }

    @Override // defpackage.ehtd
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.ehtd
    public final boolean u() {
        return true;
    }

    @Override // defpackage.ehtd
    public final void v(kxu kxuVar) {
        boolean isShowingHintText;
        if (!ehsx.a(this.a)) {
            kxuVar.r(Spinner.class.getName());
        }
        isShowingHintText = kxuVar.a.isShowingHintText();
        if (isShowingHintText) {
            kxuVar.C(null);
        }
    }

    @Override // defpackage.ehtd
    public final void w(AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || ehsx.a(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
