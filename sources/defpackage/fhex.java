package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhex {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("(?i)^cid:.*");
    private static final Pattern c = Pattern.compile("[<>]");

    public static String a(String str) {
        return (fhel.b("ical4j.compatibility.notes") && b.matcher(str).matches()) ? c.matcher(str).replaceAll("") : str;
    }

    public static URI b(String str) {
        try {
            return new URI(a(str));
        } catch (URISyntaxException e) {
            if (!fhel.b("ical4j.parsing.relaxed")) {
                throw e;
            }
            String a2 = a(str);
            int indexOf = a2.indexOf(58);
            if (indexOf != -1 && indexOf < a2.length() - 1) {
                try {
                    return new URI(a2.substring(0, indexOf), a2.substring(indexOf + 1), null);
                } catch (URISyntaxException unused) {
                    return new URI("net.fortunal.ical4j.invalid", str, null);
                }
            }
            try {
                return new URI("net.fortunal.ical4j.invalid", str, null);
            } catch (URISyntaxException unused2) {
                throw new IllegalArgumentException("Could not build URI from ".concat(String.valueOf(str)));
            }
        }
    }
}
