package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qq extends CheckedTextView {
    private final qr a;
    private final qo b;
    private final ry c;
    private qy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        yq.a(context);
        yo.d(this, getContext());
        ry ryVar = new ry(this);
        this.c = ryVar;
        ryVar.h(attributeSet, R.attr.checkedTextViewStyle);
        ryVar.e();
        qo qoVar = new qo(this);
        this.b = qoVar;
        qoVar.b(attributeSet, R.attr.checkedTextViewStyle);
        qr qrVar = new qr(this);
        this.a = qrVar;
        qrVar.b(attributeSet);
        a().a(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final qy a() {
        if (this.d == null) {
            this.d = new qy(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.e();
        }
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.a();
        }
        qr qrVar = this.a;
        if (qrVar != null) {
            qrVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kzd.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        qz.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().b(z);
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ku.a(getContext(), i));
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kzd.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ry ryVar = this.c;
        if (ryVar != null) {
            ryVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        qr qrVar = this.a;
        if (qrVar != null) {
            if (qrVar.a) {
                qrVar.a = false;
            } else {
                qrVar.a = true;
                qrVar.a();
            }
        }
    }
}
