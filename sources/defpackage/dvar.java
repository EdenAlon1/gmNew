package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvar {
    public static CharSequence a(Locale locale, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || locale == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (!TextUtils.isEmpty(spannableString)) {
            spannableString.setSpan(new LocaleSpan(locale), 0, spannableString.length(), 33);
        }
        return spannableString;
    }
}
