package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csji {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("\\.");

    public static String a(Context context, String str) {
        String lowerCase = str.trim().toLowerCase(ctid.c(context));
        String[] split = lowerCase.split("@", 2);
        return split.length == 2 ? ("gmail.com".equals(split[1]) || "googlemail.com".equals(split[1])) ? String.format("%s@%s", b.matcher(split[0]).replaceAll(""), "gmail.com") : lowerCase : lowerCase;
    }
}
