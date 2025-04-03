package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehtp extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public ehtp(TextInputLayout textInputLayout, yt ytVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (ehmq.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        h();
        i();
        int[] iArr = ehto.a;
        if (ytVar.q(70)) {
            this.e = ehmq.d(getContext(), ytVar, 70);
        }
        if (ytVar.q(71)) {
            this.f = ehjg.c(ytVar.c(71, -1), null);
        }
        if (ytVar.q(67)) {
            Drawable h = ytVar.h(67);
            checkableImageButton.setImageDrawable(h);
            if (h != null) {
                ehte.b(textInputLayout, checkableImageButton, this.e, this.f);
                e(true);
                c();
            } else {
                e(false);
                h();
                i();
                d(null);
            }
            if (ytVar.q(66)) {
                d(ytVar.m(66));
            }
            checkableImageButton.a(ytVar.p(65, true));
        }
        int b = ytVar.b(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (b < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (b != this.g) {
            this.g = b;
            ehte.d(checkableImageButton, b);
        }
        if (ytVar.q(69)) {
            checkableImageButton.setScaleType(ehte.a(ytVar.c(69, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ytVar.f(61, 0));
        if (ytVar.q(62)) {
            appCompatTextView.setTextColor(ytVar.g(62));
        }
        CharSequence m = ytVar.m(60);
        this.b = true != TextUtils.isEmpty(m) ? m : null;
        appCompatTextView.setText(m);
        j();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private final void j() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.D();
    }

    public final int a() {
        int i;
        if (g()) {
            CheckableImageButton checkableImageButton = this.c;
            i = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            i = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + i;
    }

    public final void b(boolean z) {
        this.h = z;
        j();
    }

    public final void c() {
        ehte.c(this.d, this.c, this.e);
    }

    final void d(CharSequence charSequence) {
        if (this.c.getContentDescription() != charSequence) {
            this.c.setContentDescription(charSequence);
        }
    }

    final void e(boolean z) {
        if (g() != z) {
            this.c.setVisibility(true != z ? 8 : 0);
            f();
            j();
        }
    }

    final void f() {
        EditText editText = this.d.c;
        if (editText == null) {
            return;
        }
        this.a.setPaddingRelative(g() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean g() {
        return this.c.getVisibility() == 0;
    }

    final void h() {
        ehte.e(this.c, null);
    }

    final void i() {
        ehte.f(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f();
    }
}
