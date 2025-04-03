package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.cnq;
import defpackage.kpz;
import defpackage.kqh;
import defpackage.ksr;
import defpackage.ku;
import defpackage.kzd;
import defpackage.qo;
import defpackage.qy;
import defpackage.qz;
import defpackage.ru;
import defpackage.rx;
import defpackage.ry;
import defpackage.rz;
import defpackage.sa;
import defpackage.sb;
import defpackage.yo;
import defpackage.yq;
import defpackage.zu;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final qo a;
    private final ry b;
    private final ru c;
    public Typeface d;
    private qy e;
    private boolean f;
    private Typeface g;
    private String h;
    private rz i;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final qy a() {
        if (this.e == null) {
            this.e = new qy(this);
        }
        return this.e;
    }

    private final void b(Typeface typeface) {
        this.g = typeface;
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.a();
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (zu.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            return ryVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (zu.c) {
            return super.getAutoSizeMinTextSize();
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            return ryVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (zu.c) {
            return super.getAutoSizeStepGranularity();
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            return ryVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (zu.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ry ryVar = this.b;
        return ryVar != null ? ryVar.p() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (zu.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            return ryVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kzd.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return this.h;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        ru ruVar;
        return (Build.VERSION.SDK_INT >= 28 || (ruVar = this.c) == null) ? super.getTextClassifier() : ruVar.a();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return this.d;
    }

    final rz j() {
        if (this.i == null) {
            this.i = Build.VERSION.SDK_INT >= 34 ? new sb(this) : Build.VERSION.SDK_INT >= 28 ? new sa(this) : new rz(this);
        }
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ry.r(this, onCreateInputConnection, editorInfo);
        qz.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.q();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ry ryVar = this.b;
        if (ryVar == null || zu.c || !ryVar.o()) {
            return;
        }
        ryVar.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (zu.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (zu.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (zu.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.m(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ku.a(context, i) : null, i2 != 0 ? ku.a(context, i2) : null, i3 != 0 ? ku.a(context, i3) : null, i4 != 0 ? ku.a(context, i4) : null);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ku.a(context, i) : null, i2 != 0 ? ku.a(context, i2) : null, i3 != 0 ? ku.a(context, i3) : null, i4 != 0 ? ku.a(context, i4) : null);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kzd.b(this, callback));
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().c(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().a(i);
        } else {
            kzd.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        String fontVariationSettings;
        boolean fontVariationSettings2;
        Typeface typeface = this.d;
        if (this.g != getPaint().getTypeface()) {
            Log.w("AppCompatTextView", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = getPaint().getTypeface();
        }
        cnq cnqVar = rx.a;
        ksr ksrVar = new ksr(typeface, str);
        Typeface typeface2 = (Typeface) rx.a.c(ksrVar);
        if (typeface2 == null) {
            Paint paint = rx.b;
            if (paint == null) {
                paint = new Paint();
                rx.b = paint;
            }
            fontVariationSettings = paint.getFontVariationSettings();
            if (Objects.equals(fontVariationSettings, str)) {
                paint.setFontVariationSettings(null);
            }
            paint.setTypeface(typeface);
            fontVariationSettings2 = paint.setFontVariationSettings(str);
            if (fontVariationSettings2) {
                typeface2 = paint.getTypeface();
                rx.a.d(ksrVar, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        b(typeface2);
        this.h = str;
        return true;
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            j().b(i);
        } else {
            kzd.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        kzd.e(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        ru ruVar;
        if (Build.VERSION.SDK_INT >= 28 || (ruVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ruVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (zu.c) {
            super.setTextSize(i, f);
            return;
        }
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        this.d = typeface;
        b(typeface);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            j().c(i, f);
        } else {
            kzd.f(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.f) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            kqh kqhVar = kpz.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface = Typeface.create(typeface, i);
        }
        this.f = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq.a(context);
        this.f = false;
        this.i = null;
        yo.d(this, getContext());
        qo qoVar = new qo(this);
        this.a = qoVar;
        qoVar.b(attributeSet, i);
        ry ryVar = new ry(this);
        this.b = ryVar;
        ryVar.h(attributeSet, i);
        ryVar.e();
        this.c = new ru(this);
        a().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.e();
        }
    }
}
