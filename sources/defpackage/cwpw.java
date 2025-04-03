package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpw {
    public static void a(im imVar, SpannableString spannableString) {
        csix.g();
        if (TextUtils.isEmpty(spannableString)) {
            imVar.setTitle("");
        } else {
            imVar.setTitle(spannableString);
        }
    }

    public static void b(im imVar, CharSequence charSequence) {
        if (imVar == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            a(imVar, null);
        } else {
            a(imVar, new SpannableString(charSequence));
        }
    }

    public static void c(Context context, im imVar, int i) {
        a(imVar, new SpannableString(context.getString(i)));
    }
}
