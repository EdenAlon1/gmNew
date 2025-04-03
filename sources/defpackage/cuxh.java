package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxh {
    private final Context a;

    public cuxh(Context context) {
        this.a = context;
    }

    public static String a(String str) {
        return kse.a().b(str);
    }

    @Deprecated
    public static String b(String str) {
        return kse.a().c(str, ksk.a);
    }

    public final String c(String str) {
        ksg ksgVar = ksk.a;
        if (!d() || TextUtils.isEmpty(str)) {
            return str;
        }
        String string = this.a.getResources().getString(R.string.comma_list_separator);
        kse a = kse.a();
        if (!str.contains(", ")) {
            return a.c(str, ksgVar);
        }
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            split[i] = a.c(split[i], ksgVar);
        }
        return new emww(string).f(split);
    }

    public final boolean d() {
        return this.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final String e(String str, TextPaint textPaint, int i, int i2) {
        CharSequence listEllipsize;
        Context context = this.a;
        String c = c(str);
        listEllipsize = TextUtils.listEllipsize(this.a, enkr.a(emye.e(", ").f().i(str)), context.getResources().getString(R.string.enumeration_comma), textPaint, i, i2);
        String charSequence = listEllipsize.toString();
        return TextUtils.isEmpty(charSequence) ? c : charSequence;
    }
}
