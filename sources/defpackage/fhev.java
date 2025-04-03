package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhev {
    public static final Pattern a = Pattern.compile("[:;,]|[^\\p{ASCII}]");
    private static final Pattern b = Pattern.compile("([,;])");
    private static final Pattern c = Pattern.compile("\\\\([,;\"])");
    private static final Pattern d = Pattern.compile("\r?\n");
    private static final Pattern e = Pattern.compile("(?<!\\\\)\\\\n");
    private static final Pattern f = Pattern.compile("\\\\");
    private static final Pattern g = Pattern.compile("\\\\\\\\");

    public static String a(String str) {
        String b2 = b(str != null ? f.matcher(str).replaceAll("\\\\\\\\") : null);
        if (b2 != null) {
            return b.matcher(b2).replaceAll("\\\\$1");
        }
        return null;
    }

    public static String b(String str) {
        if (str != null) {
            return d.matcher(str).replaceAll("\\\\n");
        }
        return null;
    }

    public static String c(Object obj) {
        return obj != null ? a.a((String) obj, "\"", "\"") : "\"\"";
    }

    public static String d(String str) {
        String replaceAll = str != null ? c.matcher(str).replaceAll("$1") : null;
        String replaceAll2 = replaceAll != null ? e.matcher(replaceAll).replaceAll("\n") : null;
        if (replaceAll2 != null) {
            return g.matcher(replaceAll2).replaceAll("\\\\");
        }
        return null;
    }

    public static String e(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(0, str.length() - 1).substring(1) : str;
    }

    public static String f(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
