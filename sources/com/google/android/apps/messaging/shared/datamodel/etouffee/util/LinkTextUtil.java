package com.google.android.apps.messaging.shared.datamodel.etouffee.util;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.crlu;
import defpackage.ffpa;
import defpackage.ffpc;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class LinkTextUtil {
    public static final String a(Context context) {
        String string = context.getString(R.string.how_it_works);
        string.getClass();
        return new ffpa("\\s").a(string, " ");
    }

    public static final void b(SpannableStringBuilder spannableStringBuilder, Context context, String str, final String str2, final Runnable runnable) {
        str.getClass();
        str2.getClass();
        URLSpan uRLSpan = new URLSpan(str2) { // from class: com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil$constructWithStyledUrlLink$urlSpan$1
            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View view) {
                view.getClass();
                super.onClick(view);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.getClass();
            }
        };
        int Y = ffpc.Y(spannableStringBuilder.toString(), str);
        int length = str.length() + Y;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(crlu.a(context, android.R.attr.textColorLink)), Y, length, 17);
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), Y, length, 17);
        spannableStringBuilder.setSpan(uRLSpan, Y, length, 17);
    }
}
