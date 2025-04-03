package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class re extends RadioButton implements kzf {
    private final qs a;
    private final qo b;
    private final ry c;
    private qy d;

    public re(Context context) {
        this(context, null);
    }

    private final qy c() {
        if (this.d == null) {
            this.d = new qy(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.a();
        }
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // defpackage.kzf
    public final void hl(PorterDuff.Mode mode) {
        throw null;
    }

    @Override // defpackage.kzf
    public final void hm() {
        throw null;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().b(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(ku.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().c(inputFilterArr));
    }

    public re(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq.a(context);
        yo.d(this, getContext());
        qs qsVar = new qs(this);
        this.a = qsVar;
        qsVar.b(attributeSet, i);
        qo qoVar = new qo(this);
        this.b = qoVar;
        qoVar.b(attributeSet, i);
        ry ryVar = new ry(this);
        this.c = ryVar;
        ryVar.h(attributeSet, i);
        c().a(attributeSet, i);
    }
}
