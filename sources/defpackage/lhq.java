package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lhq implements InputFilter {
    private final TextView a;
    private lgg b;

    public lhq(TextView textView) {
        this.a = textView;
    }

    static void a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int b = lgl.c().b();
        if (b != 0) {
            if (b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i == 0) {
                    if (i2 != charSequence.length()) {
                        i = 0;
                    }
                    return lgl.c().j(charSequence, charSequence.length());
                }
                charSequence = charSequence.subSequence(i, i2);
                return lgl.c().j(charSequence, charSequence.length());
            }
            if (b != 3) {
                return charSequence;
            }
        }
        lgl c = lgl.c();
        if (this.b == null) {
            this.b = new lhp(this.a, this);
        }
        c.f(this.b);
        return charSequence;
    }
}
