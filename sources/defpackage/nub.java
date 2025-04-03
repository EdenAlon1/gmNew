package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nub {
    public final Resources a;

    public nub(Resources resources) {
        lti.f(resources);
        this.a = resources;
    }

    private static final String e(lqc lqcVar) {
        Locale.Category category;
        Locale locale;
        String str = lqcVar.d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        int i = lvf.a;
        category = Locale.Category.DISPLAY;
        locale = Locale.getDefault(category);
        String displayName = forLanguageTag.getDisplayName(locale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(locale) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String a(lqc lqcVar) {
        int i = lqcVar.j;
        return i == -1 ? "" : this.a.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String b(lqc lqcVar) {
        String d = d(e(lqcVar), c(lqcVar));
        return TextUtils.isEmpty(d) ? TextUtils.isEmpty(lqcVar.b) ? "" : lqcVar.b : d;
    }

    public final String c(lqc lqcVar) {
        String string = (lqcVar.f & 2) != 0 ? this.a.getString(R.string.exo_track_role_alternate) : "";
        if ((lqcVar.f & 4) != 0) {
            string = d(string, this.a.getString(R.string.exo_track_role_supplementary));
        }
        if ((lqcVar.f & 8) != 0) {
            string = d(string, this.a.getString(R.string.exo_track_role_commentary));
        }
        return (lqcVar.f & 1088) != 0 ? d(string, this.a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.a.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
