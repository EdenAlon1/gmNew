package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuw {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static euuw c;

    private euuw() {
    }

    public static euuw b() {
        if (euvo.a == null) {
            euvo.a = new euvo();
        }
        if (c == null) {
            c = new euuw();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(euvd euvdVar) {
        euuz euuzVar = (euuz) euvdVar;
        if (TextUtils.isEmpty(euuzVar.b)) {
            return true;
        }
        return euuzVar.e + euuzVar.d < a() + a;
    }
}
