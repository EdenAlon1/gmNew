package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfo implements InputFilter {
    private final TextView a;
    private les b;

    public lfo(TextView textView) {
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
        int a = lew.b().a();
        if (a != 0) {
            if (a == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i == 0) {
                    if (i2 != charSequence.length()) {
                        i = 0;
                    }
                    return lew.b().i(charSequence, charSequence.length());
                }
                charSequence = charSequence.subSequence(i, i2);
                return lew.b().i(charSequence, charSequence.length());
            }
            if (a != 3) {
                return charSequence;
            }
        }
        lew b = lew.b();
        if (this.b == null) {
            this.b = new lfn(this.a);
        }
        b.f(this.b);
        return charSequence;
    }
}
