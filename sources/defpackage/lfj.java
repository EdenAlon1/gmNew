package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lfj extends qw {
    private lfk a;
    private boolean b;

    public lfj(Context context) {
        super(context);
        c(null, 0);
    }

    private final lfk b() {
        if (this.a == null) {
            this.a = new lfk(this);
        }
        return this.a;
    }

    private final void c(AttributeSet attributeSet, int i) {
        if (this.b) {
            return;
        }
        this.b = true;
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, len.a, i, 0);
            i2 = obtainStyledAttributes.getInteger(0, Alert.DURATION_SHOW_INDEFINITELY);
            obtainStyledAttributes.recycle();
        }
        b().b(i2);
        setKeyListener(super.getKeyListener());
    }

    @Override // defpackage.qw, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return b().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // defpackage.qw, android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            b();
            keyListener = lfk.c(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public lfj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, R.attr.editTextStyle);
    }

    public lfj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet, i);
    }
}
