package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzj {
    public final String a;
    private final String b;

    public edzj(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public static edzj a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Address must not be null");
        }
        int indexOf = str.indexOf(60);
        if (indexOf == -1) {
            return new edzj(b(str));
        }
        if (indexOf > 0) {
            String trim = str.substring(0, indexOf).trim();
            if (trim.startsWith("\"")) {
                trim = trim.substring(1);
            }
            if (trim.endsWith("\"")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            str2 = trim.trim();
        } else {
            str2 = null;
        }
        return new edzj(str2, b(str.substring(indexOf)));
    }

    private static String b(String str) {
        String trim = str.trim();
        if (trim.startsWith("<")) {
            trim = trim.substring(1);
        }
        if (trim.endsWith(">")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        return trim.trim();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof edzj)) {
            return false;
        }
        edzj edzjVar = (edzj) obj;
        return TextUtils.equals(this.b, edzjVar.b) && TextUtils.equals(this.a, edzjVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{String.valueOf(this.b), this.a});
    }

    public final String toString() {
        String str = this.b;
        return (str == null ? "<" : a.a(str, "\"", "\" <")) + this.a + ">";
    }

    public edzj(String str) {
        this(null, str);
    }
}
