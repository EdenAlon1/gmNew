package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhx implements TextWatcher {
    public final EditText a;
    public lgg b;
    public boolean c = true;
    private int d;
    private int e;

    public lhx(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            lgl.c().d(editableText);
            lhq.a(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.a.isInEditMode() && this.c && lgl.h()) {
            int i = this.d;
            int i2 = this.e;
            if (i2 > 0) {
                int b = lgl.c().b();
                if (b != 0) {
                    if (b == 1) {
                        lgl.c().k(editable, i, i2 + i, 0);
                        return;
                    } else if (b != 3) {
                        return;
                    }
                }
                lgl c = lgl.c();
                if (this.b == null) {
                    this.b = new lhw(this.a);
                }
                c.f(this.b);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = i;
        this.e = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
