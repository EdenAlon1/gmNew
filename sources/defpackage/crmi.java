package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crmi {
    public static String a(Context context) {
        return b(context.getString(R.string.learn_more));
    }

    public static String b(String str) {
        return str.replaceAll("\\s", " ");
    }

    public static void c(Context context, SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        int lastIndexOf = spannableStringBuilder.toString().lastIndexOf(str);
        if (lastIndexOf >= 0) {
            int length = str.length() + lastIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(crlu.a(context, android.R.attr.textColorLink)), lastIndexOf, length, 17);
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), lastIndexOf, length, 17);
            if (clickableSpan != null) {
                spannableStringBuilder.setSpan(clickableSpan, lastIndexOf, length, 17);
            }
        }
    }

    public static void d(Context context, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        c(context, spannableStringBuilder, str, onClickListener != null ? new crmh(onClickListener) : null);
    }
}
