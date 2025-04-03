package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjze {
    public static final String a(String str) {
        str.getClass();
        return "~".concat(str);
    }

    public static /* synthetic */ String b(String str, String str2, cjwi cjwiVar) {
        cjwiVar.getClass();
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        } else if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return (str == null || cjwiVar != cjwi.PROFILE_PEOPLE_SHARING_SOURCE) ? str : "~".concat(str);
    }
}
