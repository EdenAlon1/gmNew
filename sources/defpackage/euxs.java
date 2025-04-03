package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxs {
    public static final /* synthetic */ int d = 0;
    private static final Pattern e = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public euxs(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !e.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.a = str3;
        this.b = str;
        this.c = a.w(str2, str, "!");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof euxs)) {
            return false;
        }
        euxs euxsVar = (euxs) obj;
        return this.a.equals(euxsVar.a) && this.b.equals(euxsVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
