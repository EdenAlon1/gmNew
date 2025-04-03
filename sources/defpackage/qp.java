package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qp extends Button {
    public final qo a;
    private final ry b;
    private qy c;

    public qp(Context context) {
        this(context, null);
    }

    private final qy a() {
        if (this.c == null) {
            this.c = new qy(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.q();
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ry ryVar = this.b;
        if (ryVar == null || zu.c || !ryVar.o()) {
            return;
        }
        ryVar.g();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kzd.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().c(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.i(context, i);
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

    public qp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq.a(context);
        yo.d(this, getContext());
        qo qoVar = new qo(this);
        this.a = qoVar;
        qoVar.b(attributeSet, i);
        ry ryVar = new ry(this);
        this.b = ryVar;
        ryVar.h(attributeSet, i);
        ryVar.e();
        a().a(attributeSet, i);
    }
}
