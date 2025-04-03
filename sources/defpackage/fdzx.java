package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzx {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final eoeg b = febo.d;

    public static febj a(String str, fdzw fdzwVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        int i = febj.d;
        return new febm(str, z, fdzwVar);
    }
}
