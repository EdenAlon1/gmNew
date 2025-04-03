package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctia {
    public final Context a;
    private final ffbr b;

    public ctia(Context context, ffbr ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    public final CharSequence a(String str, CharSequence charSequence, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = this.a.getString(R.string.notification_ticker_separator);
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(charSequence);
            string = this.a.getString(R.string.notification_separator);
        }
        if (!TextUtils.isEmpty(str2) && !le.x(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(b(null, str2));
        }
        return spannableStringBuilder;
    }

    public final CharSequence b(String str, String str2) {
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this.a, R.style.NotificationSecondaryText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(this.a, R.style.NotificationSenderText);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(textAppearanceSpan2, 0, str.length(), 0);
            spannableStringBuilder.append((CharSequence) this.a.getString(R.string.notification_separator));
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(this.a.getText(cuww.a(str2)));
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 0);
        spannableStringBuilder.setSpan(new StyleSpan(2), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final boolean c() {
        Context context = this.a;
        return ((ctyx) this.b.b()).q(context.getString(R.string.notification_vibration_pref_key), context.getResources().getBoolean(R.bool.notification_vibration_pref_default));
    }
}
