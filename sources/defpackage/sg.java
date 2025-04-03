package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sg extends ToggleButton {
    private final qo a;
    private final ry b;
    private qy c;

    public sg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        yo.d(this, getContext());
        qo qoVar = new qo(this);
        this.a = qoVar;
        qoVar.b(attributeSet, R.attr.buttonStyleToggle);
        ry ryVar = new ry(this);
        this.b = ryVar;
        ryVar.h(attributeSet, R.attr.buttonStyleToggle);
        a().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private final qy a() {
        if (this.c == null) {
            this.c = new qy(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().c(inputFilterArr));
    }
}
