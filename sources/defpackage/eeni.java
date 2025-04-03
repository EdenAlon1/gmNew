package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeni {
    public static final Pattern a = Pattern.compile("(\\d+)\\s+(\\S+)\\s+\"(\\d+)\\s+.+\"");

    public static int a(eenl eenlVar) {
        String j = eenlVar.j("Retry-After");
        if (j != null) {
            try {
                return Integer.parseInt(j);
            } catch (NumberFormatException e) {
                dkty.s(e, "Retry-After does not contain a parsable integer (%s).", j);
            }
        }
        return 0;
    }
}
