package com.google.android.libraries.material.featurehighlight;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.material.button.MaterialButton;
import defpackage.dwmb;
import defpackage.dwmz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextContentView extends ScrollView implements dwmb {
    public dwmz a;
    private TextView b;
    private TextView c;
    private TextView d;

    public TextContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScrollBarStyle(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
    }

    private final void B(TextView textView, int i) {
        TypedArray typedArray;
        try {
            typedArray = getContext().obtainStyledAttributes(i, new int[]{R.attr.lineSpacingExtra});
            try {
                textView.setLineSpacing(typedArray.getDimension(0, textView.getLineSpacingExtra()), textView.getLineSpacingMultiplier());
                if (typedArray != null) {
                    typedArray.recycle();
                }
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private static final void C(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i;
            view.setLayoutParams(layoutParams2);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = i;
            view.setLayoutParams(layoutParams3);
        }
    }

    private static final void D(TextView textView, int i) {
        if (i == 0) {
            textView.setTextAlignment(5);
        } else if (i == 1) {
            textView.setTextAlignment(4);
        } else {
            if (i != 2) {
                return;
            }
            textView.setTextAlignment(6);
        }
    }

    private static final void E(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        if (charSequence instanceof Spanned) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // defpackage.dwmb
    public final boolean A() {
        return this.b.getVisibility() == 0;
    }

    @Override // defpackage.dwmb
    public final View b() {
        return this.c;
    }

    @Override // defpackage.dwmb
    public final View c() {
        return this.d;
    }

    @Override // defpackage.dwmb
    public final View d() {
        return this.b;
    }

    @Override // defpackage.dwmb
    public final CharSequence e() {
        CharSequence text = this.c.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.dwmb
    public final CharSequence f() {
        CharSequence text = this.d.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.dwmb
    public final CharSequence g() {
        CharSequence text = this.b.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.dwmb
    public final void h(int i) {
        D(this.c, i);
    }

    @Override // defpackage.dwmb
    public final void i(int i) {
        this.c.setTextAppearance(i);
        B(this.c, i);
    }

    @Override // defpackage.dwmb
    public final void j(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    @Override // defpackage.dwmb
    public final void k(float f) {
        this.c.setTextSize(f);
    }

    @Override // defpackage.dwmb
    public final void l(dwmz dwmzVar) {
        this.a = dwmzVar;
    }

    @Override // defpackage.dwmb
    public final void m(int i) {
        TextView textView = this.d;
        if (i == 0) {
            C(textView, 8388611);
        } else {
            if (i != 1) {
                return;
            }
            C(textView, 8388613);
        }
    }

    @Override // defpackage.dwmb
    public final void n(ColorStateList colorStateList) {
        this.d.setBackgroundColor(colorStateList.getDefaultColor());
    }

    @Override // defpackage.dwmb
    public final void o(ColorStateList colorStateList) {
        TextView textView = this.d;
        if (textView instanceof MaterialButton) {
            ((MaterialButton) textView).e(colorStateList);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(com.google.android.apps.messaging.R.id.featurehighlight_help_text_header_view);
        textView.getClass();
        this.b = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.apps.messaging.R.id.featurehighlight_help_text_body_view);
        textView2.getClass();
        this.c = textView2;
        TextView textView3 = (TextView) findViewById(com.google.android.apps.messaging.R.id.featurehighlight_dismiss_action_text_view);
        textView3.getClass();
        this.d = textView3;
    }

    @Override // defpackage.dwmb
    public final void p(ColorStateList colorStateList) {
        TextView textView = this.d;
        if (textView instanceof MaterialButton) {
            ((MaterialButton) textView).g(colorStateList);
        }
    }

    @Override // defpackage.dwmb
    public final void q(int i) {
        D(this.d, i);
    }

    @Override // defpackage.dwmb
    public final void r(int i) {
        this.d.setTextAppearance(i);
        B(this.d, i);
    }

    @Override // defpackage.dwmb
    public final void s(ColorStateList colorStateList) {
        this.d.setTextColor(colorStateList);
    }

    @Override // defpackage.dwmb
    public final void t(int i) {
        D(this.b, i);
    }

    @Override // defpackage.dwmb
    public final void u(int i) {
        this.b.setTextAppearance(i);
        B(this.b, i);
    }

    @Override // defpackage.dwmb
    public final void v(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    @Override // defpackage.dwmb
    public final void w(float f) {
        this.b.setTextSize(f);
    }

    @Override // defpackage.dwmb
    public final void x(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        E(this.b, charSequence);
        E(this.c, charSequence2);
        E(this.d, charSequence3);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: dwng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextContentView.this.a.a(3);
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (TextUtils.isEmpty(charSequence3)) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(charSequence3);
    }

    @Override // defpackage.dwmb
    public final boolean y() {
        return this.c.getVisibility() == 0;
    }

    @Override // defpackage.dwmb
    public final boolean z() {
        return this.d.getVisibility() == 0;
    }

    @Override // defpackage.dwmb
    public final View a() {
        return this;
    }
}
