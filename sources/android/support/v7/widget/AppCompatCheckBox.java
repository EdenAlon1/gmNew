package android.support.v7.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.messaging.R;
import defpackage.ku;
import defpackage.kzf;
import defpackage.qo;
import defpackage.qs;
import defpackage.qy;
import defpackage.ry;
import defpackage.yo;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements kzf {
    private final qs a;
    private final qo b;
    private final ry c;
    private qy d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private final qy c() {
        if (this.d == null) {
            this.d = new qy(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
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
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.a = mode;
            qsVar.c = true;
            qsVar.a();
        }
    }

    @Override // defpackage.kzf
    public final void hm() {
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.b = true;
            qsVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ku.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
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
