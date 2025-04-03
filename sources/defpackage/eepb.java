package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepb {
    private static final entd b = entd.c("GlobMatcher");
    public final Pattern a;

    private eepb(String str, Pattern pattern) {
        str.getClass();
        this.a = pattern;
    }

    public static emxc a(String str) {
        eepa eepaVar = new eepa();
        StringBuilder sb = new StringBuilder();
        if (!eepaVar.a(str.toCharArray(), sb, false)) {
            ((ensz) ((ensz) b.i()).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 49, "GlobMatcher.java")).t("Internal error. Can't parse glob-pattern: %s", str);
            return emux.a;
        }
        try {
            return emxc.j(new eepb(str, Pattern.compile(sb.toString(), 2)));
        } catch (PatternSyntaxException e) {
            ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/android/libraries/saferwebview/GlobMatcher", "create", 44, "GlobMatcher.java")).t("Internal error. Generated regex is invalid: %s", sb);
            return emux.a;
        }
    }
}
