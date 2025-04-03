package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avwj {
    public static final entd a = entd.c("BugleFileTransfer");

    public static String a(String... strArr) {
        int i = eodh.a;
        return eode.a.b(TextUtils.join(":", strArr).getBytes()).toString();
    }

    public static String b(String str) {
        return a.a(str, "\"", "\"");
    }
}
