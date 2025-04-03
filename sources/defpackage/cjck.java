package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjck {
    public final Context a;

    public cjck(Context context) {
        this.a = context;
    }

    public final CharSequence a(String str, CharSequence charSequence, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = this.a.getString(i);
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(charSequence);
            string = this.a.getString(R.string.im_notification_separator);
        }
        if (!TextUtils.isEmpty(str2) && !le.x(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append(c(null, str2));
        }
        return spannableStringBuilder;
    }

    public final CharSequence b(String str, CharSequence charSequence, String str2) {
        return a(str, charSequence, str2, R.string.im_notification_ticker_separator);
    }

    public final CharSequence c(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) this.a.getString(R.string.im_notification_separator));
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(this.a.getText(cuww.a(str2)));
        spannableStringBuilder.setSpan(new StyleSpan(2), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
