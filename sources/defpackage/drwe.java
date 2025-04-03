package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwe {
    public static final SpannableString a(CharSequence charSequence) {
        return charSequence instanceof SpannableString ? (SpannableString) charSequence : new SpannableString(charSequence);
    }

    public static final CharSequence b(CharSequence charSequence, CharSequence charSequence2) {
        return TextUtils.concat(a(charSequence), a(charSequence2));
    }
}
