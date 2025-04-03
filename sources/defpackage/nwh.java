package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwh {
    public static float a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void b(lsy lsyVar) {
        lsyVar.d(-3.4028235E38f, Integer.MIN_VALUE);
        CharSequence charSequence = lsyVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                lsyVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = lsyVar.a;
            lti.f(charSequence2);
            c((Spannable) charSequence2, new emxg() { // from class: nwg
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
                }
            });
        }
    }

    public static void c(Spannable spannable, emxg emxgVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (emxgVar.a(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
