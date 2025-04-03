package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsj extends ehtd {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public ehsj(ehtc ehtcVar) {
        super(ehtcVar);
        this.j = new View.OnClickListener() { // from class: ehsc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehsj ehsjVar = ehsj.this;
                EditText editText = ehsjVar.a;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                ehsjVar.x();
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: ehsd
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ehsj ehsjVar = ehsj.this;
                ehsjVar.f(ehsjVar.k());
            }
        };
        this.b = ehmp.a(ehtcVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = ehmp.a(ehtcVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = ehjz.a(ehtcVar.getContext(), R.attr.motionEasingLinearInterpolator, egyv.a);
        this.i = ehjz.a(ehtcVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, egyv.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration(this.b);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehse
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ehsj.this.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @Override // defpackage.ehtd
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.ehtd
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.ehtd
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.ehtd
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.ehtd
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean r = this.f.r();
        if (!z) {
            this.l.cancel();
            this.m.start();
            if (r) {
                return;
            }
            this.m.end();
            return;
        }
        if (this.l.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (r) {
            this.l.end();
        }
    }

    @Override // defpackage.ehtd
    public final void g(EditText editText) {
        this.a = editText;
        this.e.i(k());
    }

    @Override // defpackage.ehtd
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.ehtd
    public final void i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.i);
        ofFloat.setDuration(this.c);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehsg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ehsj ehsjVar = ehsj.this;
                ehsjVar.h.setScaleX(floatValue);
                ehsjVar.h.setScaleY(floatValue);
            }
        });
        ValueAnimator m = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, m);
        this.l.addListener(new ehsh(this));
        ValueAnimator m2 = m(1.0f, 0.0f);
        this.m = m2;
        m2.addListener(new ehsi(this));
    }

    @Override // defpackage.ehtd
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new Runnable() { // from class: ehsf
                @Override // java.lang.Runnable
                public final void run() {
                    ehsj.this.f(true);
                }
            });
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null) {
            return (editText.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.ehtd
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
